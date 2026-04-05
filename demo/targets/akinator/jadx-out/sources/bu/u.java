package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f11059b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f11060c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11061e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11062f;

    public u(mt.q0 q0Var, st.q qVar) {
        this.f11059b = q0Var;
        this.f11060c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11061e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11061e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11062f) {
            return;
        }
        this.f11062f = true;
        this.f11059b.onSuccess(Boolean.FALSE);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11062f) {
            mu.a.onError(th2);
        } else {
            this.f11062f = true;
            this.f11059b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11062f) {
            return;
        }
        try {
            if (this.f11060c.test(obj)) {
                this.f11062f = true;
                this.f11061e.dispose();
                this.f11059b.onSuccess(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f11061e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11061e, cVar)) {
            this.f11061e = cVar;
            this.f11059b.onSubscribe(this);
        }
    }
}
