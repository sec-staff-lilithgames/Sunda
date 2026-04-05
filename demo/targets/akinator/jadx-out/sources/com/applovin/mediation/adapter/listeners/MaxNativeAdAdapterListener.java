package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.nativeAds.MaxNativeAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface MaxNativeAdAdapterListener extends MaxAdapterListener {
    void onNativeAdClicked();

    void onNativeAdClicked(Bundle bundle);

    void onNativeAdDisplayed(Bundle bundle);

    void onNativeAdLoadFailed(MaxAdapterError maxAdapterError);

    void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle);
}
