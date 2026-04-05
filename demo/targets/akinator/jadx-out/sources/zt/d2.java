package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d2 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98570b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98571c;

    public d2(mt.v vVar) {
        this.f98570b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98571c.dispose();
        this.f98571c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98571c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98571c = tt.d.f87352b;
        this.f98570b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98571c = tt.d.f87352b;
        this.f98570b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98571c, cVar)) {
            this.f98571c = cVar;
            this.f98570b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98571c = tt.d.f87352b;
        this.f98570b.onComplete();
    }
}
