#define _GNU_SOURCE 1

#include <android/log.h>
#include <dirent.h>
#include <dlfcn.h>
#include <elf.h>
#include <fcntl.h>
#include <jni.h>
#include <link.h>
#include <setjmp.h>
#include <signal.h>
#include <stdint.h>
#include <stdio.h>
#include <string.h>
#include <sys/stat.h>
#include <sys/syscall.h>
#include <sys/types.h>
#include <sys/mman.h>
#include <unistd.h>

#include <algorithm>
#include <array>
#include <cerrno>
#include <cinttypes>
#include <cstdlib>
#include <functional>
#include <optional>
#include <set>
#include <sstream>
#include <string>
#include <string_view>
#include <unordered_map>
#include <utility>
#include <vector>

namespace {

constexpr char kLogTag[] = "SundaScan";
constexpr size_t kAsciiNeedleSize = 5;
constexpr size_t kUtf16NeedleSize = kAsciiNeedleSize * 2;
constexpr size_t kPreviewBytes = 12;
constexpr size_t kChunkSize = 64 * 1024;
constexpr size_t kChunkOverlap = 16;
constexpr size_t kMaxRecordedHits = 512;

thread_local sigjmp_buf *g_fault_jmp = nullptr;

struct MappingInfo {
  uint64_t start = 0;
  uint64_t end = 0;
  std::string perms;
  std::string path;
};

struct Hit {
  std::string surface;
  std::string mapping_range;
  std::string protection;
  std::string address;
  std::string module_path;
  std::string encoding;
  std::string preview_hex;
  std::string match_text;
  std::string bucket;
  std::string why;
  int count = 1;
};

struct ScanReport {
  std::string reason;
  int pid = getpid();
  std::vector<Hit> hits;
  std::unordered_map<std::string, int> surface_counts;
  std::unordered_map<std::string, int> bucket_counts;
  std::unordered_map<std::string, int> module_counts;
  size_t total_hits = 0;
  bool truncated = false;
};

uint8_t ascii_lower(uint8_t c) {
  if (c >= 'A' && c <= 'Z') {
    return static_cast<uint8_t>(c + 32);
  }
  return c;
}

uint8_t needle_byte(size_t index) {
  switch (index) {
    case 0:
      return 0x66;
    case 1:
      return 0x72;
    case 2:
      return 0x69;
    case 3:
      return 0x64;
    case 4:
      return 0x61;
    default:
      return 0x00;
  }
}

int create_memfd(const char *name) {
#ifdef __NR_memfd_create
  return static_cast<int>(syscall(__NR_memfd_create, name, 0));
#else
  errno = ENOSYS;
  return -1;
#endif
}

void fault_signal_handler(int) {
  if (g_fault_jmp != nullptr) {
    siglongjmp(*g_fault_jmp, 1);
  }
}

class FaultGuard {
 public:
  FaultGuard() {
    struct sigaction action = {};
    action.sa_handler = fault_signal_handler;
    sigemptyset(&action.sa_mask);
    action.sa_flags = SA_NODEFER;
    sigaction(SIGBUS, &action, &old_bus_);
    sigaction(SIGSEGV, &action, &old_segv_);
  }

  ~FaultGuard() {
    sigaction(SIGBUS, &old_bus_, nullptr);
    sigaction(SIGSEGV, &old_segv_, nullptr);
  }

 private:
  struct sigaction old_bus_ = {};
  struct sigaction old_segv_ = {};
};

std::string trim(std::string_view value) {
  size_t start = 0;
  while (start < value.size() && (value[start] == ' ' || value[start] == '\t' || value[start] == '\n' || value[start] == '\r')) {
    start++;
  }
  size_t end = value.size();
  while (end > start && (value[end - 1] == ' ' || value[end - 1] == '\t' || value[end - 1] == '\n' || value[end - 1] == '\r' || value[end - 1] == '\0')) {
    end--;
  }
  return std::string(value.substr(start, end - start));
}

std::string json_escape(std::string_view input) {
  std::string out;
  out.reserve(input.size() + 8);
  for (char c : input) {
    switch (c) {
      case '\\':
        out += "\\\\";
        break;
      case '"':
        out += "\\\"";
        break;
      case '\n':
        out += "\\n";
        break;
      case '\r':
        out += "\\r";
        break;
      case '\t':
        out += "\\t";
        break;
      default:
        if (static_cast<unsigned char>(c) < 0x20) {
          char buf[7];
          snprintf(buf, sizeof(buf), "\\u%04x", static_cast<unsigned char>(c));
          out += buf;
        } else {
          out.push_back(c);
        }
        break;
    }
  }
  return out;
}

std::string hex_preview(const uint8_t *data, size_t size, size_t start, size_t length) {
  size_t end = std::min(size, start + length);
  std::ostringstream stream;
  for (size_t i = start; i < end; i++) {
    if (i > start) {
      stream << ' ';
    }
    char buf[4];
    snprintf(buf, sizeof(buf), "%02x", data[i]);
    stream << buf;
  }
  return stream.str();
}

std::string limit_text(std::string value, size_t max_size) {
  if (value.size() <= max_size) {
    return value;
  }
  return value.substr(0, max_size - 3) + "...";
}

bool is_printable_ascii(uint8_t c) {
  return c >= 0x20 && c <= 0x7e;
}

bool is_printable_utf16le(uint8_t lo, uint8_t hi) {
  return hi == 0x00 && is_printable_ascii(lo);
}

bool contains_needle_ascii(std::string_view input) {
  if (input.size() < kAsciiNeedleSize) {
    return false;
  }

  for (size_t offset = 0; offset + kAsciiNeedleSize <= input.size(); offset++) {
    bool matched = true;
    for (size_t i = 0; i != kAsciiNeedleSize; i++) {
      if (ascii_lower(static_cast<uint8_t>(input[offset + i])) != needle_byte(i)) {
        matched = false;
        break;
      }
    }
    if (matched) {
      return true;
    }
  }
  return false;
}

bool contains_fragments(std::string_view input, std::initializer_list<std::string_view> fragments) {
  size_t cursor = 0;
  for (std::string_view fragment : fragments) {
    size_t pos = input.find(fragment, cursor);
    if (pos == std::string_view::npos) {
      return false;
    }
    cursor = pos + fragment.size();
  }
  return true;
}

std::string lowercase_ascii(std::string_view input) {
  std::string out(input);
  for (char &c : out) {
    c = static_cast<char>(ascii_lower(static_cast<uint8_t>(c)));
  }
  return out;
}

std::string extract_ascii_match_text(const uint8_t *data, size_t size, size_t offset) {
  size_t left = offset;
  while (left > 0 && is_printable_ascii(data[left - 1]) && (offset - left) < 80) {
    left--;
  }

  size_t right = offset + kAsciiNeedleSize;
  while (right < size && is_printable_ascii(data[right]) && (right - left) < 160) {
    right++;
  }

  return limit_text(trim(std::string(reinterpret_cast<const char *>(data + left), right - left)), 120);
}

std::string extract_utf16_match_text(const uint8_t *data, size_t size, size_t offset) {
  size_t left = offset;
  while (left >= 2 && is_printable_utf16le(data[left - 2], data[left - 1]) && (offset - left) < 160) {
    left -= 2;
  }

  size_t right = offset + kUtf16NeedleSize;
  while (right + 1 < size && is_printable_utf16le(data[right], data[right + 1]) && (right - left) < 320) {
    right += 2;
  }

  std::string out;
  out.reserve((right - left) / 2);
  for (size_t i = left; i + 1 < right; i += 2) {
    out.push_back(static_cast<char>(data[i]));
  }
  return limit_text(trim(out), 120);
}

std::string normalize_module_path(std::string_view module_path) {
  return module_path.empty() ? "<anonymous>" : std::string(module_path);
}

struct HitClassification {
  std::string bucket;
  std::string why;
};

std::string why_for_bucket(std::string_view bucket) {
  if (bucket == "source_debug_path") {
    return "Matched build-time source or debug path residue.";
  }
  if (bucket == "source_subprojects_path") {
    return "Matched vendored subproject source path residue.";
  }
  if (bucket == "protocol_namespace") {
    return "Matched protocol, interface, or namespace identifier.";
  }
  if (bucket == "runtime_asset_path") {
    return "Matched embedded runtime asset path.";
  }
  if (bucket == "rpc_channel") {
    return "Matched RPC channel literal.";
  }
  if (bucket == "symbolic_brand") {
    return "Matched brand-facing class, symbol, or type name.";
  }
  if (bucket == "other_literal_or_path") {
    return "Matched an uncategorized literal or path fragment.";
  }
  return "Matched the generic token without a stronger local pattern.";
}

HitClassification classify_hit(std::string_view match_text) {
  std::string lower = lowercase_ascii(match_text);

  if (contains_fragments(lower, {"/__w/", "fri", "da/", "fri", "da/"})) {
    return {
        "source_debug_path",
        why_for_bucket("source_debug_path"),
    };
  }

  if (contains_fragments(lower, {"subprojects/", "fri", "da-"})) {
    return {
        "source_subprojects_path",
        why_for_bucket("source_subprojects_path"),
    };
  }

  if (contains_fragments(lower, {"re.", "fri", "da"}) ||
      contains_fragments(lower, {"/re/", "fri", "da/"})) {
    return {
        "protocol_namespace",
        why_for_bucket("protocol_namespace"),
    };
  }

  if (contains_fragments(lower, {"file:///", "fri", "da/runtime/"}) ||
      contains_fragments(lower, {"/", "fri", "da/runtime/"})) {
    return {
        "runtime_asset_path",
        why_for_bucket("runtime_asset_path"),
    };
  }

  if (contains_fragments(lower, {"fri", "da:rpc"})) {
    return {
        "rpc_channel",
        why_for_bucket("rpc_channel"),
    };
  }

  if (contains_fragments(match_text, {"Fri", "da"}) ||
      contains_fragments(lower, {"fri", "da."})) {
    return {
        "symbolic_brand",
        why_for_bucket("symbolic_brand"),
    };
  }

  if (contains_fragments(lower, {"/", "fri", "da/"}) ||
      contains_fragments(lower, {"fri", "da-"}) ||
      contains_needle_ascii(lower)) {
    return {
        "other_literal_or_path",
        why_for_bucket("other_literal_or_path"),
    };
  }

  return {
      "generic_token",
      why_for_bucket("generic_token"),
  };
}

template <typename Map>
std::vector<std::pair<std::string, int>> sort_counts(const Map &counts, size_t limit = 0) {
  std::vector<std::pair<std::string, int>> sorted(counts.begin(), counts.end());
  std::sort(sorted.begin(), sorted.end(), [](const auto &lhs, const auto &rhs) {
    if (lhs.second != rhs.second) {
      return lhs.second > rhs.second;
    }
    return lhs.first < rhs.first;
  });
  if (limit != 0 && sorted.size() > limit) {
    sorted.resize(limit);
  }
  return sorted;
}

std::string describe_address(uint64_t address) {
  char buf[32];
  snprintf(buf, sizeof(buf), "0x%016" PRIx64, address);
  return std::string(buf);
}

std::string describe_range(uint64_t start, uint64_t end) {
  char buf[64];
  snprintf(buf, sizeof(buf), "0x%016" PRIx64 "-0x%016" PRIx64, start, end);
  return std::string(buf);
}

bool matches_ascii(const uint8_t *ptr) {
  for (size_t i = 0; i != kAsciiNeedleSize; i++) {
    if (ascii_lower(ptr[i]) != needle_byte(i)) {
      return false;
    }
  }
  return true;
}

bool matches_utf16le(const uint8_t *ptr) {
  for (size_t i = 0; i != kAsciiNeedleSize; i++) {
    if (ascii_lower(ptr[i * 2]) != needle_byte(i) || ptr[i * 2 + 1] != 0x00) {
      return false;
    }
  }
  return true;
}

bool is_token_char_ascii(uint8_t c) {
  return (c >= 'a' && c <= 'z') ||
         (c >= 'A' && c <= 'Z') ||
         (c >= '0' && c <= '9') ||
         c == '_';
}

bool has_ascii_boundary(const uint8_t *data, size_t size, size_t offset) {
  bool left_ok = offset == 0 || !is_token_char_ascii(data[offset - 1]);
  size_t right = offset + kAsciiNeedleSize;
  bool right_ok = right >= size || !is_token_char_ascii(data[right]);
  return left_ok && right_ok;
}

bool has_utf16_boundary(const uint8_t *data, size_t size, size_t offset) {
  bool left_ok = true;
  if (offset >= 2) {
    uint8_t left_char = data[offset - 2];
    uint8_t left_hi = data[offset - 1];
    left_ok = !(left_hi == 0x00 && is_token_char_ascii(left_char));
  }

  size_t right = offset + kUtf16NeedleSize;
  bool right_ok = true;
  if (right + 1 < size) {
    uint8_t right_char = data[right];
    uint8_t right_hi = data[right + 1];
    right_ok = !(right_hi == 0x00 && is_token_char_ascii(right_char));
  }
  return left_ok && right_ok;
}

void record_hit(ScanReport &report,
                const std::string &surface,
                const std::string &mapping_range,
                const std::string &protection,
                const std::string &address,
                const std::string &module_path,
                const std::string &encoding,
                const std::string &preview_hex,
                const std::string &match_text) {
  HitClassification classification = classify_hit(match_text);
  report.total_hits++;
  report.surface_counts[surface]++;
  report.bucket_counts[classification.bucket]++;
  report.module_counts[normalize_module_path(module_path)]++;
  if (report.hits.size() >= kMaxRecordedHits) {
    report.truncated = true;
    return;
  }
  report.hits.push_back(Hit{
      .surface = surface,
      .mapping_range = mapping_range,
      .protection = protection,
      .address = address,
      .module_path = module_path,
      .encoding = encoding,
      .preview_hex = preview_hex,
      .match_text = match_text,
      .bucket = classification.bucket,
      .why = classification.why,
      .count = 1,
  });
}

bool starts_with(const std::string &value, const char *prefix) {
  return value.rfind(prefix, 0) == 0;
}

bool should_scan_mapping_bytes(const MappingInfo &mapping) {
  uint64_t size = mapping.end - mapping.start;
  if (size == 0) {
    return false;
  }

  bool file_backed = !mapping.path.empty() && mapping.path[0] == '/';
  if (file_backed) {
    if (size > (64ULL * 1024 * 1024) &&
        mapping.perms.find('x') == std::string::npos &&
        mapping.path.find(".so") == std::string::npos &&
        mapping.path.find(".apk") == std::string::npos) {
      return false;
    }
    return true;
  }

  if (mapping.path.empty()) {
    return size <= (1ULL * 1024 * 1024);
  }

  if (mapping.path == "[heap]" ||
      starts_with(mapping.path, "[anon:linker_alloc]") ||
      starts_with(mapping.path, "[anon:bionic_alloc_small_objects]") ||
      starts_with(mapping.path, "[anon:.bss]") ||
      starts_with(mapping.path, "[anon:stack_and_tls")) {
    return size <= (16ULL * 1024 * 1024);
  }

  return false;
}

void scan_blob(ScanReport &report,
               const std::string &surface,
               const MappingInfo *mapping,
               const uint8_t *data,
               size_t size,
               uint64_t base_address) {
  size_t ascii_limit = size >= kAsciiNeedleSize ? size - kAsciiNeedleSize + 1 : 0;
  size_t utf16_limit = size >= kUtf16NeedleSize ? size - kUtf16NeedleSize + 1 : 0;

  for (size_t offset = 0; offset < ascii_limit; offset++) {
    if (!matches_ascii(data + offset) || !has_ascii_boundary(data, size, offset)) {
      continue;
    }
    size_t preview_start = offset > kPreviewBytes ? offset - kPreviewBytes : 0;
    size_t preview_length = kAsciiNeedleSize + (offset - preview_start) + kPreviewBytes;
    record_hit(report,
               surface,
               mapping != nullptr ? describe_range(mapping->start, mapping->end) : "",
               mapping != nullptr ? mapping->perms : "",
               base_address != 0 ? describe_address(base_address + offset) : "",
               mapping != nullptr ? mapping->path : "",
               "ascii-ci",
               hex_preview(data, size, preview_start, preview_length),
               extract_ascii_match_text(data, size, offset));
  }

  for (size_t offset = 0; offset < utf16_limit; offset++) {
    if (!matches_utf16le(data + offset) || !has_utf16_boundary(data, size, offset)) {
      continue;
    }
    size_t preview_start = offset > kPreviewBytes ? offset - kPreviewBytes : 0;
    size_t preview_length = kUtf16NeedleSize + (offset - preview_start) + kPreviewBytes;
    record_hit(report,
               surface,
               mapping != nullptr ? describe_range(mapping->start, mapping->end) : "",
               mapping != nullptr ? mapping->perms : "",
               base_address != 0 ? describe_address(base_address + offset) : "",
               mapping != nullptr ? mapping->path : "",
               "utf16le-ci",
               hex_preview(data, size, preview_start, preview_length),
               extract_utf16_match_text(data, size, offset));
  }
}

std::optional<MappingInfo> parse_maps_line(std::string_view line) {
  MappingInfo mapping;
  unsigned long long start = 0;
  unsigned long long end = 0;
  char perms[5] = {};
  unsigned long long offset = 0;
  unsigned int dev_major = 0;
  unsigned int dev_minor = 0;
  unsigned long inode = 0;

  int consumed = 0;
  if (sscanf(std::string(line).c_str(),
             "%llx-%llx %4s %llx %x:%x %lu %n",
             &start,
             &end,
             perms,
             &offset,
             &dev_major,
             &dev_minor,
             &inode,
             &consumed) < 7) {
    return std::nullopt;
  }

  mapping.start = start;
  mapping.end = end;
  mapping.perms = perms;
  mapping.path = trim(line.substr(consumed));
  return mapping;
}

std::vector<std::string> read_lines(const char *path) {
  std::vector<std::string> lines;
  FILE *fp = fopen(path, "re");
  if (fp == nullptr) {
    return lines;
  }

  char *line = nullptr;
  size_t capacity = 0;
  while (getline(&line, &capacity, fp) != -1) {
    lines.emplace_back(line);
  }
  free(line);
  fclose(fp);
  return lines;
}

std::vector<uint8_t> read_file_bytes(const char *path) {
  std::vector<uint8_t> data;
  FILE *fp = fopen(path, "re");
  if (fp == nullptr) {
    return data;
  }
  uint8_t buffer[4096];
  while (true) {
    size_t n = fread(buffer, 1, sizeof(buffer), fp);
    if (n > 0) {
      data.insert(data.end(), buffer, buffer + n);
    }
    if (n < sizeof(buffer)) {
      break;
    }
  }
  fclose(fp);
  return data;
}

void scan_proc_file(ScanReport &report, const char *path, const std::string &surface) {
  std::vector<uint8_t> data = read_file_bytes(path);
  if (!data.empty()) {
    scan_blob(report, surface, nullptr, data.data(), data.size(), 0);
  }
}

void scan_thread_names(ScanReport &report) {
  DIR *dir = opendir("/proc/self/task");
  if (dir == nullptr) {
    return;
  }

  dirent *entry = nullptr;
  while ((entry = readdir(dir)) != nullptr) {
    if (entry->d_name[0] == '.') {
      continue;
    }
    std::string path = std::string("/proc/self/task/") + entry->d_name + "/comm";
    std::vector<uint8_t> bytes = read_file_bytes(path.c_str());
    if (bytes.empty()) {
      continue;
    }
    scan_blob(report, "thread_name", nullptr, bytes.data(), bytes.size(), 0);
  }
  closedir(dir);
}

void scan_fd_targets(ScanReport &report) {
  DIR *dir = opendir("/proc/self/fd");
  if (dir == nullptr) {
    return;
  }

  dirent *entry = nullptr;
  while ((entry = readdir(dir)) != nullptr) {
    if (entry->d_name[0] == '.') {
      continue;
    }
    std::string path = std::string("/proc/self/fd/") + entry->d_name;
    char buffer[PATH_MAX];
    ssize_t len = readlink(path.c_str(), buffer, sizeof(buffer) - 1);
    if (len <= 0) {
      continue;
    }
    buffer[len] = '\0';
    std::string link_value(buffer);
    scan_blob(report, "fd_target", nullptr,
              reinterpret_cast<const uint8_t *>(link_value.data()),
              link_value.size(),
              0);
  }
  closedir(dir);
}

int phdr_callback(dl_phdr_info *info, size_t, void *user_data) {
  auto *report = reinterpret_cast<ScanReport *>(user_data);
  if (info->dlpi_name == nullptr || info->dlpi_name[0] == '\0') {
    return 0;
  }

  std::string path(info->dlpi_name);
  scan_blob(*report,
            "module_path",
            nullptr,
            reinterpret_cast<const uint8_t *>(path.data()),
            path.size(),
            0);
  return 0;
}

void scan_module_paths(ScanReport &report) {
  dl_iterate_phdr(phdr_callback, &report);
}

void scan_memory_mappings(ScanReport &report) {
  std::vector<std::string> lines = read_lines("/proc/self/maps");
  if (lines.empty()) {
    return;
  }

  std::set<uint64_t> seen_addresses;
  std::vector<uint8_t> buffer(kChunkSize + kChunkOverlap);
  for (const std::string &line : lines) {
    auto parsed = parse_maps_line(line);
    if (!parsed.has_value()) {
      continue;
    }
    const MappingInfo &mapping = parsed.value();
    if (mapping.perms.empty() || mapping.perms[0] != 'r' || mapping.end <= mapping.start) {
      continue;
    }

    if (!mapping.path.empty()) {
      scan_blob(report,
                "maps_path",
                &mapping,
                reinterpret_cast<const uint8_t *>(mapping.path.data()),
                mapping.path.size(),
                0);
    }

    if (!should_scan_mapping_bytes(mapping)) {
      continue;
    }

    uint64_t cursor = mapping.start;
    size_t carry = 0;
    while (cursor < mapping.end) {
      size_t want = static_cast<size_t>(std::min<uint64_t>(kChunkSize, mapping.end - cursor));
      sigjmp_buf jump_buffer;
      if (sigsetjmp(jump_buffer, 1) != 0) {
        g_fault_jmp = nullptr;
        __android_log_print(ANDROID_LOG_WARN, kLogTag,
                            "Skipping faulting mapping chunk range=%s perms=%s path=%s",
                            describe_range(mapping.start, mapping.end).c_str(),
                            mapping.perms.c_str(),
                            mapping.path.c_str());
        break;
      }
      g_fault_jmp = &jump_buffer;
      memcpy(buffer.data() + carry, reinterpret_cast<const void *>(cursor), want);
      g_fault_jmp = nullptr;
      ssize_t n = static_cast<ssize_t>(want);

      size_t total = carry + static_cast<size_t>(n);
      MappingInfo local_mapping = mapping;
      size_t ascii_limit = total >= kAsciiNeedleSize ? total - kAsciiNeedleSize + 1 : 0;
      size_t utf16_limit = total >= kUtf16NeedleSize ? total - kUtf16NeedleSize + 1 : 0;

      for (size_t offset = 0; offset < ascii_limit; offset++) {
        if (!matches_ascii(buffer.data() + offset) || !has_ascii_boundary(buffer.data(), total, offset)) {
          continue;
        }
        uint64_t absolute = cursor - carry + offset;
        if (!seen_addresses.insert(absolute).second) {
          continue;
        }
        size_t preview_start = offset > kPreviewBytes ? offset - kPreviewBytes : 0;
        size_t preview_length = kAsciiNeedleSize + (offset - preview_start) + kPreviewBytes;
        record_hit(report, "mapping_bytes", describe_range(local_mapping.start, local_mapping.end), local_mapping.perms,
                   describe_address(absolute), local_mapping.path, "ascii-ci",
                   hex_preview(buffer.data(), total, preview_start, preview_length),
                   extract_ascii_match_text(buffer.data(), total, offset));
      }

      for (size_t offset = 0; offset < utf16_limit; offset++) {
        if (!matches_utf16le(buffer.data() + offset) || !has_utf16_boundary(buffer.data(), total, offset)) {
          continue;
        }
        uint64_t absolute = cursor - carry + offset;
        if (!seen_addresses.insert(absolute).second) {
          continue;
        }
        size_t preview_start = offset > kPreviewBytes ? offset - kPreviewBytes : 0;
        size_t preview_length = kUtf16NeedleSize + (offset - preview_start) + kPreviewBytes;
        record_hit(report, "mapping_bytes", describe_range(local_mapping.start, local_mapping.end), local_mapping.perms,
                   describe_address(absolute), local_mapping.path, "utf16le-ci",
                   hex_preview(buffer.data(), total, preview_start, preview_length),
                   extract_utf16_match_text(buffer.data(), total, offset));
      }

      carry = std::min(kChunkOverlap, total);
      memmove(buffer.data(), buffer.data() + total - carry, carry);
      cursor += static_cast<uint64_t>(n);
    }
  }
}

std::string report_to_json(const ScanReport &report) {
  std::ostringstream stream;
  stream << "{";
  stream << "\"reason\":\"" << json_escape(report.reason) << "\",";
  stream << "\"pid\":" << report.pid << ",";
  stream << "\"summary\":{";
  stream << "\"totalHits\":" << report.total_hits << ",";
  stream << "\"recordedHits\":" << report.hits.size() << ",";
  stream << "\"truncated\":" << (report.truncated ? "true" : "false") << ",";
  stream << "\"surfaceCounts\":{";
  bool first_surface = true;
  for (const auto &entry : sort_counts(report.surface_counts)) {
    if (!first_surface) {
      stream << ",";
    }
    first_surface = false;
    stream << "\"" << json_escape(entry.first) << "\":" << entry.second;
  }
  stream << "},";
  stream << "\"bucketCounts\":{";
  bool first_bucket = true;
  for (const auto &entry : sort_counts(report.bucket_counts)) {
    if (!first_bucket) {
      stream << ",";
    }
    first_bucket = false;
    stream << "\"" << json_escape(entry.first) << "\":" << entry.second;
  }
  stream << "},";
  stream << "\"bucketDetails\":[";
  bool first_bucket_detail = true;
  for (const auto &entry : sort_counts(report.bucket_counts)) {
    if (!first_bucket_detail) {
      stream << ",";
    }
    first_bucket_detail = false;
    stream << "{";
    stream << "\"bucket\":\"" << json_escape(entry.first) << "\",";
    stream << "\"count\":" << entry.second << ",";
    stream << "\"why\":\"" << json_escape(why_for_bucket(entry.first)) << "\"";
    stream << "}";
  }
  stream << "],";
  stream << "\"topModules\":[";
  bool first_module = true;
  for (const auto &entry : sort_counts(report.module_counts, 8)) {
    if (!first_module) {
      stream << ",";
    }
    first_module = false;
    stream << "{";
    stream << "\"modulePath\":\"" << json_escape(entry.first) << "\",";
    stream << "\"count\":" << entry.second;
    stream << "}";
  }
  stream << "]";
  stream << "},";
  stream << "\"hits\":[";
  for (size_t i = 0; i != report.hits.size(); i++) {
    const Hit &hit = report.hits[i];
    if (i != 0) {
      stream << ",";
    }
    stream << "{";
    stream << "\"surface\":\"" << json_escape(hit.surface) << "\",";
    stream << "\"mappingRange\":\"" << json_escape(hit.mapping_range) << "\",";
    stream << "\"protection\":\"" << json_escape(hit.protection) << "\",";
    stream << "\"address\":\"" << json_escape(hit.address) << "\",";
    stream << "\"modulePath\":\"" << json_escape(hit.module_path) << "\",";
    stream << "\"encoding\":\"" << json_escape(hit.encoding) << "\",";
    stream << "\"previewHex\":\"" << json_escape(hit.preview_hex) << "\",";
    stream << "\"matchText\":\"" << json_escape(hit.match_text) << "\",";
    stream << "\"bucket\":\"" << json_escape(hit.bucket) << "\",";
    stream << "\"why\":\"" << json_escape(hit.why) << "\",";
    stream << "\"count\":" << hit.count;
    stream << "}";
  }
  stream << "]";
  stream << "}";
  return stream.str();
}

ScanReport run_single_scan(const std::string &reason) {
  FaultGuard fault_guard;
  ScanReport report;
  report.reason = reason;
  scan_memory_mappings(report);
  scan_module_paths(report);
  scan_thread_names(report);
  scan_fd_targets(report);
  scan_proc_file(report, "/proc/self/cmdline", "proc_cmdline");
  scan_proc_file(report, "/proc/self/status", "proc_status");
  return report;
}

std::string run_scan_json(const std::string &reason) {
  ScanReport report = run_single_scan(reason);
  std::string json = report_to_json(report);
  __android_log_print(ANDROID_LOG_INFO, kLogTag, "scan reason=%s hits=%zu truncated=%d",
                      reason.c_str(), report.hits.size(), report.truncated ? 1 : 0);
  return json;
}

std::string run_calibration_json(const std::string &reason) {
  int ascii_fd = create_memfd("scan-cal-a");
  int utf16_fd = create_memfd("scan-cal-u");
  if (ascii_fd == -1 || utf16_fd == -1 ||
      ftruncate(ascii_fd, 4096) != 0 ||
      ftruncate(utf16_fd, 4096) != 0) {
    if (ascii_fd != -1) {
      close(ascii_fd);
    }
    if (utf16_fd != -1) {
      close(utf16_fd);
    }
    return "{\"kind\":\"calibration\",\"before\":{\"summary\":{\"totalHits\":0,\"recordedHits\":0,\"truncated\":false,\"surfaceCounts\":{}}},\"after\":{\"summary\":{\"totalHits\":0,\"recordedHits\":0,\"truncated\":false,\"surfaceCounts\":{}}}}";
  }

  uint8_t *ascii_buffer = reinterpret_cast<uint8_t *>(
      mmap(nullptr, 4096, PROT_READ | PROT_WRITE, MAP_SHARED, ascii_fd, 0));
  uint8_t *utf16_buffer = reinterpret_cast<uint8_t *>(
      mmap(nullptr, 4096, PROT_READ | PROT_WRITE, MAP_SHARED, utf16_fd, 0));
  if (ascii_buffer == MAP_FAILED || utf16_buffer == MAP_FAILED) {
    if (ascii_buffer != MAP_FAILED) {
      munmap(ascii_buffer, 4096);
    }
    if (utf16_buffer != MAP_FAILED) {
      munmap(utf16_buffer, 4096);
    }
    close(ascii_fd);
    close(utf16_fd);
    return "{\"kind\":\"calibration\",\"before\":{\"summary\":{\"totalHits\":0,\"recordedHits\":0,\"truncated\":false,\"surfaceCounts\":{}}},\"after\":{\"summary\":{\"totalHits\":0,\"recordedHits\":0,\"truncated\":false,\"surfaceCounts\":{}}}}";
  }

  memset(ascii_buffer, 0, 4096);
  memset(utf16_buffer, 0, 4096);
  for (size_t i = 0; i != kAsciiNeedleSize; i++) {
    ascii_buffer[19 + i] = needle_byte(i);
    utf16_buffer[23 + (i * 2)] = needle_byte(i);
    utf16_buffer[23 + (i * 2) + 1] = 0x00;
  }

  ScanReport before;
  before.reason = reason + "_before";
  scan_blob(before, "calibration_buffer", nullptr, ascii_buffer, 4096, 0);
  scan_blob(before, "calibration_buffer", nullptr, utf16_buffer, 4096, 0);
  memset(ascii_buffer, 0, 4096);
  memset(utf16_buffer, 0, 4096);
  ScanReport after;
  after.reason = reason + "_after";
  scan_blob(after, "calibration_buffer", nullptr, ascii_buffer, 4096, 0);
  scan_blob(after, "calibration_buffer", nullptr, utf16_buffer, 4096, 0);
  munmap(ascii_buffer, 4096);
  munmap(utf16_buffer, 4096);
  close(ascii_fd);
  close(utf16_fd);

  std::ostringstream stream;
  stream << "{";
  stream << "\"kind\":\"calibration\",";
  stream << "\"reason\":\"" << json_escape(reason) << "\",";
  stream << "\"before\":" << report_to_json(before) << ",";
  stream << "\"after\":" << report_to_json(after);
  stream << "}";
  return stream.str();
}

jstring to_jstring(JNIEnv *env, const std::string &value) {
  return env->NewStringUTF(value.c_str());
}

}  // namespace

extern "C" JNIEXPORT jstring JNICALL
Java_com_sunda_demo_NativeScanner_runScan(JNIEnv *env, jclass, jstring reason) {
  const char *raw_reason = env->GetStringUTFChars(reason, nullptr);
  std::string json = run_scan_json(raw_reason != nullptr ? raw_reason : "scan");
  if (raw_reason != nullptr) {
    env->ReleaseStringUTFChars(reason, raw_reason);
  }
  return to_jstring(env, json);
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_sunda_demo_NativeScanner_runCalibration(JNIEnv *env, jclass, jstring reason) {
  const char *raw_reason = env->GetStringUTFChars(reason, nullptr);
  std::string json = run_calibration_json(raw_reason != nullptr ? raw_reason : "calibration");
  if (raw_reason != nullptr) {
    env->ReleaseStringUTFChars(reason, raw_reason);
  }
  return to_jstring(env, json);
}
