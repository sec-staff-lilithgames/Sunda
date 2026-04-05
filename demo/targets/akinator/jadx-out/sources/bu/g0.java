package bu;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 extends wt.u implements pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final Callable f10326j;

    /* renamed from: k, reason: collision with root package name */
    public final Callable f10327k;

    /* renamed from: l, reason: collision with root package name */
    public pt.c f10328l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f10329m;

    /* renamed from: n, reason: collision with root package name */
    public Collection f10330n;

    public g0(ku.m mVar, Callable callable, Callable callable2) {
        super(mVar, new eu.b());
        this.f10329m = new AtomicReference();
        this.f10326j = callable;
        this.f10327k = callable2;
    }

    public final void U() {
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f10326j.call(), "The buffer supplied is null");
            try {
                mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10327k.call(), "The boundary ObservableSource supplied is null");
                f0 f0Var = new f0(this);
                if (tt.d.replace(this.f10329m, f0Var)) {
                    synchronized (this) {
                        try {
                            Collection collection2 = this.f10330n;
                            if (collection2 == null) {
                                return;
                            }
                            this.f10330n = collection;
                            g0Var.subscribe(f0Var);
                            S(collection2, this);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f91287g = true;
                this.f10328l.dispose();
                this.f91285e.onError(th3);
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            dispose();
            this.f91285e.onError(th4);
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f91287g) {
            return;
        }
        this.f91287g = true;
        this.f10328l.dispose();
        tt.d.dispose(this.f10329m);
        if (enter()) {
            this.f91286f.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91287g;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        synchronized (this) {
            try {
                Collection collection = this.f10330n;
                if (collection == null) {
                    return;
                }
                this.f10330n = null;
                this.f91286f.offer(collection);
                this.f91288h = true;
                if (enter()) {
                    iu.z.drainLoop(this.f91286f, this.f91285e, false, this, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        dispose();
        this.f91285e.onError(th2);
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f10330n;
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
        if (tt.d.validate(this.f10328l, cVar)) {
            this.f10328l = cVar;
            mt.i0 i0Var = this.f91285e;
            try {
                this.f10330n = (Collection) ut.o0.requireNonNull(this.f10326j.call(), "The buffer supplied is null");
                try {
                    mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10327k.call(), "The boundary ObservableSource supplied is null");
                    f0 f0Var = new f0(this);
                    this.f10329m.set(f0Var);
                    i0Var.onSubscribe(this);
                    if (this.f91287g) {
                        return;
                    }
                    g0Var.subscribe(f0Var);
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f91287g = true;
                    cVar.dispose();
                    tt.e.error(th2, i0Var);
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f91287g = true;
                cVar.dispose();
                tt.e.error(th3, i0Var);
            }
        }
    }

    @Override // wt.u, iu.v
    public void accept(mt.i0 i0Var, Collection<Object> collection) {
        this.f91285e.onNext(collection);
    }
}
