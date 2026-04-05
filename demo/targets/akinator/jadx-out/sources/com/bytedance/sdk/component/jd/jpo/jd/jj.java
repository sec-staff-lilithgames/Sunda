package com.bytedance.sdk.component.jd.jpo.jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class jj {

    /* renamed from: jd, reason: collision with root package name */
    static long f18567jd;
    static my jpo;

    private jj() {
    }

    public static my jpo() {
        synchronized (jj.class) {
            my myVar = jpo;
            if (myVar == null) {
                return new my();
            }
            jpo = myVar.f18571jj;
            myVar.f18571jj = null;
            f18567jd -= 8192;
            return myVar;
        }
    }

    public static void jpo(my myVar) {
        if (myVar.f18571jj == null && myVar.f18572qk == null) {
            if (myVar.f18569cm) {
                return;
            }
            synchronized (jj.class) {
                try {
                    long j10 = f18567jd;
                    if (j10 + 8192 > 65536) {
                        return;
                    }
                    f18567jd = j10 + 8192;
                    myVar.f18571jj = jpo;
                    myVar.wqx = 0;
                    myVar.f18570jd = 0;
                    jpo = myVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
