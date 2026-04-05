package com.ironsource;

import android.app.Activity;
import com.ironsource.C3300k6;
import com.ironsource.InterfaceC3259i0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3408q6 implements InterfaceC3441s6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3162cb f38210a;

    /* renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f38211b;

    public C3408q6(C3162cb adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38210a = adInternal;
        this.f38211b = adInfo;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        String string = this.f38210a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f38210a.a(new LevelPlayAdError(string, this.f38210a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f38211b);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public InterfaceC3259i0 c() {
        return new InterfaceC3259i0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void loadAd() {
        String string = this.f38210a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        C3162cb.a(this.f38210a, new LevelPlayAdError(string, this.f38210a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClicked() {
        this.f38210a.a("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClosed() {
        this.f38210a.a("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3350n0 c3350n0F = this.f38210a.f();
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.f38211b.getPlacementName());
        IronLog.INTERNAL.verbose(C3350n0.a(c3350n0F, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c3350n0F.e().h().e();
        C3162cb c3162cb = this.f38210a;
        c3162cb.a(new C3424r6(c3162cb, levelPlayAdInfo));
        c3350n0F.e(new gi(22, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38210a.a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38210a.a("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38210a.a("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public LevelPlayAdInfo b() {
        return this.f38211b;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38210a.a(a(error, this.f38211b));
        this.f38210a.a(error, this.f38211b);
    }

    private final InterfaceC3441s6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C3210f5.f36691a.a(Pf.f35205a.a(levelPlayAdError))) {
            C3162cb c3162cb = this.f38210a;
            return new C3374o6(c3162cb, levelPlayAdInfo, c3162cb.j());
        }
        return new C3300k6(this.f38210a, C3300k6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a() {
        this.f38210a.a("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3408q6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        InterfaceC3180db interfaceC3180dbK = this$0.f38210a.k();
        if (interfaceC3180dbK != null) {
            interfaceC3180dbK.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
