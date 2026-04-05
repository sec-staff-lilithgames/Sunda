package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class aa extends b3.f {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c3 f92250a;

    public aa(wr.g0 g0Var) {
        this.f92250a = wr.c3.withError(g0Var.getStatus());
    }

    @Override // wr.b3.f
    public wr.c3 pickSubchannel(b3.d dVar) {
        return this.f92250a;
    }

    public String toString() {
        return mh.g1.toStringHelper((Class<?>) aa.class).add("errorResult", this.f92250a).toString();
    }
}
