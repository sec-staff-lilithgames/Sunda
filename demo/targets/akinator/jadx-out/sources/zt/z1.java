package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z1 implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98846b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98847c;

    public z1(mt.v vVar) {
        this.f98846b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98847c.dispose();
        this.f98847c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98847c.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f98847c = tt.d.f87352b;
        this.f98846b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98847c, cVar)) {
            this.f98847c = cVar;
            this.f98846b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f98847c = tt.d.f87352b;
        this.f98846b.onSuccess(obj);
    }
}
