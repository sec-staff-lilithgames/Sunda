package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.device.ads.DTBMetricReport;
import com.ironsource.C3271ic;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2677a2 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f32627a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32629c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32630d;

    /* renamed from: b, reason: collision with root package name */
    public int f32628b = -1;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f32631e = new AtomicBoolean(false);

    public AbstractC2677a2(F5 f52) {
        this.f32627a = f52;
    }

    public final void a(WebView view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f32631e.set(true);
        view.postDelayed(new zg.h(this, 10), 1000L);
    }

    public final void b(WebView webView) {
        String str;
        C2675a0 c2675a0;
        String strB;
        String str2;
        String str3;
        C2675a0 c2675a02;
        String strM;
        V0 v02;
        int i10 = this.f32628b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f32628b = i10 - 1;
                return;
            }
            if (this.f32629c) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Q9(webView));
            this.f32629c = true;
            if (webView instanceof GestureDetectorOnGestureListenerC3093yc) {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webView;
                F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                if (f52 != null) {
                    String str4 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    ((G5) f52).a(str4, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str4, "TAG", "sendTelemetryEventForNetworkLoad "));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String creativeId = gestureDetectorOnGestureListenerC3093yc.getCreativeId();
                if (creativeId != null) {
                    linkedHashMap.put("creativeId", creativeId);
                }
                String impressionId = gestureDetectorOnGestureListenerC3093yc.getImpressionId();
                if (impressionId != null) {
                    linkedHashMap.put("impressionId", impressionId);
                }
                linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(gestureDetectorOnGestureListenerC3093yc.f33661y0 ? (short) 2212 : (short) 2211));
                Bc bc2 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc2 != null && (v02 = bc2.f31686j) != null) {
                    linkedHashMap.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - v02.f32381a.f32417c));
                }
                Bc bc3 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc3 != null && (c2675a02 = bc3.f31677a) != null && (strM = c2675a02.m()) != null) {
                    linkedHashMap.put("plType", strM);
                }
                Bc bc4 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc4 != null && (str3 = bc4.f31682f) != null) {
                    linkedHashMap.put("creativeType", str3);
                }
                Bc bc5 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc5 != null && (str2 = bc5.f31678b) != null) {
                    linkedHashMap.put("markupType", str2);
                }
                Bc bc6 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc6 != null && (c2675a0 = bc6.f31677a) != null && (strB = c2675a0.b()) != null) {
                    linkedHashMap.put("adType", strB);
                }
                Bc bc7 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc7 != null && (str = bc7.f31680d) != null) {
                    linkedHashMap.put("metadataBlob", str);
                }
                Bc bc8 = gestureDetectorOnGestureListenerC3093yc.f33626h;
                if (bc8 != null) {
                    linkedHashMap.put("isRewarded", Boolean.valueOf(bc8.f31684h));
                }
                F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                if (f53 != null) {
                    String str5 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    ((G5) f53).a(str5, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str5, "TAG", "processTelemetryEvent "));
                }
                gestureDetectorOnGestureListenerC3093yc.getListener().a("NetworkLoadLimitExceeded", linkedHashMap);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f32630d) {
            this.f32630d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        AbstractC2902n7.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        WebResourceResponse webResourceResponseA = Pf.a(url, this.f32627a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    public static final void a(AbstractC2677a2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f32631e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse webResourceResponseA;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        b(view);
        F5 f52 = this.f32627a;
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "<this>");
        if (sv.k0.equals(C3271ic.f36943a, request.getMethod(), true)) {
            String string = request.getUrl().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            webResourceResponseA = Pf.a(string, f52);
        } else {
            webResourceResponseA = null;
        }
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }
}
