package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.ironsource.C3271ic;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final t f43322a;

    public a(t tVar) {
        this.f43322a = tVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        w wVarD = gVar.d();
        g gVarI = gVar.i();
        return gVar.a(wVarD, gVarI, gVarI.a(this.f43322a, aVar, !wVarD.e().equals(C3271ic.f36943a)), gVarI.c());
    }
}
