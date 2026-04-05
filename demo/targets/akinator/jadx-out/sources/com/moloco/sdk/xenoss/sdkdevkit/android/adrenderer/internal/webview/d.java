package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i;
import kotlinx.coroutines.flow.MutableStateFlow;
import kv.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class d implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f50144c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebView f50145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f50147g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f50148h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f50149i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.a f50150j;

    public /* synthetic */ d(w wVar, WebView webView, int i10, MutableStateFlow mutableStateFlow, kv.l lVar, e0 e0Var, kv.a aVar, int i11) {
        this.f50143b = i11;
        this.f50144c = wVar;
        this.f50145e = webView;
        this.f50146f = i10;
        this.f50147g = mutableStateFlow;
        this.f50148h = lVar;
        this.f50149i = e0Var;
        this.f50150j = aVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f50143b) {
            case 0:
                return i.a(this.f50144c, this.f50145e, this.f50146f, this.f50147g, this.f50148h, this.f50149i, this.f50150j, (Context) obj);
            default:
                return i.a.a(this.f50144c, this.f50145e, this.f50146f, this.f50147g, this.f50148h, this.f50149i, this.f50150j, (Context) obj);
        }
    }
}
