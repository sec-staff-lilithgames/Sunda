package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.x;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.k f43370a;

    public a(com.mbridge.msdk.thrid.okhttp.k kVar) {
        this.f43370a = kVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        w wVarD = aVar.d();
        w.a aVarF = wVarD.f();
        x xVarA = wVarD.a();
        if (xVarA != null) {
            xVarA.b();
            long jA = xVarA.a();
            if (jA != -1) {
                aVarF.b("Content-Length", Long.toString(jA));
                aVarF.a("Transfer-Encoding");
            } else {
                aVarF.b("Transfer-Encoding", "chunked");
                aVarF.a("Content-Length");
            }
        }
        boolean z10 = false;
        if (wVarD.a("Host") == null) {
            aVarF.b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(wVarD.g(), false));
        }
        if (wVarD.a("Connection") == null) {
            aVarF.b("Connection", "Keep-Alive");
        }
        if (wVarD.a("Accept-Encoding") == null && wVarD.a(Command.HTTP_HEADER_RANGE) == null) {
            aVarF.b("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<com.mbridge.msdk.thrid.okhttp.j> listA = this.f43370a.a(wVarD.g());
        if (!listA.isEmpty()) {
            aVarF.b("Cookie", a(listA));
        }
        if (wVarD.a(Command.HTTP_HEADER_USER_AGENT) == null) {
            aVarF.b(Command.HTTP_HEADER_USER_AGENT, com.mbridge.msdk.thrid.okhttp.internal.d.a());
        }
        y yVarA = aVar.a(aVarF.a());
        e.a(this.f43370a, wVarD.g(), yVarA.m());
        y.a aVarA = yVarA.o().a(wVarD);
        if (z10 && "gzip".equalsIgnoreCase(yVarA.b("Content-Encoding")) && e.b(yVarA)) {
            com.mbridge.msdk.thrid.okio.j jVar = new com.mbridge.msdk.thrid.okio.j(yVarA.d().k());
            aVarA.a(yVarA.m().a().b("Content-Encoding").b("Content-Length").a());
            aVarA.a(new h(yVarA.b("Content-Type"), -1L, l.a(jVar)));
        }
        return aVarA.a();
    }

    private String a(List<com.mbridge.msdk.thrid.okhttp.j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            com.mbridge.msdk.thrid.okhttp.j jVar = list.get(i10);
            sb2.append(jVar.a());
            sb2.append(G5.T);
            sb2.append(jVar.b());
        }
        return sb2.toString();
    }
}
