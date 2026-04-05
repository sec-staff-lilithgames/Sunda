package wr;

import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l4 extends p4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q4 f91023a;

    public l4(q4 q4Var) {
        this.f91023a = q4Var;
    }

    @Override // wr.p4.b, wr.q4
    public void onError(m6 m6Var) {
        this.f91023a.onError(m6Var);
    }

    @Override // wr.p4.b
    public void onResult(s4 s4Var) {
        this.f91023a.onAddresses(s4Var.getAddresses(), s4Var.getAttributes());
    }
}
