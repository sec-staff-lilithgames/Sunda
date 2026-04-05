package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a extends t {

    /* renamed from: h, reason: collision with root package name */
    private static final long f43804h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f43805i;

    /* renamed from: j, reason: collision with root package name */
    static a f43806j;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43807e;

    /* renamed from: f, reason: collision with root package name */
    private a f43808f;

    /* renamed from: g, reason: collision with root package name */
    private long f43809g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    public class C0335a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f43810a;

        public C0335a(r rVar) {
            this.f43810a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f43818b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f43817a;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += oVar.f43852c - oVar.f43851b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f43855f;
                }
                a.this.h();
                try {
                    try {
                        this.f43810a.a(cVar, j11);
                        j10 -= j11;
                        a.this.a(true);
                    } catch (IOException e10) {
                        throw a.this.a(e10);
                    }
                } catch (Throwable th2) {
                    a.this.a(false);
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.f43810a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.f43810a.flush();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f43810a + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.g()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.mbridge.msdk.thrid.okio.a r2 = com.mbridge.msdk.thrid.okio.a.f43806j     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.mbridge.msdk.thrid.okio.a.f43806j = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f43804h = millis;
        f43805i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void a(a aVar, long j10, boolean z10) {
        try {
            if (f43806j == null) {
                f43806j = new a();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                aVar.f43809g = Math.min(j10, aVar.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                aVar.f43809g = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                aVar.f43809g = aVar.c();
            }
            long jB = aVar.b(jNanoTime);
            a aVar2 = f43806j;
            while (true) {
                a aVar3 = aVar2.f43808f;
                if (aVar3 == null || jB < aVar3.b(jNanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f43808f;
                }
            }
            aVar.f43808f = aVar2.f43808f;
            aVar2.f43808f = aVar;
            if (aVar2 == f43806j) {
                a.class.notify();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private long b(long j10) {
        return this.f43809g - j10;
    }

    public static a g() throws InterruptedException {
        a aVar = f43806j.f43808f;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f43804h);
            if (f43806j.f43808f != null || System.nanoTime() - jNanoTime < f43805i) {
                return null;
            }
            return f43806j;
        }
        long jB = aVar.b(System.nanoTime());
        if (jB > 0) {
            long j10 = jB / 1000000;
            a.class.wait(j10, (int) (jB - (1000000 * j10)));
            return null;
        }
        f43806j.f43808f = aVar.f43808f;
        aVar.f43808f = null;
        return aVar;
    }

    public final void h() {
        if (this.f43807e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jF = f();
        boolean zD = d();
        if (jF != 0 || zD) {
            this.f43807e = true;
            a(this, jF, zD);
        }
    }

    public final boolean i() {
        if (!this.f43807e) {
            return false;
        }
        this.f43807e = false;
        return a(this);
    }

    public IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f43812a;

        public b(s sVar) {
            this.f43812a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            a.this.h();
            try {
                try {
                    long jB = this.f43812a.b(cVar, j10);
                    a.this.a(true);
                    return jB;
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f43812a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f43812a + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        a aVar2 = f43806j;
        while (aVar2 != null) {
            a aVar3 = aVar2.f43808f;
            if (aVar3 == aVar) {
                aVar2.f43808f = aVar.f43808f;
                aVar.f43808f = null;
                return false;
            }
            aVar2 = aVar3;
        }
        return true;
    }

    public void j() {
    }

    public final r a(r rVar) {
        return new C0335a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    public final void a(boolean z10) throws IOException {
        if (i() && z10) {
            throw b((IOException) null);
        }
    }

    public final IOException a(IOException iOException) throws IOException {
        return !i() ? iOException : b(iOException);
    }
}
