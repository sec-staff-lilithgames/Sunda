package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import rv.t;
import tu.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            e0.checkNotNullParameter(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m359write$default(FileSystem fileSystem, Path file, boolean z10, l writerAction, int i10, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z10));
        Throwable th2 = null;
        try {
            objInvoke = writerAction.invoke(bufferedSinkBuffer);
            b0.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            b0.finallyEnd(1);
        } catch (Throwable th4) {
            b0.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    h.addSuppressed(th4, th5);
                }
            }
            b0.finallyEnd(1);
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        e0.checkNotNull(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        e0.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        e0.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ t listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* renamed from: -read, reason: not valid java name */
    public final <T> T m360read(Path file, l readerAction) throws Throwable {
        T t10;
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        Throwable th2 = null;
        try {
            t10 = (T) readerAction.invoke(bufferedSourceBuffer);
            b0.finallyStart(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            b0.finallyEnd(1);
        } catch (Throwable th4) {
            b0.finallyStart(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    h.addSuppressed(th4, th5);
                }
            }
            b0.finallyEnd(1);
            th2 = th4;
            t10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        e0.checkNotNull(t10);
        return t10;
    }

    /* renamed from: -write, reason: not valid java name */
    public final <T> T m361write(Path file, boolean z10, l writerAction) throws Throwable {
        T t10;
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z10));
        Throwable th2 = null;
        try {
            t10 = (T) writerAction.invoke(bufferedSinkBuffer);
            b0.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            b0.finallyEnd(1);
        } catch (Throwable th4) {
            b0.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    h.addSuppressed(th4, th5);
                }
            }
            b0.finallyEnd(1);
            th2 = th4;
            t10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        e0.checkNotNull(t10);
        return t10;
    }

    public final Sink appendingSink(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    public abstract Sink appendingSink(Path path, boolean z10) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        com.applovin.shadow.okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        com.applovin.shadow.okio.internal.FileSystem.commonCreateDirectories(this, dir, z10);
    }

    public final void createDirectory(Path dir) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(Path path, boolean z10) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public final void delete(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z10) throws IOException;

    public void deleteRecursively(Path fileOrDirectory, boolean z10) throws IOException {
        e0.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        com.applovin.shadow.okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, z10);
    }

    public final boolean exists(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path) throws IOException;

    public abstract List<Path> listOrNull(Path path);

    public t listRecursively(Path dir, boolean z10) {
        e0.checkNotNullParameter(dir, "dir");
        return com.applovin.shadow.okio.internal.FileSystem.commonListRecursively(this, dir, z10);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public final FileHandle openReadWrite(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z10, boolean z11) throws IOException;

    public final Sink sink(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    public abstract Sink sink(Path path, boolean z10) throws IOException;

    public abstract Source source(Path path) throws IOException;

    public final void createDirectories(Path dir) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(Path fileOrDirectory) throws IOException {
        e0.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final t listRecursively(Path dir) {
        e0.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }
}
