package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements AudienceNetworkAds.InitResult {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f22997a;

    public e(Throwable th2) {
        this.f22997a = th2;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public String getMessage() {
        return DynamicLoaderFactory.createErrorMessage(this.f22997a);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public boolean isSuccess() {
        return false;
    }
}
