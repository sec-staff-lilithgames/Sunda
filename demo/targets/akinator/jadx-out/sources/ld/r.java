package ld;

import ld.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends j0.a {

    /* renamed from: a, reason: collision with root package name */
    public n0 f73290a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f73291b;

    @Override // ld.j0.a
    public j0 build() {
        return new s(this.f73290a, this.f73291b);
    }

    @Override // ld.j0.a
    public j0.a setPrivacyContext(n0 n0Var) {
        this.f73290a = n0Var;
        return this;
    }

    @Override // ld.j0.a
    public j0.a setProductIdOrigin(k0 k0Var) {
        this.f73291b = k0Var;
        return this;
    }
}
