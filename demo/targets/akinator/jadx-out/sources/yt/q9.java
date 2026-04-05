package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q9 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f96195b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f96196c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f96197e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public r9 f96198f;

    public q9(tw.b bVar) {
        this.f96195b = bVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96196c);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96198f.cancel();
        this.f96198f.f96266k.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96198f.cancel();
        this.f96198f.f96266k.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.f96196c.get() != hu.g.f59176b) {
                this.f96195b.subscribe(this.f96198f);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f96196c, this.f96197e, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f96196c, this.f96197e, j10);
    }
}
