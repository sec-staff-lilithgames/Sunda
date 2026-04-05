package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public mt.q0 f52872b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f52873c;

    @Override // pt.c
    public void dispose() {
        this.f52872b = null;
        this.f52873c.dispose();
        this.f52873c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52873c.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52873c = tt.d.f87352b;
        mt.q0 q0Var = this.f52872b;
        if (q0Var != null) {
            this.f52872b = null;
            q0Var.onError(th2);
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52873c, cVar)) {
            this.f52873c = cVar;
            this.f52872b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52873c = tt.d.f87352b;
        mt.q0 q0Var = this.f52872b;
        if (q0Var != null) {
            this.f52872b = null;
            q0Var.onSuccess(obj);
        }
    }
}
