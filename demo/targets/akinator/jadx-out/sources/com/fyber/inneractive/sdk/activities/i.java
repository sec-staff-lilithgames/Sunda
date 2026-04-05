package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f23059a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f23059a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f23059a.f23040e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f23059a.f23040e.goBack();
    }
}
