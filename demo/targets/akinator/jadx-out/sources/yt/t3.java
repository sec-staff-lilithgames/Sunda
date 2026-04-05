package yt;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t3 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96350b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96351c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f96352e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f96353f;

    /* renamed from: g, reason: collision with root package name */
    public long f96354g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96355h;

    public t3(mt.q0 q0Var, long j10, Object obj) {
        this.f96350b = q0Var;
        this.f96351c = j10;
        this.f96352e = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f96353f.cancel();
        this.f96353f = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96353f == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96353f = hu.g.f59176b;
        if (this.f96355h) {
            return;
        }
        this.f96355h = true;
        mt.q0 q0Var = this.f96350b;
        Object obj = this.f96352e;
        if (obj != null) {
            q0Var.onSuccess(obj);
        } else {
            q0Var.onError(new NoSuchElementException());
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96355h) {
            mu.a.onError(th2);
            return;
        }
        this.f96355h = true;
        this.f96353f = hu.g.f59176b;
        this.f96350b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96355h) {
            return;
        }
        long j10 = this.f96354g;
        if (j10 != this.f96351c) {
            this.f96354g = j10 + 1;
            return;
        }
        this.f96355h = true;
        this.f96353f.cancel();
        this.f96353f = hu.g.f59176b;
        this.f96350b.onSuccess(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96353f, dVar)) {
            this.f96353f = dVar;
            this.f96350b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
