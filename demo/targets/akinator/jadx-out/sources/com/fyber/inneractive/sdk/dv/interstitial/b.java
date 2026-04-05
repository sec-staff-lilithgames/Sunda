package com.fyber.inneractive.sdk.dv.interstitial;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends InterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23448a;

    public b(d dVar) {
        this.f23448a = dVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f23448a.f23428g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f23448a.f23944a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            d dVar = this.f23448a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, dVar.f23944a, (i) dVar.f23945b, loadAdError.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        d dVar = this.f23448a;
        if (dVar.f23428g != null) {
            dVar.f23430i = interstitialAd2;
            dVar.g();
            this.f23448a.f23428g.g();
        }
    }
}
