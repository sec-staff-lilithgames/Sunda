package ku;

import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f72029b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f72030c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f72031e;

    public l(i0 i0Var) {
        this.f72029b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f72030c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f72030c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f72031e) {
            return;
        }
        this.f72031e = true;
        pt.c cVar = this.f72030c;
        i0 i0Var = this.f72029b;
        if (cVar != null) {
            try {
                i0Var.onComplete();
                return;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            i0Var.onSubscribe(tt.e.f87354b);
            try {
                i0Var.onError(nullPointerException);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(nullPointerException, th3));
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(new qt.c(nullPointerException, th4));
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f72031e) {
            mu.a.onError(th2);
            return;
        }
        this.f72031e = true;
        pt.c cVar = this.f72030c;
        i0 i0Var = this.f72029b;
        if (cVar != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                i0Var.onError(th2);
                return;
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            i0Var.onSubscribe(tt.e.f87354b);
            try {
                i0Var.onError(new qt.c(th2, nullPointerException));
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                mu.a.onError(new qt.c(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            qt.d.throwIfFatal(th5);
            mu.a.onError(new qt.c(th2, nullPointerException, th5));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f72031e) {
            return;
        }
        pt.c cVar = this.f72030c;
        i0 i0Var = this.f72029b;
        if (cVar == null) {
            this.f72031e = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                i0Var.onSubscribe(tt.e.f87354b);
                try {
                    i0Var.onError(nullPointerException);
                    return;
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    mu.a.onError(new qt.c(nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(nullPointerException, th3));
                return;
            }
        }
        if (obj == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f72030c.dispose();
                onError(nullPointerException2);
                return;
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                onError(new qt.c(nullPointerException2, th4));
                return;
            }
        }
        try {
            i0Var.onNext(obj);
        } catch (Throwable th5) {
            qt.d.throwIfFatal(th5);
            try {
                this.f72030c.dispose();
                onError(th5);
            } catch (Throwable th6) {
                qt.d.throwIfFatal(th6);
                onError(new qt.c(th5, th6));
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f72030c, cVar)) {
            this.f72030c = cVar;
            try {
                this.f72029b.onSubscribe(this);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f72031e = true;
                try {
                    cVar.dispose();
                    mu.a.onError(th2);
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    mu.a.onError(new qt.c(th2, th3));
                }
            }
        }
    }
}
