package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class cd extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95278b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95279c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f95280e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f95281f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95282g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f95283h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f95284i = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public tw.d f95285j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f95286k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f95287l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f95288m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f95289n;

    /* renamed from: o, reason: collision with root package name */
    public long f95290o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95291p;

    public cd(tw.c cVar, long j10, TimeUnit timeUnit, m0.a aVar, boolean z10) {
        this.f95278b = cVar;
        this.f95279c = j10;
        this.f95280e = timeUnit;
        this.f95281f = aVar;
        this.f95282g = z10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f95283h;
        AtomicLong atomicLong = this.f95284i;
        tw.c cVar = this.f95278b;
        int iAddAndGet = 1;
        while (!this.f95288m) {
            boolean z10 = this.f95286k;
            if (z10 && this.f95287l != null) {
                atomicReference.lazySet(null);
                cVar.onError(this.f95287l);
                this.f95281f.dispose();
                return;
            }
            boolean z11 = atomicReference.get() == null;
            if (z10) {
                if (z11 || !this.f95282g) {
                    atomicReference.lazySet(null);
                    cVar.onComplete();
                } else {
                    Object andSet = atomicReference.getAndSet(null);
                    long j10 = this.f95290o;
                    if (j10 != atomicLong.get()) {
                        this.f95290o = j10 + 1;
                        cVar.onNext(andSet);
                        cVar.onComplete();
                    } else {
                        cVar.onError(new qt.e("Could not emit final value due to lack of requests"));
                    }
                }
                this.f95281f.dispose();
                return;
            }
            if (z11) {
                if (this.f95289n) {
                    this.f95291p = false;
                    this.f95289n = false;
                }
            } else if (!this.f95291p || this.f95289n) {
                Object andSet2 = atomicReference.getAndSet(null);
                long j11 = this.f95290o;
                if (j11 == atomicLong.get()) {
                    this.f95285j.cancel();
                    cVar.onError(new qt.e("Could not emit value due to lack of requests"));
                    this.f95281f.dispose();
                    return;
                } else {
                    cVar.onNext(andSet2);
                    this.f95290o = j11 + 1;
                    this.f95289n = false;
                    this.f95291p = true;
                    this.f95281f.schedule(this, this.f95279c, this.f95280e);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // tw.d
    public void cancel() {
        this.f95288m = true;
        this.f95285j.cancel();
        this.f95281f.dispose();
        if (getAndIncrement() == 0) {
            this.f95283h.lazySet(null);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95286k = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95287l = th2;
        this.f95286k = true;
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95283h.set(obj);
        a();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95285j, dVar)) {
            this.f95285j = dVar;
            this.f95278b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95284i, j10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95289n = true;
        a();
    }
}
