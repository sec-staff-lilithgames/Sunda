package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k2 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10494b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10495c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10496e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10497f;

    public k2(mt.i0 i0Var, st.o oVar) {
        this.f10494b = i0Var;
        this.f10495c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10497f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10497f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10496e) {
            return;
        }
        this.f10496e = true;
        this.f10494b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10496e) {
            mu.a.onError(th2);
        } else {
            this.f10496e = true;
            this.f10494b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10496e) {
            if (obj instanceof mt.a0) {
                mt.a0 a0Var = (mt.a0) obj;
                if (a0Var.isOnError()) {
                    mu.a.onError(a0Var.getError());
                    return;
                }
                return;
            }
            return;
        }
        try {
            mt.a0 a0Var2 = (mt.a0) ut.o0.requireNonNull(this.f10495c.apply(obj), "The selector returned a null Notification");
            if (a0Var2.isOnError()) {
                this.f10497f.dispose();
                onError(a0Var2.getError());
            } else if (!a0Var2.isOnComplete()) {
                this.f10494b.onNext(a0Var2.getValue());
            } else {
                this.f10497f.dispose();
                onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10497f.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10497f, cVar)) {
            this.f10497f = cVar;
            this.f10494b.onSubscribe(this);
        }
    }
}
