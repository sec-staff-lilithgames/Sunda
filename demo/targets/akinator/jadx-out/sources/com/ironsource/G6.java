package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    private final F6 f34453a;

    /* renamed from: b, reason: collision with root package name */
    private final C3458t6 f34454b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34455c;

    public G6(F6 strategy, C3458t6 c3458t6, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
        this.f34453a = strategy;
        this.f34454b = c3458t6;
        this.f34455c = z10;
    }

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f34453a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f34455c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34453a.a(this.f34455c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34453a.a(this.f34455c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        C3458t6 c3458t6A = this.f34453a.b().a(true, this.f34453a.c());
        F6 f62 = this.f34453a;
        f62.a(new K6(f62, c3458t6A));
        c3458t6A.a(this.f34453a);
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f34453a.a(this.f34455c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ G6(F6 f62, C3458t6 c3458t6, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(f62, c3458t6, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        this.f34453a.a(this.f34455c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f34453a.a(this.f34455c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34453a.a(this.f34455c ? "show success on expired ad" : "show success before load called");
    }
}
