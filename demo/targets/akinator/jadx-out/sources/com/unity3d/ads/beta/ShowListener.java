package com.unity3d.ads.beta;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ShowListener<UnityAd> {
    void showClick(UnityAd unityad);

    void showComplete(UnityAd unityad, ShowFinishState showFinishState);

    void showFailed(UnityAd unityad, UnityAdsError unityAdsError);

    void showImpression(UnityAd unityad);

    void showStart(UnityAd unityad);
}
