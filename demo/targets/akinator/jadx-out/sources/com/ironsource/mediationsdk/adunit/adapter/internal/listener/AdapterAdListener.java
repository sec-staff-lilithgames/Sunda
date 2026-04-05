package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface AdapterAdListener {
    void onAdClicked();

    default void onAdClicked(Map<String, Object> map) {
        onAdClicked();
    }

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    default void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str, Map<String, Object> map) {
        onAdLoadFailed(adapterErrorType, i10, str);
    }

    void onAdLoadSuccess();

    default void onAdLoadSuccess(Map<String, Object> map) {
        onAdLoadSuccess();
    }

    void onAdOpened();

    default void onAdOpened(Map<String, Object> map) {
        onAdOpened();
    }

    void onAdShowFailed(int i10, String str);

    default void onAdShowFailed(int i10, String str, Map<String, Object> map) {
        onAdShowFailed(i10, str);
    }
}
