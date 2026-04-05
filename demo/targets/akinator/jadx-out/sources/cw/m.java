package cw;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f51177a;

    /* renamed from: b, reason: collision with root package name */
    public final bw.g f51178b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51179c;

    /* renamed from: d, reason: collision with root package name */
    public long f51180d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f51181e;

    /* renamed from: f, reason: collision with root package name */
    public final BlockingQueue f51182f;

    public m(f0 routePlanner, bw.g taskRunner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(routePlanner, "routePlanner");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        this.f51177a = routePlanner;
        this.f51178b = taskRunner;
        this.f51179c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f51180d = Long.MIN_VALUE;
        this.f51181e = new CopyOnWriteArrayList();
        this.f51182f = taskRunner.getBackend().decorate(new LinkedBlockingDeque());
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f51181e;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            e0Var.mo3673cancel();
            e0 e0VarRetry = e0Var.retry();
            if (e0VarRetry != null) {
                getRoutePlanner().getDeferredPlans().addLast(e0VarRetry);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final d0 b() throws IOException {
        e0 kVar;
        if (f0.hasNext$default(getRoutePlanner(), null, 1, null)) {
            try {
                kVar = getRoutePlanner().plan();
            } catch (Throwable th2) {
                kVar = new k(th2);
            }
            if (kVar.isReady()) {
                return new d0(kVar, null, null, 6, null);
            }
            if (kVar instanceof k) {
                return ((k) kVar).getResult();
            }
            this.f51181e.add(kVar);
            bw.c.schedule$default(this.f51178b.newQueue(), new l(yv.i.f96668b + " connect " + getRoutePlanner().getAddress().url().redact(), kVar, this), 0L, 2, null);
        }
        return null;
    }

    @Override // cw.j
    public u find() throws IOException {
        d0 d0VarB;
        long j10;
        d0 d0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f51181e;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !f0.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    a();
                    kotlin.jvm.internal.e0.checkNotNull(iOException);
                    throw iOException;
                }
                if (getRoutePlanner().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jNanoTime = this.f51178b.getBackend().nanoTime();
                long j11 = this.f51180d - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j11 <= 0) {
                    d0VarB = b();
                    j10 = this.f51179c;
                    this.f51180d = jNanoTime + j10;
                } else {
                    j10 = j11;
                    d0VarB = null;
                }
                if (d0VarB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (d0Var = (d0) this.f51182f.poll(j10, timeUnit)) == null) {
                        d0VarB = null;
                    } else {
                        copyOnWriteArrayList.remove(d0Var.getPlan());
                        d0VarB = d0Var;
                    }
                    if (d0VarB == null) {
                    }
                }
                if (d0VarB.isSuccess()) {
                    a();
                    if (!d0VarB.getPlan().isReady()) {
                        d0VarB = d0VarB.getPlan().connectTlsEtc();
                    }
                    if (d0VarB.isSuccess()) {
                        return d0VarB.getPlan().handleSuccess();
                    }
                }
                Throwable throwable = d0VarB.getThrowable();
                if (throwable != null) {
                    if (!(throwable instanceof IOException)) {
                        throw throwable;
                    }
                    if (iOException == null) {
                        iOException = (IOException) throwable;
                    } else {
                        tu.h.addSuppressed(iOException, throwable);
                    }
                }
                e0 nextPlan = d0VarB.getNextPlan();
                if (nextPlan != null) {
                    getRoutePlanner().getDeferredPlans().addFirst(nextPlan);
                }
            } finally {
                a();
            }
        }
    }

    @Override // cw.j
    public f0 getRoutePlanner() {
        return this.f51177a;
    }
}
