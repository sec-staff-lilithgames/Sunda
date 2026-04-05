package hv;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements rv.t {

    /* renamed from: a, reason: collision with root package name */
    public final Path f59243a;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f59244b;

    public p(Path start, r[] options) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(options, "options");
        this.f59243a = start;
        this.f59244b = options;
    }

    public static final LinkOption[] access$getLinkOptions(p pVar) {
        pVar.getClass();
        return j.f59208a.toLinkOptions(k0.contains(pVar.f59244b, r.f59247e));
    }

    @Override // rv.t
    public Iterator<Path> iterator() {
        return k0.contains(this.f59244b, r.f59246c) ? rv.w.iterator(new n(this, null)) : rv.w.iterator(new o(this, null));
    }
}
