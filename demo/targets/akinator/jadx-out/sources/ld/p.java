package ld;

import ld.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends h0.a {

    /* renamed from: a, reason: collision with root package name */
    public i0 f73286a;

    /* renamed from: b, reason: collision with root package name */
    public a f73287b;

    @Override // ld.h0.a
    public h0 build() {
        return new q(this.f73286a, this.f73287b);
    }

    @Override // ld.h0.a
    public h0.a setAndroidClientInfo(a aVar) {
        this.f73287b = aVar;
        return this;
    }

    @Override // ld.h0.a
    public h0.a setClientType(i0 i0Var) {
        this.f73286a = i0Var;
        return this;
    }
}
