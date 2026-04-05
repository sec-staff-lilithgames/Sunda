package oi;

import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.f;
import hi.c0;
import hi.r0;
import hi.u0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jd.k;
import md.f0;
import pi.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f79406a;

    /* renamed from: b, reason: collision with root package name */
    public final double f79407b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79408c;

    /* renamed from: d, reason: collision with root package name */
    public final long f79409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79410e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f79411f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f79412g;

    /* renamed from: h, reason: collision with root package name */
    public final k f79413h;

    /* renamed from: i, reason: collision with root package name */
    public final r0 f79414i;

    /* renamed from: j, reason: collision with root package name */
    public int f79415j;

    /* renamed from: k, reason: collision with root package name */
    public long f79416k;

    public c(k kVar, d dVar, r0 r0Var) {
        double d10 = dVar.f81384d;
        double d11 = dVar.f81385e;
        this.f79406a = d10;
        this.f79407b = d11;
        this.f79408c = dVar.f81386f * 1000;
        this.f79413h = kVar;
        this.f79414i = r0Var;
        this.f79409d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f79410e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f79411f = arrayBlockingQueue;
        this.f79412g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f79415j = 0;
        this.f79416k = 0L;
    }

    public final int a() {
        if (this.f79416k == 0) {
            this.f79416k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f79416k) / this.f79408c);
        int iMin = this.f79411f.size() == this.f79410e ? Math.min(100, this.f79415j + iCurrentTimeMillis) : Math.max(0, this.f79415j - iCurrentTimeMillis);
        if (this.f79415j != iMin) {
            this.f79415j = iMin;
            this.f79416k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(c0 c0Var, TaskCompletionSource taskCompletionSource) {
        f.getLogger().d("Sending report through Google DataTransport: " + c0Var.getSessionId());
        ((f0) this.f79413h).schedule(jd.f.ofUrgent(c0Var.getReport()), new fo.c(SystemClock.elapsedRealtime() - this.f79409d < 2000, this, taskCompletionSource, c0Var));
    }

    public void flushScheduledReportsIfAble() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new im.k(29, this, countDownLatch)).start();
        u0.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }
}
