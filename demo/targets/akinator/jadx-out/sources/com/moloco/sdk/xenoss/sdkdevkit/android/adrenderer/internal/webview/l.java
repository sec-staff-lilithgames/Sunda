package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.util.Base64;
import kotlin.jvm.internal.e0;
import sv.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements m {
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.m
    public String a(String content) {
        e0.checkNotNullParameter(content, "content");
        byte[] bytes = d0.trimIndent(content).getBytes(sv.g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 1);
        e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
