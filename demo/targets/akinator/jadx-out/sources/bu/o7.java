package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o7 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f10751b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10752c;

    /* renamed from: e, reason: collision with root package name */
    public Object f10753e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10754f;

    public o7(mt.q0 q0Var, st.c cVar, Object obj) {
        this.f10751b = q0Var;
        this.f10753e = obj;
        this.f10752c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10754f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10754f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Object obj = this.f10753e;
        if (obj != null) {
            this.f10753e = null;
            this.f10751b.onSuccess(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10753e == null) {
            mu.a.onError(th2);
        } else {
            this.f10753e = null;
            this.f10751b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        Object obj2 = this.f10753e;
        if (obj2 != null) {
            try {
                this.f10753e = ut.o0.requireNonNull(this.f10752c.apply(obj2, obj), "The reducer returned a null value");
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f10754f.dispose();
                onError(th2);
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10754f, cVar)) {
            this.f10754f = cVar;
            this.f10751b.onSubscribe(this);
        }
    }
}
