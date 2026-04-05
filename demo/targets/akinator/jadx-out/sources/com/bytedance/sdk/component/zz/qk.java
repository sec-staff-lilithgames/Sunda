package com.bytedance.sdk.component.zz;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.zz.jpo;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends WebViewClient {

    /* renamed from: jd, reason: collision with root package name */
    private final jpo.InterfaceC0096jpo f19100jd;
    private final WebViewClient jpo;
    private final List<String> wqx;

    public qk(jpo.InterfaceC0096jpo interfaceC0096jpo, WebViewClient webViewClient, List<String> list) {
        this.f19100jd = interfaceC0096jpo;
        this.jpo = webViewClient;
        this.wqx = list;
    }

    private int jpo(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.jpo.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        jpo.InterfaceC0096jpo interfaceC0096jpo = this.f19100jd;
        if (interfaceC0096jpo != null) {
            interfaceC0096jpo.jpo(jpo(webView));
        }
        this.jpo.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.jpo.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.jpo.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.jpo.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.jpo.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.jpo.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        jpo.InterfaceC0096jpo interfaceC0096jpo = this.f19100jd;
        if (interfaceC0096jpo != null) {
            interfaceC0096jpo.jpo();
        }
        return this.jpo.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.jpo.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        jpo.InterfaceC0096jpo interfaceC0096jpo;
        if (jd.jpo(this.wqx, webResourceRequest.getUrl().toString()) && (interfaceC0096jpo = this.f19100jd) != null) {
            interfaceC0096jpo.jpo();
        }
        return this.jpo.shouldInterceptRequest(webView, webResourceRequest);
    }
}
