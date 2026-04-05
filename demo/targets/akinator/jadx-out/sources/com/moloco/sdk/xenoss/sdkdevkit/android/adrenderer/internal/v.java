package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class v extends WebView {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.n f48809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        super(context.getApplicationContext());
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f48809b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.n();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.n getHtmlCssFixer() {
        return this.f48809b;
    }
}
