package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface PAGLoadCallback<Ad> {
    void onAdLoaded(Ad ad2);

    void onError(PAGErrorModel pAGErrorModel);
}
