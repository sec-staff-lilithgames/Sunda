package xt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f93362b;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f93363c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.f f93364e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f93365f;

    public a(AtomicBoolean atomicBoolean, mt.f fVar, pt.b bVar) {
        this.f93362b = atomicBoolean;
        this.f93363c = bVar;
        this.f93364e = fVar;
    }

    @Override // mt.f
    public void onComplete() {
        if (this.f93362b.compareAndSet(false, true)) {
            pt.c cVar = this.f93365f;
            pt.b bVar = this.f93363c;
            bVar.delete(cVar);
            bVar.dispose();
            this.f93364e.onComplete();
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        if (!this.f93362b.compareAndSet(false, true)) {
            mu.a.onError(th2);
            return;
        }
        pt.c cVar = this.f93365f;
        pt.b bVar = this.f93363c;
        bVar.delete(cVar);
        bVar.dispose();
        this.f93364e.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93365f = cVar;
        this.f93363c.add(cVar);
    }
}
