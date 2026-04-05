package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z7 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11307b;

    /* renamed from: f, reason: collision with root package name */
    public final pu.f f11310f;

    /* renamed from: i, reason: collision with root package name */
    public final mt.g0 f11313i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f11314j;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f11308c = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final iu.d f11309e = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final y7 f11311g = new y7(this);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f11312h = new AtomicReference();

    public z7(mt.i0 i0Var, pu.f fVar, mt.g0 g0Var) {
        this.f11307b = i0Var;
        this.f11310f = fVar;
        this.f11313i = g0Var;
    }

    public final void a() {
        if (this.f11308c.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.f11314j) {
                    this.f11314j = true;
                    this.f11313i.subscribe(this);
                }
                if (this.f11308c.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f11312h);
        tt.d.dispose(this.f11311g);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f11312h.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.replace(this.f11312h, null);
        this.f11314j = false;
        this.f11310f.onNext(0);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f11311g);
        iu.n.onError(this.f11307b, th2, this, this.f11309e);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        iu.n.onNext(this.f11307b, obj, this, this.f11309e);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f11312h, cVar);
    }
}
