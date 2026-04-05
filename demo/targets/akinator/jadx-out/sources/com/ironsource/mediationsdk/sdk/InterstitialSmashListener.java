package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface InterstitialSmashListener {
    void onInterstitialAdClicked();

    default void onInterstitialAdClicked(Map<String, Object> map) {
        onInterstitialAdClicked();
    }

    void onInterstitialAdClosed();

    default void onInterstitialAdClosed(Map<String, Object> map) {
        onInterstitialAdClosed();
    }

    void onInterstitialAdLoadFailed(IronSourceError ironSourceError);

    default void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    void onInterstitialAdOpened();

    default void onInterstitialAdOpened(Map<String, Object> map) {
        onInterstitialAdOpened();
    }

    void onInterstitialAdReady();

    default void onInterstitialAdReady(Map<String, Object> map) {
        onInterstitialAdReady();
    }

    void onInterstitialAdShowFailed(IronSourceError ironSourceError);

    default void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    void onInterstitialAdShowSucceeded();

    default void onInterstitialAdShowSucceeded(Map<String, Object> map) {
        onInterstitialAdShowSucceeded();
    }

    void onInterstitialAdVisible();

    default void onInterstitialAdVisible(Map<String, Object> map) {
        onInterstitialAdVisible();
    }

    void onInterstitialInitFailed(IronSourceError ironSourceError);

    default void onInterstitialInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onInterstitialInitFailed(ironSourceError);
    }

    void onInterstitialInitSuccess();

    default void onInterstitialInitSuccess(Map<String, Object> map) {
        onInterstitialInitSuccess();
    }
}
