package com.ironsource;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ri implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f38301c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LevelPlayBannerAdView f38302e;

    public /* synthetic */ ri(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView, int i10) {
        this.f38300b = i10;
        this.f38301c = testSuiteActivity;
        this.f38302e = levelPlayBannerAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38300b) {
            case 0:
                C3569zf.a(this.f38301c, this.f38302e);
                break;
            default:
                C3569zf.b(this.f38301c, this.f38302e);
                break;
        }
    }
}
