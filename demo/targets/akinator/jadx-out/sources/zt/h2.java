package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h2 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98629b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98630c;

    public h2(mt.v vVar) {
        this.f98629b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98630c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98630c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98629b.onSuccess(Boolean.TRUE);
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98629b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98630c, cVar)) {
            this.f98630c = cVar;
            this.f98629b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98629b.onSuccess(Boolean.FALSE);
    }
}
