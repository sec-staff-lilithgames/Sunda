package io.odeeo.internal.y1;

import java.io.IOException;
import pw.b1;
import pw.h0;
import xv.j0;
import xv.o0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l<T> implements io.odeeo.internal.y1.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final q f67601a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f67602b;

    /* renamed from: c, reason: collision with root package name */
    public final xv.i f67603c;

    /* renamed from: d, reason: collision with root package name */
    public final f<w0, T> f67604d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f67605e;

    /* renamed from: f, reason: collision with root package name */
    public xv.j f67606f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f67607g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67608h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements xv.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f67609a;

        public a(d dVar) {
            this.f67609a = dVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f67609a.onFailure(l.this, th2);
            } catch (Throwable th3) {
                w.a(th3);
                th3.printStackTrace();
            }
        }

        @Override // xv.k
        public void onFailure(xv.j jVar, IOException iOException) {
            a(iOException);
        }

        @Override // xv.k
        public void onResponse(xv.j jVar, v0 v0Var) {
            try {
                try {
                    this.f67609a.onResponse(l.this, l.this.a(v0Var));
                } catch (Throwable th2) {
                    w.a(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                w.a(th3);
                a(th3);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends w0 {

        /* renamed from: a, reason: collision with root package name */
        public final w0 f67611a;

        /* renamed from: b, reason: collision with root package name */
        public final pw.k f67612b;

        /* renamed from: c, reason: collision with root package name */
        public IOException f67613c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends pw.u {
            public a(b1 b1Var) {
                super(b1Var);
            }

            @Override // pw.u, pw.b1
            public long read(pw.g gVar, long j10) throws IOException {
                try {
                    return super.read(gVar, j10);
                } catch (IOException e10) {
                    b.this.f67613c = e10;
                    throw e10;
                }
            }
        }

        public b(w0 w0Var) {
            this.f67611a = w0Var;
            this.f67612b = h0.buffer(new a(w0Var.source()));
        }

        public void a() throws IOException {
            IOException iOException = this.f67613c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // xv.w0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f67611a.close();
        }

        @Override // xv.w0
        public long contentLength() {
            return this.f67611a.contentLength();
        }

        @Override // xv.w0
        public j0 contentType() {
            return this.f67611a.contentType();
        }

        @Override // xv.w0
        public pw.k source() {
            return this.f67612b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends w0 {

        /* renamed from: a, reason: collision with root package name */
        public final j0 f67615a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67616b;

        public c(j0 j0Var, long j10) {
            this.f67615a = j0Var;
            this.f67616b = j10;
        }

        @Override // xv.w0
        public long contentLength() {
            return this.f67616b;
        }

        @Override // xv.w0
        public j0 contentType() {
            return this.f67615a;
        }

        @Override // xv.w0
        public pw.k source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public l(q qVar, Object[] objArr, xv.i iVar, f<w0, T> fVar) {
        this.f67601a = qVar;
        this.f67602b = objArr;
        this.f67603c = iVar;
        this.f67604d = fVar;
    }

    public final xv.j a() throws IOException {
        xv.j jVarNewCall = this.f67603c.newCall(this.f67601a.a(this.f67602b));
        if (jVarNewCall != null) {
            return jVarNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // io.odeeo.internal.y1.b
    public void cancel() {
        xv.j jVar;
        this.f67605e = true;
        synchronized (this) {
            jVar = this.f67606f;
        }
        if (jVar != null) {
            jVar.cancel();
        }
    }

    @Override // io.odeeo.internal.y1.b
    public void enqueue(d<T> dVar) {
        xv.j jVar;
        Throwable th2;
        w.a(dVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f67608h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f67608h = true;
                jVar = this.f67606f;
                th2 = this.f67607g;
                if (jVar == null && th2 == null) {
                    try {
                        xv.j jVarA = a();
                        this.f67606f = jVarA;
                        jVar = jVarA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        w.a(th2);
                        this.f67607g = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            dVar.onFailure(this, th2);
            return;
        }
        if (this.f67605e) {
            jVar.cancel();
        }
        jVar.enqueue(new a(dVar));
    }

    @Override // io.odeeo.internal.y1.b
    public r<T> execute() throws IOException {
        xv.j jVarA;
        synchronized (this) {
            try {
                if (this.f67608h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f67608h = true;
                Throwable th2 = this.f67607g;
                if (th2 != null) {
                    if (th2 instanceof IOException) {
                        throw ((IOException) th2);
                    }
                    if (th2 instanceof RuntimeException) {
                        throw ((RuntimeException) th2);
                    }
                    throw ((Error) th2);
                }
                jVarA = this.f67606f;
                if (jVarA == null) {
                    try {
                        jVarA = a();
                        this.f67606f = jVarA;
                    } catch (IOException | Error | RuntimeException e10) {
                        w.a(e10);
                        this.f67607g = e10;
                        throw e10;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f67605e) {
            jVarA.cancel();
        }
        return a(jVarA.execute());
    }

    @Override // io.odeeo.internal.y1.b
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f67605e) {
            return true;
        }
        synchronized (this) {
            try {
                xv.j jVar = this.f67606f;
                if (jVar == null || !jVar.isCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // io.odeeo.internal.y1.b
    public synchronized boolean isExecuted() {
        return this.f67608h;
    }

    @Override // io.odeeo.internal.y1.b
    public synchronized o0 request() {
        xv.j jVar = this.f67606f;
        if (jVar != null) {
            return jVar.request();
        }
        Throwable th2 = this.f67607g;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.f67607g);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            xv.j jVarA = a();
            this.f67606f = jVarA;
            return jVarA.request();
        } catch (IOException e10) {
            this.f67607g = e10;
            throw new RuntimeException("Unable to create request.", e10);
        } catch (Error e11) {
            e = e11;
            w.a(e);
            this.f67607g = e;
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            w.a(e);
            this.f67607g = e;
            throw e;
        }
    }

    public r<T> a(v0 v0Var) throws IOException {
        w0 w0VarBody = v0Var.body();
        v0 v0VarBuild = v0Var.newBuilder().body(new c(w0VarBody.contentType(), w0VarBody.contentLength())).build();
        int iCode = v0VarBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return r.error(w.a(w0VarBody), v0VarBuild);
            } finally {
                w0VarBody.close();
            }
        }
        if (iCode != 204 && iCode != 205) {
            b bVar = new b(w0VarBody);
            try {
                return r.success(this.f67604d.convert(bVar), v0VarBuild);
            } catch (RuntimeException e10) {
                bVar.a();
                throw e10;
            }
        }
        w0VarBody.close();
        return r.success((Object) null, v0VarBuild);
    }

    @Override // io.odeeo.internal.y1.b
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public l<T> m4616clone() {
        return new l<>(this.f67601a, this.f67602b, this.f67603c, this.f67604d);
    }
}
