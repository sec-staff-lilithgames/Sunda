package xt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93533b;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f93534c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.d f93535e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f93536f;

    public x0(mt.f fVar, pt.b bVar, iu.d dVar, AtomicInteger atomicInteger) {
        this.f93533b = fVar;
        this.f93534c = bVar;
        this.f93535e = dVar;
        this.f93536f = atomicInteger;
    }

    @Override // mt.f
    public void onComplete() {
        if (this.f93536f.decrementAndGet() == 0) {
            Throwable thTerminate = this.f93535e.terminate();
            mt.f fVar = this.f93533b;
            if (thTerminate == null) {
                fVar.onComplete();
            } else {
                fVar.onError(thTerminate);
            }
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f93535e;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f93536f.decrementAndGet() == 0) {
            Throwable thTerminate = dVar.terminate();
            mt.f fVar = this.f93533b;
            if (thTerminate == null) {
                fVar.onComplete();
            } else {
                fVar.onError(thTerminate);
            }
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93534c.add(cVar);
    }
}
