package ds;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.p1;
import mh.u2;
import sh.n1;
import wr.e4;
import wr.k4;
import wr.m6;
import wr.n6;
import wr.o6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f52643a = Logger.getLogger(q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f52644b;

    /* renamed from: c, reason: collision with root package name */
    public static final wr.h f52645c;

    static {
        f52644b = !u2.isNullOrEmpty(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f52645c = wr.h.create("internal-stub-type");
    }

    public static void a(wr.p pVar, Object obj, l lVar) {
        pVar.start(lVar, new e4());
        lVar.a();
        try {
            pVar.sendMessage(obj);
            pVar.halfClose();
        } catch (Error | RuntimeException e10) {
            b(pVar, e10);
            throw null;
        }
    }

    public static <ReqT, RespT> l0 asyncBidiStreamingCall(wr.p pVar, l0 l0Var) {
        p1.checkNotNull(l0Var, "responseObserver");
        j jVar = new j(pVar, true);
        m mVar = new m(l0Var, jVar);
        pVar.start(mVar, new e4());
        mVar.a();
        return jVar;
    }

    public static <ReqT, RespT> l0 asyncClientStreamingCall(wr.p pVar, l0 l0Var) {
        p1.checkNotNull(l0Var, "responseObserver");
        j jVar = new j(pVar, false);
        m mVar = new m(l0Var, jVar);
        pVar.start(mVar, new e4());
        mVar.a();
        return jVar;
    }

    public static <ReqT, RespT> void asyncServerStreamingCall(wr.p pVar, ReqT reqt, l0 l0Var) {
        p1.checkNotNull(l0Var, "responseObserver");
        a(pVar, reqt, new m(l0Var, new j(pVar, true)));
    }

    public static <ReqT, RespT> void asyncUnaryCall(wr.p pVar, ReqT reqt, l0 l0Var) {
        p1.checkNotNull(l0Var, "responseObserver");
        a(pVar, reqt, new m(l0Var, new j(pVar, false)));
    }

    public static void b(wr.p pVar, Throwable th2) {
        try {
            pVar.cancel(null, th2);
        } catch (Error | RuntimeException e10) {
            f52643a.log(Level.SEVERE, "RuntimeException encountered while closing call", e10);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw ((Error) th2);
    }

    public static <ReqT, RespT> Iterator<RespT> blockingServerStreamingCall(wr.p pVar, ReqT reqt) {
        i iVar = new i(pVar);
        a(pVar, reqt, iVar.f52610c);
        return iVar;
    }

    public static <ReqT, RespT> RespT blockingUnaryCall(wr.p pVar, ReqT reqt) {
        try {
            return (RespT) c(futureUnaryCall(pVar, reqt));
        } catch (Error | RuntimeException e10) {
            b(pVar, e10);
            throw null;
        }
    }

    public static Object c(n1 n1Var) {
        try {
            return n1Var.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw m6.f91038f.withDescription("Thread interrupted").withCause(e10).asRuntimeException();
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            for (Throwable cause2 = (Throwable) p1.checkNotNull(cause, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP); cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof n6) {
                    n6 n6Var = (n6) cause2;
                    throw new o6(n6Var.getStatus(), n6Var.getTrailers());
                }
                if (cause2 instanceof o6) {
                    o6 o6Var = (o6) cause2;
                    throw new o6(o6Var.getStatus(), o6Var.getTrailers());
                }
            }
            throw m6.f91039g.withDescription("unexpected exception").withCause(cause).asRuntimeException();
        }
    }

    public static <ReqT, RespT> n1 futureUnaryCall(wr.p pVar, ReqT reqt) {
        k kVar = new k(pVar);
        a(pVar, reqt, new p(kVar));
        return kVar;
    }

    public static <ReqT, RespT> RespT blockingUnaryCall(wr.j jVar, k4 k4Var, wr.i iVar, ReqT reqt) throws Throwable {
        o oVar = new o();
        wr.p pVarNewCall = jVar.newCall(k4Var, iVar.withOption(f52645c, n.f52633b).withExecutor(oVar));
        boolean z10 = false;
        try {
            try {
                n1 n1VarFutureUnaryCall = futureUnaryCall(pVarNewCall, reqt);
                while (!n1VarFutureUnaryCall.isDone()) {
                    try {
                        oVar.waitAndDrain();
                    } catch (InterruptedException e10) {
                        try {
                            pVarNewCall.cancel("Thread interrupted", e10);
                            z10 = true;
                        } catch (Error e11) {
                            e = e11;
                            b(pVarNewCall, e);
                            throw null;
                        } catch (RuntimeException e12) {
                            e = e12;
                            b(pVarNewCall, e);
                            throw null;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                oVar.shutdown();
                RespT respt = (RespT) c(n1VarFutureUnaryCall);
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Error e13) {
            e = e13;
        } catch (RuntimeException e14) {
            e = e14;
        }
    }

    public static <ReqT, RespT> Iterator<RespT> blockingServerStreamingCall(wr.j jVar, k4 k4Var, wr.i iVar, ReqT reqt) {
        wr.p pVarNewCall = jVar.newCall(k4Var, iVar.withOption(f52645c, n.f52633b));
        i iVar2 = new i(pVarNewCall);
        a(pVarNewCall, reqt, iVar2.f52610c);
        return iVar2;
    }
}
