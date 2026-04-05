package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x8 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11211b;

    /* renamed from: f, reason: collision with root package name */
    public final pu.f f11214f;

    /* renamed from: i, reason: collision with root package name */
    public final mt.g0 f11217i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f11218j;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f11212c = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final iu.d f11213e = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final w8 f11215g = new w8(this);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f11216h = new AtomicReference();

    public x8(mt.i0 i0Var, pu.f fVar, mt.g0 g0Var) {
        this.f11211b = i0Var;
        this.f11214f = fVar;
        this.f11217i = g0Var;
    }

    public final void a() {
        if (this.f11212c.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.f11218j) {
                    this.f11218j = true;
                    this.f11217i.subscribe(this);
                }
                if (this.f11212c.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f11216h);
        tt.d.dispose(this.f11215g);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f11216h.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.dispose(this.f11215g);
        iu.n.onComplete(this.f11211b, this, this.f11213e);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.replace(this.f11216h, null);
        this.f11218j = false;
        this.f11214f.onNext(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        iu.n.onNext(this.f11211b, obj, this, this.f11213e);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f11216h, cVar);
    }
}
