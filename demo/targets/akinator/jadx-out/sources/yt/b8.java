package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b8 extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95226b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f95227c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95228e;

    public b8(tw.c cVar) {
        this.f95226b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f95227c.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95228e) {
            return;
        }
        this.f95228e = true;
        this.f95226b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95228e) {
            mu.a.onError(th2);
        } else {
            this.f95228e = true;
            this.f95226b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95228e) {
            return;
        }
        if (get() != 0) {
            this.f95226b.onNext(obj);
            iu.e.produced(this, 1L);
        } else {
            this.f95227c.cancel();
            onError(new qt.e("could not emit value due to lack of requests"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95227c, dVar)) {
            this.f95227c = dVar;
            this.f95226b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }
}
