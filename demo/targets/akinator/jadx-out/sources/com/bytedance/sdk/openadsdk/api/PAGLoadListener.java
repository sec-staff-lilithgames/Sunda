package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.jj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface PAGLoadListener<Ad> extends jj {
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.jj
    void onError(int i10, String str);
}
