package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    default void onAdLeftApplication(Map<String, Object> map) {
        onAdLeftApplication();
    }

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    default void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onAdLoadSuccess(view, layoutParams);
    }

    void onAdScreenDismissed();

    default void onAdScreenDismissed(Map<String, Object> map) {
        onAdScreenDismissed();
    }

    void onAdScreenPresented();

    default void onAdScreenPresented(Map<String, Object> map) {
        onAdScreenPresented();
    }
}
