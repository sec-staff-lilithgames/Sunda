package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q2 extends hu.c implements mt.q0 {

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52824e;

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f52824e.dispose();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f59162b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52824e, cVar)) {
            this.f52824e = cVar;
            this.f59162b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        complete(obj);
    }
}
