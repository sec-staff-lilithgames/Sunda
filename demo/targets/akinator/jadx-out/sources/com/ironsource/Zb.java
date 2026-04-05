package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Zb extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private final InternalNativeAdListener f35882a;

    public Zb(InternalNativeAdListener mNativeAdListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f35882a = mNativeAdListener;
    }

    @Override // com.ironsource.K0
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f35882a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.K0
    public void d(AdInfo adInfo) {
        this.f35882a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.K0
    public void a(IronSourceError ironSourceError) {
        this.f35882a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.K0
    public void a(C3325ld placement, AdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        this.f35882a.onNativeAdClicked(adInfo);
    }
}
