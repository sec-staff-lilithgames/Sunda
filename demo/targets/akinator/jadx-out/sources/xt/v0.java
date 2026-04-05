package xt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 extends AtomicInteger implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93520b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f93521c;

    /* renamed from: e, reason: collision with root package name */
    public final pt.b f93522e;

    public v0(mt.f fVar, AtomicBoolean atomicBoolean, pt.b bVar, int i10) {
        this.f93520b = fVar;
        this.f93521c = atomicBoolean;
        this.f93522e = bVar;
        lazySet(i10);
    }

    @Override // mt.f
    public void onComplete() {
        if (decrementAndGet() == 0 && this.f93521c.compareAndSet(false, true)) {
            this.f93520b.onComplete();
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93522e.dispose();
        if (this.f93521c.compareAndSet(false, true)) {
            this.f93520b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93522e.add(cVar);
    }
}
