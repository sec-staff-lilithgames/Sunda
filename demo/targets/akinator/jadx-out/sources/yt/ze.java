package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ze extends AtomicReference implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final qu.d f96656b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f96657c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f96658e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f96659f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f96660g = new AtomicReference();

    public ze(qu.d dVar, st.c cVar) {
        this.f96656b = dVar;
        this.f96657c = cVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96658e);
        hu.g.cancel(this.f96660g);
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        hu.g.cancel(this.f96660g);
        this.f96656b.onComplete();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        hu.g.cancel(this.f96660g);
        this.f96656b.onError(th2);
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj)) {
            return;
        }
        ((tw.d) this.f96658e.get()).request(1L);
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f96658e, this.f96659f, dVar);
    }

    public void otherError(Throwable th2) {
        hu.g.cancel(this.f96658e);
        this.f96656b.onError(th2);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f96658e, this.f96659f, j10);
    }

    public boolean setOther(tw.d dVar) {
        return hu.g.setOnce(this.f96660g, dVar);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        qu.d dVar = this.f96656b;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                dVar.onNext(ut.o0.requireNonNull(this.f96657c.apply(obj, obj2), "The combiner returned a null value"));
                return true;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                dVar.onError(th2);
            }
        }
        return false;
    }
}
