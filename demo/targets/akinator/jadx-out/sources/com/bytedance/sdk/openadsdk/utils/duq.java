package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.xyk.wqx.jj;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class duq {

    /* renamed from: cm, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj f21506cm;

    /* renamed from: jd, reason: collision with root package name */
    private static volatile boolean f21507jd;

    /* renamed from: jj, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj f21508jj;
    private static volatile ThreadPoolExecutor jpo;

    /* renamed from: ju, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj f21509ju;
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj my;

    /* renamed from: qk, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj f21510qk;
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj wqx;
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj xyk;

    /* renamed from: yd, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj f21511yd;
    private static volatile com.bytedance.sdk.component.xyk.wqx.jj zz;

    static {
        com.bytedance.sdk.component.xyk.wqx.wqx.jpo(new com.bytedance.sdk.component.xyk.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.utils.duq.1
            @Override // com.bytedance.sdk.component.xyk.wqx.jpo
            public void jpo(com.bytedance.sdk.component.xyk.wqx.jj jjVar, com.bytedance.sdk.component.xyk.wqx.jd jdVar) {
                jdVar.jd();
                new RuntimeException();
            }
        });
        jpo = null;
        f21507jd = false;
    }

    private static ThreadPoolExecutor au() {
        int iWad;
        if (jpo == null) {
            synchronized (duq.class) {
                try {
                    if (jpo == null) {
                        if (com.bytedance.sdk.openadsdk.core.settings.au.as()) {
                            iWad = com.bytedance.sdk.openadsdk.core.settings.au.jrx().wad();
                            f21507jd = true;
                        } else {
                            iWad = 4;
                        }
                        jpo = new ThreadPoolExecutor(iWad, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public static ExecutorService cm() {
        return m495if() ? prr() : com.bytedance.sdk.component.xyk.jj.cm();
    }

    private static com.bytedance.sdk.component.xyk.wqx.jj hna() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = my;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(my)) {
                    try {
                        my = jpo("aidl", my);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = my;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    /* renamed from: if, reason: not valid java name */
    public static boolean m495if() {
        if (com.bytedance.sdk.openadsdk.core.settings.au.as()) {
            return com.bytedance.sdk.openadsdk.core.settings.au.jrx().aix();
        }
        return true;
    }

    public static ExecutorService jd() {
        return m495if() ? sq() : com.bytedance.sdk.component.xyk.jj.yd();
    }

    public static boolean jj() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ScheduledExecutorService jpo() {
        return com.bytedance.sdk.component.xyk.jj.jj();
    }

    private static com.bytedance.sdk.component.xyk.wqx.jj jr() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = f21509ju;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(f21509ju)) {
                    try {
                        f21509ju = jpo("imgdisk", f21509ju);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = f21509ju;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    public static com.bytedance.sdk.component.xyk.wqx.jj ju() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = f21511yd;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(f21511yd)) {
                    try {
                        f21511yd = jpo("net", f21511yd);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = f21511yd;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    public static ExecutorService my() {
        return m495if() ? zz() : com.bytedance.sdk.component.xyk.jj.jd();
    }

    private static com.bytedance.sdk.component.xyk.wqx.jj opi() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = f21510qk;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(f21510qk)) {
                    try {
                        f21510qk = jpo("io", f21510qk);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = f21510qk;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    private static ThreadPoolExecutor oya() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = wqx;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(wqx)) {
                    try {
                        wqx = jpo("ad", wqx);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = wqx;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    private static com.bytedance.sdk.component.xyk.wqx.jj prr() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = f21506cm;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(f21506cm)) {
                    try {
                        f21506cm = jpo("log", f21506cm);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = f21506cm;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    public static boolean qk() {
        String str = m495if() ? "pag_log" : "csj_log";
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    private static com.bytedance.sdk.component.xyk.wqx.jj sq() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = xyk;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(xyk)) {
                    try {
                        xyk = jpo("image", xyk);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = xyk;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    public static ExecutorService wqx() {
        return m495if() ? jr() : com.bytedance.sdk.component.xyk.jj.wqx();
    }

    public static ExecutorService xyk() {
        return m495if() ? opi() : com.bytedance.sdk.component.xyk.jj.wqx();
    }

    public static com.bytedance.sdk.component.xyk.wqx.jj yd() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = zz;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(zz)) {
                    try {
                        zz = jpo("express", zz);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = zz;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    public static com.bytedance.sdk.component.xyk.wqx.jj zz() {
        com.bytedance.sdk.component.xyk.wqx.jj jjVar;
        com.bytedance.sdk.component.xyk.wqx.jj jjVar2 = f21508jj;
        if (!jpo(jjVar2)) {
            return jjVar2;
        }
        synchronized (duq.class) {
            try {
                if (jpo(f21508jj)) {
                    try {
                        f21508jj = jpo("cache", f21508jj);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                jjVar = f21508jj;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jjVar;
    }

    public static void jpo(Runnable runnable) {
        if (runnable == null || kln.jpo) {
            return;
        }
        if (jj()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.oya.wqx().post(runnable);
        }
    }

    public static void cm(final com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (xykVar == null || kln.jpo) {
            return;
        }
        if (m495if()) {
            oya().execute(new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.7
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.xyk.jj.my(xykVar);
        }
    }

    public static void jd(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.oya.wqx().removeCallbacks(runnable);
    }

    public static void my(final com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (kln.jpo) {
            return;
        }
        if (m495if()) {
            oya().execute(new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName(), xykVar) { // from class: com.bytedance.sdk.openadsdk.utils.duq.9
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            });
            return;
        }
        ThreadPoolExecutor threadPoolExecutorAu = au();
        threadPoolExecutorAu.execute(xykVar);
        if (f21507jd || !com.bytedance.sdk.openadsdk.core.settings.au.as()) {
            return;
        }
        f21507jd = true;
        threadPoolExecutorAu.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.au.jrx().wad());
    }

    public static void wqx(final com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (xykVar == null || kln.jpo) {
            return;
        }
        if (m495if()) {
            prr().execute(new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.5
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.xyk.jj.wqx(xykVar);
        }
    }

    public static void jd(final com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (kln.jpo) {
            return;
        }
        if (m495if()) {
            opi().execute(new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.3
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.xyk.jj.jd(xykVar);
        }
    }

    public static void jpo(final com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (kln.jpo) {
            return;
        }
        if (m495if()) {
            zz().execute(new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.2
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.xyk.jj.jpo(xykVar);
        }
    }

    public static void wqx(final com.bytedance.sdk.component.xyk.xyk xykVar, int i10) {
        if (xykVar == null || kln.jpo) {
            return;
        }
        if (m495if()) {
            hna().execute(new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.8
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.xyk.jj.wqx(xykVar, i10);
        }
    }

    public static void jd(final com.bytedance.sdk.component.xyk.xyk xykVar, int i10) {
        if (xykVar == null || kln.jpo) {
            return;
        }
        if (m495if()) {
            com.bytedance.sdk.component.xyk.wqx.jd jdVar = new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.6
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            };
            jdVar.jpo(i10);
            prr().execute(jdVar);
            return;
        }
        com.bytedance.sdk.component.xyk.jj.jd(xykVar, i10);
    }

    public static void jpo(final com.bytedance.sdk.component.xyk.xyk xykVar, int i10) {
        if (xykVar == null || kln.jpo) {
            return;
        }
        if (m495if()) {
            com.bytedance.sdk.component.xyk.wqx.jd jdVar = new com.bytedance.sdk.component.xyk.wqx.jd(xykVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.duq.4
                @Override // java.lang.Runnable
                public void run() {
                    xykVar.run();
                }
            };
            jdVar.jpo(i10);
            opi().execute(jdVar);
            return;
        }
        com.bytedance.sdk.component.xyk.jj.jpo(xykVar, 5, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.sdk.component.xyk.wqx.jj.jpo jd(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.duq.jd(java.lang.String):com.bytedance.sdk.component.xyk.wqx.jj$jpo");
    }

    public static void jpo(com.bytedance.sdk.component.xyk.wqx.jd jdVar) {
        ju().execute(jdVar);
    }

    private static boolean jpo(com.bytedance.sdk.component.xyk.wqx.jj jjVar) {
        if (jjVar != null) {
            return !jjVar.jpo() && com.bytedance.sdk.openadsdk.core.settings.au.as();
        }
        return true;
    }

    private static com.bytedance.sdk.component.xyk.wqx.jj jpo(String str, com.bytedance.sdk.component.xyk.wqx.jj jjVar) {
        jj.jpo jpoVarJpo = jpo(str);
        if (jjVar == null) {
            return jpoVarJpo.jpo();
        }
        jjVar.jpo(jpoVarJpo);
        return jjVar;
    }

    private static jj.jpo jpo(String str) {
        jj.jpo jpoVarJd = jd(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.au.as()) {
                jpoVarJd.jd(true);
                JSONObject jSONObjectUx = com.bytedance.sdk.openadsdk.core.settings.au.jrx().ux();
                JSONObject jSONObjectOptJSONObject = jSONObjectUx != null ? jSONObjectUx.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    jpoVarJd.jd(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        jpoVarJd.jpo(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        jpoVarJd.jd(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        jpoVarJd.wqx(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        jpoVarJd.jpo(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        jpoVarJd.jpo(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return jpoVarJd;
        } catch (Throwable th2) {
            th2.getMessage();
            return jpoVarJd;
        }
    }
}
