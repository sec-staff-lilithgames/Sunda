package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98709b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98710c;

    public o(mt.q0 q0Var) {
        this.f98709b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f98710c.dispose();
        this.f98710c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98710c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98710c = tt.d.f87352b;
        this.f98709b.onSuccess(0L);
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98710c = tt.d.f87352b;
        this.f98709b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98710c, cVar)) {
            this.f98710c = cVar;
            this.f98709b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98710c = tt.d.f87352b;
        this.f98709b.onSuccess(1L);
    }
}
