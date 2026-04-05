package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n {
    public final String a(String toHtml) {
        e0.checkNotNullParameter(toHtml, "toHtml");
        return "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        " + toHtml;
    }
}
