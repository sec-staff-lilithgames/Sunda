package com.bytedance.sdk.component.xyk;

import com.bytedance.sdk.component.xyk.jpo;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends my {

    /* renamed from: jd, reason: collision with root package name */
    public static wqx f19026jd;

    /* renamed from: jj, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19027jj;

    /* renamed from: ju, reason: collision with root package name */
    private static volatile ScheduledExecutorService f19028ju;
    private static volatile ThreadPoolExecutor my;

    /* renamed from: qk, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19029qk;
    private static volatile ThreadPoolExecutor xyk;

    /* renamed from: yd, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19030yd;
    private static volatile ThreadPoolExecutor zz;
    public static final int jpo = Runtime.getRuntime().availableProcessors();
    public static int wqx = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;

    /* renamed from: cm, reason: collision with root package name */
    public static boolean f19025cm = true;

    public static ExecutorService cm() {
        if (xyk == null) {
            synchronized (jj.class) {
                try {
                    if (xyk == null) {
                        jpo jpoVarJpo = new jpo.C0094jpo().jpo("log").jd(10).jpo(4).jpo(20L).jpo(TimeUnit.SECONDS).jpo(new PriorityBlockingQueue()).jpo(xyk()).jpo(my.jpo().createThreadFactory(10, "log")).jpo();
                        xyk = jpoVarJpo;
                        jpoVarJpo.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return xyk;
    }

    public static ExecutorService jd() {
        if (my == null) {
            synchronized (jj.class) {
                try {
                    if (my == null) {
                        my = new jpo.C0094jpo().jpo(C3191e4.a.f36368f).jpo(0).jd(10).jpo(5L).jpo(TimeUnit.SECONDS).jpo(new SynchronousQueue()).jpo(xyk()).jpo(my.jpo().createThreadFactory(10, C3191e4.a.f36368f)).jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return my;
    }

    public static ScheduledExecutorService jj() {
        if (f19028ju == null) {
            synchronized (jj.class) {
                try {
                    if (f19028ju == null) {
                        f19028ju = Executors.newSingleThreadScheduledExecutor(my.jpo().createThreadFactory(5, "scheduled"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f19028ju;
    }

    public static void jpo(xyk xykVar) {
        if (my == null) {
            jd();
        }
        if (xykVar == null || my == null) {
            return;
        }
        my.execute(xykVar);
    }

    public static ExecutorService my() {
        if (f19030yd == null) {
            synchronized (jj.class) {
                try {
                    if (f19030yd == null) {
                        jpo jpoVarJpo = new jpo.C0094jpo().jpo("aidl").jd(10).jpo(2).jpo(30L).jpo(TimeUnit.SECONDS).jpo(new PriorityBlockingQueue()).jpo(xyk()).jpo(my.jpo().createThreadFactory(10, "aidl")).jpo();
                        f19030yd = jpoVarJpo;
                        jpoVarJpo.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f19030yd;
    }

    public static boolean qk() {
        return f19025cm;
    }

    public static ExecutorService wqx() {
        return jpo(10);
    }

    public static RejectedExecutionHandler xyk() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.xyk.jj.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ExecutorService yd() {
        if (zz == null) {
            synchronized (jj.class) {
                try {
                    if (zz == null) {
                        jpo jpoVarJpo = new jpo.C0094jpo().jpo("computation").jpo(3).jd(10).jpo(20L).jpo(TimeUnit.SECONDS).jpo(new PriorityBlockingQueue()).jpo(xyk()).jpo(my.jpo().createThreadFactory(10, "computation")).jpo();
                        zz = jpoVarJpo;
                        jpoVarJpo.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zz;
    }

    public static wqx zz() {
        return f19026jd;
    }

    public static void wqx(xyk xykVar) {
        if (xyk == null) {
            cm();
        }
        if (xykVar == null || xyk == null) {
            return;
        }
        xyk.execute(xykVar);
    }

    public static ExecutorService jpo(int i10) {
        if (f19027jj == null) {
            synchronized (jj.class) {
                try {
                    if (f19027jj == null) {
                        jpo jpoVarJpo = new jpo.C0094jpo().jpo("io").jpo(2).jd(i10).jpo(20L).jpo(TimeUnit.SECONDS).jpo(new LinkedBlockingQueue()).jpo(xyk()).jpo(my.jpo().createThreadFactory(i10, "io")).jpo();
                        f19027jj = jpoVarJpo;
                        jpoVarJpo.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f19027jj;
    }

    public static void wqx(xyk xykVar, int i10) {
        if (xykVar != null) {
            xykVar.setPriority(i10);
        }
        cm(xykVar);
    }

    public static void wqx(int i10) {
        wqx = i10;
    }

    public static void jd(xyk xykVar) {
        if (f19027jj == null) {
            wqx();
        }
        if (f19027jj != null) {
            f19027jj.execute(xykVar);
        }
    }

    public static void cm(xyk xykVar) {
        if (f19030yd == null) {
            my();
        }
        if (xykVar == null || f19030yd == null) {
            return;
        }
        f19030yd.execute(xykVar);
    }

    public static void my(xyk xykVar) {
        if (f19029qk == null) {
            jd(5);
        }
        if (xykVar == null || f19029qk == null) {
            return;
        }
        f19029qk.execute(xykVar);
    }

    public static void jd(xyk xykVar, int i10) {
        if (xykVar != null) {
            xykVar.setPriority(i10);
        }
        wqx(xykVar);
    }

    public static void jpo(xyk xykVar, int i10) {
        jd(xykVar);
    }

    public static ExecutorService jd(int i10) {
        if (f19029qk == null) {
            synchronized (jj.class) {
                try {
                    if (f19029qk == null) {
                        jpo jpoVarJpo = new jpo.C0094jpo().jpo("ad").jpo(2).jd(i10).jpo(20L).jpo(TimeUnit.SECONDS).jpo(new LinkedBlockingQueue()).jpo(xyk()).jpo(my.jpo().createThreadFactory(i10, "ad")).jpo();
                        f19029qk = jpoVarJpo;
                        jpoVarJpo.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f19029qk;
    }

    public static void jpo(xyk xykVar, int i10, int i11) {
        if (f19027jj == null) {
            jpo(i11);
        }
        if (xykVar == null || f19027jj == null) {
            return;
        }
        xykVar.setPriority(i10);
        f19027jj.execute(xykVar);
    }

    public static void jpo(boolean z10) {
        f19025cm = z10;
    }

    public static void jpo(wqx wqxVar) {
        f19026jd = wqxVar;
    }
}
