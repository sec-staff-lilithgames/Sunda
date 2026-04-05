package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f23061a;

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f23061a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f23061a.f23040e;
        if (webView != null) {
            webView.reload();
            int i10 = IAlog.f26748a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f23061a.f23040e.getUrl());
        }
    }
}
