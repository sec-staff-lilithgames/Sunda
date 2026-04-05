package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f26992a;

    public x(i0 i0Var) {
        this.f26992a = i0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        if (exc != null || TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.r.f26804b.post(new w(this));
            return;
        }
        i0 i0Var = this.f26992a;
        if (com.fyber.inneractive.sdk.util.o.a(i0Var.f26879b) != null) {
            a0 a0Var = new a0(str);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(com.fyber.inneractive.sdk.util.o.a(i0Var.f26879b).getApplicationContext(), a0Var);
            a0Var.f26836b = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }
}
