package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t4 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11018b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f11019c;

    public t4(mt.i0 i0Var) {
        this.f11018b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f11019c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11019c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11018b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11018b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11018b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11019c, cVar)) {
            this.f11019c = cVar;
            this.f11018b.onSubscribe(this);
        }
    }
}
