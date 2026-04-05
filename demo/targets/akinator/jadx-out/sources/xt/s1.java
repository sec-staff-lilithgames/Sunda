package xt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s1 implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final pt.b f93495b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f93496c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.f f93497e;

    public s1(AtomicBoolean atomicBoolean, mt.f fVar, pt.b bVar) {
        this.f93495b = bVar;
        this.f93496c = atomicBoolean;
        this.f93497e = fVar;
    }

    @Override // mt.f
    public void onComplete() {
        if (this.f93496c.compareAndSet(false, true)) {
            this.f93495b.dispose();
            this.f93497e.onComplete();
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        if (!this.f93496c.compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            this.f93495b.dispose();
            this.f93497e.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93495b.add(cVar);
    }
}
