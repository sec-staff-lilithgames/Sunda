package com.applovin.mediation.adapters;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinAdapterNativeAd extends MaxNativeAd {
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeAd(AppLovinMediationAdapter appLovinMediationAdapter, MaxNativeAd.Builder builder) {
        super(builder);
        this.parentAdapter = appLovinMediationAdapter;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad views: native ad is null");
            return false;
        }
        appLovinMediationAdapter.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
        appLovinNativeAdImpl.registerViewsForInteraction(list, viewGroup);
        return true;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad view for interaction. Native ad is null");
            return;
        }
        appLovinMediationAdapter.d("Preparing view for interaction: " + maxNativeAdView);
        ArrayList arrayList = new ArrayList(5);
        if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
            this.parentAdapter.d("Adding title TextView: " + maxNativeAdView.getTitleTextView());
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (StringUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
            this.parentAdapter.d("Adding advertiser TextView: " + maxNativeAdView.getAdvertiserTextView());
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
            this.parentAdapter.d("Adding body TextView: " + maxNativeAdView.getBodyTextView());
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
            this.parentAdapter.d("Adding CTA button: " + maxNativeAdView.getCallToActionButton());
            this.parentAdapter.d("CTA button is clickable: " + maxNativeAdView.getCallToActionButton().isClickable());
            this.parentAdapter.d("CTA button is enabled: " + maxNativeAdView.getCallToActionButton().isEnabled());
            this.parentAdapter.d("CTA button has onClickListeners: " + maxNativeAdView.getCallToActionButton().hasOnClickListeners());
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
            this.parentAdapter.d("Adding icon image view: " + maxNativeAdView.getIconImageView());
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
    }
}
