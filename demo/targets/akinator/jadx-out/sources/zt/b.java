package zt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98534b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f98535c;

    /* renamed from: e, reason: collision with root package name */
    public final pt.b f98536e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f98537f;

    public b(mt.v vVar, pt.b bVar, AtomicBoolean atomicBoolean) {
        this.f98534b = vVar;
        this.f98536e = bVar;
        this.f98535c = atomicBoolean;
    }

    @Override // mt.v
    public void onComplete() {
        if (this.f98535c.compareAndSet(false, true)) {
            pt.c cVar = this.f98537f;
            pt.b bVar = this.f98536e;
            bVar.delete(cVar);
            bVar.dispose();
            this.f98534b.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        if (!this.f98535c.compareAndSet(false, true)) {
            mu.a.onError(th2);
            return;
        }
        pt.c cVar = this.f98537f;
        pt.b bVar = this.f98536e;
        bVar.delete(cVar);
        bVar.dispose();
        this.f98534b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        this.f98537f = cVar;
        this.f98536e.add(cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        if (this.f98535c.compareAndSet(false, true)) {
            pt.c cVar = this.f98537f;
            pt.b bVar = this.f98536e;
            bVar.delete(cVar);
            bVar.dispose();
            this.f98534b.onSuccess(obj);
        }
    }
}
