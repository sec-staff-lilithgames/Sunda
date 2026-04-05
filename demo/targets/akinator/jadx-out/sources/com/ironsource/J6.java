package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    private final F6 f34687a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f34688b;

    public J6(F6 strategy, C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f34687a = strategy;
        this.f34688b = adUnit;
    }

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34688b.a(activity, this.f34687a);
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34687a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34687a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        F6 f62 = this.f34687a;
        f62.a(new G6(f62, null, false, 4, null));
        this.f34687a.loadAd();
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        this.f34687a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        if (!C3210f5.f36691a.a(ironSourceError)) {
            F6 f62 = this.f34687a;
            f62.a(new G6(f62, null, false, 4, null));
        }
        this.f34687a.d().c(ironSourceError);
    }

    @Override // com.ironsource.L6
    public void a() {
        F6 f62 = this.f34687a;
        f62.a(new G6(f62, null, true));
        this.f34687a.d().a();
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34687a.d().a(adInfo);
        C3458t6 c3458t6A = this.f34687a.b().a(false, this.f34687a.c());
        F6 f62 = this.f34687a;
        f62.a(new I6(f62, this.f34688b, c3458t6A));
        c3458t6A.a(this.f34687a);
    }
}
