package com.ironsource.mediationsdk.ads.nativead.internal;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(AdInfo adInfo);

    void onNativeAdImpression(AdInfo adInfo);

    void onNativeAdLoadFailed(IronSourceError ironSourceError);

    void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}
