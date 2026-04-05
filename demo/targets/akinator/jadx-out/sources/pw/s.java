package pw;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p0.g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s extends r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f81977f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final r f81978e;

    public s(r delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f81978e = delegate;
    }

    @Override // pw.r
    public z0 appendingSink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return this.f81978e.appendingSink(onPathParameter(file, "appendingSink", C3191e4.h.f36473b), z10);
    }

    @Override // pw.r
    public void atomicMove(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        this.f81978e.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // pw.r
    public n0 canonicalize(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        return onPathResult(this.f81978e.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // pw.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81978e.close();
    }

    @Override // pw.r
    public void createDirectory(n0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        this.f81978e.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z10);
    }

    @Override // pw.r
    public void createSymlink(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        this.f81978e.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    public final r delegate() {
        return this.f81978e;
    }

    @Override // pw.r
    public void delete(n0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        this.f81978e.delete(onPathParameter(path, "delete", "path"), z10);
    }

    @Override // pw.r
    public List<n0> list(n0 dir) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        List<n0> list = this.f81978e.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((n0) it.next(), "list"));
        }
        uu.u0.sort(arrayList);
        return arrayList;
    }

    @Override // pw.r
    public List<n0> listOrNull(n0 dir) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        List<n0> listListOrNull = this.f81978e.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((n0) it.next(), "listOrNull"));
        }
        uu.u0.sort(arrayList);
        return arrayList;
    }

    @Override // pw.r
    public rv.t listRecursively(n0 dir, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        return rv.f0.map(this.f81978e.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z10), new g2(this, 6));
    }

    @Override // pw.r
    public q metadataOrNull(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        q qVarMetadataOrNull = this.f81978e.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (qVarMetadataOrNull == null) {
            return null;
        }
        return qVarMetadataOrNull.getSymlinkTarget() == null ? qVarMetadataOrNull : q.copy$default(qVarMetadataOrNull, false, false, onPathResult(qVarMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public n0 onPathParameter(n0 path, String functionName, String parameterName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.e0.checkNotNullParameter(functionName, "functionName");
        kotlin.jvm.internal.e0.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    public n0 onPathResult(n0 path, String functionName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.e0.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    @Override // pw.r
    public p openReadOnly(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return this.f81978e.openReadOnly(onPathParameter(file, "openReadOnly", C3191e4.h.f36473b));
    }

    @Override // pw.r
    public p openReadWrite(n0 file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return this.f81978e.openReadWrite(onPathParameter(file, "openReadWrite", C3191e4.h.f36473b), z10, z11);
    }

    @Override // pw.r
    public z0 sink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return this.f81978e.sink(onPathParameter(file, "sink", C3191e4.h.f36473b), z10);
    }

    @Override // pw.r
    public b1 source(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        return this.f81978e.source(onPathParameter(file, "source", C3191e4.h.f36473b));
    }

    public String toString() {
        return kotlin.jvm.internal.c1.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.f81978e + ')';
    }
}
