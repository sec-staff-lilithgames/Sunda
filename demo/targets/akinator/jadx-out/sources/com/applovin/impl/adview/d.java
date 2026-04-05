package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13523a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f13524b = new a();

    public d(com.applovin.impl.sdk.k kVar) {
        this.f13523a = kVar;
    }

    public WebViewRenderProcessClient a() {
        return this.f13524b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f13523a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    d.this.f13523a.O().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }
    }
}
