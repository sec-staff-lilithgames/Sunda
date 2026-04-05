package hm;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends AdManagerInterstitialAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final i f59009b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f59010c;

    public g(i iVar, g0 g0Var) {
        this.f59009b = iVar;
        this.f59010c = g0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f59009b.c(new gm.c(15, this, loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        i iVar = this.f59009b;
        adManagerInterstitialAd.setOnPaidEventListener(new h(iVar));
        iVar.f59012k = adManagerInterstitialAd;
        iVar.c(new gm.c(16, this, adManagerInterstitialAd));
    }
}
