package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Eb implements V5<Db> {

    /* renamed from: a, reason: collision with root package name */
    private final String f34274a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3567zd f34275b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3170d1 f34276c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34277d;

    public Eb(String adm, InterfaceC3567zd providerName, InterfaceC3170d1 adapterConfigs, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f34274a = adm;
        this.f34275b = providerName;
        this.f34276c = adapterConfigs;
        this.f34277d = z10;
    }

    @Override // com.ironsource.V5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Db a() throws Exception {
        InterfaceC3321l9 interfaceC3321l9A = this.f34276c.a(this.f34275b);
        new S(this.f34274a, interfaceC3321l9A, this.f34277d).a();
        if (interfaceC3321l9A != null) {
            return new Db(interfaceC3321l9A.f(), interfaceC3321l9A.e(), interfaceC3321l9A.b(), interfaceC3321l9A.d(), false, 16, null);
        }
        return null;
    }
}
