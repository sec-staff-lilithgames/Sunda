package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.c2;
import com.applovin.impl.e2;
import com.applovin.impl.k7;
import com.applovin.impl.l7;
import com.applovin.impl.o7;
import com.applovin.impl.r4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.v4;
import com.applovin.impl.x7;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class c extends r4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13520a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13521b;

    /* renamed from: c, reason: collision with root package name */
    private final a f13522c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f13520a = kVar;
        this.f13521b = kVar.O();
        this.f13522c = aVar;
    }

    private void b() {
        this.f13522c.z();
    }

    private void c() {
        this.f13522c.a();
    }

    @Override // com.applovin.impl.r4
    public Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        mapHashMap.putAll(e2.a((AppLovinAdImpl) this.f13522c.g()));
        return mapHashMap;
    }

    public a d() {
        return this.f13522c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f13521b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f13521b.d("AdWebView", "Loaded URL: " + str);
        }
        this.f13522c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f13522c.g();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13521b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (k7.a(webResourceRequest.getUrl().toString(), this.f13520a)) {
            this.f13520a.E().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f13522c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.o.a()) {
            this.f13521b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    @Override // com.applovin.impl.r4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f13522c.g();
        com.applovin.impl.sdk.o.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f13520a.a(v4.F5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.f13521b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.applovin.impl.sdk.ad.b bVarG = this.f13522c.g();
        String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.o.a()) {
            this.f13521b.b("AdWebView", str3 + " for ad: " + bVarG);
        }
        if (k7.a(str2, this.f13520a)) {
            this.f13520a.E().a("adWebViewReceivedError", str2, i10, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.c.a(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f13520a.a(v4.M5)).booleanValue()) {
            throw new RuntimeException(a.b.k("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", bVar != null ? String.valueOf(bVar.getAdIdNumber()) : AbstractJsonLexerKt.NULL));
        }
        if (webView == null || !webView.equals(this.f13522c.f())) {
            return;
        }
        this.f13522c.b();
        AppLovinAdSize appLovinAdSizeK = this.f13522c.k();
        if (k7.a(appLovinAdSizeK)) {
            this.f13522c.a(appLovinAdSizeK);
            this.f13522c.F();
        }
    }

    private boolean a(boolean z10, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z10) {
            return false;
        }
        boolean zL1 = bVar.l1();
        a(uri, zL1, bVar, this.f13520a);
        return zL1;
    }

    private static void a(Uri uri, boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(v4.F6).contains(uri.getScheme())) {
            return;
        }
        kVar.E().d(c2.f13744w0, a(bVar, uri, z10));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z10) {
        Map mapA = e2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z10), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f13522c.a(motionEvent);
    }

    private void a(l7 l7Var, b bVar) {
        a(l7Var, bVar, (Bundle) null);
    }

    private void a(l7 l7Var, b bVar, Bundle bundle) {
        o7 o7VarS1 = l7Var.s1();
        if (o7VarS1 != null) {
            x7.a(o7VarS1.b(), this.f13522c.j());
            a(bVar, o7VarS1.c(), bundle);
        }
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f13522c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof l7) {
                ((l7) currentAd).getAdEventTracker().v();
            }
            this.f13522c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f13521b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String strK;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            strK = a.b.k("Tracked event: ", queryParameter);
        } else {
            strK = a.b.k("Failed to track event: ", queryParameter);
        }
        k7.a(strK, com.applovin.impl.sdk.k.o());
    }
}
