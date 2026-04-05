package pu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mt.b0;
import mt.i0;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends f {

    /* renamed from: b, reason: collision with root package name */
    public final eu.d f81851b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f81852c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f81853e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f81854f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f81855g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f81856h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f81857i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f81858j;

    /* renamed from: k, reason: collision with root package name */
    public final g f81859k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f81860l;

    public h(int i10, boolean z10) {
        this.f81851b = new eu.d(o0.verifyPositive(i10, "capacityHint"));
        this.f81853e = new AtomicReference();
        this.f81854f = z10;
        this.f81852c = new AtomicReference();
        this.f81858j = new AtomicBoolean();
        this.f81859k = new g(this);
    }

    public static <T> h create() {
        return new h(b0.bufferSize(), true);
    }

    public final void d() {
        AtomicReference atomicReference = this.f81853e;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void e() {
        Throwable th2;
        if (this.f81859k.getAndIncrement() != 0) {
            return;
        }
        i0 i0Var = (i0) this.f81852c.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (i0Var == null) {
            iAddAndGet2 = this.f81859k.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                i0Var = (i0) this.f81852c.get();
            }
        }
        if (this.f81860l) {
            eu.d dVar = this.f81851b;
            boolean z10 = this.f81854f;
            while (!this.f81855g) {
                boolean z11 = this.f81856h;
                if (!z10 && z11 && (th2 = this.f81857i) != null) {
                    this.f81852c.lazySet(null);
                    dVar.clear();
                    i0Var.onError(th2);
                    return;
                }
                i0Var.onNext(null);
                if (z11) {
                    this.f81852c.lazySet(null);
                    Throwable th3 = this.f81857i;
                    if (th3 != null) {
                        i0Var.onError(th3);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f81859k.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f81852c.lazySet(null);
            return;
        }
        eu.d dVar2 = this.f81851b;
        boolean z12 = this.f81854f;
        boolean z13 = true;
        int iAddAndGet3 = 1;
        while (!this.f81855g) {
            boolean z14 = this.f81856h;
            Object objPoll = this.f81851b.poll();
            boolean z15 = objPoll == null;
            if (z14) {
                if (!z12 && z13) {
                    Throwable th4 = this.f81857i;
                    if (th4 != null) {
                        this.f81852c.lazySet(null);
                        dVar2.clear();
                        i0Var.onError(th4);
                        return;
                    }
                    z13 = false;
                }
                if (z15) {
                    this.f81852c.lazySet(null);
                    Throwable th5 = this.f81857i;
                    if (th5 != null) {
                        i0Var.onError(th5);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
            }
            if (z15) {
                iAddAndGet3 = this.f81859k.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                i0Var.onNext(objPoll);
            }
        }
        this.f81852c.lazySet(null);
        dVar2.clear();
    }

    @Override // pu.f
    public Throwable getThrowable() {
        if (this.f81856h) {
            return this.f81857i;
        }
        return null;
    }

    @Override // pu.f
    public boolean hasComplete() {
        return this.f81856h && this.f81857i == null;
    }

    @Override // pu.f
    public boolean hasObservers() {
        return this.f81852c.get() != null;
    }

    @Override // pu.f
    public boolean hasThrowable() {
        return this.f81856h && this.f81857i != null;
    }

    @Override // pu.f, mt.i0, mt.f
    public void onComplete() {
        if (this.f81856h || this.f81855g) {
            return;
        }
        this.f81856h = true;
        d();
        e();
    }

    @Override // pu.f, mt.i0, mt.f
    public void onError(Throwable th2) {
        o0.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f81856h || this.f81855g) {
            mu.a.onError(th2);
            return;
        }
        this.f81857i = th2;
        this.f81856h = true;
        d();
        e();
    }

    @Override // pu.f, mt.i0
    public void onNext(Object obj) {
        o0.requireNonNull(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f81856h || this.f81855g) {
            return;
        }
        this.f81851b.offer(obj);
        e();
    }

    @Override // pu.f, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (this.f81856h || this.f81855g) {
            cVar.dispose();
        }
    }

    @Override // mt.b0
    public final void subscribeActual(i0 i0Var) {
        if (this.f81858j.get() || !this.f81858j.compareAndSet(false, true)) {
            tt.e.error(new IllegalStateException("Only a single observer allowed."), i0Var);
            return;
        }
        i0Var.onSubscribe(this.f81859k);
        this.f81852c.lazySet(i0Var);
        if (this.f81855g) {
            this.f81852c.lazySet(null);
        } else {
            e();
        }
    }

    public static <T> h create(int i10) {
        return new h(i10, true);
    }

    public static <T> h create(int i10, Runnable runnable) {
        return new h(i10, runnable, true);
    }

    public static <T> h create(int i10, Runnable runnable, boolean z10) {
        return new h(i10, runnable, z10);
    }

    public static <T> h create(boolean z10) {
        return new h(b0.bufferSize(), z10);
    }

    public h(int i10, Runnable runnable, boolean z10) {
        this.f81851b = new eu.d(o0.verifyPositive(i10, "capacityHint"));
        this.f81853e = new AtomicReference(o0.requireNonNull(runnable, "onTerminate"));
        this.f81854f = z10;
        this.f81852c = new AtomicReference();
        this.f81858j = new AtomicBoolean();
        this.f81859k = new g(this);
    }
}
