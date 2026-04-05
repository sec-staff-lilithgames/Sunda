package xr;

import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ea extends wr.k3 implements wr.m2 {

    /* renamed from: q, reason: collision with root package name */
    public static final Logger f92470q = Logger.getLogger(ea.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public i6 f92471a;

    /* renamed from: b, reason: collision with root package name */
    public da f92472b;

    /* renamed from: c, reason: collision with root package name */
    public ba f92473c;

    /* renamed from: d, reason: collision with root package name */
    public final wr.n2 f92474d;

    /* renamed from: e, reason: collision with root package name */
    public final String f92475e;

    /* renamed from: f, reason: collision with root package name */
    public final a3 f92476f;

    /* renamed from: g, reason: collision with root package name */
    public final wr.e2 f92477g;

    /* renamed from: h, reason: collision with root package name */
    public final y9 f92478h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f92479i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f92480j;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f92482l;

    /* renamed from: m, reason: collision with root package name */
    public final v0 f92483m;

    /* renamed from: n, reason: collision with root package name */
    public final y0 f92484n;

    /* renamed from: o, reason: collision with root package name */
    public final cf f92485o;

    /* renamed from: k, reason: collision with root package name */
    public final CountDownLatch f92481k = new CountDownLatch(1);

    /* renamed from: p, reason: collision with root package name */
    public final z9 f92486p = new z9(this);

    public ea(String str, y9 y9Var, ScheduledExecutorService scheduledExecutorService, wr.u6 u6Var, v0 v0Var, y0 y0Var, wr.e2 e2Var, cf cfVar) {
        this.f92475e = (String) mh.p1.checkNotNull(str, "authority");
        this.f92474d = wr.n2.allocate((Class<?>) ea.class, str);
        this.f92478h = (y9) mh.p1.checkNotNull(y9Var, "executorPool");
        Executor executor = (Executor) mh.p1.checkNotNull((Executor) y9Var.getObject(), "executor");
        this.f92479i = executor;
        this.f92480j = (ScheduledExecutorService) mh.p1.checkNotNull(scheduledExecutorService, "deadlineCancellationExecutor");
        a3 a3Var = new a3(executor, u6Var);
        this.f92476f = a3Var;
        this.f92477g = (wr.e2) mh.p1.checkNotNull(e2Var);
        a3Var.start(new ca(this));
        this.f92483m = v0Var;
        this.f92484n = (y0) mh.p1.checkNotNull(y0Var, "channelTracer");
        this.f92485o = (cf) mh.p1.checkNotNull(cfVar, "timeProvider");
    }

    @Override // wr.j
    public String authority() {
        return this.f92475e;
    }

    @Override // wr.k3
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f92481k.await(j10, timeUnit);
    }

    @Override // wr.m2, wr.v2
    public wr.n2 getLogId() {
        return this.f92474d;
    }

    @Override // wr.k3
    public wr.f0 getState(boolean z10) {
        i6 i6Var = this.f92471a;
        return i6Var == null ? wr.f0.f90915f : i6Var.f92632y.getState();
    }

    @Override // wr.m2
    public sh.n1 getStats() {
        sh.a2 a2VarCreate = sh.a2.create();
        wr.x1 x1Var = new wr.x1();
        this.f92483m.a(x1Var);
        this.f92484n.c(x1Var);
        x1Var.setTarget(this.f92475e).setState(this.f92471a.f92632y.getState()).setSubchannels(Collections.singletonList(this.f92471a));
        a2VarCreate.set(x1Var.build());
        return a2VarCreate;
    }

    @Override // wr.k3
    public boolean isShutdown() {
        return this.f92482l;
    }

    @Override // wr.k3
    public boolean isTerminated() {
        return this.f92481k.getCount() == 0;
    }

    @Override // wr.j
    public <RequestT, ResponseT> wr.p newCall(wr.k4 k4Var, wr.i iVar) {
        return new j1(k4Var, iVar.getExecutor() == null ? this.f92479i : iVar.getExecutor(), iVar, this.f92486p, this.f92480j, this.f92483m);
    }

    @Override // wr.k3
    public void resetConnectBackoff() {
        i6 i6Var = this.f92471a;
        i6Var.f92620m.execute(new r5(i6Var));
    }

    @Override // wr.k3
    public wr.k3 shutdown() {
        this.f92482l = true;
        this.f92476f.shutdown(wr.m6.f91047o.withDescription("OobChannel.shutdown() called"));
        return this;
    }

    @Override // wr.k3
    public wr.k3 shutdownNow() {
        this.f92482l = true;
        this.f92476f.shutdownNow(wr.m6.f91047o.withDescription("OobChannel.shutdownNow() called"));
        return this;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("logId", this.f92474d.getId()).add("authority", this.f92475e).toString();
    }
}
