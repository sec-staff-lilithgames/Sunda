package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f22995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f22996c;

    public d(AudienceNetworkAds.InitListener initListener, Throwable th2) {
        this.f22995b = initListener;
        this.f22996c = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22995b.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.f22996c));
    }
}
