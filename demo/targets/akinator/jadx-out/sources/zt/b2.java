package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b2 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98542b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98543c;

    public b2(mt.v vVar) {
        this.f98542b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98543c.dispose();
        this.f98543c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98543c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98542b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98542b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98543c, cVar)) {
            this.f98543c = cVar;
            this.f98542b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98542b.onSuccess(obj);
    }
}
