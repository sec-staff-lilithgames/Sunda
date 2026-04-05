package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l9 extends AtomicInteger implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95881b;

    /* renamed from: c, reason: collision with root package name */
    public final hu.f f95882c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95883e;

    /* renamed from: f, reason: collision with root package name */
    public long f95884f;

    /* renamed from: g, reason: collision with root package name */
    public long f95885g;

    public l9(tw.c cVar, long j10, hu.f fVar, tw.b bVar) {
        this.f95881b = cVar;
        this.f95882c = fVar;
        this.f95883e = bVar;
        this.f95884f = j10;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                hu.f fVar = this.f95882c;
                if (fVar.isCancelled()) {
                    return;
                }
                long j10 = this.f95885g;
                if (j10 != 0) {
                    this.f95885g = 0L;
                    fVar.produced(j10);
                }
                this.f95883e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        long j10 = this.f95884f;
        if (j10 != Long.MAX_VALUE) {
            this.f95884f = j10 - 1;
        }
        if (j10 != 0) {
            a();
        } else {
            this.f95881b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95881b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95885g++;
        this.f95881b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        this.f95882c.setSubscription(dVar);
    }
}
