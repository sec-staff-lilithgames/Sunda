package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.G8;
import com.ironsource.I8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IronSourceNativeAdListener implements I8.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder binder, NativeAdSmashListener smashListener) {
        e0.checkNotNullParameter(binder, "binder");
        e0.checkNotNullParameter(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdLoadFailed(String reason) {
        e0.checkNotNullParameter(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - " + reason));
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdLoadSuccess(G8 adData) {
        e0.checkNotNullParameter(adData, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
