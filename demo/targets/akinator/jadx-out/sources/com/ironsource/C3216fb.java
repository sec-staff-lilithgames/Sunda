package com.ironsource;

import android.app.Activity;
import com.ironsource.C3162cb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3216fb {

    /* renamed from: a, reason: collision with root package name */
    private final L7 f36695a;

    /* renamed from: b, reason: collision with root package name */
    private final C3162cb f36696b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.fb$a */
    public static final class a implements InterfaceC3503w0 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3503w0
        public AbstractC3486v0 a(boolean z10, C3205f0 adProperties) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            return D9.f34173z.a(adProperties, C3216fb.this.f36695a.e().a(), z10);
        }
    }

    public C3216fb(String adUnitId, C3162cb.b config, C3350n0 adTools, C3265i6 adControllerFactory, L7 provider, InterfaceC3456t4 currentTimeProvider, C3561z7 idFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(idFactory, "idFactory");
        this.f36695a = provider;
        this.f36696b = new C3162cb(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, a(), provider, currentTimeProvider, idFactory);
    }

    public final String b() {
        String string = this.f36696b.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f36696b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f36696b.n();
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f36696b.a(levelPlayInterstitialAdListener != null ? C3234gb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f36696b.a(activity, str);
    }

    private final InterfaceC3503w0 a() {
        return new a();
    }
}
