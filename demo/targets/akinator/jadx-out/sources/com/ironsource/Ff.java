package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ff {

    /* renamed from: a, reason: collision with root package name */
    private final C3569zf f34387a;

    /* renamed from: b, reason: collision with root package name */
    private final Gf f34388b;

    /* renamed from: c, reason: collision with root package name */
    private final V8 f34389c;

    public Ff(C3569zf adsManager, V8 uiLifeCycleListener, Gf javaScriptEvaluator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adsManager, "adsManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f34387a = adsManager;
        this.f34388b = javaScriptEvaluator;
        this.f34389c = uiLifeCycleListener;
    }

    private final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f34388b.a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f34387a.a(d10);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f34389c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f34387a.a();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(Boolean.valueOf(this.f34387a.c())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(Boolean.valueOf(this.f34387a.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z10, boolean z11, String description, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetwork, "adNetwork");
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z10, z11, description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f34389c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f34387a.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f34387a.f();
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z10, boolean z11, String description, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetwork, "adNetwork");
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        this.f34387a.a(new Hf(adNetwork, z10, Boolean.valueOf(z11), str), description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetwork, "adNetwork");
        this.f34387a.a(new Hf(adNetwork, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adNetwork, "adNetwork");
        this.f34387a.b(new Hf(adNetwork, z10, Boolean.valueOf(z11), str));
    }
}
