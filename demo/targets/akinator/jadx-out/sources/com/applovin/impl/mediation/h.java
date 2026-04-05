package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.DTBMetricReport;
import com.applovin.impl.b5;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.applovin.impl.h3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.o3;
import com.applovin.impl.p6;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.Constants;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14744b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14745c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14746d;

    /* renamed from: e, reason: collision with root package name */
    private final h3 f14747e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14748f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAdapter f14749g;

    /* renamed from: h, reason: collision with root package name */
    private String f14750h;

    /* renamed from: i, reason: collision with root package name */
    private v2 f14751i;

    /* renamed from: j, reason: collision with root package name */
    private View f14752j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAd f14753k;

    /* renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f14754l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f14755m;

    /* renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f14757o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f14761s;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f14743a = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    private final b f14756n = new b(this, null);

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f14758p = new AtomicBoolean(true);

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f14759q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f14760r = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements MaxSignalCollectionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b5 f14762a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q4 f14763b;

        public a(b5 b5Var, q4 q4Var) {
            this.f14762a = b5Var;
            this.f14763b = q4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f14762a.y() && TextUtils.isEmpty(str)) {
                this.f14763b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f14763b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f14763b.a(new MaxErrorImpl(str));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f14765a;

        private b() {
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f14753k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        private void b(String str, Bundle bundle) {
            if (h.this.f14751i.w().compareAndSet(false, true)) {
                a(str, this.f14765a, new s(this, bundle, 2));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!h.this.f14751i.w().get()) {
                h.this.f14760r.set(true);
                a(str, this.f14765a, new s(this, bundle, 0));
                return;
            }
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.b("MediationAdapterWrapper", h.this.f14748f + ": blocking ad loaded callback for " + h.this.f14751i + " since onAdHidden() has been called");
            }
            h.this.f14744b.u().a(h.this.f14751i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f14765a.a(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f14765a.a(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f14765a.a(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f14765a.c(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f14765a.c(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f14765a.e(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f14759q.compareAndSet(false, true)) {
                this.f14765a.f(h.this.f14751i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f14765a, new s(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f14765a, new u(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f14765a, new s(this, bundle, 9));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f14752j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f14765a, new s(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f14765a, new s(this, bundle, 7));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f14765a, new s(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f14765a, new s(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.k("MediationAdapterWrapper", h.this.f14748f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f14745c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (h.this.f14751i instanceof z2) {
                z2 z2Var = (z2) h.this.f14751i;
                if (z2Var.n0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.o unused = h.this.f14745c;
                    if (com.applovin.impl.sdk.o.a()) {
                        h.this.f14745c.d("MediationAdapterWrapper", h.this.f14748f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f14765a, new v(0, this, z2Var, maxReward, bundle));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f14765a.d(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f14765a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f14765a.a(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError) {
            if (h.this.f14751i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f14745c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f14745c.b("MediationAdapterWrapper", h.this.f14748f + ": blocking ad load failed callback for " + h.this.f14751i + " since onAdHidden() has been called");
                }
                h.this.f14744b.u().a(h.this.f14751i, str);
                return;
            }
            a(str, this.f14765a, new r(0, this, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f14759q.compareAndSet(false, true)) {
                this.f14765a.onAdLoadFailed(h.this.f14750h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (h.this.f14751i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f14745c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f14745c.b("MediationAdapterWrapper", h.this.f14748f + ": blocking ad displayed callback for " + h.this.f14751i + " since onAdHidden() has been called");
                }
                h.this.f14744b.u().a(h.this.f14751i, str);
                return;
            }
            if (!((Boolean) h.this.f14744b.a(o3.f14959m8)).booleanValue()) {
                if (h.this.f14751i.u().compareAndSet(false, true)) {
                    a(str, this.f14765a, new s(this, bundle, 6));
                    return;
                }
                return;
            }
            a(str, this.f14765a, new s(this, bundle, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError, Bundle bundle) {
            if (h.this.f14751i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f14745c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f14745c.b("MediationAdapterWrapper", h.this.f14748f + ": blocking ad display failed callback for " + h.this.f14751i + " since onAdHidden() has been called");
                }
                h.this.f14744b.u().a(h.this.f14751i, str);
                return;
            }
            a(str, this.f14765a, new t(this, 0, maxError, bundle));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f14765a.a(h.this.f14751i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(z2 z2Var, MaxReward maxReward, Bundle bundle) {
            this.f14765a.a(z2Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f14765a.a(h.this.f14751i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f14765a.onAdCollapsed(h.this.f14751i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            h.this.f14743a.post(new v(1, this, runnable, maxAdListener, str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("MediationAdapterWrapper", a.b.m("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th2);
                h.this.f14744b.E().a("MediationAdapterWrapper", str, th2, CollectionUtils.hashMap("adapter_class", h.this.f14747e.b()));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements MaxAdapter.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f14767a;

        /* renamed from: b, reason: collision with root package name */
        private final h3 f14768b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14769c;

        /* renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f14770d;

        public c(com.applovin.impl.sdk.k kVar, h3 h3Var, long j10, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f14767a = kVar;
            this.f14768b = h3Var;
            this.f14769c = j10;
            this.f14770d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new t(this, 1, initializationStatus, str), this.f14768b.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f14767a.S().a(this.f14768b, SystemClock.elapsedRealtime() - this.f14769c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f14770d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends g5 {

        /* renamed from: g, reason: collision with root package name */
        private final WeakReference f14771g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(v2 v2Var) {
            if (v2Var != null) {
                this.f14003a.Z().a(v2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f14759q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, h.this.f14748f + " is timing out " + h.this.f14751i + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            b(h.this.f14751i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f14771g.get();
            if (bVar != null) {
                bVar.a(this.f14004b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f14744b);
            this.f14771g = new WeakReference(h.this.f14756n);
        }
    }

    public h(h3 h3Var, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.k kVar) {
        if (h3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f14746d = h3Var.c();
        this.f14749g = maxAdapter;
        this.f14744b = kVar;
        this.f14745c = kVar.O();
        this.f14747e = h3Var;
        this.f14748f = maxAdapter.getClass().getSimpleName();
        this.f14761s = z10;
    }

    public String toString() {
        return o2.o(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f14748f, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f14749g;
        if (maxAdapter != null) {
            this.f14749g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f14745c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f14748f + "' is already destroyed");
        }
        this.f14752j = null;
        this.f14753k = null;
        this.f14754l = null;
        this.f14755m = null;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f14749g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f14746d, th2);
            this.f14744b.E().a("MediationAdapterWrapper", "sdk_version", th2, CollectionUtils.hashMap("adapter_class", this.f14747e.b()));
            a("sdk_version");
            this.f14744b.T().a(this.f14747e.b(), "sdk_version", this.f14751i);
            return null;
        }
    }

    public boolean j() {
        return this.f14759q.get() && this.f14760r.get();
    }

    public boolean k() {
        return this.f14758p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f14749g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f14756n);
    }

    public MediationServiceImpl.b c() {
        return this.f14756n.f14765a;
    }

    public View d() {
        return this.f14752j;
    }

    public MaxNativeAd e() {
        return this.f14753k;
    }

    public MaxNativeAdView f() {
        return this.f14754l;
    }

    public String g() {
        return this.f14746d;
    }

    public ViewGroup h() {
        return this.f14755m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f14749g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f14756n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f14749g).loadNativeAd(maxAdapterResponseParameters, activity, this.f14756n);
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b(MobileAdsBridgeBase.initializeMethodName, new v(4, this, onCompletionListener, maxAdapterInitializationParameters, activity));
    }

    public void b(v2 v2Var, final Activity activity) {
        Runnable runnable;
        if (a(v2Var, activity)) {
            if (v2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14814c;

                    {
                        this.f14814c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f14814c.a(activity);
                                break;
                            case 1:
                                this.f14814c.b(activity);
                                break;
                            default:
                                this.f14814c.c(activity);
                                break;
                        }
                    }
                };
            } else if (v2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i11 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14814c;

                    {
                        this.f14814c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f14814c.a(activity);
                                break;
                            case 1:
                                this.f14814c.b(activity);
                                break;
                            default:
                                this.f14814c.c(activity);
                                break;
                        }
                    }
                };
            } else if (v2Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i12 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.q

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14814c;

                    {
                        this.f14814c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f14814c.a(activity);
                                break;
                            case 1:
                                this.f14814c.b(activity);
                                break;
                            default:
                                this.f14814c.c(activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + v2Var + ": " + v2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, v2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14745c.a("MediationAdapterWrapper", "Initializing " + this.f14748f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f14747e.r());
        }
        this.f14749g.initialize(maxAdapterInitializationParameters, activity, new c(this.f14744b, this.f14747e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f14749g).showRewardedAd(this.f14757o, activity, this.f14756n);
    }

    public void a(String str, v2 v2Var) {
        this.f14750h = str;
        this.f14751i = v2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f14754l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f14755m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f14749g).showAppOpenAd(this.f14757o, activity, this.f14756n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, v2 v2Var, final Activity activity, MediationServiceImpl.b bVar) {
        Runnable vVar;
        if (v2Var != null) {
            if (!this.f14758p.get()) {
                String str2 = "Mediation adapter '" + this.f14748f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f14757o = maxAdapterResponseParameters;
            this.f14756n.a(bVar);
            MaxAdFormat format = v2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14810c;

                    {
                        this.f14810c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f14810c.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f14810c.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f14810c.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f14810c.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                final int i11 = 1;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14810c;

                    {
                        this.f14810c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f14810c.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f14810c.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f14810c.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f14810c.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                final int i12 = 2;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14810c;

                    {
                        this.f14810c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f14810c.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f14810c.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f14810c.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f14810c.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                final int i13 = 3;
                vVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14810c;

                    {
                        this.f14810c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.f14810c.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f14810c.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f14810c.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f14810c.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else {
                if (format.isAdViewAd()) {
                    vVar = new v(3, this, maxAdapterResponseParameters, format, activity);
                    a(Constants.LOAD_AD, format, new t(this, 2, v2Var, vVar));
                    return;
                }
                throw new IllegalStateException("Failed to load " + v2Var + ": " + v2Var.getFormat() + " is not a supported ad format");
            }
            a(Constants.LOAD_AD, format, new t(this, 2, v2Var, vVar));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, k0 k0Var, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f14749g).showRewardedAd(this.f14757o, viewGroup, k0Var, activity, this.f14756n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f14749g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f14746d, th2);
            this.f14744b.E().a("MediationAdapterWrapper", DTBMetricReport.ADAPTER_VERSION, th2, CollectionUtils.hashMap("adapter_class", this.f14747e.b()));
            a(DTBMetricReport.ADAPTER_VERSION);
            this.f14744b.T().a(this.f14747e.b(), DTBMetricReport.ADAPTER_VERSION, this.f14751i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f14749g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f14756n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f14749g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f14756n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v2 v2Var, Runnable runnable) {
        a(this.f14747e, v2Var);
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start loading ad for " + this.f14746d + " due to: " + th2;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f14756n.a(Constants.LOAD_AD, new MaxErrorImpl(-1, str));
            this.f14744b.E().a("MediationAdapterWrapper", Constants.LOAD_AD, th2, CollectionUtils.hashMap("adapter_class", this.f14747e.b()));
            a(Constants.LOAD_AD);
            this.f14744b.T().a(this.f14747e.b(), Constants.LOAD_AD, this.f14751i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f14749g).showInterstitialAd(this.f14757o, activity, this.f14756n);
    }

    public void a(v2 v2Var, final ViewGroup viewGroup, final k0 k0Var, final Activity activity) {
        Runnable runnable;
        if (a(v2Var, activity)) {
            if (v2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14805c;

                    {
                        this.f14805c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f14805c.a(viewGroup, k0Var, activity);
                                break;
                            default:
                                this.f14805c.b(viewGroup, k0Var, activity);
                                break;
                        }
                    }
                };
            } else if (v2Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i11 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ h f14805c;

                    {
                        this.f14805c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f14805c.a(viewGroup, k0Var, activity);
                                break;
                            default:
                                this.f14805c.b(viewGroup, k0Var, activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + v2Var + ": " + v2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, v2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, k0 k0Var, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f14749g).showInterstitialAd(this.f14757o, viewGroup, k0Var, activity, this.f14756n);
    }

    private boolean a(v2 v2Var, Activity activity) {
        if (v2Var != null) {
            if (v2Var.A() == null) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f14756n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (v2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != v2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f14758p.get()) {
                    String str = "Mediation adapter '" + this.f14748f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
                    this.f14756n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(o2.o(new StringBuilder("Mediation adapter '"), this.f14748f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(Runnable runnable, v2 v2Var) {
        a("show_ad", v2Var.getFormat(), new r(4, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start displaying ad for " + this.f14746d + " due to: " + th2;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f14756n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f14744b.E().a("MediationAdapterWrapper", "show_ad", th2, CollectionUtils.hashMap("adapter_class", this.f14747e.b()));
            a("show_ad");
            this.f14744b.T().a(this.f14747e.b(), "show_ad", this.f14751i);
        }
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, b5 b5Var, Activity activity, q4 q4Var) {
        if (q4Var != null) {
            if (!this.f14758p.get()) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f14748f + "' is disabled. Signal collection ads with this adapter is disabled.");
                q4Var.a(new MaxErrorImpl(o2.o(new StringBuilder("The adapter ("), this.f14748f, ") is disabled")));
                return;
            }
            MaxAdapter maxAdapter = this.f14749g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", new j(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, b5Var, q4Var));
                return;
            } else {
                q4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, o2.o(new StringBuilder("The adapter ("), this.f14748f, ") does not support signal collection")));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, b5 b5Var, q4 q4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(b5Var, q4Var));
        } catch (Throwable th2) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f14746d + " due to: " + th2);
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            q4Var.a(maxErrorImpl);
            this.f14744b.E().a("MediationAdapterWrapper", "collect_signal", th2, CollectionUtils.hashMap("adapter_class", this.f14747e.b()));
            a("collect_signal");
            this.f14744b.T().a(this.f14747e.b(), "collect_signal", this.f14751i);
        }
        if (!q4Var.c() && b5Var.m() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14745c.a("MediationAdapterWrapper", "Failing signal collection " + b5Var + " since it has 0 timeout");
            }
            q4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, o2.o(new StringBuilder("The adapter ("), this.f14748f, ") has 0 timeout")));
        }
    }

    public void a() {
        if (this.f14761s) {
            return;
        }
        b("destroy", new u(this, 1));
    }

    private void a(h3 h3Var, v2 v2Var) {
        a(new d(this, null), h3Var, v2Var);
    }

    private void a(g5 g5Var, h3 h3Var, v2 v2Var) {
        long jM = h3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f14745c;
                StringBuilder sb2 = new StringBuilder("Non-positive timeout set for ");
                if (v2Var != null) {
                    h3Var = v2Var;
                }
                sb2.append(h3Var);
                sb2.append(", not scheduling a timeout");
                oVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar2 = this.f14745c;
            StringBuilder sbR = e2.r(jM, "Setting timeout ", "ms for ");
            if (v2Var != null) {
                h3Var = v2Var;
            }
            sbR.append(h3Var);
            oVar2.a("MediationAdapterWrapper", sbR.toString());
        }
        this.f14744b.r0().a(g5Var, b6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14745c.d("MediationAdapterWrapper", a.b.o(new StringBuilder("Marking "), this.f14748f, " as disabled due to: ", str));
        }
        this.f14758p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        t tVar = new t(this, 3, str, runnable);
        if (a(str, maxAdFormat)) {
            this.f14743a.post(tVar);
            return;
        }
        StringBuilder sbT = a.b.t(str, ":");
        sbT.append(this.f14747e.c());
        p6 p6Var = new p6(this.f14744b, sbT.toString(), tVar);
        if (((Boolean) this.f14744b.a(v4.X)).booleanValue()) {
            this.f14744b.r0().a(p6Var, this.f14747e);
        } else {
            this.f14744b.r0().a(p6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14745c.a("MediationAdapterWrapper", this.f14748f + ": running " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            runnable.run();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14745c.a("MediationAdapterWrapper", this.f14748f + ": finished " + str + "");
            }
        } catch (Throwable th2) {
            StringBuilder sbO = e3.g.o("Failed operation ", str, " for ");
            sbO.append(this.f14746d);
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", sbO.toString(), th2);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f14744b.T().a(this.f14747e.b(), str, this.f14751i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f14747e.b(), mapHashMap);
            this.f14744b.E().a("MediationAdapterWrapper", str, th2, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolA0;
        Boolean boolC0;
        Boolean boolB0;
        MaxAdapter maxAdapter = this.f14749g;
        if (maxAdapter == null) {
            return this.f14747e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if (Constants.LOAD_AD.equals(str) && maxAdFormat != null) {
            v2 v2Var = this.f14751i;
            if (v2Var != null && (boolB0 = v2Var.b0()) != null) {
                return boolB0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            v2 v2Var2 = this.f14751i;
            if (v2Var2 != null && (boolC0 = v2Var2.c0()) != null) {
                return boolC0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            v2 v2Var3 = this.f14751i;
            if (v2Var3 != null && (boolA0 = v2Var3.a0()) != null) {
                return boolA0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f14747e.r();
    }
}
