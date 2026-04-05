package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o1 extends l {

    /* renamed from: g, reason: collision with root package name */
    public final xv.v0 f24263g;

    public o1(l lVar, xv.v0 v0Var) {
        this.f24263g = v0Var;
        this.f24240d = lVar.f24240d;
        this.f24239c = lVar.f24239c;
        this.f24241e = lVar.f24241e;
        this.f24237a = lVar.f24237a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        xv.v0 v0Var = this.f24263g;
        if (v0Var != null) {
            v0Var.close();
        }
    }
}
