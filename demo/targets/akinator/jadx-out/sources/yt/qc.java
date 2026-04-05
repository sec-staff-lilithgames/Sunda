package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qc extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96201b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96202c;

    /* renamed from: e, reason: collision with root package name */
    public final long f96203e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96204f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f96205g;

    /* renamed from: h, reason: collision with root package name */
    public final eu.d f96206h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f96207i;

    /* renamed from: j, reason: collision with root package name */
    public tw.d f96208j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f96209k = new AtomicLong();

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f96210l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f96211m;

    /* renamed from: n, reason: collision with root package name */
    public Throwable f96212n;

    public qc(tw.c cVar, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        this.f96201b = cVar;
        this.f96202c = j10;
        this.f96203e = j11;
        this.f96204f = timeUnit;
        this.f96205g = m0Var;
        this.f96206h = new eu.d(i10);
        this.f96207i = z10;
    }

    public final boolean a(tw.c cVar, boolean z10, boolean z11) {
        if (this.f96210l) {
            this.f96206h.clear();
            return true;
        }
        if (z11) {
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f96212n;
            if (th2 != null) {
                cVar.onError(th2);
                return true;
            }
            cVar.onComplete();
            return true;
        }
        Throwable th3 = this.f96212n;
        if (th3 != null) {
            this.f96206h.clear();
            cVar.onError(th3);
            return true;
        }
        if (!z10) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f96201b;
        eu.d dVar = this.f96206h;
        boolean z10 = this.f96207i;
        int iAddAndGet = 1;
        do {
            if (this.f96211m) {
                if (a(cVar, dVar.isEmpty(), z10)) {
                    return;
                }
                long j10 = this.f96209k.get();
                long j11 = 0;
                while (true) {
                    if (a(cVar, dVar.peek() == null, z10)) {
                        return;
                    }
                    if (j10 != j11) {
                        dVar.poll();
                        cVar.onNext(dVar.poll());
                        j11++;
                    } else if (j11 != 0) {
                        iu.e.produced(this.f96209k, j11);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public final void c(long j10, eu.d dVar) {
        long j11 = this.f96202c;
        boolean z10 = j11 == Long.MAX_VALUE;
        while (!dVar.isEmpty()) {
            if (((Long) dVar.peek()).longValue() >= j10 - this.f96203e && (z10 || (dVar.size() >> 1) <= j11)) {
                return;
            }
            dVar.poll();
            dVar.poll();
        }
    }

    @Override // tw.d
    public void cancel() {
        if (this.f96210l) {
            return;
        }
        this.f96210l = true;
        this.f96208j.cancel();
        if (getAndIncrement() == 0) {
            this.f96206h.clear();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        c(this.f96205g.now(this.f96204f), this.f96206h);
        this.f96211m = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96207i) {
            c(this.f96205g.now(this.f96204f), this.f96206h);
        }
        this.f96212n = th2;
        this.f96211m = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long jNow = this.f96205g.now(this.f96204f);
        Long lValueOf = Long.valueOf(jNow);
        eu.d dVar = this.f96206h;
        dVar.offer(lValueOf, obj);
        c(jNow, dVar);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96208j, dVar)) {
            this.f96208j = dVar;
            this.f96201b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96209k, j10);
            b();
        }
    }
}
