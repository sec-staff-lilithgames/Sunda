package yt;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 extends gu.n implements tw.d, Runnable, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public final Callable f95973k;

    /* renamed from: l, reason: collision with root package name */
    public final long f95974l;

    /* renamed from: m, reason: collision with root package name */
    public final TimeUnit f95975m;

    /* renamed from: n, reason: collision with root package name */
    public final mt.m0 f95976n;

    /* renamed from: o, reason: collision with root package name */
    public tw.d f95977o;

    /* renamed from: p, reason: collision with root package name */
    public Collection f95978p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f95979q;

    public n0(qu.d dVar, Callable callable, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(dVar, new eu.b());
        this.f95979q = new AtomicReference();
        this.f95973k = callable;
        this.f95974l = j10;
        this.f95975m = timeUnit;
        this.f95976n = m0Var;
    }

    @Override // tw.d
    public void cancel() {
        this.f58456h = true;
        this.f95977o.cancel();
        tt.d.dispose(this.f95979q);
    }

    @Override // pt.c
    public void dispose() {
        cancel();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95979q.get() == tt.d.f87352b;
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        tt.d.dispose(this.f95979q);
        synchronized (this) {
            try {
                Collection collection = this.f95978p;
                if (collection == null) {
                    return;
                }
                this.f95978p = null;
                this.f58455g.offer(collection);
                this.f58457i = true;
                if (enter()) {
                    iu.z.drainMaxLoop(this.f58455g, this.f58454f, false, null, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f95979q);
        synchronized (this) {
            this.f95978p = null;
        }
        this.f58454f.onError(th2);
    }

    @Override // gu.n, mt.q, tw.c
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f95978p;
                if (collection != null) {
                    collection.add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95977o, dVar)) {
            this.f95977o = dVar;
            try {
                this.f95978p = (Collection) ut.o0.requireNonNull(this.f95973k.call(), "The supplied buffer is null");
                this.f58454f.onSubscribe(this);
                if (!this.f58456h) {
                    dVar.request(Long.MAX_VALUE);
                    mt.m0 m0Var = this.f95976n;
                    long j10 = this.f95974l;
                    pt.c cVarSchedulePeriodicallyDirect = m0Var.schedulePeriodicallyDirect(this, j10, j10, this.f95975m);
                    AtomicReference atomicReference = this.f95979q;
                    while (!atomicReference.compareAndSet(null, cVarSchedulePeriodicallyDirect)) {
                        if (atomicReference.get() != null) {
                            cVarSchedulePeriodicallyDirect.dispose();
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                hu.d.error(th2, this.f58454f);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f95973k.call(), "The supplied buffer is null");
            synchronized (this) {
                try {
                    Collection collection2 = this.f95978p;
                    if (collection2 == null) {
                        return;
                    }
                    this.f95978p = collection;
                    S(collection2, this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            cancel();
            this.f58454f.onError(th3);
        }
    }

    @Override // gu.n, iu.y
    public boolean accept(tw.c cVar, Collection<Object> collection) {
        this.f58454f.onNext(collection);
        return true;
    }
}
