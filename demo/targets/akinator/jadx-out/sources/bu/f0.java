package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final g0 f10290c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10291e;

    public f0(g0 g0Var) {
        this.f10290c = g0Var;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        if (this.f10291e) {
            return;
        }
        this.f10291e = true;
        this.f10290c.U();
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10291e) {
            mu.a.onError(th2);
        } else {
            this.f10291e = true;
            this.f10290c.onError(th2);
        }
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        if (this.f10291e) {
            return;
        }
        this.f10291e = true;
        dispose();
        this.f10290c.U();
    }
}
