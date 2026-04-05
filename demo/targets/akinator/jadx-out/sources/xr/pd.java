package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class pd implements fe {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f92903a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f92904b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.n0 f92905c;

    /* renamed from: d, reason: collision with root package name */
    public final ee f92906d;

    /* renamed from: e, reason: collision with root package name */
    public final lt.e f92907e;

    /* renamed from: f, reason: collision with root package name */
    public fe f92908f;

    public pd(Executor executor, Executor executor2, ee eeVar, wr.n0 n0Var, lt.e eVar) {
        this.f92903a = executor;
        this.f92904b = executor2;
        this.f92906d = eeVar;
        this.f92905c = n0Var;
        this.f92907e = eVar;
    }

    public static void a(pd pdVar, Throwable th2) {
        pdVar.f92906d.close(wr.m6.f91039g.withDescription("Application error processing RPC").withCause(th2), new wr.e4());
    }

    public final void b(wr.m6 m6Var) {
        if (!m6Var.isOk()) {
            Throwable cause = m6Var.getCause();
            if (cause == null) {
                cause = wr.u2.asRuntimeException(wr.m6.f91038f.withDescription("RPC cancelled"), null, false);
            }
            this.f92904b.execute(new kd(this.f92905c, cause));
        }
        this.f92903a.execute(new ld(this, lt.c.linkOut(), m6Var));
    }

    public final void c(fe feVar) {
        mh.p1.checkNotNull(feVar, "listener must not be null");
        mh.p1.checkState(this.f92908f == null, "Listener already set");
        this.f92908f = feVar;
    }

    @Override // xr.fe
    public void closed(wr.m6 m6Var) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerStreamListener.closed");
        try {
            lt.c.attachTag(this.f92907e);
            b(m6Var);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // xr.fe
    public void halfClosed() {
        lt.f fVarTraceTask = lt.c.traceTask("ServerStreamListener.halfClosed");
        try {
            lt.c.attachTag(this.f92907e);
            this.f92903a.execute(new md(this, lt.c.linkOut()));
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // xr.fe, xr.we
    public void messagesAvailable(ve veVar) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerStreamListener.messagesAvailable");
        try {
            lt.c.attachTag(this.f92907e);
            this.f92903a.execute(new nd(this, lt.c.linkOut(), veVar));
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // xr.fe, xr.we
    public void onReady() {
        lt.f fVarTraceTask = lt.c.traceTask("ServerStreamListener.onReady");
        try {
            lt.c.attachTag(this.f92907e);
            this.f92903a.execute(new od(this, lt.c.linkOut()));
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
