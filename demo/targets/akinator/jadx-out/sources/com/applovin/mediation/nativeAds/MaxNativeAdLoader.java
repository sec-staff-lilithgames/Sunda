package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import e3.g;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f16444a;

    public MaxNativeAdLoader(String str) {
        this(str, k.o());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f16444a.logApiCall("a()");
        this.f16444a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f16444a.logApiCall("b()");
        this.f16444a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f16444a.logApiCall("destroy()");
        this.f16444a.destroy();
    }

    public String getAdUnitId() {
        return this.f16444a.getAdUnitId();
    }

    public String getPlacement() {
        this.f16444a.logApiCall("getPlacement()");
        return this.f16444a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f16444a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f16444a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f16444a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f16444a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f16444a.logApiCall("setCustomData(value=" + str + ")");
        this.f16444a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f16444a.logApiCall(g.l("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f16444a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f16444a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f16444a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f16444a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f16444a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f16444a.logApiCall("setPlacement(placement=" + str + ")");
        this.f16444a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f16444a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f16444a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f16444a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f16444a.loadAd(maxNativeAdView);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f16444a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f16444a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f16444a.destroy(maxAd);
    }
}
