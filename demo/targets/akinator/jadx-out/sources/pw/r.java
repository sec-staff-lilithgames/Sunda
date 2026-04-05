package pw;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class r implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f81965b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f81966c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final r get(FileSystem fileSystem) {
            kotlin.jvm.internal.e0.checkNotNullParameter(fileSystem, "<this>");
            return new f0(fileSystem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kv.l] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m5890write$default(r rVar, n0 file, boolean z10, kv.l writerAction, int i10, Object obj) throws IOException {
        ?? r42;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.e0.checkNotNullParameter(writerAction, "writerAction");
        j jVarBuffer = h0.buffer(rVar.sink(file, z10));
        Object th2 = null;
        try {
            Object objInvoke = writerAction.invoke(jVarBuffer);
            kotlin.jvm.internal.b0.finallyStart(1);
            if (jVarBuffer != null) {
                try {
                    jVarBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            r42 = th2;
            th2 = objInvoke;
        } catch (Throwable th4) {
            kotlin.jvm.internal.b0.finallyStart(1);
            if (jVarBuffer != null) {
                try {
                    jVarBuffer.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th4, th5);
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            r42 = th4;
        }
        if (r42 == 0) {
            return th2;
        }
        throw r42;
    }

    static {
        d0 d0Var;
        try {
            Class.forName("java.nio.file.Files");
            d0Var = new g0();
        } catch (ClassNotFoundException unused) {
            d0Var = new d0();
        }
        f81966c = d0Var;
        n0.a aVar = n0.f81931c;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(property, "getProperty(...)");
        n0.a.get$default(aVar, property, false, 1, (Object) null);
        ClassLoader classLoader = qw.o.class.getClassLoader();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        new qw.o(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ z0 appendingSink$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rVar.appendingSink(n0Var, z10);
    }

    public static /* synthetic */ void createDirectories$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        rVar.createDirectories(n0Var, z10);
    }

    public static /* synthetic */ void createDirectory$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        rVar.createDirectory(n0Var, z10);
    }

    public static /* synthetic */ void delete$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        rVar.delete(n0Var, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        rVar.deleteRecursively(n0Var, z10);
    }

    public static final r get(FileSystem fileSystem) {
        return f81965b.get(fileSystem);
    }

    public static /* synthetic */ rv.t listRecursively$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rVar.listRecursively(n0Var, z10);
    }

    public static /* synthetic */ p openReadWrite$default(r rVar, n0 n0Var, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return rVar.openReadWrite(n0Var, z10, z11);
    }

    public static /* synthetic */ z0 sink$default(r rVar, n0 n0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rVar.sink(n0Var, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kv.l] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m5891read(n0 file, kv.l readerAction) throws IOException {
        ?? r52;
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.e0.checkNotNullParameter(readerAction, "readerAction");
        k kVarBuffer = h0.buffer(source(file));
        T th2 = null;
        try {
            ?? Invoke = readerAction.invoke(kVarBuffer);
            kotlin.jvm.internal.b0.finallyStart(1);
            if (kVarBuffer != null) {
                try {
                    kVarBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            T t10 = th2;
            th2 = Invoke;
            r52 = t10;
        } catch (Throwable th4) {
            kotlin.jvm.internal.b0.finallyStart(1);
            if (kVarBuffer != null) {
                try {
                    kVarBuffer.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th4, th5);
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            r52 = th4;
        }
        if (r52 == 0) {
            return th2;
        }
        throw r52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kv.l] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m5892write(n0 file, boolean z10, kv.l writerAction) throws IOException {
        ?? r52;
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.e0.checkNotNullParameter(writerAction, "writerAction");
        j jVarBuffer = h0.buffer(sink(file, z10));
        T th2 = null;
        try {
            ?? Invoke = writerAction.invoke(jVarBuffer);
            kotlin.jvm.internal.b0.finallyStart(1);
            if (jVarBuffer != null) {
                try {
                    jVarBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            T t10 = th2;
            th2 = Invoke;
            r52 = t10;
        } catch (Throwable th4) {
            kotlin.jvm.internal.b0.finallyStart(1);
            if (jVarBuffer != null) {
                try {
                    jVarBuffer.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th4, th5);
                }
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            r52 = th4;
        }
        if (r52 == 0) {
            return th2;
        }
        throw r52;
    }

    public final z0 appendingSink(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    public abstract z0 appendingSink(n0 n0Var, boolean z10) throws IOException;

    public abstract void atomicMove(n0 n0Var, n0 n0Var2) throws IOException;

    public abstract n0 canonicalize(n0 n0Var) throws IOException;

    public void copy(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        qw.g.commonCopy(this, source, target);
    }

    public final void createDirectories(n0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        qw.g.commonCreateDirectories(this, dir, z10);
    }

    public final void createDirectory(n0 dir) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(n0 n0Var, boolean z10) throws IOException;

    public abstract void createSymlink(n0 n0Var, n0 n0Var2) throws IOException;

    public final void delete(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(n0 n0Var, boolean z10) throws IOException;

    public void deleteRecursively(n0 fileOrDirectory, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        qw.g.commonDeleteRecursively(this, fileOrDirectory, z10);
    }

    public final boolean exists(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        return qw.g.commonExists(this, path);
    }

    public abstract List<n0> list(n0 n0Var) throws IOException;

    public abstract List<n0> listOrNull(n0 n0Var);

    public rv.t listRecursively(n0 dir, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        return qw.g.commonListRecursively(this, dir, z10);
    }

    public final q metadata(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        return qw.g.commonMetadata(this, path);
    }

    public abstract q metadataOrNull(n0 n0Var) throws IOException;

    public abstract p openReadOnly(n0 n0Var) throws IOException;

    public final p openReadWrite(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract p openReadWrite(n0 n0Var, boolean z10, boolean z11) throws IOException;

    public final z0 sink(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    public abstract z0 sink(n0 n0Var, boolean z10) throws IOException;

    public abstract b1 source(n0 n0Var) throws IOException;

    public final void createDirectories(n0 dir) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(n0 fileOrDirectory) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final rv.t listRecursively(n0 dir) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
