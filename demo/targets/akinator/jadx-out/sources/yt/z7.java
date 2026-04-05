package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z7 extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96645b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f96646c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96647e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96648f;

    public z7(tw.c cVar, st.g gVar) {
        this.f96645b = cVar;
        this.f96646c = gVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f96647e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96648f) {
            return;
        }
        this.f96648f = true;
        this.f96645b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96648f) {
            mu.a.onError(th2);
        } else {
            this.f96648f = true;
            this.f96645b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96648f) {
            return;
        }
        if (get() != 0) {
            this.f96645b.onNext(obj);
            iu.e.produced(this, 1L);
            return;
        }
        try {
            this.f96646c.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96647e, dVar)) {
            this.f96647e = dVar;
            this.f96645b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }
}
