package gm;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import em.d0;
import em.e0;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends e0 {

    /* renamed from: k, reason: collision with root package name */
    public AdManagerInterstitialAd f57719k;

    @Override // em.u
    public final void b() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f57719k;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f57719k.setOnPaidEventListener(null);
            this.f57719k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // em.c0
    public final void d(Activity activity, d0 d0Var) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f57719k;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new g(d0Var));
            this.f57719k.show(activity);
        } else {
            ((em.g) d0Var).onAdShowFailed(pr.a.internal("Internal GAM interstitial object is null or not loaded"));
        }
    }

    @Override // em.u
    public final void loadAd(Context context, g0 g0Var) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), o.a(getAdUnit()), new h(this, g0Var));
    }
}
