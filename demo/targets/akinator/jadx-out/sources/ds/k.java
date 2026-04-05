package ds;

import mh.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends sh.k {

    /* renamed from: j, reason: collision with root package name */
    public final wr.p f52629j;

    public k(wr.p pVar) {
        this.f52629j = pVar;
    }

    @Override // sh.k
    public final void j() {
        this.f52629j.cancel("GrpcFuture was cancelled", null);
    }

    @Override // sh.k
    public final String l() {
        return g1.toStringHelper(this).add("clientCall", this.f52629j).toString();
    }
}
