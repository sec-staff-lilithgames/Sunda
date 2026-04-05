package qw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import pw.b1;
import pw.h0;
import pw.n0;
import pw.z0;
import sv.k0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends pw.r {

    /* renamed from: h, reason: collision with root package name */
    public static final a f83597h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f83598i = n0.a.get$default(n0.f81931c, "/", false, 1, (Object) null);

    /* renamed from: e, reason: collision with root package name */
    public final ClassLoader f83599e;

    /* renamed from: f, reason: collision with root package name */
    public final pw.r f83600f;

    /* renamed from: g, reason: collision with root package name */
    public final tu.o f83601g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final boolean access$keepPath(a aVar, n0 n0Var) {
            aVar.getClass();
            return !k0.endsWith(n0Var.name(), ".class", true);
        }

        public final n0 getROOT() {
            return o.f83598i;
        }

        public final n0 removeBase(n0 n0Var, n0 base) {
            e0.checkNotNullParameter(n0Var, "<this>");
            e0.checkNotNullParameter(base, "base");
            return getROOT().resolve(k0.replace$default(sv.n0.removePrefix(n0Var.toString(), (CharSequence) base.toString()), AbstractJsonLexerKt.STRING_ESC, '/', false, 4, (Object) null));
        }
    }

    public /* synthetic */ o(ClassLoader classLoader, boolean z10, pw.r rVar, int i10, kotlin.jvm.internal.u uVar) {
        this(classLoader, z10, (i10 & 4) != 0 ? pw.r.f81966c : rVar);
    }

    @Override // pw.r
    public z0 appendingSink(n0 file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // pw.r
    public void atomicMove(n0 source, n0 target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // pw.r
    public n0 canonicalize(n0 path) {
        e0.checkNotNullParameter(path, "path");
        return f83598i.resolve(path, true);
    }

    @Override // pw.r
    public void createDirectory(n0 dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // pw.r
    public void createSymlink(n0 source, n0 target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // pw.r
    public void delete(n0 path, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // pw.r
    public List<n0> list(n0 dir) throws FileNotFoundException {
        a aVar;
        e0.checkNotNullParameter(dir, "dir");
        n0 n0Var = f83598i;
        String string = n0Var.resolve(dir, true).relativeTo(n0Var).toString();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (tu.v vVar : (List) this.f83601g.getValue()) {
            pw.r rVar = (pw.r) vVar.component1();
            n0 n0Var2 = (n0) vVar.component2();
            try {
                List<n0> list = rVar.list(n0Var2.resolve(string));
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar = f83597h;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (a.access$keepPath(aVar, (n0) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(aVar.removeBase((n0) it2.next(), n0Var2));
                }
                v0.addAll(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return y0.toList(linkedHashSet);
        }
        throw new FileNotFoundException(o2.s(dir, "file not found: "));
    }

    @Override // pw.r
    public List<n0> listOrNull(n0 dir) {
        a aVar;
        e0.checkNotNullParameter(dir, "dir");
        n0 n0Var = f83598i;
        String string = n0Var.resolve(dir, true).relativeTo(n0Var).toString();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.f83601g.getValue()).iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            tu.v vVar = (tu.v) it.next();
            pw.r rVar = (pw.r) vVar.component1();
            n0 n0Var2 = (n0) vVar.component2();
            List<n0> listListOrNull = rVar.listOrNull(n0Var2.resolve(string));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = listListOrNull.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    aVar = f83597h;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it2.next();
                    if (a.access$keepPath(aVar, (n0) next)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(aVar.removeBase((n0) it3.next(), n0Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                v0.addAll(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return y0.toList(linkedHashSet);
        }
        return null;
    }

    @Override // pw.r
    public pw.q metadataOrNull(n0 path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        if (!a.access$keepPath(f83597h, path)) {
            return null;
        }
        n0 n0Var = f83598i;
        String string = n0Var.resolve(path, true).relativeTo(n0Var).toString();
        for (tu.v vVar : (List) this.f83601g.getValue()) {
            pw.q qVarMetadataOrNull = ((pw.r) vVar.component1()).metadataOrNull(((n0) vVar.component2()).resolve(string));
            if (qVarMetadataOrNull != null) {
                return qVarMetadataOrNull;
            }
        }
        return null;
    }

    @Override // pw.r
    public pw.p openReadOnly(n0 file) throws FileNotFoundException {
        e0.checkNotNullParameter(file, "file");
        if (!a.access$keepPath(f83597h, file)) {
            throw new FileNotFoundException(o2.s(file, "file not found: "));
        }
        n0 n0Var = f83598i;
        String string = n0Var.resolve(file, true).relativeTo(n0Var).toString();
        for (tu.v vVar : (List) this.f83601g.getValue()) {
            try {
                return ((pw.r) vVar.component1()).openReadOnly(((n0) vVar.component2()).resolve(string));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(o2.s(file, "file not found: "));
    }

    @Override // pw.r
    public pw.p openReadWrite(n0 file, boolean z10, boolean z11) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // pw.r
    public z0 sink(n0 file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // pw.r
    public b1 source(n0 file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        if (!a.access$keepPath(f83597h, file)) {
            throw new FileNotFoundException(o2.s(file, "file not found: "));
        }
        n0 n0Var = f83598i;
        URL resource = this.f83599e.getResource(n0.resolve$default(n0Var, file, false, 2, (Object) null).relativeTo(n0Var).toString());
        if (resource == null) {
            throw new FileNotFoundException(o2.s(file, "file not found: "));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return h0.source(inputStream);
    }

    public o(ClassLoader classLoader, boolean z10, pw.r systemFileSystem) {
        e0.checkNotNullParameter(classLoader, "classLoader");
        e0.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f83599e = classLoader;
        this.f83600f = systemFileSystem;
        tu.o oVarLazy = tu.q.lazy(new o6.v0(this, 5));
        this.f83601g = oVarLazy;
        if (z10) {
            ((List) oVarLazy.getValue()).size();
        }
    }
}
