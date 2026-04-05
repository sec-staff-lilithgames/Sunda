package yt;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95122b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95123c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95124e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95125f;

    /* renamed from: g, reason: collision with root package name */
    public Collection f95126g;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f95127h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f95128i;

    /* renamed from: j, reason: collision with root package name */
    public int f95129j;

    public a0(tw.c cVar, int i10, int i11, Callable callable) {
        this.f95122b = cVar;
        this.f95124e = i10;
        this.f95125f = i11;
        this.f95123c = callable;
    }

    @Override // tw.d
    public void cancel() {
        this.f95127h.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95128i) {
            return;
        }
        this.f95128i = true;
        Collection collection = this.f95126g;
        this.f95126g = null;
        tw.c cVar = this.f95122b;
        if (collection != null) {
            cVar.onNext(collection);
        }
        cVar.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95128i) {
            mu.a.onError(th2);
            return;
        }
        this.f95128i = true;
        this.f95126g = null;
        this.f95122b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95128i) {
            return;
        }
        Collection collection = this.f95126g;
        int i10 = this.f95129j;
        int i11 = i10 + 1;
        if (i10 == 0) {
            try {
                collection = (Collection) ut.o0.requireNonNull(this.f95123c.call(), "The bufferSupplier returned a null buffer");
                this.f95126g = collection;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                onError(th2);
                return;
            }
        }
        if (collection != null) {
            collection.add(obj);
            if (collection.size() == this.f95124e) {
                this.f95126g = null;
                this.f95122b.onNext(collection);
            }
        }
        if (i11 == this.f95125f) {
            i11 = 0;
        }
        this.f95129j = i11;
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95127h, dVar)) {
            this.f95127h = dVar;
            this.f95122b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            int i10 = get();
            int i11 = this.f95125f;
            if (i10 != 0 || !compareAndSet(0, 1)) {
                this.f95127h.request(iu.e.multiplyCap(i11, j10));
                return;
            }
            this.f95127h.request(iu.e.addCap(iu.e.multiplyCap(j10, this.f95124e), iu.e.multiplyCap(i11 - r0, j10 - 1)));
        }
    }
}
