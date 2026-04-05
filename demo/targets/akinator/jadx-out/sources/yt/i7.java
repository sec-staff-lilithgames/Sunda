package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i7 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95670b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f95671c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final h7 f95672e = new h7(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f95673f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f95674g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f95675h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95676i;

    public i7(tw.c cVar) {
        this.f95670b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f95671c);
        tt.d.dispose(this.f95672e);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95675h = true;
        if (this.f95676i) {
            iu.n.onComplete(this.f95670b, this, this.f95673f);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f95672e);
        iu.n.onError(this.f95670b, th2, this, this.f95673f);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        iu.n.onNext(this.f95670b, obj, this, this.f95673f);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f95671c, this.f95674g, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f95671c, this.f95674g, j10);
    }
}
