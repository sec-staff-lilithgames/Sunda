package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements mt.q0, mt.v, mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f8212b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f8213c;

    public w(mt.q0 q0Var) {
        this.f8212b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f8213c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8213c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f8212b.onSuccess(mt.a0.createOnComplete());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f8212b.onSuccess(mt.a0.createOnError(th2));
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8213c, cVar)) {
            this.f8213c = cVar;
            this.f8212b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f8212b.onSuccess(mt.a0.createOnNext(obj));
    }
}
