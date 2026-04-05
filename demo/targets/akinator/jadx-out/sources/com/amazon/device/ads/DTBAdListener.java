package com.amazon.device.ads;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface DTBAdListener {
    void onAdClicked(View view);

    void onAdClosed(View view);

    void onAdFailed(View view);

    void onAdLeftApplication(View view);

    void onAdLoaded(View view);

    void onAdOpen(View view);

    void onImpressionFired(View view);

    default void onAdError(View view) {
    }
}
