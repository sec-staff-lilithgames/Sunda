package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface AdapterAdRewardListener extends AdapterAdInteractionListener {
    void onAdRewarded();

    default void onAdRewarded(Map<String, Object> map) {
        onAdRewarded();
    }
}
