package com.applovin.shadow.okio.internal;

import a.b;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.ZipFileSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kv.l;
import kv.p;
import sv.e;
import sv.k0;
import sv.n0;
import tu.x0;
import uu.p1;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$openZip$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final Boolean invoke(ZipEntry it) {
            e0.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readEntry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08221 extends f0 implements p {
        final /* synthetic */ a1 $compressedSize;
        final /* synthetic */ w0 $hasZip64Extra;
        final /* synthetic */ a1 $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ a1 $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08221(w0 w0Var, long j10, a1 a1Var, BufferedSource bufferedSource, a1 a1Var2, a1 a1Var3) {
            super(2);
            this.$hasZip64Extra = w0Var;
            this.$requiredZip64ExtraSize = j10;
            this.$size = a1Var;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = a1Var2;
            this.$offset = a1Var3;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return x0.f87415a;
        }

        public final void invoke(int i10, long j10) throws IOException {
            if (i10 == 1) {
                w0 w0Var = this.$hasZip64Extra;
                if (w0Var.f71863b) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                w0Var.f71863b = true;
                if (j10 < this.$requiredZip64ExtraSize) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                a1 a1Var = this.$size;
                long longLe = a1Var.f71813b;
                if (longLe == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                    longLe = this.$this_readEntry.readLongLe();
                }
                a1Var.f71813b = longLe;
                a1 a1Var2 = this.$compressedSize;
                a1Var2.f71813b = a1Var2.f71813b == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
                a1 a1Var3 = this.$offset;
                a1Var3.f71813b = a1Var3.f71813b == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readOrSkipLocalHeader$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08231 extends f0 implements p {
        final /* synthetic */ b1 $createdAtMillis;
        final /* synthetic */ b1 $lastAccessedAtMillis;
        final /* synthetic */ b1 $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08231(BufferedSource bufferedSource, b1 b1Var, b1 b1Var2, b1 b1Var3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = b1Var;
            this.$lastAccessedAtMillis = b1Var2;
            this.$createdAtMillis = b1Var3;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return x0.f87415a;
        }

        public final void invoke(int i10, long j10) throws IOException {
            if (i10 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.$this_readOrSkipLocalHeader.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.$lastModifiedAtMillis.f71816b = Long.valueOf(bufferedSource.readIntLe() * 1000);
                }
                if (z11) {
                    this.$lastAccessedAtMillis.f71816b = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
                if (z12) {
                    this.$createdAtMillis.f71816b = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
            }
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        Map<Path, ZipEntry> mapMutableMapOf = p1.mutableMapOf(tu.e0.to(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (ZipEntry zipEntry : y0.sortedWith(list, new Comparator() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
            }
        })) {
            if (mapMutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = mapMutableMapOf.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapMutableMapOf.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return mapMutableMapOf;
    }

    private static final Long dosDateTimeToEpochMillis(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i10) {
        StringBuilder sb2 = new StringBuilder("0x");
        String string = Integer.toString(i10, e.checkRadix(16));
        e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final ZipFileSystem openZip(Path zipPath, FileSystem fileSystem, l predicate) throws IOException {
        BufferedSource bufferedSourceBuffer;
        e0.checkNotNullParameter(zipPath, "zipPath");
        e0.checkNotNullParameter(fileSystem, "fileSystem");
        e0.checkNotNullParameter(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = fileHandleOpenReadOnly.size() - 22;
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(size));
                try {
                    if (bufferedSourceBuffer2.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer2);
                        String utf8 = bufferedSourceBuffer2.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer2.close();
                        long j10 = size - 20;
                        if (j10 > 0) {
                            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j10));
                            try {
                                if (bufferedSourceBuffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe = bufferedSourceBuffer.readIntLe();
                                    long longLe = bufferedSourceBuffer.readLongLe();
                                    if (bufferedSourceBuffer.readIntLe() != 1 || intLe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                    try {
                                        int intLe2 = bufferedSourceBuffer.readIntLe();
                                        if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                            throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                        }
                                        eocdRecord = readZip64EocdRecord(bufferedSourceBuffer, eocdRecord);
                                        gv.d.closeFinally(bufferedSourceBuffer, null);
                                    } finally {
                                    }
                                }
                                gv.d.closeFinally(bufferedSourceBuffer, null);
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j11 = 0; j11 < entryCount; j11++) {
                                ZipEntry entry = readEntry(bufferedSourceBuffer);
                                if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            gv.d.closeFinally(bufferedSourceBuffer, null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                            gv.d.closeFinally(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    bufferedSourceBuffer2.close();
                    size--;
                } finally {
                    bufferedSourceBuffer2.close();
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, l lVar, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return openZip(path, fileSystem, lVar);
    }

    public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
        e0.checkNotNullParameter(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i10));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        a1 a1Var = new a1();
        a1Var.f71813b = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        a1 a1Var2 = new a1();
        a1Var2.f71813b = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        a1 a1Var3 = new a1();
        a1Var3.f71813b = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (n0.contains$default((CharSequence) utf8, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = a1Var2.f71813b == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (a1Var.f71813b == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += 8;
        }
        if (a1Var3.f71813b == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += 8;
        }
        w0 w0Var = new w0();
        readExtra(bufferedSource, shortLe4, new C08221(w0Var, j10, a1Var2, bufferedSource, a1Var, a1Var3));
        if (j10 <= 0 || w0Var.f71863b) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(utf8), k0.endsWith$default(utf8, "/", false, 2, null), bufferedSource.readUtf8(shortLe5), intLe2, a1Var.f71813b, a1Var2.f71813b, shortLe2, lDosDateTimeToEpochMillis, a1Var3.f71813b);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & bufferedSource.readIntLe(), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i10, p pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - 4;
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            pVar.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(b.e(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata basicMetadata) throws IOException {
        e0.checkNotNullParameter(bufferedSource, "<this>");
        e0.checkNotNullParameter(basicMetadata, "basicMetadata");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, basicMetadata);
        e0.checkNotNull(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        b1 b1Var = new b1();
        b1Var.f71816b = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
        b1 b1Var2 = new b1();
        b1 b1Var3 = new b1();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i10));
        }
        bufferedSource.skip(18L);
        long shortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new C08231(bufferedSource, b1Var, b1Var2, b1Var3));
        return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) b1Var3.f71816b, (Long) b1Var.f71816b, (Long) b1Var2.f71816b, null, 128, null);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        e0.checkNotNullParameter(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
