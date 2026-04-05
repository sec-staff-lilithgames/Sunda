package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.ironsource.C3271ic;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b implements com.mbridge.msdk.tracker.network.m {

    /* renamed from: a, reason: collision with root package name */
    private final a f44034a;

    /* renamed from: b, reason: collision with root package name */
    protected final c f44035b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static p b(t<?> tVar) {
        if (tVar == null) {
            return null;
        }
        try {
            if (!tVar.a() || TextUtils.isEmpty(tVar.t())) {
                return null;
            }
            p pVar = new p(tVar.p(), tVar.g() == 0 ? C3271ic.f36943a : C3271ic.f36944b);
            pVar.d("queue");
            pVar.e(tVar.d("local_id"));
            pVar.a(tVar.d("ad_type"));
            pVar.i(tVar.r());
            tVar.a(pVar);
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    @Override // com.mbridge.msdk.tracker.network.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.tracker.network.q a(com.mbridge.msdk.tracker.network.t<?> r17) throws java.io.IOException, com.mbridge.msdk.tracker.network.b0 {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.mbridge.msdk.tracker.network.p r8 = b(r2)
        Lc:
            r3 = 0
            com.mbridge.msdk.tracker.network.b$a r0 = r2.d()     // Catch: java.io.IOException -> L79
            java.util.Map r0 = com.mbridge.msdk.tracker.network.toolbox.f.a(r0)     // Catch: java.io.IOException -> L79
            com.mbridge.msdk.tracker.network.toolbox.a r6 = r1.f44034a     // Catch: java.io.IOException -> L79
            com.mbridge.msdk.tracker.network.toolbox.g r6 = r6.a(r2, r0)     // Catch: java.io.IOException -> L79
            int r10 = r6.d()     // Catch: java.io.IOException -> L34
            a(r8, r10)     // Catch: java.io.IOException -> L34
            java.util.List r15 = r6.c()     // Catch: java.io.IOException -> L34
            r0 = 304(0x130, float:4.26E-43)
            if (r10 != r0) goto L38
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L34
            long r9 = r9 - r4
            com.mbridge.msdk.tracker.network.q r0 = com.mbridge.msdk.tracker.network.toolbox.k.a(r2, r9, r15)     // Catch: java.io.IOException -> L34
            return r0
        L34:
            r0 = move-exception
            r7 = r3
        L36:
            r3 = r0
            goto L7d
        L38:
            java.io.InputStream r0 = r6.a()     // Catch: java.io.IOException -> L34
            if (r0 == 0) goto L4a
            int r7 = r6.b()     // Catch: java.io.IOException -> L34
            com.mbridge.msdk.tracker.network.toolbox.c r9 = r1.f44035b     // Catch: java.io.IOException -> L34
            byte[] r0 = com.mbridge.msdk.tracker.network.toolbox.k.a(r0, r7, r9, r8)     // Catch: java.io.IOException -> L34
        L48:
            r11 = r0
            goto L4e
        L4a:
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L34
            goto L48
        L4e:
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L6f
            long r12 = r12 - r4
            com.mbridge.msdk.tracker.network.toolbox.k.a(r12, r2, r11, r10)     // Catch: java.io.IOException -> L6f
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 < r0) goto L73
            r0 = 299(0x12b, float:4.19E-43)
            if (r10 > r0) goto L73
            r0 = 1
            a(r8, r0, r3)     // Catch: java.io.IOException -> L6f
            com.mbridge.msdk.tracker.network.q r9 = new com.mbridge.msdk.tracker.network.q     // Catch: java.io.IOException -> L6f
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L6f
            long r13 = r12 - r4
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r15)     // Catch: java.io.IOException -> L6f
            return r9
        L6f:
            r0 = move-exception
            r3 = r0
            r7 = r11
            goto L7d
        L73:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L6f
            r0.<init>()     // Catch: java.io.IOException -> L6f
            throw r0     // Catch: java.io.IOException -> L6f
        L79:
            r0 = move-exception
            r6 = r3
            r7 = r6
            goto L36
        L7d:
            java.lang.String r0 = r3.getMessage()
            java.lang.String r9 = "timeout"
            boolean r0 = android.text.TextUtils.equals(r0, r9)
            if (r0 == 0) goto L8b
            r0 = 3
            goto L8c
        L8b:
            r0 = 2
        L8c:
            a(r8, r0, r3)
            com.mbridge.msdk.tracker.network.toolbox.k$b r0 = com.mbridge.msdk.tracker.network.toolbox.k.a(r2, r3, r4, r6, r7)
            com.mbridge.msdk.tracker.network.toolbox.k.a(r2, r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.toolbox.b.a(com.mbridge.msdk.tracker.network.t):com.mbridge.msdk.tracker.network.q");
    }

    public b(a aVar, c cVar) {
        this.f44034a = aVar;
        this.f44035b = cVar;
    }

    private static void a(p pVar, int i10, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i10);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i10) {
        if (pVar != null) {
            try {
                pVar.b(i10);
            } catch (Exception unused) {
            }
        }
    }
}
