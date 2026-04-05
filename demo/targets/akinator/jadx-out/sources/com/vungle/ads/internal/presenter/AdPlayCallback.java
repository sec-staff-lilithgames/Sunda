package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AdPlayCallback {
    void onAdClick(String str);

    void onAdEnd(String str);

    void onAdImpression(String str);

    void onAdLeftApplication(String str);

    void onAdRewarded(String str);

    void onAdStart(String str);

    void onFailure(VungleError vungleError);
}
