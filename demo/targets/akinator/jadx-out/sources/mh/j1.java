package mh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j1 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f74640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Iterable f74641f;

    public j1(Iterable iterable) {
        this.f74641f = iterable;
        this.f74640e = (Iterator) p1.checkNotNull(iterable.iterator());
    }

    @Override // mh.b
    public final Object a() {
        k1 k1Var;
        do {
            Iterator it = this.f74640e;
            if (!it.hasNext()) {
                this.f74583b = 3;
                return null;
            }
            k1Var = (k1) it.next();
        } while (!k1Var.isPresent());
        return k1Var.get();
    }
}
