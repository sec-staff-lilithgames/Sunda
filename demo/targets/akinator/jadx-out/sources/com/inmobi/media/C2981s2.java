package com.inmobi.media;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2981s2 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f33347a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public boolean f33348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2897n2 f33349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f33350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2998t2 f33351e;

    public C2981s2(C2897n2 c2897n2, C2998t2 c2998t2, Handler handler) {
        this.f33349c = c2897n2;
        this.f33350d = handler;
        this.f33351e = c2998t2;
    }

    public static final void a(C2981s2 c2981s2, C2897n2 click, Handler handler, C2998t2 this$1, WebView webView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c2981s2, PcrIk.RckVZmhZpEUNxY);
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "$click");
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "$handler");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$1, "this$1");
        try {
            Thread.sleep((C3100z2.f33678g != null ? r0.getPingInterval() : 0) * 1000);
        } catch (InterruptedException unused) {
        }
        if (c2981s2.f33347a.get()) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
        String str = click.f33111b;
        click.f33118i.set(true);
        handler.post(new zg.h(webView, 18));
        this$1.f33377a.a(click, EnumC3017u4.f33422e);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f33347a.set(true);
        if (this.f33348b || this.f33349c.f33118i.get()) {
            return;
        }
        this.f33351e.f33377a.a(this.f33349c);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f33348b = false;
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).submit(new com.applovin.impl.y8(this, this.f33349c, this.f33350d, this.f33351e, webView, 6));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String str, String failingUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(str, yFkbx.FjeKyCSjJDrOFXv);
        kotlin.jvm.internal.e0.checkNotNullParameter(failingUrl, "failingUrl");
        this.f33348b = true;
        this.f33351e.f33377a.a(this.f33349c, EnumC3017u4.f33422e);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorResponse, "errorResponse");
        this.f33348b = true;
        this.f33351e.f33377a.a(this.f33349c, EnumC3017u4.f33422e);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(detail, "detail");
        return Wf.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return (this.f33349c.f33113d || kotlin.jvm.internal.e0.areEqual(request.getUrl().toString(), this.f33349c.f33111b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f33348b = true;
        this.f33351e.f33377a.a(this.f33349c, EnumC3017u4.f33422e);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        C2897n2 c2897n2 = this.f33349c;
        return (c2897n2.f33113d || kotlin.jvm.internal.e0.areEqual(url, c2897n2.f33111b)) ? false : true;
    }

    public static final void a(WebView webView) {
        try {
            Tf tf2 = webView instanceof Tf ? (Tf) webView : null;
            if (tf2 == null || tf2.f32309a) {
                return;
            }
            ((Tf) webView).stopLoading();
        } catch (Throwable th2) {
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(th2);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }
}
