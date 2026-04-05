package au;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends AtomicReference implements mt.q, mt.v, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f8218b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8219c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f8220e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f8221f = new AtomicLong();

    public z(tw.c cVar, st.o oVar) {
        this.f8218b = cVar;
        this.f8219c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f8220e.dispose();
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f8218b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f8218b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f8218b.onNext(obj);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8220e, cVar)) {
            this.f8220e = cVar;
            this.f8218b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            ((tw.b) ut.o0.requireNonNull(this.f8219c.apply(obj), "The mapper returned a null Publisher")).subscribe(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8218b.onError(th2);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this, this.f8221f, j10);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this, this.f8221f, dVar);
    }
}
