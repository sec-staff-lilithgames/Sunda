package yt;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q2 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96166b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96167c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f96168e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f96169f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96170g;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f96171h;

    public q2(tw.c cVar, long j10, TimeUnit timeUnit, m0.a aVar, boolean z10) {
        this.f96166b = cVar;
        this.f96167c = j10;
        this.f96168e = timeUnit;
        this.f96169f = aVar;
        this.f96170g = z10;
    }

    @Override // tw.d
    public void cancel() {
        this.f96171h.cancel();
        this.f96169f.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96169f.schedule(new n2(this), this.f96167c, this.f96168e);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96169f.schedule(new o2(this, th2), this.f96170g ? this.f96167c : 0L, this.f96168e);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96169f.schedule(new p2(this, obj), this.f96167c, this.f96168e);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96171h, dVar)) {
            this.f96171h = dVar;
            this.f96166b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96171h.request(j10);
    }
}
