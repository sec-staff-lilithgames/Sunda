package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w5 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f11169b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f11170c;

    /* renamed from: e, reason: collision with root package name */
    public Object f11171e;

    public w5(mt.v vVar) {
        this.f11169b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11170c.dispose();
        this.f11170c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11170c == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11170c = tt.d.f87352b;
        Object obj = this.f11171e;
        mt.v vVar = this.f11169b;
        if (obj == null) {
            vVar.onComplete();
        } else {
            this.f11171e = null;
            vVar.onSuccess(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11170c = tt.d.f87352b;
        this.f11171e = null;
        this.f11169b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11171e = obj;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11170c, cVar)) {
            this.f11170c = cVar;
            this.f11169b.onSubscribe(this);
        }
    }
}
