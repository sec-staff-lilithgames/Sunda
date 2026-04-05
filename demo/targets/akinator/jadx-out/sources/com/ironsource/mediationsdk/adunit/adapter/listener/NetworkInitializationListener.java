package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i10, String str);

    default void onInitFailed(int i10, String str, Map<String, Object> map) {
        onInitFailed(i10, str);
    }

    void onInitSuccess();

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}
