package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class fc implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95487b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95488c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95490f = true;

    /* renamed from: e, reason: collision with root package name */
    public final hu.f f95489e = new hu.f(false);

    public fc(tw.b bVar, tw.c cVar) {
        this.f95487b = cVar;
        this.f95488c = bVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (!this.f95490f) {
            this.f95487b.onComplete();
        } else {
            this.f95490f = false;
            this.f95488c.subscribe(this);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95487b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95490f) {
            this.f95490f = false;
        }
        this.f95487b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        this.f95489e.setSubscription(dVar);
    }
}
