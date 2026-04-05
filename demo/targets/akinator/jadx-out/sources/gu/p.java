package gu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f58463b;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f58464c = new iu.d();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f58465e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f58466f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f58467g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f58468h;

    public p(tw.c cVar) {
        this.f58463b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f58468h) {
            return;
        }
        hu.g.cancel(this.f58466f);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f58468h = true;
        iu.n.onComplete(this.f58463b, this, this.f58464c);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58468h = true;
        iu.n.onError(this.f58463b, th2, this, this.f58464c);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        iu.n.onNext(this.f58463b, obj, this, this.f58464c);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (this.f58467g.compareAndSet(false, true)) {
            this.f58463b.onSubscribe(this);
            hu.g.deferredSetOnce(this.f58466f, this.f58465e, dVar);
        } else {
            dVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (j10 > 0) {
            hu.g.deferredRequest(this.f58466f, this.f58465e, j10);
        } else {
            cancel();
            onError(new IllegalArgumentException(o2.m(j10, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
