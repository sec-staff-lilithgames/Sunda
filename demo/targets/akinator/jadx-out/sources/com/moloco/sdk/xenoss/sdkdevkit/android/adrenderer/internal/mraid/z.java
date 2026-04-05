package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import cv.BLca.YsiBvdpw;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z extends WebViewClientCompat {

    /* renamed from: i, reason: collision with root package name */
    public static final a f48170i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final q f48171b;

    /* renamed from: c, reason: collision with root package name */
    public final k6.s f48172c;

    /* renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f48173e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f48174f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48175g;

    /* renamed from: h, reason: collision with root package name */
    public final StateFlow f48176h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }

        public final Uri a(WebResourceRequest webResourceRequest) {
            String string;
            Uri url = webResourceRequest.getUrl();
            if (url == null || (string = url.toString()) == null) {
                string = "";
            }
            Uri uri = Uri.parse(k0.replace(string, "mraid.js", "com.moloco.sdk.xenoss.sdkdevkit.mraid.js", true));
            e0.checkNotNullExpressionValue(uri, "parse(...)");
            return uri;
        }
    }

    public z(Context context, q mraidJsCommandsSource) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(mraidJsCommandsSource, "mraidJsCommandsSource");
        this.f48171b = mraidJsCommandsSource;
        k6.s sVarBuild = new k6.p().addPathHandler("/", new k6.o(context.getApplicationContext())).build();
        e0.checkNotNullExpressionValue(sVarBuild, "build(...)");
        this.f48172c = sVarBuild;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f48173e = MutableStateFlow;
        this.f48174f = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f48175g = MutableStateFlow2;
        this.f48176h = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.f48176h;
    }

    public final StateFlow<Boolean> b() {
        return this.f48174f;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f48173e.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f48173e.setValue(Boolean.FALSE);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f48175g.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f47672c);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest request) {
        e0.checkNotNullParameter(request, "request");
        return this.f48172c.shouldInterceptRequest(f48170i.a(request));
    }

    @Override // android.webkit.WebViewClient
    @tu.f
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return this.f48171b.a(str);
    }

    @Override // android.webkit.WebViewClient
    @tu.f
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f48175g.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f47671b);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", a.b.k(YsiBvdpw.WnCuSHF, str), null, false, 12, null);
    }
}
