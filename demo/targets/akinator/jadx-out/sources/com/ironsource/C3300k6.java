package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC3259i0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3300k6 implements InterfaceC3441s6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3162cb f37078a;

    /* renamed from: b, reason: collision with root package name */
    private final a f37079b;

    /* renamed from: c, reason: collision with root package name */
    private final LevelPlayAdInfo f37080c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C3300k6(C3162cb adInternal, a status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        this.f37078a = adInternal;
        this.f37079b = status;
        String string = adInternal.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f37080c = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, null, 248, null);
    }

    private final boolean d() {
        if (this.f37078a.h().length() == 0) {
            C3162cb c3162cb = this.f37078a;
            String string = this.f37078a.e().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
            C3162cb.a(c3162cb, new LevelPlayAdError(string, this.f37078a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f37078a.f().g()) {
            C3162cb c3162cb2 = this.f37078a;
            String string2 = this.f37078a.e().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "adInternal.adId.toString()");
            C3162cb.a(c3162cb2, new LevelPlayAdError(string2, this.f37078a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        C3126ab c3126abA = this.f37078a.l().e().a();
        if (c3126abA != null && c3126abA.a(this.f37078a.h(), this.f37078a.d())) {
            return true;
        }
        C3162cb c3162cb3 = this.f37078a;
        String string3 = this.f37078a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "adInternal.adId.toString()");
        C3162cb.a(c3162cb3, new LevelPlayAdError(string3, this.f37078a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        String str2 = this.f37079b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f37078a.e().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f37078a.a(new LevelPlayAdError(string, this.f37078a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f37080c);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public LevelPlayAdInfo b() {
        return this.f37080c;
    }

    @Override // com.ironsource.InterfaceC3441s6
    public InterfaceC3259i0 c() {
        return new InterfaceC3259i0.a(this.f37079b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void loadAd() {
        if (d()) {
            this.f37078a.o();
        }
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClicked() {
        this.f37078a.a("onAdClicked on " + this.f37079b + " state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdClosed() {
        this.f37078a.a("onAdClosed on " + this.f37079b + " state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f37078a.a("onAdDisplayed on " + this.f37079b + " state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f37078a.a("onAdInfoChanged on " + this.f37079b + " state");
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f37078a.a("onAdLoadFailed on " + this.f37079b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f37078a.a("onAdLoaded on " + this.f37079b + " state");
    }

    public /* synthetic */ C3300k6(C3162cb c3162cb, a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(c3162cb, (i10 & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f37078a.a("onAdDisplayFailed on " + this.f37079b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3441s6
    public void a() {
        this.f37078a.a("onAdExpired on " + this.f37079b + " state");
    }
}
