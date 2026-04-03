# Sunda

Sunda 是面向 Android ARM64 的 Frida 定制分支。

当前仓库路线已经切到：

- `frida17.8.0/` 目录名与当前 Frida 基线版本保持一致
- `frida-glib/` 继续作为本地保留组件维护
- 本地去指纹化与本地 GLib 选择 glue 已重新回放到迁移后的树

这意味着当前工作目标不再是继续修补旧 `17.4.1` Android 路径，而是在 `17.8.0` 基线之上继续做 Android 可用性与去指纹化收敛。

## 目录

- `frida17.8.0/`
  当前实际承载的是 `17.8.0` 的顶层、`releng`、`frida-core`、`frida-gum`
- `frida-glib/`
  本地保留的 GLib 派生树
- `demo/`
  Android 指纹 canary app、JNI scanner、host 侧验证脚本

## 当前状态

- 当前连接的 Pixel 8a / Android 16 上，官方 `frida-server` `17.4.1` 与旧本地 `17.4.1` 都会因为旧 Android host-session 路径失败
- 官方 `17.8.0` 在同设备可用
- 当前本地迁移树已能编出可运行的 `sunda` server，并在设备上通过 `frida-ps -U`
- `spawn + attach` 对 `/system/bin/sleep` 仍存在 parity 问题，但官方 `17.8.0` 在同设备同样复现，不视为本地迁移回归

## Android ARM64 构建

当前验证通过的构建方式：

```bash
cd frida17.8.0

export ANDROID_NDK_ROOT="$ANDROID_NDK_HOME"
export SSL_CERT_FILE="/Users/siberia/Library/Python/3.12/lib/python/site-packages/certifi/cacert.pem"

mkdir -p build-android-arm64-server-cert
cd build-android-arm64-server-cert

../configure --host=android-arm64
SSL_CERT_FILE="$SSL_CERT_FILE" ANDROID_NDK_ROOT="$ANDROID_NDK_ROOT" ninja -v subprojects/frida-core/server/sunda
```

生成的 server 产物路径：

```bash
frida17.8.0/build-android-arm64-server-cert/subprojects/frida-core/server/sunda
```

## 设备验证

```bash
adb push frida17.8.0/build-android-arm64-server-cert/subprojects/frida-core/server/sunda /data/local/tmp/sunda
adb shell chmod 755 /data/local/tmp/sunda
adb shell /data/local/tmp/sunda
frida-ps -U
```

## 说明

- 当前二进制里已经有 `sunda-*` 命名面，如 `sunda-agent-*`、`sunda-helper-*`、`sunda-main-loop`
- 17.8.0 新引入的 Android helper/session 面仍有部分上游 `re.frida.*` 与 helper 路径字符串，后续会继续清理
