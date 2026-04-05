package com.ironsource;

import com.ironsource.Me;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3326le {

    /* renamed from: a, reason: collision with root package name */
    private final C3483ue f37169a;

    public C3326le(C3483ue sdkInitResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f37169a = sdkInitResponse;
    }

    public final K1 a() {
        return this.f37169a.a().b().c();
    }

    public final D1 b() {
        return this.f37169a.a().b().b();
    }

    public final Q5 c() {
        return this.f37169a.b();
    }

    public final Me d() {
        return this.f37169a.c();
    }

    public final Hb e() {
        return this.f37169a.a().b().e();
    }

    public final Me.a f() {
        Me.a aVarH = this.f37169a.c().h();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(aVarH, "sdkInitResponse.fullResponse.origin");
        return aVarH;
    }

    public final C3483ue g() {
        return this.f37169a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3326le(C3326le sdkConfig) {
        this(sdkConfig.f37169a);
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
    }
}
