package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f50141c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f50142e;

    public /* synthetic */ c(MutableStateFlow mutableStateFlow, kv.a aVar, int i10) {
        this.f50140b = i10;
        this.f50141c = mutableStateFlow;
        this.f50142e = aVar;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f50140b) {
            case 0:
                return i.d(this.f50141c, this.f50142e);
            case 1:
                return i.b(this.f50141c, this.f50142e);
            case 2:
                return i.e(this.f50141c, this.f50142e);
            default:
                return i.a.a(this.f50141c, this.f50142e);
        }
    }
}
