package com.fyber.inneractive.sdk.ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f26736a;

    public b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f26736a = fyberAdIdentifierLocal;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Bitmap bitmap = (Bitmap) obj;
        if (exc != null || bitmap == null) {
            return;
        }
        this.f26736a.f26716r = bitmap;
    }
}
