package com.bytedance.adsdk.jd;

import android.content.Context;
import android.os.Trace;
import e3.g;
import j1.o2;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: cm, reason: collision with root package name */
    private static boolean f17396cm = true;

    /* renamed from: if, reason: not valid java name */
    private static volatile com.bytedance.adsdk.jd.cm.qk f11if = null;

    /* renamed from: jd, reason: collision with root package name */
    private static boolean f17397jd = false;

    /* renamed from: jj, reason: collision with root package name */
    private static long[] f17398jj = null;
    public static boolean jpo = false;

    /* renamed from: ju, reason: collision with root package name */
    private static volatile com.bytedance.adsdk.jd.cm.xyk f17399ju = null;
    private static String[] my = null;

    /* renamed from: qk, reason: collision with root package name */
    private static int f17400qk = 0;
    private static boolean wqx = true;
    private static int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private static com.bytedance.adsdk.jd.cm.my f17401yd;
    private static com.bytedance.adsdk.jd.cm.jj zz;

    public static float jd(String str) {
        int i10 = xyk;
        if (i10 > 0) {
            xyk = i10 - 1;
            return 0.0f;
        }
        if (!f17397jd) {
            return 0.0f;
        }
        int i11 = f17400qk - 1;
        f17400qk = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(my[i11])) {
            throw new IllegalStateException(o2.o(g.o("Unbalanced trace call ", str, ". Expected "), my[f17400qk], "."));
        }
        Trace.endSection();
        return (System.nanoTime() - f17398jj[f17400qk]) / 1000000.0f;
    }

    public static void jpo(String str) {
        if (f17397jd) {
            int i10 = f17400qk;
            if (i10 == 20) {
                xyk++;
                return;
            }
            my[i10] = str;
            f17398jj[i10] = System.nanoTime();
            Trace.beginSection(str);
            f17400qk++;
        }
    }

    public static com.bytedance.adsdk.jd.cm.xyk jpo(Context context) {
        com.bytedance.adsdk.jd.cm.xyk xykVar;
        com.bytedance.adsdk.jd.cm.xyk xykVar2 = f17399ju;
        if (xykVar2 != null) {
            return xykVar2;
        }
        synchronized (com.bytedance.adsdk.jd.cm.xyk.class) {
            try {
                xykVar = f17399ju;
                if (xykVar == null) {
                    com.bytedance.adsdk.jd.cm.qk qkVarJd = jd(context);
                    com.bytedance.adsdk.jd.cm.jj jdVar = zz;
                    if (jdVar == null) {
                        jdVar = new com.bytedance.adsdk.jd.cm.jd();
                    }
                    xykVar = new com.bytedance.adsdk.jd.cm.xyk(qkVarJd, jdVar);
                    f17399ju = xykVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xykVar;
    }

    public static boolean jpo() {
        return f17396cm;
    }

    public static com.bytedance.adsdk.jd.cm.qk jd(Context context) {
        com.bytedance.adsdk.jd.cm.qk qkVar;
        if (!wqx) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.jd.cm.qk qkVar2 = f11if;
        if (qkVar2 != null) {
            return qkVar2;
        }
        synchronized (com.bytedance.adsdk.jd.cm.qk.class) {
            try {
                qkVar = f11if;
                if (qkVar == null) {
                    com.bytedance.adsdk.jd.cm.my myVar = f17401yd;
                    if (myVar == null) {
                        myVar = new com.bytedance.adsdk.jd.cm.my() { // from class: com.bytedance.adsdk.jd.my.1
                            @Override // com.bytedance.adsdk.jd.cm.my
                            public File jpo() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    qkVar = new com.bytedance.adsdk.jd.cm.qk(myVar);
                    f11if = qkVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qkVar;
    }
}
