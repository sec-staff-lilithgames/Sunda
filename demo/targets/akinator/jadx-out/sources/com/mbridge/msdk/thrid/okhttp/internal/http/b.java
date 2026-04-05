package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.net.ProtocolException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43371a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends com.mbridge.msdk.thrid.okio.g {

        /* renamed from: b, reason: collision with root package name */
        long f43372b;

        public a(com.mbridge.msdk.thrid.okio.r rVar) {
            super(rVar);
        }

        @Override // com.mbridge.msdk.thrid.okio.g, com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            super.a(cVar, j10);
            this.f43372b += j10;
        }
    }

    public b(boolean z10) {
        this.f43371a = z10;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        g gVar = (g) aVar;
        c cVarH = gVar.h();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVarI = gVar.i();
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = (com.mbridge.msdk.thrid.okhttp.internal.connection.c) gVar.f();
        w wVarD = gVar.d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar.g().requestHeadersStart(gVar.e());
        cVarH.a(wVarD);
        gVar.g().requestHeadersEnd(gVar.e(), wVarD);
        y.a aVarA = null;
        if (f.a(wVarD.e()) && wVarD.a() != null) {
            if ("100-continue".equalsIgnoreCase(wVarD.a("Expect"))) {
                cVarH.b();
                gVar.g().responseHeadersStart(gVar.e());
                aVarA = cVarH.a(true);
            }
            if (aVarA == null) {
                gVar.g().requestBodyStart(gVar.e());
                a aVar2 = new a(cVarH.a(wVarD, wVarD.a().a()));
                com.mbridge.msdk.thrid.okio.d dVarA = l.a(aVar2);
                wVarD.a().a(dVarA);
                dVarA.close();
                gVar.g().requestBodyEnd(gVar.e(), aVar2.f43372b);
            } else if (!cVar.f()) {
                gVarI.e();
            }
        }
        cVarH.a();
        if (aVarA == null) {
            gVar.g().responseHeadersStart(gVar.e());
            aVarA = cVarH.a(false);
        }
        y yVarA = aVarA.a(wVarD).a(gVarI.c().b()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
        int iK = yVarA.k();
        if (iK == 100) {
            yVarA = cVarH.a(false).a(wVarD).a(gVarI.c().b()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
            iK = yVarA.k();
        }
        gVar.g().responseHeadersEnd(gVar.e(), yVarA);
        y yVarA2 = (this.f43371a && iK == 101) ? yVarA.o().a(com.mbridge.msdk.thrid.okhttp.internal.c.f43289c).a() : yVarA.o().a(cVarH.a(yVarA)).a();
        if ("close".equalsIgnoreCase(yVarA2.r().a("Connection")) || "close".equalsIgnoreCase(yVarA2.b("Connection"))) {
            gVarI.e();
        }
        if ((iK != 204 && iK != 205) || yVarA2.d().h() <= 0) {
            return yVarA2;
        }
        StringBuilder sbT = o2.t(iK, "HTTP ", " had non-zero Content-Length: ");
        sbT.append(yVarA2.d().h());
        throw new ProtocolException(sbT.toString());
    }
}
