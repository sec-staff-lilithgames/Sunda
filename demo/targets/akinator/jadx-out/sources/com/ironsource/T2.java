package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T2 extends C3402q0 {

    /* renamed from: b, reason: collision with root package name */
    private final ISBannerSize f35473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(C3205f0 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        this.f35473b = iSBannerSize;
    }

    @Override // com.ironsource.C3402q0, com.ironsource.InterfaceC3243h2
    public void a(com.ironsource.mediationsdk.i auctionRequestParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.f35473b);
    }
}
