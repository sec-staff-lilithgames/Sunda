package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t2 extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96346b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f96347c;

    /* renamed from: e, reason: collision with root package name */
    public final s2 f96348e = new s2(this);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f96349f = new AtomicReference();

    public t2(tw.b bVar, tw.c cVar) {
        this.f96346b = cVar;
        this.f96347c = bVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96348e);
        hu.g.cancel(this.f96349f);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96346b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96346b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96346b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f96349f, this, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            hu.g.deferredRequest(this.f96349f, this, j10);
        }
    }
}
