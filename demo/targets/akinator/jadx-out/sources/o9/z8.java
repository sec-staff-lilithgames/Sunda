package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements z9.c, z9.b, z9.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78719b;

    public /* synthetic */ z8(SplashscreenActivity splashscreenActivity) {
        this.f78719b = splashscreenActivity;
    }

    @Override // z9.b
    public void onInappDetailsUpdate(boolean z10) {
        z9.e.getInstance().requestAllPurchases(new z8(this.f78719b));
    }

    @Override // z9.c
    public void onInappInit(boolean z10) {
        this.f78719b.onInitialization(z10);
    }

    @Override // z9.d
    public void onInappPurchasesRequested(boolean z10) {
        SplashscreenActivity splashscreenActivity = this.f78719b;
        splashscreenActivity.F = true;
        splashscreenActivity.goToHomeScreen();
    }
}
