package xr;

import java.util.logging.Logger;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f92491a;

    /* renamed from: b, reason: collision with root package name */
    public wr.m6 f92492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f92493c;

    public f1(j1 j1Var, p.a aVar) {
        this.f92493c = j1Var;
        this.f92491a = (p.a) mh.p1.checkNotNull(aVar, "observer");
    }

    public final void a(wr.m6 m6Var, wr.e4 e4Var) {
        Logger logger = j1.f92672s;
        j1 j1Var = this.f92493c;
        wr.z0 deadline = j1Var.f92682i.getDeadline();
        wr.z0 deadline2 = j1Var.f92679f.getDeadline();
        if (deadline == null) {
            deadline = deadline2;
        } else if (deadline2 != null) {
            deadline = deadline.minimum(deadline2);
        }
        if (m6Var.getCode() == wr.j6.CANCELLED && deadline != null && deadline.isExpired()) {
            l5 l5Var = new l5();
            j1Var.f92683j.appendTimeoutInsight(l5Var);
            m6Var = wr.m6.f91040h.augmentDescription("ClientCall was cancelled at or after deadline. " + l5Var);
            e4Var = new wr.e4();
        }
        j1Var.f92676c.execute(new d1(this, lt.c.linkOut(), m6Var, e4Var));
    }

    @Override // xr.m1
    public void closed(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        lt.f fVarTraceTask = lt.c.traceTask("ClientStreamListener.closed");
        try {
            lt.c.attachTag(this.f92493c.f92675b);
            a(m6Var, e4Var);
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

    @Override // xr.m1
    public void headersRead(wr.e4 e4Var) {
        j1 j1Var = this.f92493c;
        lt.f fVarTraceTask = lt.c.traceTask("ClientStreamListener.headersRead");
        try {
            lt.c.attachTag(j1Var.f92675b);
            j1Var.f92676c.execute(new b1(this, lt.c.linkOut(), e4Var));
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

    @Override // xr.m1, xr.we
    public void messagesAvailable(ve veVar) {
        j1 j1Var = this.f92493c;
        lt.f fVarTraceTask = lt.c.traceTask("ClientStreamListener.messagesAvailable");
        try {
            lt.c.attachTag(j1Var.f92675b);
            j1Var.f92676c.execute(new c1(this, lt.c.linkOut(), veVar));
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

    @Override // xr.m1, xr.we
    public void onReady() {
        j1 j1Var = this.f92493c;
        if (j1Var.f92674a.getType().clientSendsOneMessage()) {
            return;
        }
        lt.f fVarTraceTask = lt.c.traceTask("ClientStreamListener.onReady");
        try {
            lt.c.attachTag(j1Var.f92675b);
            j1Var.f92676c.execute(new e1(this, lt.c.linkOut()));
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
