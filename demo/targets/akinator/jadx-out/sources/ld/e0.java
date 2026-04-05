package ld;

import ld.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 extends r0.a {

    /* renamed from: a, reason: collision with root package name */
    public t0 f73222a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f73223b;

    @Override // ld.r0.a
    public r0 build() {
        return new f0(this.f73222a, this.f73223b);
    }

    @Override // ld.r0.a
    public r0.a setMobileSubtype(s0 s0Var) {
        this.f73223b = s0Var;
        return this;
    }

    @Override // ld.r0.a
    public r0.a setNetworkType(t0 t0Var) {
        this.f73222a = t0Var;
        return this;
    }
}
