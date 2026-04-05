package com.bytedance.sdk.component.zz.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile jpo f19096jd;
    private volatile jd jpo;

    private jpo() {
    }

    public static jpo jpo() {
        if (f19096jd == null) {
            synchronized (jpo.class) {
                try {
                    if (f19096jd == null) {
                        f19096jd = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f19096jd;
    }

    public jd jd() {
        return this.jpo;
    }

    public void jpo(jd jdVar) {
        this.jpo = jdVar;
    }
}
