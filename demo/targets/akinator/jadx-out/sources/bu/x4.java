package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x4 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f11206b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f11207c;

    public x4(mt.f fVar) {
        this.f11206b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11207c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11207c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11206b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11206b.onError(th2);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11207c = cVar;
        this.f11206b.onSubscribe(this);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
    }
}
