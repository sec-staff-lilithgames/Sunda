package xr;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class hd implements fe {

    /* renamed from: a, reason: collision with root package name */
    public final id f92593a;

    /* renamed from: b, reason: collision with root package name */
    public final k5.a f92594b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.n0 f92595c;

    public hd(id idVar, k5.a aVar, wr.n0 n0Var) {
        this.f92593a = (id) mh.p1.checkNotNull(idVar, NotificationCompat.CATEGORY_CALL);
        this.f92594b = (k5.a) mh.p1.checkNotNull(aVar, "listener must not be null");
        wr.n0 n0Var2 = (wr.n0) mh.p1.checkNotNull(n0Var, "context");
        this.f92595c = n0Var2;
        n0Var2.addListener(new gd(this), sh.w1.directExecutor());
    }

    public final void a(wr.m6 m6Var) {
        wr.o6 o6VarAsRuntimeException = null;
        try {
            if (m6Var.isOk()) {
                this.f92594b.onComplete();
            } else {
                this.f92593a.f92657i = true;
                this.f92594b.onCancel();
                o6VarAsRuntimeException = wr.u2.asRuntimeException(wr.m6.f91038f.withDescription("RPC cancelled"), null, false);
            }
            this.f92595c.cancel(o6VarAsRuntimeException);
        } catch (Throwable th2) {
            this.f92595c.cancel(null);
            throw th2;
        }
    }

    public final void b(ve veVar) throws IOException {
        if (this.f92593a.f92657i) {
            Logger logger = c5.f92306a;
            while (true) {
                InputStream next = veVar.next();
                if (next == null) {
                    return;
                } else {
                    c5.closeQuietly(next);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream next2 = veVar.next();
                    if (next2 == null) {
                        return;
                    }
                    try {
                        this.f92594b.onMessage(this.f92593a.f92650b.parseRequest(next2));
                        next2.close();
                    } catch (Throwable th2) {
                        c5.closeQuietly(next2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Logger logger2 = c5.f92306a;
                    while (true) {
                        InputStream next3 = veVar.next();
                        if (next3 == null) {
                            mh.g3.throwIfUnchecked(th3);
                            throw new RuntimeException(th3);
                        }
                        c5.closeQuietly(next3);
                    }
                }
            }
        }
    }

    @Override // xr.fe
    public void closed(wr.m6 m6Var) {
        lt.f fVarTraceTask = lt.c.traceTask("ServerStreamListener.closed");
        try {
            lt.c.attachTag(this.f92593a.f92651c);
            a(m6Var);
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
            lt.c.attachTag(this.f92593a.f92651c);
            if (this.f92593a.f92657i) {
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } else {
                this.f92594b.onHalfClose();
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
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
            lt.c.attachTag(this.f92593a.f92651c);
            b(veVar);
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
            lt.c.attachTag(this.f92593a.f92651c);
            if (this.f92593a.f92657i) {
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } else {
                this.f92594b.onReady();
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
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
