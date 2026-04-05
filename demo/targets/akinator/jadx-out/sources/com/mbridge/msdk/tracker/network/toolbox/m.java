package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.x;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.tracker.network.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private final t f44063a = a();

    private static x a(com.mbridge.msdk.tracker.network.t tVar) {
        byte[] bArrB;
        if (tVar == null || (bArrB = tVar.b()) == null) {
            return null;
        }
        return x.a(null, bArrB);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(com.mbridge.msdk.tracker.network.t<?> tVar, Map<String, String> map) throws IOException {
        p pVarH = tVar.h();
        if (this.f44063a != null) {
            int iQ = tVar.q() <= 0 ? 30000 : tVar.q();
            long jR = tVar.r();
            String strA = tVar.g() == 0 ? d.a(tVar.t(), tVar) : tVar.t();
            if (pVarH != null) {
                pVarH.f(strA);
                long j10 = iQ;
                pVarH.e(j10);
                pVarH.f(j10);
                pVarH.j(j10);
                pVarH.a(tVar.n());
            }
            a(tVar, pVarH);
            ArrayList arrayList = new ArrayList();
            arrayList.add(u.HTTP_1_1);
            arrayList.add(u.HTTP_2);
            t.b bVarA = this.f44063a.s().a(arrayList).a(new MBridgeHostnameVerifier(strA));
            long j11 = iQ;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            t.b bVarA2 = bVarA.d(j11, timeUnit).b(j11, timeUnit).a(pVarH == null ? com.mbridge.msdk.thrid.okhttp.m.f43667a : new j(pVarH.H(), pVarH.b(), pVarH)).e(j11, timeUnit).a(Math.max(jR, 0L), timeUnit);
            a(pVarH, bVarA2);
            w.a aVar = new w.a();
            for (Map.Entry<String, String> entry : tVar.f().entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
            aVar.a("Connection", "close");
            a(aVar, tVar);
            y yVarD = bVarA2.a().a(aVar.b(strA).a()).d();
            com.mbridge.msdk.thrid.okhttp.p pVarM = yVarD.m();
            ArrayList arrayList2 = new ArrayList();
            int iB = pVarM.b();
            for (int i10 = 0; i10 < iB; i10++) {
                String strA2 = pVarM.a(i10);
                String strB = pVarM.b(i10);
                if (strA2 != null) {
                    arrayList2.add(new com.mbridge.msdk.tracker.network.g(strA2, strB));
                }
            }
            z zVarD = yVarD.d();
            if (zVarD == null) {
                return new g(yVarD.k(), arrayList2);
            }
            return new g(yVarD.k(), arrayList2, a(zVarD), zVarD.d());
        }
        throw new IOException("okhttp client is null");
    }

    private static void a(p pVar, t.b bVar) {
        if (pVar == null || bVar == null) {
            return;
        }
        try {
            bVar.a(new OKHTTPEventListener(pVar));
        } catch (Exception unused) {
        }
    }

    private static void a(com.mbridge.msdk.tracker.network.t<?> tVar, p pVar) {
        if (pVar == null || tVar == null) {
            return;
        }
        try {
            pVar.g(tVar.m());
        } catch (Exception unused) {
        }
    }

    private int a(z zVar) {
        if (zVar == null) {
            return 0;
        }
        if (zVar.h() > 2147483647L) {
            return -1;
        }
        return (int) zVar.h();
    }

    private t a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.mbridge.msdk.thrid.okhttp.l lVar = new com.mbridge.msdk.thrid.okhttp.l(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
        lVar.b(50);
        lVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
        t.b bVar = new t.b();
        bVar.d(30L, timeUnit);
        bVar.b(30L, timeUnit);
        bVar.e(30L, timeUnit);
        bVar.a(true);
        bVar.a(new com.mbridge.msdk.thrid.okhttp.h(32, 5L, TimeUnit.MINUTES));
        bVar.a(lVar);
        return bVar.a();
    }

    private static void a(w.a aVar, com.mbridge.msdk.tracker.network.t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                aVar.c();
                return;
            case 1:
                x xVarA = a(tVar);
                if (xVarA != null) {
                    aVar.c(xVarA);
                    return;
                }
                throw new IOException("can't create request body for post");
            case 2:
                x xVarA2 = a(tVar);
                if (xVarA2 != null) {
                    aVar.d(xVarA2);
                    return;
                }
                throw new IOException("can't create request body for put");
            case 3:
                aVar.b();
                return;
            case 4:
                aVar.d();
                return;
            case 5:
                aVar.a("OPTIONS", (x) null);
                return;
            case 6:
                aVar.a("TRACE", (x) null);
                return;
            case 7:
                x xVarA3 = a(tVar);
                if (xVarA3 != null) {
                    aVar.b(xVarA3);
                    return;
                }
                throw new IOException("can't create request body for patch");
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
