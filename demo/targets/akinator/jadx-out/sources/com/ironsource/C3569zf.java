package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.U8;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3569zf {

    /* renamed from: a, reason: collision with root package name */
    private final U8.a f39391a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<TestSuiteActivity> f39392b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f39393c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<LevelPlayBannerAdView> f39394d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<LevelPlayInterstitialAd> f39395e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<LevelPlayRewardedAd> f39396f;

    public C3569zf(TestSuiteActivity activity, Handler handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
        this.f39391a = Mb.f34856s.a().c();
        this.f39392b = new WeakReference<>(activity);
        this.f39393c = handler;
        this.f39394d = new AtomicReference<>();
        this.f39395e = new AtomicReference<>();
        this.f39396f = new AtomicReference<>();
    }

    public final void a(Hf loadAdConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f39391a.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f39395e;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA);
        levelPlayInterstitialAd.setListener(new Ef());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void b(Hf loadAdConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f39391a.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f39396f;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA);
        levelPlayRewardedAd.setListener(new Nf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f39395e.get();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f39396f.get();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f39395e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f39396f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    public final void a(Hf loadAdConfig, String description, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            this.f39391a.a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Kf.f34769a.b(description, i10, i11)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f39394d;
            String strA = loadAdConfig.a();
            if (strA == null) {
                strA = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strA, configBuild);
            levelPlayBannerAdView.setBannerListener(new Af());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    private final TestSuiteActivity b() {
        return this.f39392b.get();
    }

    public final void a(double d10) {
        LevelPlayBannerAdView levelPlayBannerAdView;
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.f39394d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f39393c.post(new ri(testSuiteActivityB, levelPlayBannerAdView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.e0.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, Pf.f35205a.a((Context) testSuiteActivity));
    }

    public final void a() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.f39394d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f39393c.post(new ri(testSuiteActivityB, andSet, 1));
    }
}
