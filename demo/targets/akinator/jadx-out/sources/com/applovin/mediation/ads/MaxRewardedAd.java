package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import b3.h;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import e3.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f16426b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f16427c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f16428d = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f16429a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f16429a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, k.o());
    }

    public void destroy() {
        this.f16429a.logApiCall("destroy()");
        synchronized (f16427c) {
            f16426b.remove(this.f16429a.getAdUnitId());
        }
        this.f16429a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f16429a.logApiCall("getActivity()");
        return (Activity) f16428d.get();
    }

    public String getAdUnitId() {
        return this.f16429a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f16429a.isReady();
        this.f16429a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f16429a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f16429a.logApiCall("loadAd()");
        this.f16429a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f16429a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f16429a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f16429a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f16429a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f16429a.logApiCall(g.l("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f16429a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f16429a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f16429a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f16429a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f16429a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f16429a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f16429a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f16429a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f16429a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f16429a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f16428d = new WeakReference((Activity) context);
                }
                synchronized (f16427c) {
                    try {
                        Map map = f16426b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f16429a;
        StringBuilder sbB = h.b("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbB.append(activity);
        sbB.append(")");
        maxRewardedAdImpl.logApiCall(sbB.toString());
        k7.b(str2, "MaxRewardedAd");
        this.f16429a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, k0 k0Var, Activity activity) {
        showAd((String) null, viewGroup, k0Var, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, k0 k0Var, Activity activity) {
        showAd(str, null, viewGroup, k0Var, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, k0 k0Var, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f16429a;
        StringBuilder sbB = h.b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbB.append(viewGroup);
        sbB.append(", lifecycle=");
        sbB.append(k0Var);
        sbB.append(", activity=");
        sbB.append(activity);
        sbB.append(")");
        maxRewardedAdImpl.logApiCall(sbB.toString());
        this.f16429a.showAd(str, str2, viewGroup, k0Var, activity);
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
        this.f16429a.logApiCall(g.l("showAd(placement=", str, ", customData=", str2, ")"));
        k7.b(str2, "MaxRewardedAd");
        this.f16429a.showAd(str, str2, getActivity());
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
        MaxRewardedAdImpl maxRewardedAdImpl = this.f16429a;
        StringBuilder sbB = h.b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbB.append(viewGroup);
        sbB.append(", lifecycle=");
        sbB.append(k0Var);
        sbB.append(")");
        maxRewardedAdImpl.logApiCall(sbB.toString());
        this.f16429a.showAd(str, str2, viewGroup, k0Var, getActivity());
    }
}
