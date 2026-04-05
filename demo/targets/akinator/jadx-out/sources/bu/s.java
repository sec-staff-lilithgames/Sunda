package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10937b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10938c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10939e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10940f;

    public s(mt.i0 i0Var, st.q qVar) {
        this.f10937b = i0Var;
        this.f10938c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10939e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10939e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10940f) {
            return;
        }
        this.f10940f = true;
        Boolean bool = Boolean.FALSE;
        mt.i0 i0Var = this.f10937b;
        i0Var.onNext(bool);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10940f) {
            mu.a.onError(th2);
        } else {
            this.f10940f = true;
            this.f10937b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10940f) {
            return;
        }
        try {
            if (this.f10938c.test(obj)) {
                this.f10940f = true;
                this.f10939e.dispose();
                Boolean bool = Boolean.TRUE;
                mt.i0 i0Var = this.f10937b;
                i0Var.onNext(bool);
                i0Var.onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10939e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10939e, cVar)) {
            this.f10939e = cVar;
            this.f10937b.onSubscribe(this);
        }
    }
}
