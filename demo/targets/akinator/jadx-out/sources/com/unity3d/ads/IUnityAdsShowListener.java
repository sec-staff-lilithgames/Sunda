package com.unity3d.ads;

import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IUnityAdsShowListener {
    void onUnityAdsShowClick(String str);

    void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onUnityAdsShowStart(String str);
}
