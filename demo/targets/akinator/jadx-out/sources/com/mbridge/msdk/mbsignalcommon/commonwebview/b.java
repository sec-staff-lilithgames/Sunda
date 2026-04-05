package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WebViewClient> f41873a = new CopyOnWriteArrayList<>();

    public void a(WebViewClient webViewClient) {
        this.f41873a.add(webViewClient);
    }

    public void b(WebViewClient webViewClient) {
        this.f41873a.remove(webViewClient);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().doUpdateVisitedHistory(webView, str, z10);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        try {
            Iterator<WebViewClient> it = this.f41873a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Exception e10) {
            p0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(webView, i10, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            Iterator<WebViewClient> it = this.f41873a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        } catch (Exception e10) {
            p0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th2) {
                p0.b("CommonWebViewClient", th2.getMessage());
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                Iterator<WebViewClient> it = this.f41873a.iterator();
                while (it.hasNext()) {
                    it.next().onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
                }
            }
        } catch (Exception e10) {
            p0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onScaleChanged(webView, f10, f11);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        while (it.hasNext()) {
            it.next().onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        WebResourceResponse webResourceResponseShouldInterceptRequest = null;
        while (it.hasNext()) {
            webResourceResponseShouldInterceptRequest = it.next().shouldInterceptRequest(webView, str);
        }
        return webResourceResponseShouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        boolean zShouldOverrideKeyEvent = false;
        while (it.hasNext()) {
            zShouldOverrideKeyEvent = it.next().shouldOverrideKeyEvent(webView, keyEvent);
        }
        return zShouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Iterator<WebViewClient> it = this.f41873a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            boolean zShouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(webView, str);
            if (zShouldOverrideUrlLoading) {
                z10 = zShouldOverrideUrlLoading;
            }
        }
        return z10;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        try {
            Iterator<WebViewClient> it = this.f41873a.iterator();
            while (it.hasNext()) {
                it.next().onPageCommitVisible(webView, str);
            }
        } catch (Exception e10) {
            p0.b(OcvDtWCQ.Ijyspv, e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            Iterator<WebViewClient> it = this.f41873a.iterator();
            while (it.hasNext()) {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Exception e10) {
            p0.b("CommonWebViewClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseShouldInterceptRequest = null;
        try {
            Iterator<WebViewClient> it = this.f41873a.iterator();
            while (it.hasNext()) {
                webResourceResponseShouldInterceptRequest = it.next().shouldInterceptRequest(webView, webResourceRequest);
            }
            return webResourceResponseShouldInterceptRequest;
        } catch (Exception e10) {
            p0.b("CommonWebViewClient", e10.getMessage());
            return webResourceResponseShouldInterceptRequest;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z10 = false;
        try {
            Iterator<WebViewClient> it = this.f41873a.iterator();
            while (it.hasNext()) {
                boolean zShouldOverrideUrlLoading = it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
                if (zShouldOverrideUrlLoading) {
                    z10 = zShouldOverrideUrlLoading;
                }
            }
            return z10;
        } catch (Exception e10) {
            p0.b("CommonWebViewClient", e10.getMessage());
            return z10;
        }
    }
}
