package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ee extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95446b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95447c;

    /* renamed from: e, reason: collision with root package name */
    public final long f95448e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f95449f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f95450g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95451h;

    /* renamed from: i, reason: collision with root package name */
    public long f95452i;

    /* renamed from: j, reason: collision with root package name */
    public tw.d f95453j;

    /* renamed from: k, reason: collision with root package name */
    public nu.d f95454k;

    public ee(tw.c cVar, long j10, long j11, int i10) {
        super(1);
        this.f95446b = cVar;
        this.f95447c = j10;
        this.f95448e = j11;
        this.f95449f = new AtomicBoolean();
        this.f95450g = new AtomicBoolean();
        this.f95451h = i10;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95449f.compareAndSet(false, true)) {
            run();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        nu.d dVar = this.f95454k;
        if (dVar != null) {
            this.f95454k = null;
            dVar.onComplete();
        }
        this.f95446b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        nu.d dVar = this.f95454k;
        if (dVar != null) {
            this.f95454k = null;
            dVar.onError(th2);
        }
        this.f95446b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long j10 = this.f95452i;
        nu.d dVarCreate = this.f95454k;
        if (j10 == 0) {
            getAndIncrement();
            dVarCreate = nu.d.create(this.f95451h, this);
            this.f95454k = dVarCreate;
            this.f95446b.onNext(dVarCreate);
        }
        long j11 = j10 + 1;
        if (dVarCreate != null) {
            dVarCreate.onNext(obj);
        }
        if (j11 == this.f95447c) {
            this.f95454k = null;
            dVarCreate.onComplete();
        }
        if (j11 == this.f95448e) {
            this.f95452i = 0L;
        } else {
            this.f95452i = j11;
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95453j, dVar)) {
            this.f95453j = dVar;
            this.f95446b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            AtomicBoolean atomicBoolean = this.f95450g;
            boolean z10 = atomicBoolean.get();
            long j11 = this.f95448e;
            if (z10 || !atomicBoolean.compareAndSet(false, true)) {
                this.f95453j.request(iu.e.multiplyCap(j11, j10));
            } else {
                long j12 = this.f95447c;
                this.f95453j.request(iu.e.addCap(iu.e.multiplyCap(j12, j10), iu.e.multiplyCap(j11 - j12, j10 - 1)));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (decrementAndGet() == 0) {
            this.f95453j.cancel();
        }
    }
}
