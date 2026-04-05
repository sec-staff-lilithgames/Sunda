package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3271ic;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26922c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26923d;

    /* renamed from: e, reason: collision with root package name */
    public j f26924e;

    public k0(j jVar, boolean z10, int i10, int i11, int i12) {
        this.f26924e = jVar;
        this.f26920a = z10;
        this.f26921b = i10;
        this.f26922c = i11;
        this.f26923d = i12;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.e("Resources to load: %s", str);
        IAlog.d("%s %s", "RESOURCES", str);
        j jVar = this.f26924e;
        if (jVar != null) {
            i iVar = (i) jVar;
            if (TextUtils.isEmpty(str) || !str.startsWith(DtbConstants.HTTP) || com.fyber.inneractive.sdk.util.s.a()) {
                return;
            }
            IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(iVar), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.e("onPageFinished - url: %s", str);
        j jVar = this.f26924e;
        if (jVar != null) {
            jVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.e("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.e("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i10), str, webView);
        super.onReceivedError(webView, i10, str, str2);
        j jVar = this.f26924e;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        j jVar = this.f26924e;
        if (jVar == null) {
            return true;
        }
        jVar.a();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f26920a && webResourceRequest != null) {
            IAlog.e("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            b1 b1Var = b1.f26839c;
            int i10 = this.f26921b;
            int i11 = this.f26922c;
            int i12 = this.f26923d;
            b1Var.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), C3271ic.f36943a)) {
                c1 c1Var = (c1) b1Var.f26840a.get(new d1(webResourceRequest));
                if (c1Var != null) {
                    webResourceResponse = new WebResourceResponse(c1Var.f26846c, c1Var.f26847d, c1Var.f26848e, c1Var.f26849f, c1Var.f26845b, new ByteArrayInputStream(c1Var.f26844a));
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) com.fyber.inneractive.sdk.util.f.f26774b.f26775a.poll();
                        if (byteBufferAllocateDirect == null) {
                            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                b1.a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i11);
                            c1 c1VarA = null;
                            while (i12 > 0) {
                                try {
                                    c1VarA = b1.a(httpURLConnection, byteBufferAllocateDirect);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i12 = 0;
                                }
                                if (c1VarA != null) {
                                    break;
                                }
                                i12--;
                            }
                            if (c1VarA != null) {
                                try {
                                    if (c1VarA.a()) {
                                        b1Var.f26840a.put(new d1(webResourceRequest), c1VarA);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c1VarA.f26846c, c1VarA.f26847d, c1VarA.f26848e, c1VarA.f26849f, c1VarA.f26845b, new ByteArrayInputStream(c1VarA.f26844a));
                                    httpURLConnection.disconnect();
                                    com.fyber.inneractive.sdk.util.f.f26774b.f26775a.offer(byteBufferAllocateDirect);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    httpURLConnection.disconnect();
                                }
                            } else {
                                httpURLConnection.disconnect();
                            }
                            com.fyber.inneractive.sdk.util.f.f26774b.f26775a.offer(byteBufferAllocateDirect);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.e("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        j jVar = this.f26924e;
        return jVar != null && jVar.a(webView, str);
    }
}
