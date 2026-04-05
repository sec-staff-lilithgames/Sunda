package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC3543y6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3247h6 extends AbstractC3329m implements InterfaceC3509w6, InterfaceC3526x6 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3282j6 f36836b;

    /* renamed from: c, reason: collision with root package name */
    private final C3205f0 f36837c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3543y6 f36838d;

    public /* synthetic */ C3247h6(InterfaceC3282j6 interfaceC3282j6, C3350n0 c3350n0, C3205f0 c3205f0, InterfaceC3543y6.b bVar, InterfaceC3475u6 interfaceC3475u6, int i10, kotlin.jvm.internal.u uVar) {
        this(interfaceC3282j6, c3350n0, c3205f0, (i10 & 8) != 0 ? new InterfaceC3543y6.b() : bVar, interfaceC3475u6);
    }

    public final void a(Activity activity, C3325ld c3325ld) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f36837c.a(c3325ld);
        this.f36838d.a(activity);
    }

    @Override // com.ironsource.InterfaceC3526x6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f36836b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC3526x6
    public void c(IronSourceError ironSourceError) {
        InterfaceC3282j6 interfaceC3282j6 = this.f36836b;
        String string = this.f36837c.b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC3282j6.a(new LevelPlayAdError(ironSourceError, string, this.f36837c.c()));
    }

    @Override // com.ironsource.J0
    public void g() {
        this.f36836b.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC3526x6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f36836b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC3509w6
    public void onClosed() {
        this.f36836b.onAdClosed();
    }

    public final void p() {
        this.f36838d.loadAd();
    }

    public C3247h6(InterfaceC3282j6 listener, C3350n0 adTools, C3205f0 adProperties, InterfaceC3543y6.b adUnitStrategyFactory, InterfaceC3475u6 fullscreenAdUnitFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f36836b = listener;
        this.f36837c = adProperties;
        this.f36838d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC3526x6
    public void a(IronSourceError ironSourceError) {
        InterfaceC3282j6 interfaceC3282j6 = this.f36836b;
        String string = this.f36837c.b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC3282j6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f36837c.c()));
    }

    @Override // com.ironsource.InterfaceC3526x6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f36836b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC3509w6
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reward, "reward");
        this.f36836b.a(reward);
    }

    @Override // com.ironsource.InterfaceC3526x6
    public void a() {
        this.f36836b.a();
    }
}
