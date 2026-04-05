package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i4 extends wt.l implements mt.v {

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98652e;

    @Override // wt.l, wt.b, vt.j, pt.c
    public void dispose() {
        super.dispose();
        this.f98652e.dispose();
    }

    @Override // mt.v
    public void onComplete() {
        complete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        error(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98652e, cVar)) {
            this.f98652e = cVar;
            this.f91259b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        complete(obj);
    }
}
