package du;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 extends AtomicLong implements mt.q0, mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f52732b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52733c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f52734e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public pt.c f52735f;

    public g1(tw.c cVar, st.o oVar) {
        this.f52732b = cVar;
        this.f52733c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f52735f.dispose();
        hu.g.cancel(this.f52734e);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f52732b.onComplete();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52732b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f52732b.onNext(obj);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52735f = cVar;
        this.f52732b.onSubscribe(this);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        try {
            ((tw.b) ut.o0.requireNonNull(this.f52733c.apply(obj), "the mapper returned a null Publisher")).subscribe(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f52732b.onError(th2);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f52734e, this, j10);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f52734e, this, dVar);
    }
}
