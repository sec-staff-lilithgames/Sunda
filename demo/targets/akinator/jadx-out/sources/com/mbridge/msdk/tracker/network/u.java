package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f44065a;

    /* renamed from: e, reason: collision with root package name */
    private final int f44069e;

    /* renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f44070f;

    /* renamed from: g, reason: collision with root package name */
    private final m f44071g;

    /* renamed from: h, reason: collision with root package name */
    private final w f44072h;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f44066b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f44067c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f44068d = new PriorityBlockingQueue<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<c> f44073i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private boolean f44074j = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f44068d, u.this.f44071g, u.this.f44070f, u.this.f44072h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void a(t<?> tVar, int i10);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f44069e = i10;
        this.f44070f = bVar;
        this.f44071g = mVar;
        this.f44072h = wVar;
    }

    private void a(int i10) {
        if (this.f44065a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f44065a = null;
            }
        }
    }

    public void b() {
        if (!this.f44074j || this.f44065a == null) {
            a(this.f44069e);
            this.f44074j = true;
        }
    }

    public <T> void c(t<T> tVar) {
        synchronized (this.f44067c) {
            this.f44067c.remove(tVar);
        }
        a(tVar, 5);
    }

    public <T> void d(t<T> tVar) {
        this.f44068d.add(tVar);
    }

    private void b(int i10) {
        this.f44065a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f44066b.incrementAndGet();
    }

    public <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f44067c) {
            this.f44067c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f44065a == null) {
            a(this.f44069e);
        }
        if (!this.f44065a.isShutdown()) {
            this.f44065a.execute(new b());
        }
        return tVar;
    }

    public void a(t<?> tVar, int i10) {
        synchronized (this.f44073i) {
            try {
                Iterator<c> it = this.f44073i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
