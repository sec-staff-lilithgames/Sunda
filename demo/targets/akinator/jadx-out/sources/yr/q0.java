package yr;

import java.util.List;
import wr.e4;
import wr.m6;
import xr.hf;
import yr.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements xr.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f94993a;

    public q0(r0 r0Var) {
        this.f94993a = r0Var;
    }

    @Override // xr.g
    public void cancel(m6 m6Var) {
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpServerStream$Sink.cancel");
        try {
            synchronized (this.f94993a.f95013f.f95020t) {
                r0.a aVar = this.f94993a.f95013f;
                as.a aVar2 = as.a.CANCEL;
                int i10 = aVar.f95018r;
                if (!aVar.f95021u) {
                    aVar.f95021u = true;
                    aVar.f95024x.rstStream(i10, aVar2);
                    aVar.transportReportStatus(m6Var);
                    aVar.f95017q.e(i10, true);
                }
            }
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

    @Override // xr.g
    public void writeFrame(hf hfVar, boolean z10, int i10) {
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpServerStream$Sink.writeFrame");
        try {
            pw.g gVar = ((b1) hfVar).f94840a;
            int size = (int) gVar.size();
            if (size > 0) {
                xr.m mVarB = this.f94993a.b();
                synchronized (mVarB.f92778b) {
                    mVarB.f92782f += size;
                }
            }
            synchronized (this.f94993a.f95013f.f95020t) {
                r0.a aVar = this.f94993a.f95013f;
                if (!aVar.f95021u) {
                    aVar.f95025y.data(false, aVar.B, gVar, z10);
                }
                this.f94993a.f95015h.reportMessageSent(i10);
            }
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

    @Override // xr.g
    public void writeHeaders(e4 e4Var, boolean z10) {
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpServerStream$Sink.writeHeaders");
        try {
            List<as.e> listCreateResponseHeaders = l.createResponseHeaders(e4Var);
            synchronized (this.f94993a.f95013f.f95020t) {
                r0.a aVar = this.f94993a.f95013f;
                h hVar = aVar.f95024x;
                hVar.synReply(false, aVar.f95018r, listCreateResponseHeaders);
                hVar.flush();
            }
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

    @Override // xr.g
    public void writeTrailers(e4 e4Var, boolean z10, m6 m6Var) {
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpServerStream$Sink.writeTrailers");
        try {
            List<as.e> listCreateResponseTrailers = l.createResponseTrailers(e4Var, z10);
            synchronized (this.f94993a.f95013f.f95020t) {
                r0.a aVar = this.f94993a.f95013f;
                aVar.f95025y.notifyWhenNoPendingData(aVar.B, new on.z(25, aVar, listCreateResponseTrailers));
            }
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
