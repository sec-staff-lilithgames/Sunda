package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xa implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11220b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f11221c;

    /* renamed from: e, reason: collision with root package name */
    public Object f11222e;

    public xa(mt.i0 i0Var) {
        this.f11220b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f11222e = null;
        this.f11221c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11221c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Object obj = this.f11222e;
        mt.i0 i0Var = this.f11220b;
        if (obj != null) {
            this.f11222e = null;
            i0Var.onNext(obj);
        }
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11222e = null;
        this.f11220b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11222e = obj;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11221c, cVar)) {
            this.f11221c = cVar;
            this.f11220b.onSubscribe(this);
        }
    }
}
