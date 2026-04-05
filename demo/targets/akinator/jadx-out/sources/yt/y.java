package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96579b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96580c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96581e;

    /* renamed from: f, reason: collision with root package name */
    public Collection f96582f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f96583g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96584h;

    /* renamed from: i, reason: collision with root package name */
    public int f96585i;

    public y(tw.c cVar, int i10, Callable callable) {
        this.f96579b = cVar;
        this.f96581e = i10;
        this.f96580c = callable;
    }

    @Override // tw.d
    public void cancel() {
        this.f96583g.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96584h) {
            return;
        }
        this.f96584h = true;
        Collection collection = this.f96582f;
        tw.c cVar = this.f96579b;
        if (collection != null && !collection.isEmpty()) {
            cVar.onNext(collection);
        }
        cVar.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96584h) {
            mu.a.onError(th2);
        } else {
            this.f96584h = true;
            this.f96579b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96584h) {
            return;
        }
        Collection collection = this.f96582f;
        if (collection == null) {
            try {
                collection = (Collection) ut.o0.requireNonNull(this.f96580c.call(), "The bufferSupplier returned a null buffer");
                this.f96582f = collection;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                onError(th2);
                return;
            }
        }
        collection.add(obj);
        int i10 = this.f96585i + 1;
        if (i10 != this.f96581e) {
            this.f96585i = i10;
            return;
        }
        this.f96585i = 0;
        this.f96582f = null;
        this.f96579b.onNext(collection);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96583g, dVar)) {
            this.f96583g = dVar;
            this.f96579b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            this.f96583g.request(iu.e.multiplyCap(j10, this.f96581e));
        }
    }
}
