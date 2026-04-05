package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ge extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final he f95555c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95556e;

    public ge(he heVar) {
        this.f95555c = heVar;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95556e) {
            return;
        }
        this.f95556e = true;
        he heVar = this.f95555c;
        hu.g.cancel(heVar.f95619f);
        heVar.f95625l = true;
        heVar.a();
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95556e) {
            mu.a.onError(th2);
            return;
        }
        this.f95556e = true;
        he heVar = this.f95555c;
        hu.g.cancel(heVar.f95619f);
        if (!heVar.f95622i.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            heVar.f95625l = true;
            heVar.a();
        }
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95556e) {
            return;
        }
        he heVar = this.f95555c;
        heVar.f95621h.offer(he.f95615o);
        heVar.a();
    }
}
