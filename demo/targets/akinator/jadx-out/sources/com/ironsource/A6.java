package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A6 implements E6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3560z6 f33828a;

    public A6(C3560z6 strategy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        this.f33828a = strategy;
    }

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f33828a.a("show called before load success");
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f33828a.a("load success before load called");
    }

    @Override // com.ironsource.E6
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f33828a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        C3458t6 c3458t6A = this.f33828a.b().a(true, this.f33828a.c());
        this.f33828a.a(new C6(this.f33828a, c3458t6A, true));
        c3458t6A.a(this.f33828a);
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33828a.a("ad expired before load called");
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33828a.a("load failed before load called");
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f33828a.a("ad display success before load called");
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33828a.a("ad display failed before load called");
    }
}
