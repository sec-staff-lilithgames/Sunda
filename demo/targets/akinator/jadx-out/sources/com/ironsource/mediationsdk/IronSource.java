package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class IronSource {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        REWARDED_VIDEO(Q6.F0),
        f37252c("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        private String f37256a;

        a(String str) {
            this.f37256a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f37256a;
        }
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return r.m().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        r.m().e(str);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return r.m().a(context);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return r.m().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return r.m().j(str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        r.m().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        r.m().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        r.m().b(activity, str);
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        r.m().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        r.m().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        r.m().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        r.m().g(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        r.m().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        r.m().a(str);
    }
}
