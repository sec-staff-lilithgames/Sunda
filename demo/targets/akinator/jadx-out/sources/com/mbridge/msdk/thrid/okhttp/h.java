package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f43262g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f43263h = true;

    /* renamed from: a, reason: collision with root package name */
    private final int f43264a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43265b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f43266c;

    /* renamed from: d, reason: collision with root package name */
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> f43267d;

    /* renamed from: e, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.d f43268e;

    /* renamed from: f, reason: collision with root package name */
    boolean f43269f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            while (true) {
                long jA = h.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j10 = jA / 1000000;
                    long j11 = jA - (1000000 * j10);
                    synchronized (h.this) {
                        try {
                            h.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public h() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, a0 a0Var) {
        if (!f43263h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f43267d) {
            if (cVar.a(aVar, a0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    public void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f43263h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f43269f) {
            this.f43269f = true;
            f43262g.execute(this.f43266c);
        }
        this.f43267d.add(cVar);
    }

    public h(int i10, long j10, TimeUnit timeUnit) {
        this.f43266c = new a();
        this.f43267d = new ArrayDeque();
        this.f43268e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.f43264a = i10;
        this.f43265b = timeUnit.toNanos(j10);
        if (j10 <= 0) {
            throw new IllegalArgumentException(o2.m(j10, "keepAliveDuration <= 0: "));
        }
    }

    public Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!f43263h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f43267d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f43263h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!cVar.f43336k && this.f43264a != 0) {
            notifyAll();
            return false;
        }
        this.f43267d.remove(cVar);
        return true;
    }

    public long a(long j10) throws IOException {
        synchronized (this) {
            try {
                com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
                long j11 = Long.MIN_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.f43267d) {
                    if (a(cVar2, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long j12 = j10 - cVar2.f43340o;
                        if (j12 > j11) {
                            cVar = cVar2;
                            j11 = j12;
                        }
                    }
                }
                long j13 = this.f43265b;
                if (j11 < j13 && i10 <= this.f43264a) {
                    if (i10 > 0) {
                        return j13 - j11;
                    }
                    if (i11 > 0) {
                        return j13;
                    }
                    this.f43269f = false;
                    return -1L;
                }
                this.f43267d.remove(cVar);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j10) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.f43339n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f43369a);
                list.remove(i10);
                cVar.f43336k = true;
                if (list.isEmpty()) {
                    cVar.f43340o = j10 - this.f43265b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
