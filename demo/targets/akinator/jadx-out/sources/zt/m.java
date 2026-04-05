package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98688b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f98689c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98690e;

    public m(mt.q0 q0Var, Object obj) {
        this.f98688b = q0Var;
        this.f98689c = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f98690e.dispose();
        this.f98690e = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98690e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98690e = tt.d.f87352b;
        this.f98688b.onSuccess(Boolean.FALSE);
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98690e = tt.d.f87352b;
        this.f98688b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98690e, cVar)) {
            this.f98690e = cVar;
            this.f98688b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98690e = tt.d.f87352b;
        this.f98688b.onSuccess(Boolean.valueOf(ut.o0.equals(obj, this.f98689c)));
    }
}
