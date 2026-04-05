package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface MaxInterstitialAdapterListener extends MaxAdapterListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClicked(Bundle bundle);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onInterstitialAdDisplayed();

    void onInterstitialAdDisplayed(Bundle bundle);

    void onInterstitialAdHidden();

    void onInterstitialAdHidden(Bundle bundle);

    void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdLoaded();

    void onInterstitialAdLoaded(Bundle bundle);
}
