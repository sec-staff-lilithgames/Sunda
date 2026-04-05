package yt;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class de extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95383b;

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f95384c;

    /* renamed from: e, reason: collision with root package name */
    public final long f95385e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95386f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f95387g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f95388h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f95389i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f95390j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f95391k;

    /* renamed from: l, reason: collision with root package name */
    public final int f95392l;

    /* renamed from: m, reason: collision with root package name */
    public long f95393m;

    /* renamed from: n, reason: collision with root package name */
    public long f95394n;

    /* renamed from: o, reason: collision with root package name */
    public tw.d f95395o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f95396p;

    /* renamed from: q, reason: collision with root package name */
    public Throwable f95397q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f95398r;

    public de(tw.c cVar, long j10, long j11, int i10) {
        super(1);
        this.f95383b = cVar;
        this.f95385e = j10;
        this.f95386f = j11;
        this.f95384c = new eu.d(i10);
        this.f95387g = new ArrayDeque();
        this.f95388h = new AtomicBoolean();
        this.f95389i = new AtomicBoolean();
        this.f95390j = new AtomicLong();
        this.f95391k = new AtomicInteger();
        this.f95392l = i10;
    }

    public final boolean a(boolean z10, boolean z11, tw.c cVar, eu.d dVar) {
        if (this.f95398r) {
            dVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        Throwable th2 = this.f95397q;
        if (th2 != null) {
            dVar.clear();
            cVar.onError(th2);
            return true;
        }
        if (!z11) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    public final void b() {
        if (this.f95391k.getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f95383b;
        eu.d dVar = this.f95384c;
        int iAddAndGet = 1;
        do {
            long j10 = this.f95390j.get();
            long j11 = 0;
            while (j11 != j10) {
                boolean z10 = this.f95396p;
                nu.d dVar2 = (nu.d) dVar.poll();
                boolean z11 = dVar2 == null;
                if (a(z10, z11, cVar, dVar)) {
                    return;
                }
                if (z11) {
                    break;
                }
                cVar.onNext(dVar2);
                j11++;
            }
            if (j11 == j10 && a(this.f95396p, dVar.isEmpty(), cVar, dVar)) {
                return;
            }
            if (j11 != 0 && j10 != Long.MAX_VALUE) {
                this.f95390j.addAndGet(-j11);
            }
            iAddAndGet = this.f95391k.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // tw.d
    public void cancel() {
        this.f95398r = true;
        if (this.f95388h.compareAndSet(false, true)) {
            run();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95396p) {
            return;
        }
        Iterator it = this.f95387g.iterator();
        while (it.hasNext()) {
            ((tw.a) it.next()).onComplete();
        }
        this.f95387g.clear();
        this.f95396p = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95396p) {
            mu.a.onError(th2);
            return;
        }
        Iterator it = this.f95387g.iterator();
        while (it.hasNext()) {
            ((tw.a) it.next()).onError(th2);
        }
        this.f95387g.clear();
        this.f95397q = th2;
        this.f95396p = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95396p) {
            return;
        }
        long j10 = this.f95393m;
        if (j10 == 0 && !this.f95398r) {
            getAndIncrement();
            nu.d dVarCreate = nu.d.create(this.f95392l, this);
            this.f95387g.offer(dVarCreate);
            this.f95384c.offer(dVarCreate);
            b();
        }
        long j11 = j10 + 1;
        Iterator it = this.f95387g.iterator();
        while (it.hasNext()) {
            ((tw.a) it.next()).onNext(obj);
        }
        long j12 = this.f95394n + 1;
        if (j12 == this.f95385e) {
            this.f95394n = j12 - this.f95386f;
            tw.a aVar = (tw.a) this.f95387g.poll();
            if (aVar != null) {
                aVar.onComplete();
            }
        } else {
            this.f95394n = j12;
        }
        if (j11 == this.f95386f) {
            this.f95393m = 0L;
        } else {
            this.f95393m = j11;
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95395o, dVar)) {
            this.f95395o = dVar;
            this.f95383b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95390j, j10);
            AtomicBoolean atomicBoolean = this.f95389i;
            boolean z10 = atomicBoolean.get();
            long j11 = this.f95386f;
            if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                this.f95395o.request(iu.e.multiplyCap(j11, j10));
            } else {
                this.f95395o.request(iu.e.addCap(this.f95385e, iu.e.multiplyCap(j11, j10 - 1)));
            }
            b();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (decrementAndGet() == 0) {
            this.f95395o.cancel();
        }
    }
}
