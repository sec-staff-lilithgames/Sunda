package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h4 extends AtomicInteger implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f95582b;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95584e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95585f;

    /* renamed from: h, reason: collision with root package name */
    public final int f95587h;

    /* renamed from: i, reason: collision with root package name */
    public tw.d f95588i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f95589j;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f95583c = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f95586g = new pt.b();

    public h4(mt.f fVar, st.o oVar, boolean z10, int i10) {
        this.f95582b = fVar;
        this.f95584e = oVar;
        this.f95585f = z10;
        this.f95587h = i10;
        lazySet(1);
    }

    @Override // pt.c
    public void dispose() {
        this.f95589j = true;
        this.f95588i.cancel();
        this.f95586g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95586g.isDisposed();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (decrementAndGet() != 0) {
            if (this.f95587h != Integer.MAX_VALUE) {
                this.f95588i.request(1L);
            }
        } else {
            Throwable thTerminate = this.f95583c.terminate();
            mt.f fVar = this.f95582b;
            if (thTerminate != null) {
                fVar.onError(thTerminate);
            } else {
                fVar.onComplete();
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f95583c;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        boolean z10 = this.f95585f;
        mt.f fVar = this.f95582b;
        if (!z10) {
            dispose();
            if (getAndSet(0) > 0) {
                fVar.onError(dVar.terminate());
                return;
            }
            return;
        }
        if (decrementAndGet() == 0) {
            fVar.onError(dVar.terminate());
        } else if (this.f95587h != Integer.MAX_VALUE) {
            this.f95588i.request(1L);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f95584e.apply(obj), "The mapper returned a null CompletableSource");
            getAndIncrement();
            g4 g4Var = new g4(this);
            if (this.f95589j || !this.f95586g.add(g4Var)) {
                return;
            }
            iVar.subscribe(g4Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95588i.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95588i, dVar)) {
            this.f95588i = dVar;
            this.f95582b.onSubscribe(this);
            int i10 = this.f95587h;
            if (i10 == Integer.MAX_VALUE) {
                dVar.request(Long.MAX_VALUE);
            } else {
                dVar.request(i10);
            }
        }
    }
}
