package com.ironsource;

import android.app.Activity;
import com.ironsource.C3300k6;
import com.ironsource.InterfaceC3259i0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3374o6 implements InterfaceC3441s6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3162cb f38035a;

    /* renamed from: b, reason: collision with root package name */
    private LevelPlayAdInfo f38036b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3456t4 f38037c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38038d;

    public C3374o6(C3162cb adInternal, LevelPlayAdInfo adInfo, InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f38035a = adInternal;
        this.f38036b = adInfo;
        this.f38037c = currentTimeProvider;
        this.f38038d = currentTimeProvider.a();
    }

    private final long d() {
        return this.f38037c.a() - this.f38038d;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        C3325ld c3325ldA = this.f38035a.f().a(this.f38035a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f38036b, str);
        this.f38036b = levelPlayAdInfo;
        C3162cb c3162cb = this.f38035a;
        c3162cb.a(new C3408q6(c3162cb, levelPlayAdInfo));
        this.f38035a.c().a(activity, c3325ldA);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public InterfaceC3259i0 c() {
        O3 o3A = this.f38035a.l().f().a(this.f38035a.h());
        return o3A.d() ? InterfaceC3259i0.a.f36881c.a(o3A.e()) : InterfaceC3259i0.b.f36884a;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void loadAd() {
        this.f38035a.f().e().h().a(Long.valueOf(d()));
        this.f38035a.a(this.f38036b);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClicked() {
        this.f38035a.a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClosed() {
        this.f38035a.a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38035a.a("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3350n0 c3350n0F = this.f38035a.f();
        IronLog.INTERNAL.verbose(C3350n0.a(c3350n0F, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c3350n0F.e().h().a(this.f38036b, adInfo);
        this.f38036b = adInfo;
        c3350n0F.e(new gi(21, this, adInfo));
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38035a.a("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38035a.a("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public LevelPlayAdInfo b() {
        return this.f38036b;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a() {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38035a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f38035a.a(C3300k6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3374o6 this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3180db interfaceC3180dbK = this$0.f38035a.k();
        if (interfaceC3180dbK != null) {
            interfaceC3180dbK.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38035a.a("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
