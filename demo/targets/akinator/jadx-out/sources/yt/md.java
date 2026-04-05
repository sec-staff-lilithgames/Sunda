package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class md extends hu.f implements mt.q, od {

    /* renamed from: k, reason: collision with root package name */
    public final tw.c f95958k;

    /* renamed from: l, reason: collision with root package name */
    public final long f95959l;

    /* renamed from: m, reason: collision with root package name */
    public final TimeUnit f95960m;

    /* renamed from: n, reason: collision with root package name */
    public final m0.a f95961n;

    /* renamed from: o, reason: collision with root package name */
    public final tt.h f95962o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f95963p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicLong f95964q;

    /* renamed from: r, reason: collision with root package name */
    public long f95965r;

    /* renamed from: s, reason: collision with root package name */
    public tw.b f95966s;

    public md(tw.c cVar, long j10, TimeUnit timeUnit, m0.a aVar, tw.b bVar) {
        super(true);
        this.f95958k = cVar;
        this.f95959l = j10;
        this.f95960m = timeUnit;
        this.f95961n = aVar;
        this.f95966s = bVar;
        this.f95962o = new tt.h();
        this.f95963p = new AtomicReference();
        this.f95964q = new AtomicLong();
    }

    @Override // hu.f, tw.d
    public void cancel() {
        super.cancel();
        this.f95961n.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95964q.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f95962o.dispose();
            this.f95958k.onComplete();
            this.f95961n.dispose();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95964q.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
            return;
        }
        this.f95962o.dispose();
        this.f95958k.onError(th2);
        this.f95961n.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        AtomicLong atomicLong = this.f95964q;
        long j10 = atomicLong.get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 + 1;
            if (atomicLong.compareAndSet(j10, j11)) {
                tt.h hVar = this.f95962o;
                ((pt.c) hVar.get()).dispose();
                this.f95965r++;
                this.f95958k.onNext(obj);
                hVar.replace(this.f95961n.schedule(new pd(j11, this), this.f95959l, this.f95960m));
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f95963p, dVar)) {
            setSubscription(dVar);
        }
    }

    @Override // yt.od
    public void onTimeout(long j10) {
        if (this.f95964q.compareAndSet(j10, Long.MAX_VALUE)) {
            hu.g.cancel(this.f95963p);
            long j11 = this.f95965r;
            if (j11 != 0) {
                produced(j11);
            }
            tw.b bVar = this.f95966s;
            this.f95966s = null;
            bVar.subscribe(new ld(this.f95958k, this));
            this.f95961n.dispose();
        }
    }
}
