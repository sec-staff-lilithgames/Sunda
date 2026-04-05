package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3402q0 implements InterfaceC3243h2 {

    /* renamed from: a, reason: collision with root package name */
    private final C3205f0 f38198a;

    public C3402q0(C3205f0 adProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        this.f38198a = adProperties;
    }

    @Override // com.ironsource.InterfaceC3243h2
    public void a(com.ironsource.mediationsdk.i auctionRequestParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f38198a.c());
        auctionRequestParams.a(this.f38198a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
