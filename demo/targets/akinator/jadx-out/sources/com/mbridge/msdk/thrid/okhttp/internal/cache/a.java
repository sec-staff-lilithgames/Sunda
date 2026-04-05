package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.thrid.okhttp.internal.cache.b;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements r {
    public a(c cVar) {
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        b bVarC = new b.a(System.currentTimeMillis(), aVar.d(), null).c();
        w wVar = bVarC.f43308a;
        y yVar = bVarC.f43309b;
        if (wVar == null && yVar == null) {
            return new y.a().a(aVar.d()).a(u.HTTP_1_1).a(504).a("Unsatisfiable Request (only-if-cached)").a(com.mbridge.msdk.thrid.okhttp.internal.c.f43289c).b(-1L).a(System.currentTimeMillis()).a();
        }
        if (wVar == null) {
            return yVar.o().a(a(yVar)).a();
        }
        y yVarA = aVar.a(wVar);
        if (yVar != null) {
            if (yVarA.k() == 304) {
                yVar.o().a(a(yVar.m(), yVarA.m())).b(yVarA.s()).a(yVarA.q()).a(a(yVar)).c(a(yVarA)).a();
                yVarA.d().close();
                throw null;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(yVar.d());
        }
        return yVarA.o().a(a(yVar)).c(a(yVarA)).a();
    }

    private static y a(y yVar) {
        return (yVar == null || yVar.d() == null) ? yVar : yVar.o().a((z) null).a();
    }

    private static p a(p pVar, p pVar2) {
        p.a aVar = new p.a();
        int iB = pVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = pVar.a(i10);
            String strB = pVar.b(i10);
            if ((!"Warning".equalsIgnoreCase(strA) || !strB.startsWith("1")) && (a(strA) || !b(strA) || pVar2.b(strA) == null)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(aVar, strA, strB);
            }
        }
        int iB2 = pVar2.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            String strA2 = pVar2.a(i11);
            if (!a(strA2) && b(strA2)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(aVar, strA2, pVar2.b(i11));
            }
        }
        return aVar.a();
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
