package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import io.odeeo.sdk.AdUnit;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2815i4 extends AbstractC2677a2 {

    /* renamed from: f, reason: collision with root package name */
    public final String f32919f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.jvm.internal.f0 f32920g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.jvm.internal.f0 f32921h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.internal.f0 f32922i;

    /* renamed from: j, reason: collision with root package name */
    public X6 f32923j;

    /* renamed from: k, reason: collision with root package name */
    public U6 f32924k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2815i4(String api, kv.a onUserLandingCompleted, kv.l onLpLifecycleEvent, kv.p fireLandingPageTracker, F5 f52) {
        super(f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        kotlin.jvm.internal.e0.checkNotNullParameter(onUserLandingCompleted, "onUserLandingCompleted");
        kotlin.jvm.internal.e0.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(fireLandingPageTracker, "fireLandingPageTracker");
        this.f32919f = api;
        this.f32920g = (kotlin.jvm.internal.f0) onUserLandingCompleted;
        this.f32921h = (kotlin.jvm.internal.f0) onLpLifecycleEvent;
        this.f32922i = (kotlin.jvm.internal.f0) fireLandingPageTracker;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.jvm.internal.f0, kv.l] */
    public final boolean a(WebView webView, String str) {
        String str2;
        Integer num;
        int i10;
        InterfaceC2798h4 interfaceC2798h4;
        InterfaceC2758ef userLeftApplicationListener;
        if (this.f32631e.get()) {
            return true;
        }
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", AbstractC2811i0.a("onShouldOverrideUrlLoading: ", str));
        }
        if (webView instanceof Z1) {
            str2 = str;
            Q6 q6A = S6.a(((Z1) webView).getLandingPageHandler(), this.f32919f, null, str2, this.f32923j, false, 16);
            num = q6A.f32163b;
            i10 = q6A.f32162a;
        } else {
            str2 = str;
            num = null;
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            a(3, false, str2, Integer.valueOf(num != null ? num.intValue() : 10));
            return true;
        }
        if (webView instanceof C2899n4) {
            ViewParent parent = ((C2899n4) webView).getParent();
            if ((parent instanceof C2747e4) && (userLeftApplicationListener = ((C2747e4) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        ?? r12 = this.f32921h;
        C2687ac c2687ac = GestureDetectorOnGestureListenerC3093yc.Z0;
        String str3 = this.f32919f;
        c2687ac.getClass();
        r12.invoke(C2687ac.a(str3, "onNavigatingAway"));
        a(webView);
        if (!B2.a(str2)) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (webView instanceof C2899n4) {
                ViewParent parent2 = ((C2899n4) webView).getParent();
                if ((parent2 instanceof C2747e4) && (interfaceC2798h4 = ((C2747e4) parent2).f32803d) != null) {
                    C2934p5.a(((C2917o5) interfaceC2798h4).f33179a);
                }
            }
        }
        a(this, 2, false, str2, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", AbstractC2811i0.a("onPageCommitVisible: ", str));
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.AbstractC2677a2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", AbstractC2811i0.a("onPageFinished: ", str));
        }
        a(this, 2, true, str, 8);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.f0, kv.l] */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", AbstractC2811i0.a("onPageStarted: ", str));
        }
        ?? r22 = this.f32921h;
        C2687ac c2687ac = GestureDetectorOnGestureListenerC3093yc.Z0;
        String str2 = this.f32919f;
        c2687ac.getClass();
        r22.invoke(C2687ac.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.e0.checkNotNullParameter(failingUrl, "failingUrl");
        a(3, false, failingUrl, Integer.valueOf(i10));
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", AbstractC2811i0.a("onReceivedError: ", failingUrl));
        }
    }

    @Override // com.inmobi.media.AbstractC2677a2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(detail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            a(3, true, null, Integer.valueOf(AdUnit.ERROR_LOADING_IN_PROGRESS));
            Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("source", "embedded_browser"), tu.e0.to("isCrashed", Boolean.valueOf(detail.didCrash())));
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("WebViewRenderProcessGoneEvent", mapMutableMapOf, EnumC2993se.f33373a);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (!R3.Q()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webView == null || string.length() <= 0) {
            return false;
        }
        return a(webView, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            a(3, true, request.getUrl().toString(), Integer.valueOf(error.getErrorCode()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        F5 f52 = this.f32627a;
        if (f52 != null) {
            ((G5) f52).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    public static /* synthetic */ void a(C2815i4 c2815i4, int i10, boolean z10, String str, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        c2815i4.a(i10, z10, str, null);
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [kotlin.jvm.internal.f0, kv.p] */
    /* JADX WARN: Type inference failed for: r10v15, types: [kotlin.jvm.internal.f0, kv.p] */
    /* JADX WARN: Type inference failed for: r10v17, types: [kotlin.jvm.internal.f0, kv.p] */
    /* JADX WARN: Type inference failed for: r10v23, types: [kotlin.jvm.internal.f0, kv.p] */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.f0, kv.p] */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.jvm.internal.f0, kv.a] */
    /* JADX WARN: Type inference failed for: r10v9, types: [kotlin.jvm.internal.f0, kv.p] */
    public final void a(int i10, boolean z10, String str, Integer num) {
        Integer numValueOf = Integer.valueOf(AdUnit.ERROR_LOAD_AFTER_RELEASE);
        U6 u62 = this.f32924k;
        if (u62 != null) {
            try {
                if (u62.f32355e) {
                    return;
                }
                X6 x62 = u62.f32351a;
                if (x62 != null) {
                    x62.f32490g = "IN_CUSTOM";
                }
                switch (i10) {
                    case 1:
                        if (z10) {
                            u62.f32354d = str;
                            C2815i4 c2815i4 = u62.f32352b;
                            L6 funnelState = L6.f31994h;
                            c2815i4.getClass();
                            kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
                            P6.a(funnelState, x62, (Integer) null, (kv.p) c2815i4.f32922i);
                            break;
                        }
                        break;
                    case 2:
                        if (z10) {
                            u62.f32354d = str;
                            u62.f32355e = true;
                            if (!u62.f32353c.contains(1)) {
                                C2815i4 c2815i42 = u62.f32352b;
                                L6 funnelState2 = L6.f31994h;
                                X6 x63 = u62.f32351a;
                                c2815i42.getClass();
                                kotlin.jvm.internal.e0.checkNotNullParameter(funnelState2, "funnelState");
                                P6.a(funnelState2, x63, numValueOf, (kv.p) c2815i42.f32922i);
                            }
                            u62.f32352b.f32920g.invoke();
                            C2815i4 c2815i43 = u62.f32352b;
                            L6 funnelState3 = L6.f31995i;
                            X6 x64 = u62.f32351a;
                            c2815i43.getClass();
                            kotlin.jvm.internal.e0.checkNotNullParameter(funnelState3, "funnelState");
                            P6.a(funnelState3, x64, (Integer) null, (kv.p) c2815i43.f32922i);
                            break;
                        }
                        break;
                    case 3:
                        if (z10 || (str != null && kotlin.jvm.internal.e0.areEqual(str, u62.f32354d))) {
                            u62.f32355e = true;
                            if (!u62.f32353c.contains(1)) {
                                C2815i4 c2815i44 = u62.f32352b;
                                L6 funnelState4 = L6.f31994h;
                                X6 x65 = u62.f32351a;
                                c2815i44.getClass();
                                kotlin.jvm.internal.e0.checkNotNullParameter(funnelState4, "funnelState");
                                P6.a(funnelState4, x65, numValueOf, (kv.p) c2815i44.f32922i);
                            }
                            C2815i4 c2815i45 = u62.f32352b;
                            L6 funnelState5 = L6.f31996j;
                            X6 x66 = u62.f32351a;
                            Integer numValueOf2 = Integer.valueOf(num != null ? num.intValue() : 8100);
                            c2815i45.getClass();
                            kotlin.jvm.internal.e0.checkNotNullParameter(funnelState5, "funnelState");
                            P6.a(funnelState5, x66, numValueOf2, (kv.p) c2815i45.f32922i);
                            break;
                        }
                    case 4:
                        if (z10) {
                            u62.f32354d = str;
                            break;
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        u62.f32355e = true;
                        switch (i10) {
                            case 5:
                                i = 8200;
                                break;
                            case 6:
                                i = 8300;
                                break;
                            case 7:
                                i = 8400;
                                break;
                            case 8:
                                i = 8600;
                                break;
                            case 9:
                                i = 8500;
                                break;
                        }
                        int i11 = 4;
                        if (!u62.f32353c.contains(4)) {
                            i11 = 0;
                        }
                        int i12 = i + i11;
                        C2815i4 c2815i46 = u62.f32352b;
                        L6 funnelState6 = L6.f31996j;
                        X6 x67 = u62.f32351a;
                        Integer numValueOf3 = Integer.valueOf(i12);
                        c2815i46.getClass();
                        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState6, "funnelState");
                        P6.a(funnelState6, x67, numValueOf3, (kv.p) c2815i46.f32922i);
                        break;
                }
                u62.f32353c.add(Integer.valueOf(i10));
            } catch (Exception e10) {
                e10.toString();
            }
        }
    }
}
