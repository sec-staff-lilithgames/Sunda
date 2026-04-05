package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q3 extends AtomicInteger implements pt.c, mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f10840b;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10842e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10843f;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f10845h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10846i;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f10841c = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f10844g = new pt.b();

    public q3(mt.f fVar, st.o oVar, boolean z10) {
        this.f10840b = fVar;
        this.f10842e = oVar;
        this.f10843f = z10;
        lazySet(1);
    }

    @Override // pt.c
    public void dispose() {
        this.f10846i = true;
        this.f10845h.dispose();
        this.f10844g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10845h.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (decrementAndGet() == 0) {
            Throwable thTerminate = this.f10841c.terminate();
            mt.f fVar = this.f10840b;
            if (thTerminate != null) {
                fVar.onError(thTerminate);
            } else {
                fVar.onComplete();
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f10841c;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        boolean z10 = this.f10843f;
        mt.f fVar = this.f10840b;
        if (z10) {
            if (decrementAndGet() == 0) {
                fVar.onError(dVar.terminate());
            }
        } else {
            dispose();
            if (getAndSet(0) > 0) {
                fVar.onError(dVar.terminate());
            }
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f10842e.apply(obj), "The mapper returned a null CompletableSource");
            getAndIncrement();
            p3 p3Var = new p3(this);
            if (this.f10846i || !this.f10844g.add(p3Var)) {
                return;
            }
            iVar.subscribe(p3Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10845h.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10845h, cVar)) {
            this.f10845h = cVar;
            this.f10840b.onSubscribe(this);
        }
    }
}
