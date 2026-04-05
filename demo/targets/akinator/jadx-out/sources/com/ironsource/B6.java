package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B6 implements E6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3560z6 f33886a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f33887b;

    /* renamed from: c, reason: collision with root package name */
    private C3458t6 f33888c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33889d;

    public B6(C3560z6 strategy, C3458t6 currentAdUnit, C3458t6 c3458t6, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f33886a = strategy;
        this.f33887b = currentAdUnit;
        this.f33888c = c3458t6;
        this.f33889d = z10;
    }

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f33886a.a(new D6(this.f33886a, this.f33887b, this.f33888c));
        this.f33887b.a(activity, this.f33886a);
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.e0.areEqual(this.f33887b, adUnit)) {
            this.f33886a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void c(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f33887b)) {
            this.f33886a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        tu.x0 x0Var;
        if (this.f33889d) {
            this.f33886a.a("load called while current ad is loaded");
            return;
        }
        this.f33889d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.f33887b.e();
        if (levelPlayAdInfoE != null) {
            this.f33886a.d().b(levelPlayAdInfoE);
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            this.f33886a.a("current ad is loaded without ad info");
        } else if (this.f33888c == null) {
            C3458t6 c3458t6A = this.f33886a.b().a(false, this.f33886a.c());
            this.f33888c = c3458t6A;
            c3458t6A.a(this.f33886a);
        }
    }

    @Override // com.ironsource.E6
    public void b(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f33888c)) {
            this.f33888c = null;
        } else {
            this.f33886a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f33887b)) {
            this.f33886a.a("show success when loaded");
        } else {
            this.f33886a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ B6(C3560z6 c3560z6, C3458t6 c3458t6, C3458t6 c3458t62, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(c3560z6, c3458t6, c3458t62, (i10 & 8) != 0 ? false : z10);
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f33887b)) {
            this.f33886a.a("show failed when loaded");
        } else {
            this.f33886a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void a(C3458t6 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f33888c)) {
            this.f33888c = null;
        } else if (kotlin.jvm.internal.e0.areEqual(adUnit, this.f33887b)) {
            a();
        }
    }

    private final void a() {
        E6 c62;
        C3458t6 c3458t6 = this.f33888c;
        if (c3458t6 == null) {
            C3560z6 c3560z6 = this.f33886a;
            c3560z6.a(new A6(c3560z6));
        } else {
            if (c3458t6.e() != null) {
                C3560z6 c3560z62 = this.f33886a;
                C3458t6 c3458t62 = this.f33888c;
                kotlin.jvm.internal.e0.checkNotNull(c3458t62);
                c62 = new B6(c3560z62, c3458t62, null, false, 8, null);
            } else {
                C3560z6 c3560z63 = this.f33886a;
                C3458t6 c3458t63 = this.f33888c;
                kotlin.jvm.internal.e0.checkNotNull(c3458t63);
                c62 = new C6(c3560z63, c3458t63, false);
            }
            this.f33886a.a(c62);
        }
        this.f33886a.d().a();
    }
}
