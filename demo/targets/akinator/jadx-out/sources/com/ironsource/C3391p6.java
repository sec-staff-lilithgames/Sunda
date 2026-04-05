package com.ironsource;

import android.app.Activity;
import com.ironsource.C3300k6;
import com.ironsource.InterfaceC3259i0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3391p6 implements InterfaceC3441s6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3162cb f38134a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3456t4 f38135b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38136c;

    /* renamed from: d, reason: collision with root package name */
    private final LevelPlayAdInfo f38137d;

    public C3391p6(C3162cb adInternal, InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f38134a = adInternal;
        this.f38135b = currentTimeProvider;
        this.f38136c = currentTimeProvider.a();
        String string = adInternal.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f38137d = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, null, 248, null);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        String string = this.f38134a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f38134a.a(new LevelPlayAdError(string, this.f38134a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f38137d);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public LevelPlayAdInfo b() {
        return this.f38137d;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public InterfaceC3259i0 c() {
        return new InterfaceC3259i0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void loadAd() {
        String string = this.f38134a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f38134a.a(new LevelPlayAdError(string, this.f38134a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f38135b.a() - this.f38136c);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClicked() {
        this.f38134a.a("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClosed() {
        this.f38134a.a("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38134a.a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f38134a.a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38134a.a(error, this.f38135b.a() - this.f38136c);
        this.f38134a.a(C3300k6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        C3162cb c3162cb = this.f38134a;
        c3162cb.a(new C3374o6(c3162cb, adInfo, this.f38135b));
        this.f38134a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a() {
        this.f38134a.a("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38134a.a("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
