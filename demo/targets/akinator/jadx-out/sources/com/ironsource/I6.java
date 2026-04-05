package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    private final F6 f34665a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f34666b;

    /* renamed from: c, reason: collision with root package name */
    private final C3458t6 f34667c;

    public I6(F6 strategy, C3458t6 currentAdUnit, C3458t6 progressiveAdUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.f34665a = strategy;
        this.f34666b = currentAdUnit;
        this.f34667c = progressiveAdUnit;
    }

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34665a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34665a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        F6 f62 = this.f34665a;
        f62.a(new H6(f62, this.f34666b, this.f34667c, adInfo));
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        F6 f62 = this.f34665a;
        f62.a(new K6(f62, this.f34667c));
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        F6 f62 = this.f34665a;
        f62.a(new G6(f62, this.f34666b, false, 4, null));
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f34665a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34665a.a("show success before progressive load success");
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f34665a.a("show failed before progressive load success");
    }
}
