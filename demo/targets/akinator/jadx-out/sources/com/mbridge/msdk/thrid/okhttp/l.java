package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f43659h = true;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f43662c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f43663d;

    /* renamed from: a, reason: collision with root package name */
    private int f43660a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f43661b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<v.b> f43664e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private final Deque<v.b> f43665f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final Deque<v> f43666g = new ArrayDeque();

    public l(ExecutorService executorService) {
        this.f43663d = executorService;
    }

    public synchronized ExecutorService a() {
        try {
            if (this.f43663d == null) {
                this.f43663d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43663d;
    }

    public void b(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(a.b.e(i10, "max < 1: "));
        }
        synchronized (this) {
            this.f43661b = i10;
        }
        b();
    }

    public synchronized int c() {
        return this.f43665f.size() + this.f43666g.size();
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f43660a = i10;
            }
            b();
            return;
        }
        throw new IllegalArgumentException(a.b.e(i10, "max < 1: "));
    }

    public l() {
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f43659h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<v.b> it = this.f43664e.iterator();
                while (it.hasNext()) {
                    v.b next = it.next();
                    if (this.f43665f.size() >= this.f43660a) {
                        break;
                    }
                    if (b(next) < this.f43661b) {
                        it.remove();
                        arrayList.add(next);
                        this.f43665f.add(next);
                    }
                }
                z10 = c() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((v.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    public synchronized void a(v vVar) {
        this.f43666g.add(vVar);
    }

    public void a(v.b bVar) {
        a(this.f43665f, bVar);
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f43662c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private int b(v.b bVar) {
        int i10 = 0;
        for (v.b bVar2 : this.f43665f) {
            if (!bVar2.c().f43758f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public void b(v vVar) {
        a(this.f43666g, vVar);
    }
}
