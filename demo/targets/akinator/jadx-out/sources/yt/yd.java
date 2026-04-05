package yt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class yd extends AtomicBoolean implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96619b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f96620c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96621e;

    public yd(tw.c cVar, mt.m0 m0Var) {
        this.f96619b = cVar;
        this.f96620c = m0Var;
    }

    @Override // tw.d
    public void cancel() {
        if (compareAndSet(false, true)) {
            this.f96620c.scheduleDirect(new xd(this));
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (get()) {
            return;
        }
        this.f96619b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (get()) {
            mu.a.onError(th2);
        } else {
            this.f96619b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (get()) {
            return;
        }
        this.f96619b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96621e, dVar)) {
            this.f96621e = dVar;
            this.f96619b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96621e.request(j10);
    }
}
