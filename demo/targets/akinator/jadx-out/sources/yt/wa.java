package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class wa extends AtomicReference implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final qu.d f96501b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96502c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f96503e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f96504f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f96505g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final tt.h f96506h = new tt.h();

    /* renamed from: i, reason: collision with root package name */
    public tw.d f96507i;

    public wa(qu.d dVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f96501b = dVar;
        this.f96502c = j10;
        this.f96503e = timeUnit;
        this.f96504f = m0Var;
    }

    public abstract void a();

    public final void b() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            AtomicLong atomicLong = this.f96505g;
            long j10 = atomicLong.get();
            qu.d dVar = this.f96501b;
            if (j10 != 0) {
                dVar.onNext(andSet);
                iu.e.produced(atomicLong, 1L);
            } else {
                cancel();
                dVar.onError(new qt.e("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        tt.d.dispose(this.f96506h);
        this.f96507i.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tt.d.dispose(this.f96506h);
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f96506h);
        this.f96501b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        lazySet(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96507i, dVar)) {
            this.f96507i = dVar;
            this.f96501b.onSubscribe(this);
            long j10 = this.f96502c;
            this.f96506h.replace(this.f96504f.schedulePeriodicallyDirect(this, j10, j10, this.f96503e));
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96505g, j10);
        }
    }
}
