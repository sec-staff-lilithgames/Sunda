package com.applovin.mediation.adapters;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinAdapterNativeListener implements AppLovinNativeAdLoadListener, AppLovinNativeAdEventListener {
    private final MaxNativeAdAdapterListener listener;
    private final MaxAdapterResponseParameters parameters;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeListener(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinMediationAdapter appLovinMediationAdapter, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        this.parameters = maxAdapterResponseParameters;
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxNativeAdAdapterListener;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
    public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad clicked");
        this.listener.onNativeAdClicked();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
    public void onNativeAdLoadFailed(AppLovinError appLovinError) {
        this.parentAdapter.d("Native ad failed to load with error: " + appLovinError);
        this.listener.onNativeAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
    public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad loaded: " + appLovinNativeAd);
        ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(this);
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.loadedNativeAd = appLovinNativeAd;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinNativeAd;
        this.listener.onNativeAdLoaded(new AppLovinAdapterNativeAd(appLovinMediationAdapter, new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setBody(appLovinNativeAd.getBody()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setOptionsView(appLovinNativeAd.getOptionsView()).setMediaView(appLovinNativeAd.getMediaView()).setMainImage(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAdImpl.getMainImageUri())).setMediaContentAspectRatio(appLovinNativeAdImpl.getMainImageAspectRatio()).setStarRating(appLovinNativeAd.getStarRating())), null);
    }
}
