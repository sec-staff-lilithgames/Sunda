package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ka extends b3.f {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c3 f92739a;

    public ka(wr.c3 c3Var) {
        this.f92739a = (wr.c3) mh.p1.checkNotNull(c3Var, "result");
    }

    @Override // wr.b3.f
    public wr.c3 pickSubchannel(b3.d dVar) {
        return this.f92739a;
    }

    public String toString() {
        return mh.g1.toStringHelper((Class<?>) ka.class).add("result", this.f92739a).toString();
    }
}
