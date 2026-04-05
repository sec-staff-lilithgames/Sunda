package gu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public tw.d f58433e;

    public h(tw.c cVar) {
        super(cVar);
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f58433e.cancel();
    }

    public void onComplete() {
        this.f59162b.onComplete();
    }

    public void onError(Throwable th2) {
        this.f59163c = null;
        this.f59162b.onError(th2);
    }

    public abstract /* synthetic */ void onNext(Object obj);

    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58433e, dVar)) {
            this.f58433e = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
