package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10554b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10555c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10556e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10557f;

    public l(mt.i0 i0Var, st.q qVar) {
        this.f10554b = i0Var;
        this.f10555c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10556e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10556e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10557f) {
            return;
        }
        this.f10557f = true;
        Boolean bool = Boolean.TRUE;
        mt.i0 i0Var = this.f10554b;
        i0Var.onNext(bool);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10557f) {
            mu.a.onError(th2);
        } else {
            this.f10557f = true;
            this.f10554b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10557f) {
            return;
        }
        try {
            if (this.f10555c.test(obj)) {
                return;
            }
            this.f10557f = true;
            this.f10556e.dispose();
            Boolean bool = Boolean.FALSE;
            mt.i0 i0Var = this.f10554b;
            i0Var.onNext(bool);
            i0Var.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10556e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10556e, cVar)) {
            this.f10556e = cVar;
            this.f10554b.onSubscribe(this);
        }
    }
}
