package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g4 extends hu.c implements mt.v {

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98625e;

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f98625e.dispose();
    }

    @Override // mt.v
    public void onComplete() {
        this.f59162b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f59162b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98625e, cVar)) {
            this.f98625e = cVar;
            this.f59162b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        complete(obj);
    }
}
