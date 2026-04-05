package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.amazon.device.ads.DTBMetricReport;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3110zc extends AbstractC2677a2 {

    /* renamed from: f, reason: collision with root package name */
    public final Hc f33726f;

    /* renamed from: g, reason: collision with root package name */
    public final C2806hc f33727g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33728h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3110zc(Hc hc2, F5 f52, C2806hc onRenderViewProcessGone) {
        super(f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f33726f = hc2;
        this.f33727g = onRenderViewProcessGone;
        this.f33729i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        String str2;
        boolean z10;
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", AbstractC2811i0.a("onShouldOverrideUrlLoading  - url - ", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3093yc) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webView;
            z10 = true;
            if (gestureDetectorOnGestureListenerC3093yc.f33662z) {
                webView.loadUrl(str);
                return true;
            }
            if (!gestureDetectorOnGestureListenerC3093yc.a()) {
                gestureDetectorOnGestureListenerC3093yc.a(this.f33729i);
                return true;
            }
            F5 f53 = this.f32627a;
            if (f53 != null) {
                ((G5) f53).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC3093yc.getPlacementType()) + "  url:" + str);
            }
            F5 f54 = this.f32627a;
            if (f54 != null) {
                ((G5) f54).a("RenderViewClient", AbstractC2811i0.a("Override URL loading :", str));
            }
            gestureDetectorOnGestureListenerC3093yc.l();
            str2 = str;
            Q6 q6A = S6.a(gestureDetectorOnGestureListenerC3093yc.getLandingPageHandler(), this.f33729i, null, str2, null, false, 24);
            F5 f55 = this.f32627a;
            if (f55 != null) {
                ((G5) f55).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC3093yc.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC3093yc.getOriginalUrl() + QpyI.pSJb + str2);
            }
            F5 f56 = this.f32627a;
            if (f56 != null) {
                ((G5) f56).c("RenderViewClient", "landingPage process result - " + q6A.f32162a);
            }
        } else {
            str2 = str;
            z10 = false;
        }
        F5 f57 = this.f32627a;
        if (f57 != null) {
            ((G5) f57).a("RenderViewClient", "Override URL loading :" + str2 + " returned " + z10);
        }
        return z10;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", AbstractC2811i0.a("Resource loading:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3093yc) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webView;
            String url = gestureDetectorOnGestureListenerC3093yc.getUrl();
            if (str == null || url == null || sv.k0.startsWith$default(url, "file:", false, 2, null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC3093yc);
        }
    }

    @Override // com.inmobi.media.AbstractC2677a2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Hc hc2 = this.f33726f;
        if (hc2 != null) {
            Map mapA = hc2.a();
            long j10 = hc2.f31849c;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = hc2.a("WebViewLoadFinished");
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapA, EnumC2993se.f33373a);
        }
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", AbstractC2811i0.a("Page load finished:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3093yc) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webView;
            a(gestureDetectorOnGestureListenerC3093yc);
            if (kotlin.jvm.internal.e0.areEqual("Loading", gestureDetectorOnGestureListenerC3093yc.f33654v)) {
                gestureDetectorOnGestureListenerC3093yc.c("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3093yc.c("window.mraidview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3093yc.C();
            }
        }
        F5 f53 = this.f32627a;
        if (f53 != null) {
            ((G5) f53).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        F5 f54 = this.f32627a;
        if (f54 != null) {
            ((G5) f54).b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Hc hc2 = this.f33726f;
        if (hc2 != null) {
            Map mapA = hc2.a();
            long j10 = hc2.f31849c;
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            mapA.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = hc2.a("PageStarted");
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapA, EnumC2993se.f33373a);
        }
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", AbstractC2811i0.a("Page load started:", str));
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3093yc) {
            F5 f53 = this.f32627a;
            if (f53 != null) {
                ((G5) f53).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC3093yc) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webView;
            a(gestureDetectorOnGestureListenerC3093yc);
            gestureDetectorOnGestureListenerC3093yc.setAndUpdateViewState("Loading");
        }
        F5 f54 = this.f32627a;
        if (f54 != null) {
            ((G5) f54).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        F5 f55 = this.f32627a;
        if (f55 != null) {
            ((G5) f55).b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.e0.checkNotNullParameter(failingUrl, "failingUrl");
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).b("RenderViewClient", "OnReceivedError - errorCode - " + i10 + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        F5 f52 = this.f32627a;
        if (f52 != null) {
            StringBuilder sb2 = new StringBuilder("ReceivedHttpError - error - ");
            sb2.append(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
            sb2.append(", statusCode - ");
            sb2.append(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
            sb2.append(" url - ");
            sb2.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            sb2.append(" isMainFrame - ");
            sb2.append(webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null);
            ((G5) f52).b("RenderViewClient", sb2.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        F5 f52 = this.f32627a;
        if (f52 != null) {
            StringBuilder sb2 = new StringBuilder("onReceivedSSLError - error - ");
            sb2.append(sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
            sb2.append(" - url - ");
            sb2.append(sslError != null ? sslError.getUrl() : null);
            ((G5) f52).b("RenderViewClient", sb2.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        if (!R3.Q()) {
            return false;
        }
        String string = request.getUrl().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return a(view, string);
    }

    @Override // com.inmobi.media.AbstractC2677a2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(detail, "detail");
        int i10 = Build.VERSION.SDK_INT;
        String str = QpyI.VeWOHjxxbbvrLNh;
        if (i10 >= 26) {
            F5 f52 = this.f32627a;
            if (f52 != null) {
                ((G5) f52).c(str, "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.f33727g.invoke(Boolean.valueOf(detail.didCrash()));
        } else {
            F5 f53 = this.f32627a;
            if (f53 != null) {
                ((G5) f53).c(str, "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).b("RenderViewClient", "OnReceivedError - errorCode - " + error.getErrorCode() + ", description - " + ((Object) error.getDescription()) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", AbstractC2811i0.a("shouldOverrideUrlLoading Called ", url));
        }
        return a(view, url);
    }

    public final void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        if (this.f33728h || gestureDetectorOnGestureListenerC3093yc.f33620e) {
            return;
        }
        this.f33728h = true;
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC3093yc.c(gestureDetectorOnGestureListenerC3093yc.getMraidJsString());
    }
}
