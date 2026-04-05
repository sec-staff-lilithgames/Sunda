package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i10);

    void onRenderFail(View view, String str, int i10);

    void onRenderSuccess(View view, float f10, float f11);
}
