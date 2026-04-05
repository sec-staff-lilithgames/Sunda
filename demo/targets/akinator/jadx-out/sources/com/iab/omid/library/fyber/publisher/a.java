package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;

/* loaded from: classes7.dex */
public class a extends AdSessionStatePublisher {
    public a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
