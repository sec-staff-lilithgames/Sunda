package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D6 implements E6, InterfaceC3509w6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3560z6 f34164a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f34165b;

    /* renamed from: c, reason: collision with root package name */
    private C3458t6 f34166c;

    public D6(C3560z6 strategy, C3458t6 currentAdUnit, C3458t6 c3458t6) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f34164a = strategy;
        this.f34165b = currentAdUnit;
        this.f34166c = c3458t6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34164a.a("show called while showing");
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.f34165b) {
            this.f34164a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.E6
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.f34165b) {
            this.f34164a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.J0
    public void g() {
        this.f34164a.c().g();
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        this.f34164a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC3509w6
    public void onClosed() {
        this.f34164a.a(a(this, null, 1, null));
        this.f34164a.c().onClosed();
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f34165b)) {
            this.f34164a.d().a(adInfo);
        } else {
            this.f34164a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.f34166c) {
            this.f34166c = null;
        } else {
            this.f34164a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        if (!kotlin.jvm.internal.e0.areEqual(adUnit, this.f34165b)) {
            this.f34164a.a("progressive show failed while showing current ad");
            return;
        }
        this.f34164a.a(a(ironSourceError));
        this.f34164a.d().c(ironSourceError);
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.f34166c) {
            this.f34166c = null;
        } else {
            this.f34164a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3509w6
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reward, "reward");
        this.f34164a.c().a(reward);
    }

    public static /* synthetic */ E6 a(D6 d62, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ironSourceError = null;
        }
        return d62.a(ironSourceError);
    }

    private final E6 a(IronSourceError ironSourceError) {
        if (C3210f5.f36691a.a(ironSourceError)) {
            return new B6(this.f34164a, this.f34165b, this.f34166c, true);
        }
        C3458t6 c3458t6 = this.f34166c;
        if (c3458t6 == null) {
            return new A6(this.f34164a);
        }
        if (c3458t6.e() != null) {
            return new B6(this.f34164a, c3458t6, null, false, 8, null);
        }
        return new C6(this.f34164a, c3458t6, false);
    }
}
