package cu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f51001b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f51002c;

    /* renamed from: e, reason: collision with root package name */
    public Object f51003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51004f;

    public i0(j0 j0Var, st.c cVar) {
        this.f51001b = j0Var;
        this.f51002c = cVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        int i10;
        if (this.f51004f) {
            return;
        }
        this.f51004f = true;
        Object objRequireNonNull = this.f51003e;
        j0 j0Var = this.f51001b;
        AtomicReference atomicReference = j0Var.f51009g;
        if (objRequireNonNull != null) {
            while (true) {
                k0 k0Var = (k0) atomicReference.get();
                if (k0Var == null) {
                    k0 k0Var2 = new k0();
                    while (!atomicReference.compareAndSet(null, k0Var2)) {
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                    k0Var = k0Var2;
                }
                while (true) {
                    i10 = k0Var.get();
                    if (i10 >= 2) {
                        i10 = -1;
                        break;
                    } else if (k0Var.compareAndSet(i10, i10 + 1)) {
                        break;
                    }
                }
                if (i10 >= 0) {
                    if (i10 == 0) {
                        k0Var.f51016b = objRequireNonNull;
                    } else {
                        k0Var.f51017c = objRequireNonNull;
                    }
                    if (k0Var.f51018e.incrementAndGet() == 2) {
                        while (!atomicReference.compareAndSet(k0Var, null) && atomicReference.get() == k0Var) {
                        }
                    } else {
                        k0Var = null;
                    }
                    if (k0Var == null) {
                        break;
                    }
                    try {
                        objRequireNonNull = ut.o0.requireNonNull(j0Var.f51008f.apply(k0Var.f51016b, k0Var.f51017c), "The reducer returned a null value");
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        j0Var.innerError(th2);
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(k0Var, null) && atomicReference.get() == k0Var) {
                    }
                }
            }
        }
        if (j0Var.f51010h.decrementAndGet() == 0) {
            k0 k0Var3 = (k0) atomicReference.get();
            atomicReference.lazySet(null);
            if (k0Var3 != null) {
                j0Var.complete(k0Var3.f51016b);
            } else {
                j0Var.f59162b.onComplete();
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f51004f) {
            mu.a.onError(th2);
        } else {
            this.f51004f = true;
            this.f51001b.innerError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f51004f) {
            return;
        }
        Object obj2 = this.f51003e;
        if (obj2 == null) {
            this.f51003e = obj;
            return;
        }
        try {
            this.f51003e = ut.o0.requireNonNull(this.f51002c.apply(obj2, obj), "The reducer returned a null value");
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            ((tw.d) get()).cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
