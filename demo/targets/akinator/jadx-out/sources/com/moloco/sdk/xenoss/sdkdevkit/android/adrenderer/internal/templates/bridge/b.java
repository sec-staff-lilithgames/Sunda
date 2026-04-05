package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge;

import android.webkit.WebView;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f48342a;

    public b(WebView webView) {
        e0.checkNotNullParameter(webView, "webView");
        this.f48342a = webView;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a() {
        this.f48342a.evaluateJavascript("notifyReadyEvent()", null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a(boolean z10) {
        this.f48342a.evaluateJavascript("setIsViewable(" + z10 + ')', null);
    }
}
