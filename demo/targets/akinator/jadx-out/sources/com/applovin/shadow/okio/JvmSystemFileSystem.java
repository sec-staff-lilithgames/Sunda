package com.applovin.shadow.okio;

import b0.e2;
import com.applovin.shadow.okio.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class JvmSystemFileSystem extends FileSystem {
    private final void requireCreate(Path path) throws IOException {
        if (exists(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    private final void requireExist(Path path) throws IOException {
        if (exists(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        if (z10) {
            requireExist(file);
        }
        return Okio.sink(file.toFile(), true);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        Path.Companion companion = Path.Companion;
        e0.checkNotNull(canonicalFile);
        return Path.Companion.get$default(companion, canonicalFile, false, 1, (Object) null);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
        if (fileMetadataMetadataOrNull == null || !fileMetadataMetadataOrNull.isDirectory()) {
            throw new IOException(e2.j(dir, "failed to create directory: "));
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException(e2.j(path, "failed to delete "));
        }
        if (z10) {
            throw new FileNotFoundException(e2.j(path, "no such file: "));
        }
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

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        e0.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        e0.checkNotNullParameter(file, "file");
        return new JvmFileHandle(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        e0.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z10) {
            requireCreate(file);
        }
        if (z11) {
            requireExist(file);
        }
        return new JvmFileHandle(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        if (z10) {
            requireCreate(file);
        }
        return Okio__JvmOkioKt.sink$default(file.toFile(), false, 1, null);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) {
        e0.checkNotNullParameter(file, "file");
        return Okio.source(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z10) {
                return null;
            }
            if (file.exists()) {
                throw new IOException(e2.j(path, "failed to list "));
            }
            throw new FileNotFoundException(e2.j(path, "no such file: "));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            e0.checkNotNull(str);
            arrayList.add(path.resolve(str));
        }
        u0.sort(arrayList);
        return arrayList;
    }
}
