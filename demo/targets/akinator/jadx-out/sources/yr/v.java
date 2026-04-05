package yr;

import wr.e4;
import wr.m6;
import xr.hf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements xr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f95055a;

    public v(x xVar) {
        this.f95055a = xVar;
    }

    @Override // xr.b
    public void cancel(m6 m6Var) {
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpClientStream$Sink.cancel");
        try {
            synchronized (this.f95055a.f95115l.f95103y) {
                this.f95055a.f95115l.j(null, true, m6Var);
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

    @Override // xr.b
    public void writeFrame(hf hfVar, boolean z10, boolean z11, int i10) {
        pw.g gVar;
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpClientStream$Sink.writeFrame");
        try {
            if (hfVar == null) {
                gVar = x.f95110p;
            } else {
                gVar = ((b1) hfVar).f94840a;
                int size = (int) gVar.size();
                if (size > 0) {
                    xr.m mVarB = this.f95055a.b();
                    synchronized (mVarB.f92778b) {
                        mVarB.f92782f += size;
                    }
                }
            }
            synchronized (this.f95055a.f95115l.f95103y) {
                w.i(this.f95055a.f95115l, gVar, z10, z11);
                this.f95055a.f92446a.reportMessageSent(i10);
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

    @Override // xr.b
    public void writeHeaders(e4 e4Var, byte[] bArr) {
        lt.f fVarTraceTask = lt.c.traceTask("OkHttpClientStream$Sink.writeHeaders");
        try {
            String str = "/" + this.f95055a.f95111h.getFullMethodName();
            if (bArr != null) {
                this.f95055a.f95118o = true;
                str = str + "?" + ph.o.base64().encode(bArr);
            }
            synchronized (this.f95055a.f95115l.f95103y) {
                w.h(this.f95055a.f95115l, e4Var, str);
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
