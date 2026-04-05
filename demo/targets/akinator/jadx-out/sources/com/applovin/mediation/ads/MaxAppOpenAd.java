package com.applovin.mediation.ads;

import android.content.Context;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f16423a;

    public MaxAppOpenAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f16423a.logApiCall("destroy()");
        this.f16423a.destroy();
    }

    public String getAdUnitId() {
        return this.f16423a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f16423a.isReady();
        this.f16423a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f16423a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f16423a.logApiCall("loadAd()");
        this.f16423a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f16423a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f16423a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f16423a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f16423a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f16423a.logApiCall(g.l("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f16423a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f16423a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f16423a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f16423a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f16423a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f16423a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f16423a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f16423a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f16423a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f16423a;
    }

    @Deprecated
    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.o());
    }

    public void showAd(String str, String str2) {
        this.f16423a.logApiCall(g.l("showAd(placement=", str, ", customData=", str2, ")"));
        k7.b(str2, "MaxAppOpenAd");
        this.f16423a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f16423a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
