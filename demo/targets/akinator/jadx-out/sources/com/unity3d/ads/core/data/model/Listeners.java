package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Listeners {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String placementId) {
            e0.checkNotNullParameter(placementId, "placementId");
        }

        public static void onComplete(Listeners listeners, String placementId, UnityAds.UnityAdsShowCompletionState state) {
            e0.checkNotNullParameter(placementId, "placementId");
            e0.checkNotNullParameter(state, "state");
        }

        public static void onError(Listeners listeners, String placementId, UnityAds.UnityAdsShowError error, String message) {
            e0.checkNotNullParameter(placementId, "placementId");
            e0.checkNotNullParameter(error, "error");
            e0.checkNotNullParameter(message, "message");
        }

        public static void onLeftApplication(Listeners listeners, String placementId) {
            e0.checkNotNullParameter(placementId, "placementId");
        }

        public static void onStart(Listeners listeners, String placementId) {
            e0.checkNotNullParameter(placementId, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
