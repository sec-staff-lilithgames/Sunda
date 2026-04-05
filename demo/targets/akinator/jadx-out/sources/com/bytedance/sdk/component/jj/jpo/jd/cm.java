package com.bytedance.sdk.component.jj.jpo.jd;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.jj.jpo.my;
import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: if, reason: not valid java name */
    private final PriorityBlockingQueue<com.bytedance.sdk.component.jj.jpo.cm.jpo> f64if;

    /* renamed from: ju, reason: collision with root package name */
    private final Comparator<com.bytedance.sdk.component.jj.jpo.cm.jpo> f18634ju;

    /* renamed from: yd, reason: collision with root package name */
    private volatile Handler f18635yd;
    private volatile com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx zz;
    public static final cm jpo = new cm();

    /* renamed from: cm, reason: collision with root package name */
    public static final com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo f18630cm = new com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo();
    public static final AtomicLong my = new AtomicLong(0);

    /* renamed from: jj, reason: collision with root package name */
    public static final AtomicLong f18631jj = new AtomicLong(0);

    /* renamed from: qk, reason: collision with root package name */
    public static final long f18632qk = System.currentTimeMillis();
    public static long xyk = 0;

    /* renamed from: jd, reason: collision with root package name */
    public volatile boolean f18633jd = false;
    public volatile boolean wqx = false;

    private cm() {
        Comparator<com.bytedance.sdk.component.jj.jpo.cm.jpo> comparator = new Comparator<com.bytedance.sdk.component.jj.jpo.cm.jpo>() { // from class: com.bytedance.sdk.component.jj.jpo.jd.cm.1
            @Override // java.util.Comparator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar2) {
                return cm.this.jpo(jpoVar, jpoVar2);
            }
        };
        this.f18634ju = comparator;
        this.f64if = new PriorityBlockingQueue<>(8, comparator);
    }

    public boolean cm() {
        try {
            if (this.zz != null || com.bytedance.sdk.component.jj.jpo.jd.jd()) {
                return false;
            }
            synchronized (this) {
                if (this.zz != null) {
                    return false;
                }
                this.zz = new com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx(this.f64if);
                this.zz.start();
                return true;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public void jd() {
        cm();
        my();
    }

    public void my() {
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(f18630cm.nzb(), 1);
        final com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx wqxVar = this.zz;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (wqxVar != null) {
                wqxVar.wqx(2);
                return;
            }
            return;
        }
        my myVarHna = xyk.qk().hna();
        if (myVarHna != null) {
            Executor executorCm = myVarHna.cm();
            if (executorCm == null) {
                executorCm = myVarHna.my();
            }
            if (executorCm != null) {
                executorCm.execute(new com.bytedance.sdk.component.jj.jpo.my.my("flush") { // from class: com.bytedance.sdk.component.jj.jpo.jd.cm.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx wqxVar2 = wqxVar;
                        if (wqxVar2 != null) {
                            wqxVar2.wqx(2);
                        }
                    }
                });
            }
        }
    }

    public void wqx() {
        if (this.zz == null || !this.zz.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.zz != null && this.zz.isAlive()) {
                    if (this.f18635yd != null) {
                        this.f18635yd.removeCallbacksAndMessages(null);
                    }
                    this.zz.jpo(false);
                    this.zz.quitSafely();
                    this.zz = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo() {
        return this.f64if;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar2) {
        long jJpo;
        long jJd;
        long jJd2;
        long jJpo2;
        if (jpoVar == null) {
            return jpoVar2 == null ? 0 : -1;
        }
        if (jpoVar2 == null) {
            return 1;
        }
        if (jpoVar.my() == jpoVar2.my()) {
            if (jpoVar.jpo() != null) {
                jJpo = jpoVar.jpo().jpo();
                jJd = jpoVar.jpo().jd();
            } else {
                jJpo = 0;
                jJd = 0;
            }
            if (jpoVar2.jpo() != null) {
                jJpo2 = jpoVar2.jpo().jpo();
                jJd2 = jpoVar2.jpo().jd();
            } else {
                jJd2 = 0;
                jJpo2 = 0;
            }
            if (jJpo == 0 || jJpo2 == 0) {
                return 0;
            }
            long j10 = jJpo - jJpo2;
            if (Math.abs(j10) > 2147483647L) {
                return 0;
            }
            if (j10 != 0) {
                return (int) j10;
            }
            if (jJd == 0 || jJd2 == 0) {
                return 0;
            }
            return (int) (jJd - jJd2);
        }
        return jpoVar.my() - jpoVar2.my();
    }

    public void jpo(Handler handler) {
        this.f18635yd = handler;
    }

    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) {
        cm();
        my myVarHna = xyk.qk().hna();
        com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx wqxVar = this.zz;
        if (wqxVar != null) {
            jpo(myVarHna, jpoVar);
            wqxVar.jpo(jpoVar, jpoVar.my() == 4);
        }
    }

    private void jpo(final my myVar, com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (myVar != null) {
            try {
                if (myVar.qk()) {
                    final long jJd = (jpoVar == null || jpoVar.jpo() == null) ? 0L : jpoVar.jpo().jd();
                    if (jJd == 1) {
                        xyk = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongRxq = f18630cm.rxq();
                    com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(atomicLongRxq, 1);
                    if (atomicLongRxq.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorCm = myVar.cm();
                                if (executorCm == null) {
                                    executorCm = myVar.my();
                                }
                                if (executorCm != null) {
                                    executorCm.execute(new com.bytedance.sdk.component.jj.jpo.my.my("report") { // from class: com.bytedance.sdk.component.jj.jpo.jd.cm.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            cm.this.jpo(myVar, jJd);
                                        }
                                    });
                                }
                            } else {
                                jpo(myVar, jJd);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(my myVar, long j10) {
        com.bytedance.sdk.component.jj.jpo.jd.wqx.wqx wqxVar = this.zz;
        if (myVar == null || wqxVar == null) {
            return;
        }
        com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar = f18630cm;
        wqxVar.jpo(myVar.jpo(jpoVar.jd(j10)), true);
        jpoVar.xk();
    }
}
