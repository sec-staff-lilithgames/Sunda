package dw;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.x;
import xv.i0;
import xv.l0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f52929a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public n(l0 client) {
        e0.checkNotNullParameter(client, "client");
        this.f52929a = client;
    }

    public static int b(v0 v0Var, int i10) throws NumberFormatException {
        String strHeader$default = v0.header$default(v0Var, CommonGatewayClient.HEADER_RETRY_AFTER, null, 2, null);
        if (strHeader$default == null) {
            return i10;
        }
        if (!new x("\\d+").matches(strHeader$default)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        e0.checkNotNullExpressionValue(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xv.o0 a(xv.v0 r10, cw.i r11) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.n.a(xv.v0, cw.i):xv.o0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = yv.c.stripBody(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r7 = r0.priorResponse(r6).build();
        r0 = r1.getInterceptorScopedExchange$okhttp();
        r6 = a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r0.isDuplex$okhttp() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1.getEventListener$okhttp().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r1.getEventListener$okhttp().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        yv.h.closeQuietly(r7.body());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r8 > 20) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r1.getEventListener$okhttp().followUpDecision(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r1.getEventListener$okhttp().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011f, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r12.proceed(r0).newBuilder().request(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    @Override // xv.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xv.v0 intercept(xv.h0 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.n.intercept(xv.h0):xv.v0");
    }
}
