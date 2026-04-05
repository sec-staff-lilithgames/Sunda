package yr;

import java.io.IOException;
import java.net.Socket;
import mh.p1;
import xr.fd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements pw.z0 {

    /* renamed from: e, reason: collision with root package name */
    public final fd f94889e;

    /* renamed from: f, reason: collision with root package name */
    public final g f94890f;

    /* renamed from: k, reason: collision with root package name */
    public pw.z0 f94895k;

    /* renamed from: l, reason: collision with root package name */
    public Socket f94896l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94897m;

    /* renamed from: n, reason: collision with root package name */
    public int f94898n;

    /* renamed from: o, reason: collision with root package name */
    public int f94899o;

    /* renamed from: b, reason: collision with root package name */
    public final Object f94887b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final pw.g f94888c = new pw.g();

    /* renamed from: h, reason: collision with root package name */
    public boolean f94892h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94893i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f94894j = false;

    /* renamed from: g, reason: collision with root package name */
    public final int f94891g = 10000;

    public f(fd fdVar, g gVar) {
        this.f94889e = (fd) p1.checkNotNull(fdVar, "executor");
        this.f94890f = (g) p1.checkNotNull(gVar, "exceptionHandler");
    }

    public final void a(pw.z0 z0Var, Socket socket) {
        p1.checkState(this.f94895k == null, "AsyncSink's becomeConnected should only be called once.");
        this.f94895k = (pw.z0) p1.checkNotNull(z0Var, "sink");
        this.f94896l = (Socket) p1.checkNotNull(socket, "socket");
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f94894j) {
            return;
        }
        this.f94894j = true;
        this.f94889e.execute(new c(this));
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        if (this.f94894j) {
            throw new IOException("closed");
        }
        lt.f fVarTraceTask = lt.c.traceTask("AsyncSink.flush");
        try {
            synchronized (this.f94887b) {
                if (this.f94893i) {
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } else {
                    this.f94893i = true;
                    this.f94889e.execute(new b(this));
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
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

    @Override // pw.z0
    public pw.d1 timeout() {
        return pw.d1.f81884f;
    }

    @Override // pw.z0
    public void write(pw.g gVar, long j10) throws IOException {
        p1.checkNotNull(gVar, "source");
        if (this.f94894j) {
            throw new IOException("closed");
        }
        lt.f fVarTraceTask = lt.c.traceTask("AsyncSink.write");
        try {
            synchronized (this.f94887b) {
                try {
                    this.f94888c.write(gVar, j10);
                    int i10 = this.f94899o + this.f94898n;
                    this.f94899o = i10;
                    boolean z10 = false;
                    this.f94898n = 0;
                    if (this.f94897m || i10 <= this.f94891g) {
                        if (!this.f94892h && !this.f94893i && this.f94888c.completeSegmentByteCount() > 0) {
                            this.f94892h = true;
                        }
                        if (fVarTraceTask != null) {
                            fVarTraceTask.close();
                            return;
                        }
                        return;
                    }
                    this.f94897m = true;
                    z10 = true;
                    if (!z10) {
                        this.f94889e.execute(new a(this));
                        if (fVarTraceTask != null) {
                            fVarTraceTask.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f94896l.close();
                    } catch (IOException e10) {
                        this.f94890f.onException(e10);
                    }
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
