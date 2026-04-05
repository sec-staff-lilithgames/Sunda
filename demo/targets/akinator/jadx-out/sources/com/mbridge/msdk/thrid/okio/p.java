package com.mbridge.msdk.thrid.okio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    static o f43857a;

    /* renamed from: b, reason: collision with root package name */
    static long f43858b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = f43857a;
                if (oVar == null) {
                    return new o();
                }
                f43857a = oVar.f43855f;
                oVar.f43855f = null;
                f43858b -= 8192;
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f43855f == null && oVar.f43856g == null) {
            if (oVar.f43853d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f43858b + 8192;
                    if (j10 > 65536) {
                        return;
                    }
                    f43858b = j10;
                    oVar.f43855f = f43857a;
                    oVar.f43852c = 0;
                    oVar.f43851b = 0;
                    f43857a = oVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
