package yt;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f95244b;

    public c0(d0 d0Var) {
        this.f95244b = d0Var;
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
        lazySet(hu.g.f59176b);
        d0 d0Var = this.f95244b;
        d0Var.f95314g.delete(this);
        if (d0Var.f95314g.size() == 0) {
            hu.g.cancel(d0Var.f95316i);
            d0Var.f95318k = true;
            d0Var.b();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        lazySet(hu.g.f59176b);
        d0 d0Var = this.f95244b;
        hu.g.cancel(d0Var.f95316i);
        d0Var.f95314g.delete(this);
        d0Var.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        d0 d0Var = this.f95244b;
        d0Var.getClass();
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(d0Var.f95311c.call(), "The bufferSupplier returned a null Collection");
            tw.b bVar = (tw.b) ut.o0.requireNonNull(d0Var.f95313f.apply(obj), "The bufferClose returned a null Publisher");
            long j10 = d0Var.f95321n;
            d0Var.f95321n = 1 + j10;
            synchronized (d0Var) {
                try {
                    LinkedHashMap linkedHashMap = d0Var.f95322o;
                    if (linkedHashMap == null) {
                        return;
                    }
                    linkedHashMap.put(Long.valueOf(j10), collection);
                    e0 e0Var = new e0(d0Var, j10);
                    d0Var.f95314g.add(e0Var);
                    bVar.subscribe(e0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            hu.g.cancel(d0Var.f95316i);
            d0Var.onError(th3);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
