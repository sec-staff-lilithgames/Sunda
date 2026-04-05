package com.ironsource;

import android.app.Activity;
import com.ironsource.C3300k6;
import com.ironsource.InterfaceC3259i0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.r6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3424r6 implements InterfaceC3441s6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3162cb f38290a;

    /* renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f38291b;

    public C3424r6(C3162cb adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38290a = adInternal;
        this.f38291b = adInfo;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        String string = this.f38290a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f38290a.a(new LevelPlayAdError(string, this.f38290a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f38291b);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public LevelPlayAdInfo b() {
        return this.f38291b;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public InterfaceC3259i0 c() {
        return new InterfaceC3259i0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38290a.f(), "onAdClicked adInfo: " + this.f38291b, (String) null, 2, (Object) null));
        this.f38290a.f().e(new ei(this, 2));
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f38290a.f(), "onAdClosed adInfo: " + this.f38291b, (String) null, 2, (Object) null));
        this.f38290a.f().d(new ei(this, 0));
        this.f38290a.f().e(new ei(this, 1));
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38290a.a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38290a.a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38290a.a("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38290a.a("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3424r6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f38290a.a(C3300k6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3424r6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3180db interfaceC3180dbK = this$0.f38290a.k();
        if (interfaceC3180dbK != null) {
            interfaceC3180dbK.onAdClosed(this$0.f38291b);
        }
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void loadAd() {
        String string = this.f38290a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        C3162cb.a(this.f38290a, new LevelPlayAdError(string, this.f38290a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, GalEuEfxjome.JBwphfvwr), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a() {
        this.f38290a.a("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38290a.a("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3424r6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        InterfaceC3180db interfaceC3180dbK = this$0.f38290a.k();
        if (interfaceC3180dbK != null) {
            interfaceC3180dbK.onAdClicked(this$0.f38291b);
        }
    }
}
