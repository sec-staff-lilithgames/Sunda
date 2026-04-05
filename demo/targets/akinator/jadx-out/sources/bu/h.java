package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10369b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10370c;

    public h(mt.g0 g0Var, Object obj) {
        this.f10369b = g0Var;
        this.f10370c = obj;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        Object obj = this.f10370c;
        g gVar = new g();
        gVar.f10325c = iu.u.next(obj);
        this.f10369b.subscribe(gVar);
        return gVar.getIterable();
    }
}
