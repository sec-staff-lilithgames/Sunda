package yt;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class td extends hu.c implements mt.q, tw.d {

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96375e;

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f96375e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        complete(this.f59163c);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f59163c = null;
        this.f59162b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        Collection collection = (Collection) this.f59163c;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96375e, dVar)) {
            this.f96375e = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
