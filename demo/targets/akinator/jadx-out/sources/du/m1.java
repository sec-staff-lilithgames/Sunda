package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1 implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52784b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f52785c;

    public m1(mt.q0 q0Var) {
        this.f52784b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f52785c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52785c.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52784b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52785c, cVar)) {
            this.f52785c = cVar;
            this.f52784b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52784b.onSuccess(obj);
    }
}
