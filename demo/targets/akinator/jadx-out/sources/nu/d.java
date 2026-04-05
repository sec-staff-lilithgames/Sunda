package nu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.l;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f77207c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f77208e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f77209f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f77210g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f77211h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f77212i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f77213j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f77214k;

    /* renamed from: l, reason: collision with root package name */
    public final c f77215l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicLong f77216m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f77217n;

    public d(int i10) {
        this(i10, null, true);
    }

    public static <T> d create() {
        return new d(l.bufferSize());
    }

    public final boolean e(boolean z10, boolean z11, boolean z12, tw.c cVar, eu.d dVar) {
        if (this.f77213j) {
            dVar.clear();
            this.f77212i.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z10 && this.f77211h != null) {
            dVar.clear();
            this.f77212i.lazySet(null);
            cVar.onError(this.f77211h);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f77211h;
        this.f77212i.lazySet(null);
        if (th2 != null) {
            cVar.onError(th2);
            return true;
        }
        cVar.onComplete();
        return true;
    }

    public final void f() {
        boolean z10;
        if (this.f77215l.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        tw.c cVar = (tw.c) this.f77212i.get();
        int iAddAndGet2 = 1;
        while (cVar == null) {
            iAddAndGet2 = this.f77215l.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                cVar = (tw.c) this.f77212i.get();
            }
        }
        if (this.f77217n) {
            eu.d dVar = this.f77207c;
            boolean z11 = this.f77209f;
            while (!this.f77213j) {
                boolean z12 = this.f77210g;
                if (!z11 && z12 && this.f77211h != null) {
                    dVar.clear();
                    this.f77212i.lazySet(null);
                    cVar.onError(this.f77211h);
                    return;
                }
                cVar.onNext(null);
                if (z12) {
                    this.f77212i.lazySet(null);
                    Throwable th2 = this.f77211h;
                    if (th2 != null) {
                        cVar.onError(th2);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f77215l.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f77212i.lazySet(null);
            return;
        }
        eu.d dVar2 = this.f77207c;
        boolean z13 = !this.f77209f;
        int iAddAndGet3 = 1;
        while (true) {
            long j10 = this.f77216m.get();
            long j11 = 0;
            while (j10 != j11) {
                boolean z14 = this.f77210g;
                Object objPoll = dVar2.poll();
                boolean z15 = objPoll == null;
                if (e(z13, z14, z15, cVar, dVar2)) {
                    return;
                }
                if (z15) {
                    break;
                }
                cVar.onNext(objPoll);
                j11++;
            }
            if (j10 == j11) {
                z10 = z13;
                if (e(z13, this.f77210g, dVar2.isEmpty(), cVar, dVar2)) {
                    return;
                }
            } else {
                z10 = z13;
            }
            if (j11 != 0 && j10 != Long.MAX_VALUE) {
                this.f77216m.addAndGet(-j11);
            }
            iAddAndGet3 = this.f77215l.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z13 = z10;
            }
        }
    }

    @Override // nu.a
    public Throwable getThrowable() {
        if (this.f77210g) {
            return this.f77211h;
        }
        return null;
    }

    @Override // nu.a
    public boolean hasComplete() {
        return this.f77210g && this.f77211h == null;
    }

    @Override // nu.a
    public boolean hasSubscribers() {
        return this.f77212i.get() != null;
    }

    @Override // nu.a
    public boolean hasThrowable() {
        return this.f77210g && this.f77211h != null;
    }

    @Override // nu.a, tw.a, tw.c, mt.f
    public void onComplete() {
        if (this.f77210g || this.f77213j) {
            return;
        }
        this.f77210g = true;
        Runnable runnable = (Runnable) this.f77208e.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        f();
    }

    @Override // nu.a, tw.a, tw.c, mt.f
    public void onError(Throwable th2) {
        o0.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f77210g || this.f77213j) {
            mu.a.onError(th2);
            return;
        }
        this.f77211h = th2;
        this.f77210g = true;
        Runnable runnable = (Runnable) this.f77208e.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        f();
    }

    @Override // nu.a, tw.a, tw.c
    public void onNext(Object obj) {
        o0.requireNonNull(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f77210g || this.f77213j) {
            return;
        }
        this.f77207c.offer(obj);
        f();
    }

    @Override // nu.a, tw.a, tw.c
    public void onSubscribe(tw.d dVar) {
        if (this.f77210g || this.f77213j) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        if (this.f77214k.get() || !this.f77214k.compareAndSet(false, true)) {
            hu.d.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f77215l);
        this.f77212i.set(cVar);
        if (this.f77213j) {
            this.f77212i.lazySet(null);
        } else {
            f();
        }
    }

    public d(int i10, Runnable runnable, boolean z10) {
        this.f77207c = new eu.d(o0.verifyPositive(i10, "capacityHint"));
        this.f77208e = new AtomicReference(runnable);
        this.f77209f = z10;
        this.f77212i = new AtomicReference();
        this.f77214k = new AtomicBoolean();
        this.f77215l = new c(this);
        this.f77216m = new AtomicLong();
    }

    public static <T> d create(int i10) {
        return new d(i10);
    }

    public static <T> d create(boolean z10) {
        return new d(l.bufferSize(), null, z10);
    }

    public static <T> d create(int i10, Runnable runnable) {
        o0.requireNonNull(runnable, "onTerminate");
        return new d(i10, runnable, true);
    }

    public static <T> d create(int i10, Runnable runnable, boolean z10) {
        o0.requireNonNull(runnable, "onTerminate");
        return new d(i10, runnable, z10);
    }
}
