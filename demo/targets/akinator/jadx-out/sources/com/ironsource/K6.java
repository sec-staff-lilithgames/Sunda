package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    private final F6 f34753a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f34754b;

    public K6(F6 strategy, C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34753a = strategy;
        this.f34754b = adUnit;
    }

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34753a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34753a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        F6 f62 = this.f34753a;
        f62.a(new J6(f62, this.f34754b));
        this.f34753a.d().b(adInfo);
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        this.f34753a.d().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f34753a.a("show failed while loading");
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        F6 f62 = this.f34753a;
        f62.a(new G6(f62, this.f34754b, false, 4, null));
        this.f34753a.d().a(ironSourceError);
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f34753a.a("ad expired while loading");
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34753a.a("show success while loading");
    }
}
