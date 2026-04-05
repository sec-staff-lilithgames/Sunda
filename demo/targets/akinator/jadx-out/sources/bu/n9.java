package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n9 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10703b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10704c;

    /* renamed from: e, reason: collision with root package name */
    public Object f10705e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10706f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10707g;

    public n9(mt.i0 i0Var, st.c cVar, Object obj) {
        this.f10703b = i0Var;
        this.f10704c = cVar;
        this.f10705e = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f10706f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10706f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10707g) {
            return;
        }
        this.f10707g = true;
        this.f10703b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10707g) {
            mu.a.onError(th2);
        } else {
            this.f10707g = true;
            this.f10703b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10707g) {
            return;
        }
        try {
            Object objRequireNonNull = ut.o0.requireNonNull(this.f10704c.apply(this.f10705e, obj), "The accumulator returned a null value");
            this.f10705e = objRequireNonNull;
            this.f10703b.onNext(objRequireNonNull);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10706f.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10706f, cVar)) {
            this.f10706f = cVar;
            mt.i0 i0Var = this.f10703b;
            i0Var.onSubscribe(this);
            i0Var.onNext(this.f10705e);
        }
    }
}
