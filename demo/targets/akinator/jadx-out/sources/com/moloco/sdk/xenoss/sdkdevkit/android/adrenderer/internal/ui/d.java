package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class d implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48551b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.v f48552c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f48553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f48554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f48555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f48556h;

    public /* synthetic */ d(WebView webView, e1.v vVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, int i10, int i11) {
        this.f48555g = webView;
        this.f48552c = vVar;
        this.f48556h = e0Var;
        this.f48553e = i10;
        this.f48554f = i11;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48551b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return e.a(this.f48552c, (String) this.f48555g, (kv.l) this.f48556h, this.f48553e, this.f48554f, (p0.w) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h) this.f48555g, (kv.a) this.f48556h, this.f48552c, this.f48553e, this.f48554f, (p0.w) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a((WebView) this.f48555g, this.f48552c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) this.f48556h, this.f48553e, this.f48554f, (p0.w) obj, iIntValue3);
        }
    }

    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, kv.a aVar, e1.v vVar, int i10, int i11) {
        this.f48555g = hVar;
        this.f48556h = aVar;
        this.f48552c = vVar;
        this.f48553e = i10;
        this.f48554f = i11;
    }

    public /* synthetic */ d(e1.v vVar, String str, kv.l lVar, int i10, int i11) {
        this.f48552c = vVar;
        this.f48555g = str;
        this.f48556h = lVar;
        this.f48553e = i10;
        this.f48554f = i11;
    }
}
