package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class yb extends AtomicInteger implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96609b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f96610c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f96611e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final xb f96612f = new xb(this);

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f96613g = new iu.d();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f96614h;

    public yb(tw.c cVar) {
        this.f96609b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96610c);
        hu.g.cancel(this.f96612f);
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        hu.g.cancel(this.f96612f);
        iu.n.onComplete(this.f96609b, this, this.f96613g);
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        hu.g.cancel(this.f96612f);
        iu.n.onError(this.f96609b, th2, this, this.f96613g);
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj)) {
            return;
        }
        ((tw.d) this.f96610c.get()).request(1L);
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f96610c, this.f96611e, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f96610c, this.f96611e, j10);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        if (!this.f96614h) {
            return false;
        }
        iu.n.onNext(this.f96609b, obj, this, this.f96613g);
        return true;
    }
}
