package com.fyber.inneractive.sdk.dv.rewarded;

import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends RewardedAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23458a;

    public a(d dVar) {
        this.f23458a = dVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        com.fyber.inneractive.sdk.dv.c cVar = this.f23458a.f23428g;
        if (cVar != null) {
            cVar.j();
            InneractiveAdRequest inneractiveAdRequest = this.f23458a.f23944a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            d dVar = this.f23458a;
            com.fyber.inneractive.sdk.dv.handler.e.a(spotId, aVar, dVar.f23944a, (i) dVar.f23945b, loadAdError.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        d dVar = this.f23458a;
        if (dVar.f23428g != null) {
            dVar.f23430i = rewardedAd2;
            dVar.g();
            this.f23458a.f23428g.g();
        }
    }
}
