package xr;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class yd implements he {

    /* renamed from: a, reason: collision with root package name */
    public final ge f93268a;

    /* renamed from: b, reason: collision with root package name */
    public Future f93269b;

    /* renamed from: c, reason: collision with root package name */
    public wr.c f93270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd f93271d;

    public yd(zd zdVar, ge geVar) {
        this.f93271d = zdVar;
        this.f93268a = geVar;
    }

    public static wr.t5 a(yd ydVar, ee eeVar, wr.t5 t5Var, te teVar) {
        teVar.serverCallStarted(new jd(t5Var.getMethodDescriptor(), eeVar.getAttributes(), eeVar.getAuthority()));
        wr.m5 serverCallHandler = t5Var.getServerCallHandler();
        zd zdVar = ydVar.f93271d;
        for (wr.o5 o5Var : zdVar.f93343h) {
            serverCallHandler = wr.r2.interceptCallHandlerCreate(null, serverCallHandler);
        }
        wr.t5 t5VarWithServerCallHandler = t5Var.withServerCallHandler(serverCallHandler);
        wr.d dVar = zdVar.f93357v;
        return dVar == null ? t5VarWithServerCallHandler : dVar.wrapMethodDefinition(t5VarWithServerCallHandler);
    }

    public final void b(ee eeVar, String str, wr.e4 e4Var, lt.e eVar) {
        Executor bdVar;
        Logger logger = zd.f93336z;
        zd zdVar = this.f93271d;
        if (zdVar.f93339d != sh.w1.directExecutor()) {
            bdVar = new fd(zdVar.f93339d);
        } else {
            bdVar = new bd();
            eeVar.optimizeForDirectExecutor();
        }
        Executor executor = bdVar;
        wr.z3 z3Var = c5.f92310e;
        if (e4Var.containsKey(z3Var)) {
            String str2 = (String) e4Var.get(z3Var);
            wr.a1 a1VarLookupDecompressor = zdVar.f93355t.lookupDecompressor(str2);
            if (a1VarLookupDecompressor == null) {
                eeVar.setListener(zd.A);
                eeVar.close(wr.m6.f91045m.withDescription("Can't find decompressor for " + str2), new wr.e4());
                return;
            }
            eeVar.setDecompressor(a1VarLookupDecompressor);
        }
        te teVar = (te) mh.p1.checkNotNull(eeVar.statsTraceContext(), "statsTraceCtx not present from stream");
        Long l9 = (Long) e4Var.get(c5.f92309d);
        wr.u0 u0VarWithValue = teVar.serverFilterContext(zdVar.f93354s).withValue(wr.q2.f91100a, zdVar);
        wr.n0 n0VarWithCancellation = l9 == null ? u0VarWithValue.withCancellation() : u0VarWithValue.withDeadline(wr.z0.after(l9.longValue(), TimeUnit.NANOSECONDS, zdVar.f93360y), this.f93268a.getScheduledExecutorService());
        lt.b bVarLinkOut = lt.c.linkOut();
        wr.n0 n0Var = n0VarWithCancellation;
        pd pdVar = new pd(executor, zdVar.f93339d, eeVar, n0Var, eVar);
        eeVar.setListener(pdVar);
        sh.a2 a2VarCreate = sh.a2.create();
        executor.execute(new vd(this, n0Var, eVar, bVarLinkOut, str, eeVar, pdVar, a2VarCreate, teVar, e4Var, executor));
        executor.execute(new ud(this, n0Var, bVarLinkOut, eVar, a2VarCreate, str, e4Var, eeVar, pdVar));
    }

    public void init() {
        zd zdVar = this.f93271d;
        long j10 = zdVar.f93344i;
        ge geVar = this.f93268a;
        if (j10 != Long.MAX_VALUE) {
            this.f93269b = geVar.getScheduledExecutorService().schedule(new wd(this), j10, TimeUnit.MILLISECONDS);
        } else {
            this.f93269b = new FutureTask(new sd(), null);
        }
        zdVar.f93358w.addServerSocket(zdVar, geVar);
    }

    @Override // xr.he
    public void streamCreated(ee eeVar, String str, wr.e4 e4Var) {
        lt.e eVarCreateTag = lt.c.createTag(str, eeVar.streamId());
        lt.f fVarTraceTask = lt.c.traceTask("ServerTransportListener.streamCreated");
        try {
            lt.c.attachTag(eVarCreateTag);
            b(eeVar, str, e4Var, eVarCreateTag);
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

    @Override // xr.he
    public wr.c transportReady(wr.c cVar) {
        this.f93269b.cancel(false);
        this.f93269b = null;
        for (wr.d6 d6Var : this.f93271d.f93342g) {
            cVar = (wr.c) mh.p1.checkNotNull(d6Var.transportReady(cVar), "Filter %s returned null", d6Var);
        }
        this.f93270c = cVar;
        return cVar;
    }

    @Override // xr.he
    public void transportTerminated() {
        Future future = this.f93269b;
        if (future != null) {
            future.cancel(false);
            this.f93269b = null;
        }
        Iterator it = this.f93271d.f93342g.iterator();
        while (it.hasNext()) {
            ((wr.d6) it.next()).transportTerminated(this.f93270c);
        }
        zd zdVar = this.f93271d;
        ge geVar = this.f93268a;
        synchronized (zdVar.f93351p) {
            try {
                if (!zdVar.f93353r.remove(geVar)) {
                    throw new AssertionError("Transport already removed");
                }
                zdVar.f93358w.removeServerSocket(zdVar, geVar);
                zdVar.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
