package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.G5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class w {
    public static final void a(WebView webView, String data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webView, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        webView.loadDataWithBaseURL("https://appassets.androidplatform.net", data, "text/html", G5.N, null);
    }
}
