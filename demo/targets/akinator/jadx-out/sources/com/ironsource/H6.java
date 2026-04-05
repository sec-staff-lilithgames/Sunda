package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    private final F6 f34576a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f34577b;

    /* renamed from: c, reason: collision with root package name */
    private final C3458t6 f34578c;

    /* renamed from: d, reason: collision with root package name */
    private LevelPlayAdInfo f34579d;

    public H6(F6 strategy, C3458t6 currentAdUnit, C3458t6 progressiveAdUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34576a = strategy;
        this.f34577b = currentAdUnit;
        this.f34578c = progressiveAdUnit;
        this.f34579d = adInfo;
    }

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34576a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34579d = adInfo;
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34576a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        this.f34576a.d().b(this.f34579d);
        F6 f62 = this.f34576a;
        f62.a(new J6(f62, this.f34578c));
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f34576a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        this.f34576a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void a() {
        F6 f62 = this.f34576a;
        f62.a(new G6(f62, this.f34577b, true));
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34576a.a("show success on progressive ad unit that already loaded");
    }
}
