package com.ironsource;

import android.app.Activity;
import com.ironsource.C3162cb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3413qb {

    /* renamed from: a, reason: collision with root package name */
    private final C3162cb f38222a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.qb$a */
    public static final class a implements InterfaceC3503w0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L7 f38223a;

        public a(L7 l72) {
            this.f38223a = l72;
        }

        @Override // com.ironsource.InterfaceC3503w0
        public AbstractC3486v0 a(boolean z10, C3205f0 adProperties) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
            return Td.f35501z.a(adProperties, this.f38223a.e().a(), z10);
        }
    }

    public C3413qb(String adUnitId, C3162cb.b config, C3350n0 adTools, C3265i6 adControllerFactory, L7 provider, InterfaceC3456t4 currentTimeProvider, C3561z7 idFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(idFactory, "idFactory");
        this.f38222a = new C3162cb(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String string = this.f38222a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f38222a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f38222a.n();
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f38222a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info(SUvoXnn.MlVDwduBEEXSSBx);
        this.f38222a.a(levelPlayRewardedAdListener != null ? C3429rb.b(levelPlayRewardedAdListener) : null);
    }

    private final a a(L7 l72) {
        return new a(l72);
    }
}
