package bm;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import zl.a0;
import zl.e0;
import zl.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends a0 {

    /* renamed from: h, reason: collision with root package name */
    public AdManagerInterstitialAd f9719h;

    @Override // zl.t
    public final void b() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f9719h;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f9719h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zl.y
    public final void c(Activity activity, z zVar) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f9719h;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new d(zVar));
            this.f9719h.show(activity);
        } else {
            ((zl.c) zVar).onAdShowFailed(pr.a.internal("InternalGAM interstitial object is null or not loaded"));
        }
    }

    @Override // zl.t
    public final void loadAd(Context context, e0 e0Var) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), c.a(getGamLoader(), getGamUnitData()), new g(this, e0Var));
    }
}
