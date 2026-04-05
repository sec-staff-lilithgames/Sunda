package io.bidmachine;

import io.bidmachine.IAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface AdListener<AdType extends IAd> {
    void onAdClicked(AdType adtype);

    void onAdExpired(AdType adtype);

    void onAdImpression(AdType adtype);

    void onAdLoadFailed(AdType adtype, pr.a aVar);

    void onAdLoaded(AdType adtype);

    void onAdShowFailed(AdType adtype, pr.a aVar);
}
