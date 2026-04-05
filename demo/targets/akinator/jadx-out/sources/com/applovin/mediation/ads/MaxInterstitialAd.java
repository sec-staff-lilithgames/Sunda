package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import b3.h;
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
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f16424b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f16425a;

    public MaxInterstitialAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f16425a.logApiCall("destroy()");
        this.f16425a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f16425a.logApiCall("getActivity()");
        return (Activity) f16424b.get();
    }

    public String getAdUnitId() {
        return this.f16425a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f16425a.isReady();
        this.f16425a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f16425a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f16425a.logApiCall("loadAd()");
        this.f16425a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f16425a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f16425a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f16425a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f16425a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f16425a.logApiCall(g.l("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f16425a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f16425a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f16425a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f16425a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f16425a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f16425a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f16425a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f16425a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f16425a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f16425a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f16424b = new WeakReference((Activity) context);
                }
                this.f16425a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f16425a;
        StringBuilder sbB = h.b("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbB.append(activity);
        sbB.append(")");
        maxFullscreenAdImpl.logApiCall(sbB.toString());
        k7.b(str2, "MaxInterstitialAd");
        this.f16425a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, k0 k0Var, Activity activity) {
        showAd((String) null, viewGroup, k0Var, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, k0 k0Var, Activity activity) {
        showAd(str, null, viewGroup, k0Var, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, k0 k0Var, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f16425a;
        StringBuilder sbB = h.b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbB.append(viewGroup);
        sbB.append(", lifecycle=");
        sbB.append(k0Var);
        sbB.append(", activity=");
        sbB.append(activity);
        sbB.append(")");
        maxFullscreenAdImpl.logApiCall(sbB.toString());
        this.f16425a.showAd(str, str2, viewGroup, k0Var, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f16425a.logApiCall(g.l("showAd(placement=", str, ", customData=", str2, ")"));
        k7.b(str2, "MaxInterstitialAd");
        this.f16425a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, k0 k0Var) {
        showAd((String) null, viewGroup, k0Var);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, k0 k0Var) {
        showAd(str, (String) null, viewGroup, k0Var);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, k0 k0Var) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f16425a;
        StringBuilder sbB = h.b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbB.append(viewGroup);
        sbB.append(", lifecycle=");
        sbB.append(k0Var);
        sbB.append(")");
        maxFullscreenAdImpl.logApiCall(sbB.toString());
        this.f16425a.showAd(str, str2, viewGroup, k0Var, getActivity());
    }
}
