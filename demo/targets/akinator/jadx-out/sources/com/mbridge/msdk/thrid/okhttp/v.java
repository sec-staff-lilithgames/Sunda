package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class v implements d {

    /* renamed from: a, reason: collision with root package name */
    final t f43753a;

    /* renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http.j f43754b;

    /* renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.a f43755c;

    /* renamed from: d, reason: collision with root package name */
    private n f43756d;

    /* renamed from: e, reason: collision with root package name */
    final w f43757e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f43758f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43759g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() throws IOException {
            v.this.cancel();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f43761c = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f43762b;

        public void a(ExecutorService executorService) {
            if (!f43761c && Thread.holdsLock(this.f43762b.f43753a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f43762b.f43756d.callFailed(this.f43762b, interruptedIOException);
                    throw null;
                }
            } catch (Throwable th2) {
                this.f43762b.f43753a.j().a(this);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            Throwable th2;
            this.f43762b.f43755c.h();
            try {
                try {
                    this.f43762b.c();
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = true;
                        this.f43762b.cancel();
                        if (z10) {
                            throw th2;
                        }
                        new IOException("canceled due to " + th2);
                        throw null;
                    }
                } catch (IOException e10) {
                    this.f43762b.f43756d.callFailed(this.f43762b, this.f43762b.a(e10));
                    throw null;
                } catch (Throwable th4) {
                    z10 = false;
                    th2 = th4;
                }
            } catch (Throwable th5) {
                this.f43762b.f43753a.j().a(this);
                throw th5;
            }
        }

        public v c() {
            return this.f43762b;
        }

        public String d() {
            return this.f43762b.f43757e.g().g();
        }
    }

    private v(t tVar, w wVar, boolean z10) {
        this.f43753a = tVar;
        this.f43757e = wVar;
        this.f43758f = z10;
        this.f43754b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(tVar, z10);
        a aVar = new a();
        this.f43755c = aVar;
        aVar.a(tVar.b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v clone() {
        return a(this.f43753a, this.f43757e, this.f43758f);
    }

    public y c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f43753a.p());
        arrayList.add(this.f43754b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f43753a.i()));
        this.f43753a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f43753a));
        if (!this.f43758f) {
            arrayList.addAll(this.f43753a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f43758f));
        y yVarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f43757e, this, this.f43756d, this.f43753a.e(), this.f43753a.y(), this.f43753a.C()).a(this.f43757e);
        if (!this.f43754b.b()) {
            return yVarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(yVarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() throws IOException {
        this.f43754b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public y d() throws IOException {
        synchronized (this) {
            if (this.f43759g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f43759g = true;
        }
        a();
        this.f43755c.h();
        this.f43756d.callStart(this);
        try {
            try {
                this.f43753a.j().a(this);
                y yVarC = c();
                if (yVarC != null) {
                    return yVarC;
                }
                throw new IOException("Canceled");
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f43756d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } finally {
            this.f43753a.j().b(this);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f43754b.b();
    }

    public static v a(t tVar, w wVar, boolean z10) {
        v vVar = new v(tVar, wVar, z10);
        vVar.f43756d = tVar.l().a(vVar);
        return vVar;
    }

    public IOException a(IOException iOException) {
        if (!this.f43755c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f43754b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }
}
