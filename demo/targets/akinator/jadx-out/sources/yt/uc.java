package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class uc extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96415b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f96416c = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f96417e = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final tc f96419g = new tc(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f96418f = new iu.d();

    public uc(tw.c cVar) {
        this.f96415b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96417e);
        hu.g.cancel(this.f96419g);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        hu.g.cancel(this.f96419g);
        iu.n.onComplete(this.f96415b, this, this.f96418f);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        hu.g.cancel(this.f96419g);
        iu.n.onError(this.f96415b, th2, this, this.f96418f);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        iu.n.onNext(this.f96415b, obj, this, this.f96418f);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f96417e, this.f96416c, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f96417e, this.f96416c, j10);
    }
}
