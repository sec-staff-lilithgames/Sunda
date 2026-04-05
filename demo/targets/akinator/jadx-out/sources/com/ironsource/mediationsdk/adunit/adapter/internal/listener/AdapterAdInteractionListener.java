package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    default void onAdClosed(Map<String, Object> map) {
        onAdClosed();
    }

    void onAdEnded();

    default void onAdEnded(Map<String, Object> map) {
        onAdEnded();
    }

    void onAdStarted();

    default void onAdStarted(Map<String, Object> map) {
        onAdStarted();
    }

    void onAdVisible();

    default void onAdVisible(Map<String, Object> map) {
        onAdVisible();
    }
}
