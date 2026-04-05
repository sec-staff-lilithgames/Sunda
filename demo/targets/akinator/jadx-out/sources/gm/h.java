package gm;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends AdManagerInterstitialAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final j f57716b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f57717c;

    public h(j jVar, g0 g0Var) {
        this.f57716b = jVar;
        this.f57717c = g0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f57716b.c(new c(3, this, loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        j jVar = this.f57716b;
        adManagerInterstitialAd.setOnPaidEventListener(new i(jVar));
        jVar.f57719k = adManagerInterstitialAd;
        jVar.c(new c(2, this, adManagerInterstitialAd));
    }
}
