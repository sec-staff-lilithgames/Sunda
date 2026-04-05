package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gd extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Number f95553b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95554c;

    /* JADX WARN: Multi-variable type inference failed */
    public gd(long j10, id idVar) {
        this.f95554c = j10;
        this.f95553b = (Number) idVar;
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Number, yt.id] */
    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj != gVar) {
            lazySet(gVar);
            this.f95553b.onTimeout(this.f95554c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Number, yt.id] */
    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj == gVar) {
            mu.a.onError(th2);
        } else {
            lazySet(gVar);
            this.f95553b.onTimeoutError(this.f95554c, th2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Number, yt.id] */
    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        tw.d dVar = (tw.d) get();
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            dVar.cancel();
            lazySet(gVar);
            this.f95553b.onTimeout(this.f95554c);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
