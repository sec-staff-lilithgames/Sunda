package hm;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import em.d0;
import em.e0;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends e0 {

    /* renamed from: k, reason: collision with root package name */
    public AdManagerInterstitialAd f59012k;

    @Override // em.u
    public final void b() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f59012k;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f59012k.setOnPaidEventListener(null);
            this.f59012k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // em.c0
    public final void d(Activity activity, d0 d0Var) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f59012k;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new f(d0Var));
            this.f59012k.show(activity);
        } else {
            ((em.g) d0Var).onAdShowFailed(pr.a.internal("Internal GAM interstitial object is null or not loaded"));
        }
    }

    @Override // em.u
    public final void loadAd(Context context, g0 g0Var) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), n.a(getAdUnit()), new g(this, g0Var));
    }
}
