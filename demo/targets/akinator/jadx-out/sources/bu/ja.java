package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ja implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10470b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10471c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10472e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10473f;

    public ja(mt.i0 i0Var, st.q qVar) {
        this.f10470b = i0Var;
        this.f10471c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10472e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10472e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10470b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10470b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        boolean z10 = this.f10473f;
        mt.i0 i0Var = this.f10470b;
        if (z10) {
            i0Var.onNext(obj);
            return;
        }
        try {
            if (this.f10471c.test(obj)) {
                return;
            }
            this.f10473f = true;
            i0Var.onNext(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10472e.dispose();
            i0Var.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10472e, cVar)) {
            this.f10472e = cVar;
            this.f10470b.onSubscribe(this);
        }
    }
}
