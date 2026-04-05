package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f95403b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95404c;

    public e0(d0 d0Var, long j10) {
        this.f95403b = d0Var;
        this.f95404c = j10;
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj != gVar) {
            lazySet(gVar);
            this.f95403b.a(this, this.f95404c);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj == gVar) {
            mu.a.onError(th2);
            return;
        }
        lazySet(gVar);
        d0 d0Var = this.f95403b;
        hu.g.cancel(d0Var.f95316i);
        d0Var.f95314g.delete(this);
        d0Var.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        tw.d dVar = (tw.d) get();
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            lazySet(gVar);
            dVar.cancel();
            this.f95403b.a(this, this.f95404c);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
