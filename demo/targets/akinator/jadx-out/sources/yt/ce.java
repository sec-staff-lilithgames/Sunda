package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ce extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95292b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95293c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f95294e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95295f;

    /* renamed from: g, reason: collision with root package name */
    public long f95296g;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f95297h;

    /* renamed from: i, reason: collision with root package name */
    public nu.d f95298i;

    public ce(tw.c cVar, long j10, int i10) {
        super(1);
        this.f95292b = cVar;
        this.f95293c = j10;
        this.f95294e = new AtomicBoolean();
        this.f95295f = i10;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95294e.compareAndSet(false, true)) {
            run();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        nu.d dVar = this.f95298i;
        if (dVar != null) {
            this.f95298i = null;
            dVar.onComplete();
        }
        this.f95292b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        nu.d dVar = this.f95298i;
        if (dVar != null) {
            this.f95298i = null;
            dVar.onError(th2);
        }
        this.f95292b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long j10 = this.f95296g;
        nu.d dVarCreate = this.f95298i;
        if (j10 == 0) {
            getAndIncrement();
            dVarCreate = nu.d.create(this.f95295f, this);
            this.f95298i = dVarCreate;
            this.f95292b.onNext(dVarCreate);
        }
        long j11 = j10 + 1;
        dVarCreate.onNext(obj);
        if (j11 != this.f95293c) {
            this.f95296g = j11;
            return;
        }
        this.f95296g = 0L;
        this.f95298i = null;
        dVarCreate.onComplete();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95297h, dVar)) {
            this.f95297h = dVar;
            this.f95292b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            this.f95297h.request(iu.e.multiplyCap(this.f95293c, j10));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (decrementAndGet() == 0) {
            this.f95297h.cancel();
        }
    }
}
