package wt;

import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l extends b {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f91259b;

    /* renamed from: c, reason: collision with root package name */
    public Object f91260c;

    public l(i0 i0Var) {
        this.f91259b = i0Var;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public final void clear() {
        lazySet(32);
        this.f91260c = null;
    }

    public final void complete(Object obj) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        i0 i0Var = this.f91259b;
        if (i10 == 8) {
            this.f91260c = obj;
            lazySet(16);
            i0Var.onNext(null);
        } else {
            lazySet(2);
            i0Var.onNext(obj);
        }
        if (get() != 4) {
            i0Var.onComplete();
        }
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        set(4);
        this.f91260c = null;
    }

    public final void error(Throwable th2) {
        if ((get() & 54) != 0) {
            mu.a.onError(th2);
        } else {
            lazySet(2);
            this.f91259b.onError(th2);
        }
    }

    @Override // wt.b, vt.j, pt.c
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public final Object poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f91260c;
        this.f91260c = null;
        lazySet(32);
        return obj;
    }

    @Override // wt.b, vt.j, vt.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f91259b.onComplete();
    }
}
