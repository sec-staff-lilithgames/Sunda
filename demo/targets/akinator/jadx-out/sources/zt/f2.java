package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f2 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f98598b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98599c;

    public f2(mt.f fVar) {
        this.f98598b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98599c.dispose();
        this.f98599c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98599c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98599c = tt.d.f87352b;
        this.f98598b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98599c = tt.d.f87352b;
        this.f98598b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98599c, cVar)) {
            this.f98599c = cVar;
            this.f98598b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98599c = tt.d.f87352b;
        this.f98598b.onComplete();
    }
}
