package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s2 extends wt.l implements mt.q0 {

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52842e;

    @Override // wt.l, wt.b, vt.j, pt.c
    public void dispose() {
        super.dispose();
        this.f52842e.dispose();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        error(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52842e, cVar)) {
            this.f52842e = cVar;
            this.f91259b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        complete(obj);
    }
}
