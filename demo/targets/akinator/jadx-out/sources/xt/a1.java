package xt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 extends AtomicBoolean implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final pt.b f93368b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.f f93369c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f93370e;

    public a1(mt.f fVar, pt.b bVar, AtomicInteger atomicInteger) {
        this.f93369c = fVar;
        this.f93368b = bVar;
        this.f93370e = atomicInteger;
    }

    @Override // mt.f
    public void onComplete() {
        if (this.f93370e.decrementAndGet() == 0 && compareAndSet(false, true)) {
            this.f93369c.onComplete();
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93368b.dispose();
        if (compareAndSet(false, true)) {
            this.f93369c.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93368b.add(cVar);
    }
}
