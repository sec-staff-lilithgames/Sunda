package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class dc extends AtomicReference implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95373b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.a f95374c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95375e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f95376f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95377g;

    /* renamed from: h, reason: collision with root package name */
    public tw.b f95378h;

    public dc(tw.c cVar, m0.a aVar, tw.b bVar, boolean z10) {
        this.f95373b = cVar;
        this.f95374c = aVar;
        this.f95378h = bVar;
        this.f95377g = !z10;
    }

    public final void a(long j10, tw.d dVar) {
        if (this.f95377g || Thread.currentThread() == get()) {
            dVar.request(j10);
        } else {
            this.f95374c.schedule(new cc(j10, dVar));
        }
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f95375e);
        this.f95374c.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95373b.onComplete();
        this.f95374c.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95373b.onError(th2);
        this.f95374c.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95373b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f95375e, dVar)) {
            long andSet = this.f95376f.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, dVar);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            AtomicReference atomicReference = this.f95375e;
            tw.d dVar = (tw.d) atomicReference.get();
            if (dVar != null) {
                a(j10, dVar);
                return;
            }
            AtomicLong atomicLong = this.f95376f;
            iu.e.add(atomicLong, j10);
            tw.d dVar2 = (tw.d) atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, dVar2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        lazySet(Thread.currentThread());
        tw.b bVar = this.f95378h;
        this.f95378h = null;
        bVar.subscribe(this);
    }
}
