package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93468b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f93469c;

    public o0(mt.f fVar) {
        this.f93468b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f93469c.dispose();
        this.f93469c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93469c.isDisposed();
    }

    @Override // mt.f
    public void onComplete() {
        this.f93468b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93468b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f93469c, cVar)) {
            this.f93469c = cVar;
            this.f93468b.onSubscribe(this);
        }
    }
}
