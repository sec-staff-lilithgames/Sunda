package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ed implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95441b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f95442c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f95443e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95444f;

    /* renamed from: g, reason: collision with root package name */
    public long f95445g;

    public ed(tw.c cVar, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f95441b = cVar;
        this.f95443e = m0Var;
        this.f95442c = timeUnit;
    }

    @Override // tw.d
    public void cancel() {
        this.f95444f.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95441b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95441b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        mt.m0 m0Var = this.f95443e;
        TimeUnit timeUnit = this.f95442c;
        long jNow = m0Var.now(timeUnit);
        long j10 = this.f95445g;
        this.f95445g = jNow;
        this.f95441b.onNext(new ou.k(obj, jNow - j10, timeUnit));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95444f, dVar)) {
            this.f95445g = this.f95443e.now(this.f95442c);
            this.f95444f = dVar;
            this.f95441b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f95444f.request(j10);
    }
}
