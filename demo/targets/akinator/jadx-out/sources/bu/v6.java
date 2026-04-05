package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v6 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11120b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11121c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11122e;

    public v6(mt.i0 i0Var, st.o oVar) {
        this.f11120b = i0Var;
        this.f11121c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11122e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11122e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11120b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        mt.i0 i0Var = this.f11120b;
        try {
            Object objApply = this.f11121c.apply(th2);
            if (objApply != null) {
                i0Var.onNext(objApply);
                i0Var.onComplete();
            } else {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th2);
                i0Var.onError(nullPointerException);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            i0Var.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11120b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11122e, cVar)) {
            this.f11122e = cVar;
            this.f11120b.onSubscribe(this);
        }
    }
}
