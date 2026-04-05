package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C6 implements E6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3560z6 f33922a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f33923b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33924c;

    public C6(C3560z6 strategy, C3458t6 currentAdUnit, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f33922a = strategy;
        this.f33923b = currentAdUnit;
        this.f33924c = z10;
    }

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f33922a.a("show called while loading");
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (!this.f33924c) {
            this.f33922a.a(new B6(this.f33922a, this.f33923b, null, false));
            return;
        }
        C3458t6 c3458t6A = this.f33922a.b().a(false, this.f33922a.c());
        this.f33922a.a(new B6(this.f33922a, this.f33923b, c3458t6A, true));
        this.f33922a.d().b(adInfo);
        c3458t6A.a(this.f33922a);
    }

    @Override // com.ironsource.E6
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f33922a.a("ad info changed while loading");
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        if (this.f33924c) {
            this.f33922a.a("load called while loading");
        }
        this.f33924c = true;
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f33922a.a("show success while loading");
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33922a.a("show failed while loading");
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33922a.a("ad expired while loading");
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33922a.a(new A6(this.f33922a));
        if (this.f33924c) {
            this.f33922a.d().a(ironSourceError);
        }
    }
}
