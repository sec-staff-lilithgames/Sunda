package bm;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import zl.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends AdManagerInterstitialAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final h f9717b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f9718c;

    public g(h hVar, e0 e0Var) {
        this.f9717b = hVar;
        this.f9718c = e0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        ((zl.j) this.f9718c).onAdLoadFailed(this.f9717b, new pr.a(pr.a.f81798p, loadAdError.getCode(), loadAdError.getMessage()));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        h hVar = this.f9717b;
        hVar.f9719h = adManagerInterstitialAd;
        hVar.onAdLoaded();
        ((zl.j) this.f9718c).onAdLoaded(hVar);
    }
}
