package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o1 extends AtomicReference implements mt.q, mt.f, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96027b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96028c;

    /* renamed from: e, reason: collision with root package name */
    public mt.i f96029e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96030f;

    public o1(tw.c cVar, mt.i iVar) {
        this.f96027b = cVar;
        this.f96029e = iVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f96028c.cancel();
        tt.d.dispose(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96030f) {
            this.f96027b.onComplete();
            return;
        }
        this.f96030f = true;
        this.f96028c = hu.g.f59176b;
        mt.i iVar = this.f96029e;
        this.f96029e = null;
        iVar.subscribe(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96027b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96027b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96028c, dVar)) {
            this.f96028c = dVar;
            this.f96027b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96028c.request(j10);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
