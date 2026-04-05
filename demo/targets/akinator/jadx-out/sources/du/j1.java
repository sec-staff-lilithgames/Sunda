package du;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j1 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52756b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f52757c;

    /* renamed from: e, reason: collision with root package name */
    public Object f52758e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52759f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f52760g;

    public j1(mt.q0 q0Var) {
        this.f52756b = q0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f52760g = true;
        this.f52757c.cancel();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52760g;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f52759f) {
            return;
        }
        this.f52759f = true;
        Object obj = this.f52758e;
        this.f52758e = null;
        mt.q0 q0Var = this.f52756b;
        if (obj == null) {
            q0Var.onError(new NoSuchElementException("The source Publisher is empty"));
        } else {
            q0Var.onSuccess(obj);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f52759f) {
            mu.a.onError(th2);
            return;
        }
        this.f52759f = true;
        this.f52758e = null;
        this.f52756b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f52759f) {
            return;
        }
        if (this.f52758e == null) {
            this.f52758e = obj;
            return;
        }
        this.f52757c.cancel();
        this.f52759f = true;
        this.f52758e = null;
        this.f52756b.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f52757c, dVar)) {
            this.f52757c = dVar;
            this.f52756b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
