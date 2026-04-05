package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.b6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h2 {

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f14049b;

    /* renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f14050c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAd f14051d;

    /* renamed from: e, reason: collision with root package name */
    private String f14052e;

    /* renamed from: f, reason: collision with root package name */
    private SoftReference f14053f;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f14055h;

    /* renamed from: j, reason: collision with root package name */
    private volatile double f14057j;

    /* renamed from: a, reason: collision with root package name */
    public final Map f14048a = a.b.u();

    /* renamed from: g, reason: collision with root package name */
    private final Object f14054g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f14056i = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f14059a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f14059a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            h2.this.f14051d = appLovinAd;
            if (this.f14059a != null) {
                AppLovinSdkUtils.runOnUiThread(new s8(1, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            if (this.f14059a != null) {
                AppLovinSdkUtils.runOnUiThread(new h9(this, i10, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f14059a.adReceived(appLovinAd);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th2);
                h2.this.f14049b.E().a("IncentivizedAdController", "adLoaded", th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f14059a.failedToReceiveAd(i10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th2);
                h2.this.f14049b.E().a("IncentivizedAdController", "adLoadFailed", th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements k2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAd f14061a;

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f14062b;

        /* renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f14063c;

        /* renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f14064d;

        /* renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f14065e;

        public /* synthetic */ c(h2 h2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i10;
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = h2.this.b();
            if (!StringUtils.isValidString(strB) || !h2.this.f14056i) {
                h2.this.f14049b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = h2.this.f14049b.O();
                    StringBuilder sbO = e3.g.o("Invalid reward state - result: ", strB, " and wasFullyEngaged: ");
                    sbO.append(h2.this.f14056i);
                    oVarO.b("IncentivizedAdController", sbO.toString());
                }
                h2.this.f14049b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    h2.this.f14049b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (h2.this.f14056i) {
                    h2.this.f14049b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        h2.this.f14049b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    h2.this.f14049b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        h2.this.f14049b.O().b("IncentivizedAdController", "Ad closed prematurely from source: ".concat(str));
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(l4.a(str));
                h2.this.f14049b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    h2.this.f14049b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                q2.a(this.f14065e, bVar, i10);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(h2.this.f14057j));
                CollectionUtils.putStringIfValid("source", str, mapHashMap);
                h2.this.f14049b.g().a(c2.f13743w, bVar, mapHashMap);
            }
            if (bVar.L0().getAndSet(true)) {
                return;
            }
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            h2.this.f14049b.r0().a((g5) new k6(bVar, h2.this.f14049b), b6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            q2.a(this.f14063c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            q2.a(this.f14062b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, false));
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                h2.this.f14049b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    h2.this.f14049b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            h2.this.a(appLovinAdF);
            h2.this.f14049b.O();
            if (com.applovin.impl.sdk.o.a()) {
                h2.this.f14049b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            q2.b(this.f14062b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.k2
        public void onAdDisplayFailed(String str) {
            String str2;
            ?? r02 = this.f14061a;
            boolean z10 = r02 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVarF = r02;
            if (z10) {
                bVarF = ((com.applovin.impl.sdk.ad.c) r02).f();
            }
            boolean z11 = this.f14062b instanceof k2;
            if (bVarF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = bVarF;
                a(bVar, a(bVar, StringUtils.isValidString(str)));
            } else {
                if (bVarF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVarF;
                }
                h2.this.f14049b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    h2.this.f14049b.O().b("IncentivizedAdController", a.b.o(new StringBuilder("Received `"), z11 ? "adDisplayFailed" : "adHidden", "` callback for ", str2));
                }
            }
            h2.this.a(bVarF);
            if (z11) {
                q2.a(this.f14062b, str);
            } else {
                q2.b(this.f14062b, this.f14061a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            h2.this.a("quota_exceeded");
            q2.b(this.f14065e, appLovinAd, map);
            h2.this.f14049b.g().a(c2.f13741v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            h2.this.a("rejected");
            q2.a(this.f14065e, appLovinAd, map);
            h2.this.f14049b.g().a(c2.f13741v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            h2.this.a("accepted");
            q2.c(this.f14065e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            h2.this.a("network_timeout");
            q2.a(this.f14065e, appLovinAd, i10);
            h2.this.f14049b.g().a(c2.f13741v, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            q2.a(this.f14064d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z11 = (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) appLovinAdF).S0();
            h2 h2Var = h2.this;
            if (z11) {
                d10 = 100.0d;
            }
            h2Var.f14057j = d10;
            h2.this.f14056i = z10 || z11;
            q2.a(this.f14064d, appLovinAd, h2.this.f14057j, h2.this.f14056i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f14061a = appLovinAd;
            this.f14062b = appLovinAdDisplayListener;
            this.f14063c = appLovinAdClickListener;
            this.f14064d = appLovinAdVideoPlaybackListener;
            this.f14065e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z10) {
            if (StringUtils.isValidString(bVar.F())) {
                return bVar.F();
            }
            if (z10) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public h2(String str, AppLovinSdk appLovinSdk) {
        this.f14049b = appLovinSdk.a();
        this.f14050c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f14052e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f14053f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f14051d != null;
    }

    public String c() {
        return this.f14052e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f14049b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14049b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f14053f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f14051d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f14050c.loadNextIncentivizedAd(this.f14052e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f14051d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.k0 k0Var, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, viewGroup, k0Var, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.k0 k0Var, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f14051d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, viewGroup, k0Var, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f14054g) {
            str = this.f14055h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f14049b.r0().a((g5) new q6(bVar, appLovinAdRewardListener, this.f14049b), b6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f14054g) {
            this.f14055h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f14048a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = e2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapA);
        this.f14049b.g().d(c2.f13729p, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = k7.a(appLovinAdImpl, this.f14049b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f14049b.z0(), context);
        for (String str : this.f14048a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f14048a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.k0 k0Var, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = e2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapA);
        this.f14049b.g().d(c2.f13729p, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = k7.a(appLovinAdImpl, this.f14049b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f14049b.z0(), context);
        for (String str : this.f14048a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f14048a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, k0Var);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, k2 k2Var) {
        q2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        q2.a(k2Var, str);
        Map mapA = e2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f14049b.g().d(c2.f13735s, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f14051d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f14051d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f14051d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
