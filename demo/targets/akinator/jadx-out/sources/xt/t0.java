package xt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 extends AtomicInteger implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93501c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93502e;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f93505h;

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f93504g = new pt.b();

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f93503f = new iu.d();

    public t0(mt.f fVar, int i10, boolean z10) {
        this.f93500b = fVar;
        this.f93501c = i10;
        this.f93502e = z10;
        lazySet(1);
    }

    @Override // pt.c
    public void dispose() {
        this.f93505h.cancel();
        this.f93504g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93504g.isDisposed();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (decrementAndGet() == 0) {
            iu.d dVar = this.f93503f;
            Throwable th2 = (Throwable) dVar.get();
            mt.f fVar = this.f93500b;
            if (th2 != null) {
                fVar.onError(dVar.terminate());
            } else {
                fVar.onComplete();
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f93502e;
        mt.f fVar = this.f93500b;
        iu.d dVar = this.f93503f;
        if (z10) {
            if (!dVar.addThrowable(th2)) {
                mu.a.onError(th2);
                return;
            } else {
                if (decrementAndGet() == 0) {
                    fVar.onError(dVar.terminate());
                    return;
                }
                return;
            }
        }
        this.f93504g.dispose();
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
        } else if (getAndSet(0) > 0) {
            fVar.onError(dVar.terminate());
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f93505h, dVar)) {
            this.f93505h = dVar;
            this.f93500b.onSubscribe(this);
            int i10 = this.f93501c;
            if (i10 == Integer.MAX_VALUE) {
                dVar.request(Long.MAX_VALUE);
            } else {
                dVar.request(i10);
            }
        }
    }

    @Override // mt.q, tw.c
    public void onNext(mt.i iVar) {
        getAndIncrement();
        s0 s0Var = new s0(this);
        this.f93504g.add(s0Var);
        iVar.subscribe(s0Var);
    }
}
