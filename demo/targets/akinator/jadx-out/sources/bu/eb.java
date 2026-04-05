package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class eb implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10275b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10276c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10277e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10278f;

    public eb(mt.i0 i0Var, st.q qVar) {
        this.f10275b = i0Var;
        this.f10276c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10277e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10277e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10278f) {
            return;
        }
        this.f10278f = true;
        this.f10275b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10278f) {
            mu.a.onError(th2);
        } else {
            this.f10278f = true;
            this.f10275b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10278f) {
            return;
        }
        mt.i0 i0Var = this.f10275b;
        i0Var.onNext(obj);
        try {
            if (this.f10276c.test(obj)) {
                this.f10278f = true;
                this.f10277e.dispose();
                i0Var.onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10277e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10277e, cVar)) {
            this.f10277e = cVar;
            this.f10275b.onSubscribe(this);
        }
    }
}
