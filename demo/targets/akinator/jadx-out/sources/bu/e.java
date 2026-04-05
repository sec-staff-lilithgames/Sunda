package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10232b;

    public e(mt.g0 g0Var) {
        this.f10232b = g0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        d dVar = new d();
        mt.b0.wrap(this.f10232b).materialize().subscribe(dVar);
        return dVar;
    }
}
