package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I9 implements InterfaceC3321l9 {

    /* renamed from: a, reason: collision with root package name */
    private final C3134b1 f34668a;

    /* renamed from: b, reason: collision with root package name */
    private final F9 f34669b;

    public I9(C3134b1 adapterConfig, F9 adFormatConfigurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f34668a = adapterConfig;
        this.f34669b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC3152c1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3451t
    public long b() {
        return this.f34669b.e();
    }

    @Override // com.ironsource.InterfaceC3152c1
    public String c() {
        String strF = this.f34668a.f();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC3152c1
    public boolean d() {
        return !this.f34668a.j();
    }

    @Override // com.ironsource.InterfaceC3152c1
    public String e() {
        String strA = this.f34668a.a();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3152c1
    public EnumC3359n9 f() {
        return EnumC3359n9.f37971b.a(this.f34668a.d());
    }
}
