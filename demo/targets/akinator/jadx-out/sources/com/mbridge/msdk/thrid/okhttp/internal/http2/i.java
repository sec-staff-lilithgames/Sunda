package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.mbridge.msdk.thrid.okhttp.internal.http2.c;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f43563l = true;

    /* renamed from: a, reason: collision with root package name */
    long f43564a = 0;

    /* renamed from: b, reason: collision with root package name */
    long f43565b;

    /* renamed from: c, reason: collision with root package name */
    final int f43566c;

    /* renamed from: d, reason: collision with root package name */
    final g f43567d;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<p> f43568e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43569f;

    /* renamed from: g, reason: collision with root package name */
    private final b f43570g;

    /* renamed from: h, reason: collision with root package name */
    final a f43571h;

    /* renamed from: i, reason: collision with root package name */
    final c f43572i;

    /* renamed from: j, reason: collision with root package name */
    final c f43573j;

    /* renamed from: k, reason: collision with root package name */
    com.mbridge.msdk.thrid.okhttp.internal.http2.b f43574k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.thrid.okio.a {
        public c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f43567d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    public i(int i10, g gVar, boolean z10, boolean z11, p pVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f43568e = arrayDeque;
        this.f43572i = new c();
        this.f43573j = new c();
        this.f43574k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f43566c = i10;
        this.f43567d = gVar;
        this.f43565b = gVar.f43503u.c();
        b bVar = new b(gVar.f43502t.c());
        this.f43570g = bVar;
        a aVar = new a();
        this.f43571h = aVar;
        bVar.f43585e = z11;
        aVar.f43578c = z10;
        if (pVar != null) {
            arrayDeque.add(pVar);
        }
        if (f() && pVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && pVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public static /* synthetic */ c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.f43566c;
    }

    public r d() {
        synchronized (this) {
            try {
                if (!this.f43569f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f43571h;
    }

    public s e() {
        return this.f43570g;
    }

    public boolean f() {
        return this.f43567d.f43483a == ((this.f43566c & 1) == 1);
    }

    public synchronized boolean g() {
        try {
            if (this.f43574k != null) {
                return false;
            }
            b bVar = this.f43570g;
            if (bVar.f43585e || bVar.f43584d) {
                a aVar = this.f43571h;
                if (aVar.f43578c || aVar.f43577b) {
                    if (this.f43569f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public t h() {
        return this.f43572i;
    }

    public void i() {
        boolean zG;
        if (!f43563l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f43570g.f43585e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f43567d.c(this.f43566c);
    }

    public synchronized p j() throws IOException {
        this.f43572i.h();
        while (this.f43568e.isEmpty() && this.f43574k == null) {
            try {
                k();
            } catch (Throwable th2) {
                this.f43572i.k();
                throw th2;
            }
        }
        this.f43572i.k();
        if (this.f43568e.isEmpty()) {
            throw new n(this.f43574k);
        }
        return this.f43568e.removeFirst();
    }

    public void k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f43573j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!f43563l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f43574k != null) {
                    return false;
                }
                if (this.f43570g.f43585e && this.f43571h.f43578c) {
                    return false;
                }
                this.f43574k = bVar;
                notifyAll();
                this.f43567d.c(this.f43566c);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.f43567d.b(this.f43566c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f43567d.c(this.f43566c, bVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements r {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f43575e = true;

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f43576a = new com.mbridge.msdk.thrid.okio.c();

        /* renamed from: b, reason: collision with root package name */
        boolean f43577b;

        /* renamed from: c, reason: collision with root package name */
        boolean f43578c;

        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f43575e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f43576a.a(cVar, j10);
            while (this.f43576a.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f43573j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f43575e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                try {
                    if (this.f43577b) {
                        return;
                    }
                    if (!i.this.f43571h.f43578c) {
                        if (this.f43576a.size() > 0) {
                            while (this.f43576a.size() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f43567d.a(iVar.f43566c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f43577b = true;
                    }
                    i.this.f43567d.flush();
                    i.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f43575e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f43576a.size() > 0) {
                a(false);
                i.this.f43567d.flush();
            }
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f43573j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f43565b > 0 || this.f43578c || this.f43577b || iVar.f43574k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } finally {
                        i.this.f43573j.k();
                    }
                }
                iVar.f43573j.k();
                i.this.b();
                jMin = Math.min(i.this.f43565b, this.f43576a.size());
                iVar2 = i.this;
                iVar2.f43565b -= jMin;
            }
            iVar2.f43573j.h();
            try {
                i iVar3 = i.this;
                iVar3.f43567d.a(iVar3.f43566c, z10 && jMin == this.f43576a.size(), this.f43576a, jMin);
                i.this.f43573j.k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!f43563l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f43569f = true;
            this.f43568e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f43567d.c(this.f43566c);
    }

    public synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f43574k == null) {
            this.f43574k = bVar;
            notifyAll();
        }
    }

    public void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws IOException {
        if (!f43563l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f43570g.a(eVar, i10);
    }

    public void b() throws IOException {
        a aVar = this.f43571h;
        if (!aVar.f43577b) {
            if (!aVar.f43578c) {
                if (this.f43574k != null) {
                    throw new n(this.f43574k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.f43563l
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            monitor-enter(r2)
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$b r0 = r2.f43570g     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.f43585e     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2b
            boolean r0 = r0.f43584d     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$a r0 = r2.f43571h     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0.f43578c     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            boolean r0 = r0.f43577b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            goto L29
        L27:
            r0 = move-exception
            goto L43
        L29:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L39
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL
            r2.a(r0)
            return
        L39:
            if (r1 != 0) goto L42
            com.mbridge.msdk.thrid.okhttp.internal.http2.g r0 = r2.f43567d
            int r1 = r2.f43566c
            r0.c(r1)
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.a():void");
    }

    public void a(long j10) {
        this.f43565b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements s {

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ boolean f43580g = true;

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f43581a = new com.mbridge.msdk.thrid.okio.c();

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f43582b = new com.mbridge.msdk.thrid.okio.c();

        /* renamed from: c, reason: collision with root package name */
        private final long f43583c;

        /* renamed from: d, reason: collision with root package name */
        boolean f43584d;

        /* renamed from: e, reason: collision with root package name */
        boolean f43585e;

        public b(long j10) {
            this.f43583c = j10;
        }

        private void f(long j10) {
            if (!f43580g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f43567d.g(j10);
        }

        public void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            long size;
            if (!f43580g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f43585e;
                    z11 = this.f43582b.size() + j10 > this.f43583c;
                }
                if (z11) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f43581a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    try {
                        if (this.f43584d) {
                            size = this.f43581a.size();
                            this.f43581a.k();
                        } else {
                            boolean z12 = this.f43582b.size() == 0;
                            this.f43582b.a(this.f43581a);
                            if (z12) {
                                i.this.notifyAll();
                            }
                            size = 0;
                        }
                    } finally {
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
        @Override // com.mbridge.msdk.thrid.okio.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long b(com.mbridge.msdk.thrid.okio.c r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb3
            L6:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r2 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this
                monitor-enter(r2)
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r3 = r3.f43572i     // Catch: java.lang.Throwable -> L85
                r3.h()     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.b r4 = r3.f43574k     // Catch: java.lang.Throwable -> L2c
                if (r4 == 0) goto L17
                goto L18
            L17:
                r4 = 0
            L18:
                boolean r5 = r11.f43584d     // Catch: java.lang.Throwable -> L2c
                if (r5 != 0) goto La1
                java.util.Deque r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.a(r3)     // Catch: java.lang.Throwable -> L2c
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2c
                if (r3 != 0) goto L2f
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i.b(r3)     // Catch: java.lang.Throwable -> L2c
                goto L2f
            L2c:
                r12 = move-exception
                goto La9
            L2f:
                com.mbridge.msdk.thrid.okio.c r3 = r11.f43582b     // Catch: java.lang.Throwable -> L2c
                long r5 = r3.size()     // Catch: java.lang.Throwable -> L2c
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                r5 = -1
                if (r3 <= 0) goto L71
                com.mbridge.msdk.thrid.okio.c r3 = r11.f43582b     // Catch: java.lang.Throwable -> L2c
                long r7 = r3.size()     // Catch: java.lang.Throwable -> L2c
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> L2c
                long r12 = r3.b(r12, r13)     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                long r7 = r14.f43564a     // Catch: java.lang.Throwable -> L2c
                long r7 = r7 + r12
                r14.f43564a = r7     // Catch: java.lang.Throwable -> L2c
                if (r4 != 0) goto L88
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r14 = r14.f43567d     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.m r14 = r14.f43502t     // Catch: java.lang.Throwable -> L2c
                int r14 = r14.c()     // Catch: java.lang.Throwable -> L2c
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> L2c
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L88
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r3 = r14.f43567d     // Catch: java.lang.Throwable -> L2c
                int r7 = r14.f43566c     // Catch: java.lang.Throwable -> L2c
                long r8 = r14.f43564a     // Catch: java.lang.Throwable -> L2c
                r3.a(r7, r8)     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                r14.f43564a = r0     // Catch: java.lang.Throwable -> L2c
                goto L88
            L71:
                boolean r3 = r11.f43585e     // Catch: java.lang.Throwable -> L2c
                if (r3 != 0) goto L87
                if (r4 != 0) goto L87
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L2c
                r3.k()     // Catch: java.lang.Throwable -> L2c
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r3 = r3.f43572i     // Catch: java.lang.Throwable -> L85
                r3.k()     // Catch: java.lang.Throwable -> L85
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
                goto L6
            L85:
                r12 = move-exception
                goto Lb1
            L87:
                r12 = r5
            L88:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r14 = r14.f43572i     // Catch: java.lang.Throwable -> L85
                r14.k()     // Catch: java.lang.Throwable -> L85
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L98
                r11.f(r12)
                return r12
            L98:
                if (r4 != 0) goto L9b
                return r5
            L9b:
                com.mbridge.msdk.thrid.okhttp.internal.http2.n r12 = new com.mbridge.msdk.thrid.okhttp.internal.http2.n
                r12.<init>(r4)
                throw r12
            La1:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L2c
                throw r12     // Catch: java.lang.Throwable -> L2c
            La9:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r13 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> L85
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r13 = r13.f43572i     // Catch: java.lang.Throwable -> L85
                r13.k()     // Catch: java.lang.Throwable -> L85
                throw r12     // Catch: java.lang.Throwable -> L85
            Lb1:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L85
                throw r12
            Lb3:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r13 = p0.o2.m(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.b.b(com.mbridge.msdk.thrid.okio.c, long):long");
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                try {
                    this.f43584d = true;
                    size = this.f43582b.size();
                    this.f43582b.k();
                    if (!i.this.f43568e.isEmpty()) {
                        i.b(i.this);
                    }
                    i.this.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f43572i;
        }
    }
}
