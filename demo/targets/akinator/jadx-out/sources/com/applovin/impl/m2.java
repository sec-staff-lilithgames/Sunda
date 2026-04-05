package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m2 implements AppLovinInterstitialAdDialog {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f14419a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f14420b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f14421c = a.b.u();

    /* renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f14422d;

    /* renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f14423e;

    /* renamed from: f, reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f14424f;

    /* renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f14425g;

    /* renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f14426h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            m2.this.b(appLovinAd);
            m2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            m2.this.b(i10);
        }
    }

    public m2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f14419a = appLovinSdk.a();
        this.f14420b = new WeakReference(context);
    }

    private long g() {
        String str = this.f14419a.o0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f14419a.a(v4.T1)).longValue());
        }
        return 0L;
    }

    public Map h() {
        return this.f14421c;
    }

    public boolean i() {
        com.applovin.impl.sdk.ad.b bVar = this.f14426h;
        if (bVar == null) {
            return false;
        }
        bVar.A0();
        bVar.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new s8(13, this, bVar));
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f14425g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f14423e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f14422d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f14424f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f14421c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = e2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAd", mapA);
            this.f14419a.g().d(c2.f13729p, mapA);
        }
        AppLovinAd appLovinAdA = k7.a(appLovinAd, this.f14419a);
        Context contextE = e();
        String strA = a(appLovinAdA, appLovinAd, contextE);
        if (StringUtils.isValidString(strA)) {
            a("interstitialAdShowFailed", strA, appLovinAd);
        } else {
            if (((Boolean) this.f14419a.a(v4.L5)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                return;
            }
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, contextE);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f14420b.get();
    }

    public AppLovinAdDisplayListener c() {
        return this.f14423e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f14424f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f14426h;
    }

    public AppLovinAdClickListener b() {
        return this.f14425g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar) {
        this.f14419a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14419a.O().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(androidx.lifecycle.k0 k0Var, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        a((com.applovin.impl.sdk.ad.b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(k0Var, this), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        a(bVar, appLovinAdDisplayListener, str, th2, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (this.f14426h.X0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f14419a.j0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f14419a.e().a() == null && ((Boolean) this.f14419a.a(v4.f15978m2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public boolean a(com.applovin.impl.sdk.ad.b bVar) {
        List listA = k7.a(!bVar.O0(), bVar, this.f14419a, com.applovin.impl.sdk.k.o());
        if (listA.isEmpty()) {
            return false;
        }
        String str = "Missing ad resources: " + listA;
        if (((Boolean) this.f14419a.a(v4.H5)).booleanValue()) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + listA);
            a("missingCachedAdResources", str, bVar);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f14419a.E().a(c2.f13750z0, "missingCachedAdResources", mapHashMap);
            return true;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + listA);
        bVar.Q0();
        HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", mapHashMap2);
        this.f14419a.E().a(c2.f13750z0, "missingCachedAdResources", mapHashMap2);
        return false;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.k0 k0Var) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = e2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAdView", mapA);
            this.f14419a.g().d(c2.f13729p, mapA);
        }
        if (viewGroup != null && k0Var != null) {
            AppLovinAd appLovinAdA = k7.a(appLovinAd, this.f14419a);
            Activity activityV0 = this.f14419a.v0();
            String strA = a(appLovinAdA, appLovinAd, activityV0);
            if (StringUtils.isValidString(strA)) {
                a("interstitialAdShowFailed", strA, appLovinAd);
                return;
            } else {
                if (((Boolean) this.f14419a.a(v4.L5)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new y8(this, k0Var, appLovinAdA, viewGroup, activityV0, 1));
                return;
            }
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public class b implements v1.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f14428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f14429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f14430c;

        public b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f14428a = activity;
            this.f14429b = appLovinFullscreenAdViewObserver;
            this.f14430c = viewGroup;
        }

        @Override // com.applovin.impl.v1.g
        public void a(v1 v1Var) {
            if (d.d(this.f14428a)) {
                String str = PcrIk.CENHjYZnR;
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", str);
                m2.b(m2.this.f14426h, m2.this.f14423e, str, null, this.f14429b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
                m2.this.f14419a.g().a(c2.f13735s, m2.this.f14426h, mapHashMap);
                return;
            }
            this.f14429b.setPresenter(v1Var);
            try {
                v1Var.a(this.f14430c);
            } catch (Throwable th2) {
                String str2 = "Failed to show interstitial: presenter threw exception " + th2;
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", str2);
                m2.b(m2.this.f14426h, m2.this.f14423e, str2, th2, this.f14429b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("source", "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str2, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap2);
                m2.this.f14419a.g().a(c2.f13735s, m2.this.f14426h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.v1.g
        public void a(String str, Throwable th2) {
            m2.b(m2.this.f14426h, m2.this.f14423e, str, th2, this.f14429b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            m2.this.f14419a.g().a(c2.f13735s, m2.this.f14426h, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new s8(15, this, appLovinAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        AppLovinSdkUtils.runOnUiThread(new h9(this, i10, 1));
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.o.c("InterstitialAdDialogWrapper", str, th2);
        if (appLovinAdDisplayListener instanceof k2) {
            q2.a(appLovinAdDisplayListener, str);
        } else {
            q2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    public void a() {
        this.f14425g = null;
        this.f14422d = null;
        this.f14424f = null;
        this.f14423e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f14419a.k().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f14419a.a(v4.G1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f14419a.f().a(bVar);
        this.f14426h = bVar;
        long jG = g();
        this.f14419a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14419a.O().a("InterstitialAdDialogWrapper", p0.o2.n(jG, "Presenting ad with delay ", "ms..."));
        }
        if (((Boolean) this.f14419a.a(v4.W0)).booleanValue()) {
            this.f14419a.h().a(this.f14426h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new s8(14, this, context), jG);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Activity activity) {
        this.f14419a.f().a(bVar);
        this.f14426h = bVar;
        long jG = g();
        this.f14419a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14419a.O().a("InterstitialAdDialogWrapper", p0.o2.n(jG, "Presenting ad with delay ", "ms..."));
        }
        if (((Boolean) this.f14419a.a(v4.W0)).booleanValue()) {
            this.f14419a.h().a(this.f14426h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new al.a(7, this, viewGroup, activity, appLovinFullscreenAdViewObserver), jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f14419a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14419a.O().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        v1.a(this.f14426h, this.f14425g, this.f14423e, this.f14424f, this.f14421c, this.f14419a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.f14423e != null) {
            if (this.f14423e instanceof k2) {
                ((k2) this.f14423e).onAdDisplayFailed(str2);
            } else {
                this.f14423e.adHidden(appLovinAd);
            }
        }
        Map mapA = e2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", str, mapA);
        CollectionUtils.putStringIfValid("error_message", str2, mapA);
        this.f14419a.g().d(c2.f13735s, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f14422d != null) {
            this.f14422d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (this.f14422d != null) {
            this.f14422d.failedToReceiveAd(i10);
        }
    }
}
