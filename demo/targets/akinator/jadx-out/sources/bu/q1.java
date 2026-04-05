package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q1 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f10833b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f10834c;

    /* renamed from: e, reason: collision with root package name */
    public long f10835e;

    public q1(mt.q0 q0Var) {
        this.f10833b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f10834c.dispose();
        this.f10834c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10834c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10834c = tt.d.f87352b;
        this.f10833b.onSuccess(Long.valueOf(this.f10835e));
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10834c = tt.d.f87352b;
        this.f10833b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10835e++;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10834c, cVar)) {
            this.f10834c = cVar;
            this.f10833b.onSubscribe(this);
        }
    }
}
