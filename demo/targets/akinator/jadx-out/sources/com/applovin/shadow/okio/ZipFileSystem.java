package com.applovin.shadow.okio;

import b0.e2;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.FixedLengthSource;
import com.applovin.shadow.okio.internal.ZipEntry;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.h;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ZipFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final String comment;
    private final Map<Path, ZipEntry> entries;
    private final FileSystem fileSystem;
    private final Path zipPath;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }

        private Companion() {
        }
    }

    public ZipFileSystem(Path zipPath, FileSystem fileSystem, Map<Path, ZipEntry> entries, String str) {
        e0.checkNotNullParameter(zipPath, "zipPath");
        e0.checkNotNullParameter(fileSystem, "fileSystem");
        e0.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws FileNotFoundException {
        e0.checkNotNullParameter(path, "path");
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        List<Path> list = list(dir, true);
        e0.checkNotNull(list);
        return list;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        e0.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:13:0x0053, B:33:0x0083, B:39:0x008f, B:28:0x0078, B:24:0x0072, B:14:0x005f), top: B:58:0x0053, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:13:0x0053, B:33:0x0083, B:39:0x008f, B:28:0x0078, B:24:0x0072, B:14:0x005f), top: B:58:0x0053, inners: #1, #5 }] */
    @Override // com.applovin.shadow.okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.shadow.okio.FileMetadata metadataOrNull(com.applovin.shadow.okio.Path r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.e0.checkNotNullParameter(r14, r0)
            com.applovin.shadow.okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<com.applovin.shadow.okio.Path, com.applovin.shadow.okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            com.applovin.shadow.okio.internal.ZipEntry r14 = (com.applovin.shadow.okio.internal.ZipEntry) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            com.applovin.shadow.okio.FileMetadata r2 = new com.applovin.shadow.okio.FileMetadata
            boolean r0 = r14.isDirectory()
            r3 = r0 ^ 1
            boolean r4 = r14.isDirectory()
            boolean r0 = r14.isDirectory()
            if (r0 == 0) goto L29
            r6 = r1
            goto L32
        L29:
            long r5 = r14.getSize()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r6 = r0
        L32:
            java.lang.Long r8 = r14.getLastModifiedAtMillis()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            long r3 = r14.getOffset()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4b
            return r2
        L4b:
            com.applovin.shadow.okio.FileSystem r0 = r13.fileSystem
            com.applovin.shadow.okio.Path r3 = r13.zipPath
            com.applovin.shadow.okio.FileHandle r3 = r0.openReadOnly(r3)
            long r4 = r14.getOffset()     // Catch: java.lang.Throwable -> L7c
            com.applovin.shadow.okio.Source r14 = r3.source(r4)     // Catch: java.lang.Throwable -> L7c
            com.applovin.shadow.okio.BufferedSource r14 = com.applovin.shadow.okio.Okio.buffer(r14)     // Catch: java.lang.Throwable -> L7c
            com.applovin.shadow.okio.FileMetadata r2 = com.applovin.shadow.okio.internal.ZipFilesKt.readLocalHeader(r14, r2)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L69
            goto L6c
        L69:
            r0 = move-exception
            r14 = r0
            goto L81
        L6c:
            r14 = r1
            goto L81
        L6e:
            r0 = move-exception
            r2 = r0
            if (r14 == 0) goto L7f
            r14.close()     // Catch: java.lang.Throwable -> L76
            goto L7f
        L76:
            r0 = move-exception
            r14 = r0
            tu.h.addSuppressed(r2, r14)     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r0 = move-exception
            r14 = r0
            goto L90
        L7f:
            r14 = r2
            r2 = r1
        L81:
            if (r14 != 0) goto L8f
            kotlin.jvm.internal.e0.checkNotNull(r2)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L9c
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L8c:
            r0 = move-exception
            r1 = r0
            goto L9c
        L8f:
            throw r14     // Catch: java.lang.Throwable -> L7c
        L90:
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Throwable -> L96
            goto L9a
        L96:
            r0 = move-exception
            tu.h.addSuppressed(r14, r0)
        L9a:
            r2 = r1
            r1 = r14
        L9c:
            if (r1 != 0) goto La2
            kotlin.jvm.internal.e0.checkNotNull(r2)
            return r2
        La2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.ZipFileSystem.metadataOrNull(com.applovin.shadow.okio.Path):com.applovin.shadow.okio.FileMetadata");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        e0.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws Throwable {
        BufferedSource bufferedSourceBuffer;
        e0.checkNotNullParameter(file, "file");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
        if (zipEntry == null) {
            throw new FileNotFoundException(e2.j(file, "no such file: "));
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th2 = null;
        try {
            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th5) {
                    h.addSuppressed(th4, th5);
                }
            }
            bufferedSourceBuffer = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        e0.checkNotNull(bufferedSourceBuffer);
        ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return y0.toList(zipEntry.getChildren());
        }
        if (z10) {
            throw new IOException(e2.j(path, "not a directory: "));
        }
        return null;
    }
}
