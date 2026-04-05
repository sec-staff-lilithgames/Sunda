package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ad extends AtomicLong implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final qu.d f95162b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95163c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f95164e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f95165f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f95166g;

    /* renamed from: h, reason: collision with root package name */
    public final tt.h f95167h = new tt.h();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95168i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f95169j;

    public ad(qu.d dVar, long j10, TimeUnit timeUnit, m0.a aVar) {
        this.f95162b = dVar;
        this.f95163c = j10;
        this.f95164e = timeUnit;
        this.f95165f = aVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f95166g.cancel();
        this.f95165f.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95169j) {
            return;
        }
        this.f95169j = true;
        this.f95162b.onComplete();
        this.f95165f.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95169j) {
            mu.a.onError(th2);
            return;
        }
        this.f95169j = true;
        this.f95162b.onError(th2);
        this.f95165f.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95169j || this.f95168i) {
            return;
        }
        this.f95168i = true;
        if (get() == 0) {
            this.f95169j = true;
            cancel();
            this.f95162b.onError(new qt.e("Could not deliver value due to lack of requests"));
        } else {
            this.f95162b.onNext(obj);
            iu.e.produced(this, 1L);
            pt.c cVar = (pt.c) this.f95167h.get();
            if (cVar != null) {
                cVar.dispose();
            }
            this.f95167h.replace(this.f95165f.schedule(this, this.f95163c, this.f95164e));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95166g, dVar)) {
            this.f95166g = dVar;
            this.f95162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95168i = false;
    }
}
