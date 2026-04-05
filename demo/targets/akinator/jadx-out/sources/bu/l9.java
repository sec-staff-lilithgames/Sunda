package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l9 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10602b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10603c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10604e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10605f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10606g;

    public l9(mt.i0 i0Var, st.c cVar) {
        this.f10602b = i0Var;
        this.f10603c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10604e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10604e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10606g) {
            return;
        }
        this.f10606g = true;
        this.f10602b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10606g) {
            mu.a.onError(th2);
        } else {
            this.f10606g = true;
            this.f10602b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10606g) {
            return;
        }
        Object obj2 = this.f10605f;
        mt.i0 i0Var = this.f10602b;
        if (obj2 == null) {
            this.f10605f = obj;
            i0Var.onNext(obj);
            return;
        }
        try {
            Object objRequireNonNull = ut.o0.requireNonNull(this.f10603c.apply(obj2, obj), "The value returned by the accumulator is null");
            this.f10605f = objRequireNonNull;
            i0Var.onNext(objRequireNonNull);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10604e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10604e, cVar)) {
            this.f10604e = cVar;
            this.f10602b.onSubscribe(this);
        }
    }
}
