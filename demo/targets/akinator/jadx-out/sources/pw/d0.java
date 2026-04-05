package pw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p0.o2;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d0 extends r {
    public static ArrayList a(n0 n0Var, boolean z10) throws IOException {
        File file = n0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z10) {
                return null;
            }
            if (file.exists()) {
                throw new IOException(o2.s(n0Var, "failed to list "));
            }
            throw new FileNotFoundException(o2.s(n0Var, "no such file: "));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.e0.checkNotNull(str);
            arrayList.add(n0Var.resolve(str));
        }
        uu.u0.sort(arrayList);
        return arrayList;
    }

    @Override // pw.r
    public z0 appendingSink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        if (!z10 || exists(file)) {
            return h0.sink(file.toFile(), true);
        }
        throw new IOException(file + " doesn't exist.");
    }

    @Override // pw.r
    public void atomicMove(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // pw.r
    public n0 canonicalize(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        n0.a aVar = n0.f81931c;
        kotlin.jvm.internal.e0.checkNotNull(canonicalFile);
        return n0.a.get$default(aVar, canonicalFile, false, 1, (Object) null);
    }

    @Override // pw.r
    public void createDirectory(n0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        q qVarMetadataOrNull = metadataOrNull(dir);
        if (qVarMetadataOrNull == null || !qVarMetadataOrNull.isDirectory()) {
            throw new IOException(o2.s(dir, "failed to create directory: "));
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // pw.r
    public void createSymlink(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // pw.r
    public void delete(n0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException(o2.s(path, "failed to delete "));
        }
        if (z10) {
            throw new FileNotFoundException(o2.s(path, "no such file: "));
        }
    }

    @Override // pw.r
    public List<n0> list(n0 dir) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        ArrayList arrayListA = a(dir, true);
        kotlin.jvm.internal.e0.checkNotNull(arrayListA);
        return arrayListA;
    }

    @Override // pw.r
    public List<n0> listOrNull(n0 dir) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        return a(dir, false);
    }

    @Override // pw.r
    public q metadataOrNull(n0 path) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new q(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // pw.r
    public p openReadOnly(n0 file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return new c0(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // pw.r
    public p openReadWrite(n0 file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z10 && exists(file)) {
            throw new IOException(file + " already exists.");
        }
        if (!z11 || exists(file)) {
            return new c0(true, new RandomAccessFile(file.toFile(), "rw"));
        }
        throw new IOException(file + " doesn't exist.");
    }

    @Override // pw.r
    public z0 sink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        if (!z10 || !exists(file)) {
            return i0.sink$default(file.toFile(), false, 1, null);
        }
        throw new IOException(file + " already exists.");
    }

    @Override // pw.r
    public b1 source(n0 file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return h0.source(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
