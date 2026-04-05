package com.facebook.ads.redexgen.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class TZ extends WebViewClient {
    public final /* synthetic */ CallableC1555Ta A00;

    public TZ(CallableC1555Ta callableC1555Ta) {
        this.A00 = callableC1555Ta;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1711Ze.A0D(AbstractC1550Sv.A2j);
        return true;
    }
}
