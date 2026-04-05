package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f23747a;

    /* renamed from: b, reason: collision with root package name */
    public final s f23748b;

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.f23747a = fVar;
        this.f23748b = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f23748b.a(null, exc, this.f23747a);
            return;
        }
        s sVar = this.f23748b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f23747a;
        sVar.a(new g(fVar.f26663a, uri), null, fVar);
    }
}
