package com.ironsource;

import com.ironsource.L8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3344me implements L8, L8.a {

    /* renamed from: a, reason: collision with root package name */
    private C3326le f37236a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37237b;

    @Override // com.ironsource.L8
    public C3126ab a() {
        C3326le c3326le = this.f37236a;
        if (c3326le != null) {
            return new C3126ab(c3326le);
        }
        return null;
    }

    @Override // com.ironsource.L8
    public O9 b() {
        C3326le c3326le = this.f37236a;
        if (c3326le != null) {
            return new O9(c3326le);
        }
        return null;
    }

    @Override // com.ironsource.L8
    public boolean c() {
        return this.f37237b;
    }

    @Override // com.ironsource.L8.a
    public void d() {
        this.f37237b = true;
    }

    @Override // com.ironsource.L8.a
    public void a(C3326le sdkConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f37236a = sdkConfig;
    }
}
