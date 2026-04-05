package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Dc extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f31738a;

    /* renamed from: b, reason: collision with root package name */
    public final Hc f31739b;

    public Dc(F5 f52, Hc hc2) {
        this.f31738a = f52;
        this.f31739b = hc2;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f31738a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + ' ' + webViewRenderProcess);
        }
        Hc hc2 = this.f31739b;
        if (hc2 != null) {
            Map mapA = hc2.a();
            mapA.put("creativeId", hc2.f31847a.f31683g);
            int i10 = hc2.f31851e + 1;
            hc2.f31851e = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = hc2.a("RenderProcessResponsive");
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapA, EnumC2993se.f33373a);
        }
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f31738a;
        if (f52 != null) {
            ((G5) f52).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + ' ' + webViewRenderProcess);
        }
        Hc hc2 = this.f31739b;
        if (hc2 != null) {
            Map mapA = hc2.a();
            mapA.put("creativeId", hc2.f31847a.f31683g);
            int i10 = hc2.f31850d + 1;
            hc2.f31850d = i10;
            mapA.put("count", Integer.valueOf(i10));
            String strA = hc2.a("RenderProcessUnResponsive");
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(strA, mapA, EnumC2993se.f33373a);
        }
    }
}
