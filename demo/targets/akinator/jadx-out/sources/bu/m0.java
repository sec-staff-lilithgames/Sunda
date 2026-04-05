package bu;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 extends wt.u implements Runnable, pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final Callable f10627j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10628k;

    /* renamed from: l, reason: collision with root package name */
    public final TimeUnit f10629l;

    /* renamed from: m, reason: collision with root package name */
    public final mt.m0 f10630m;

    /* renamed from: n, reason: collision with root package name */
    public pt.c f10631n;

    /* renamed from: o, reason: collision with root package name */
    public Collection f10632o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f10633p;

    public m0(ku.m mVar, Callable callable, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(mVar, new eu.b());
        this.f10633p = new AtomicReference();
        this.f10627j = callable;
        this.f10628k = j10;
        this.f10629l = timeUnit;
        this.f10630m = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10633p);
        this.f10631n.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10633p.get() == tt.d.f87352b;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        Collection collection;
        synchronized (this) {
            collection = this.f10632o;
            this.f10632o = null;
        }
        if (collection != null) {
            this.f91286f.offer(collection);
            this.f91288h = true;
            if (enter()) {
                iu.z.drainLoop(this.f91286f, this.f91285e, false, null, this);
            }
        }
        tt.d.dispose(this.f10633p);
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        synchronized (this) {
            this.f10632o = null;
        }
        this.f91285e.onError(th2);
        tt.d.dispose(this.f10633p);
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f10632o;
                if (collection == null) {
                    return;
                }
                collection.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10631n, cVar)) {
            this.f10631n = cVar;
            try {
                this.f10632o = (Collection) ut.o0.requireNonNull(this.f10627j.call(), "The buffer supplied is null");
                this.f91285e.onSubscribe(this);
                if (!this.f91287g) {
                    mt.m0 m0Var = this.f10630m;
                    long j10 = this.f10628k;
                    pt.c cVarSchedulePeriodicallyDirect = m0Var.schedulePeriodicallyDirect(this, j10, j10, this.f10629l);
                    AtomicReference atomicReference = this.f10633p;
                    while (!atomicReference.compareAndSet(null, cVarSchedulePeriodicallyDirect)) {
                        if (atomicReference.get() != null) {
                            cVarSchedulePeriodicallyDirect.dispose();
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                dispose();
                tt.e.error(th2, this.f91285e);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Collection collection;
        try {
            Collection collection2 = (Collection) ut.o0.requireNonNull(this.f10627j.call(), "The bufferSupplier returned a null buffer");
            synchronized (this) {
                try {
                    collection = this.f10632o;
                    if (collection != null) {
                        this.f10632o = collection2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (collection == null) {
                tt.d.dispose(this.f10633p);
            } else {
                S(collection, this);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            this.f91285e.onError(th3);
            dispose();
        }
    }

    @Override // wt.u, iu.v
    public void accept(mt.i0 i0Var, Collection<Object> collection) {
        this.f91285e.onNext(collection);
    }
}
