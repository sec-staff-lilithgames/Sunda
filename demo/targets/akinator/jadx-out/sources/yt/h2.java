package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h2 extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final qu.d f95571b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95572c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95573e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f95574f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public volatile long f95575g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f95576h;

    public h2(qu.d dVar, st.o oVar) {
        this.f95571b = dVar;
        this.f95572c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f95573e.cancel();
        tt.d.dispose(this.f95574f);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95576h) {
            return;
        }
        this.f95576h = true;
        AtomicReference atomicReference = this.f95574f;
        pt.c cVar = (pt.c) atomicReference.get();
        if (tt.d.isDisposed(cVar)) {
            return;
        }
        g2 g2Var = (g2) cVar;
        if (g2Var != null) {
            g2Var.a();
        }
        tt.d.dispose(atomicReference);
        this.f95571b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f95574f);
        this.f95571b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95576h) {
            return;
        }
        long j10 = this.f95575g + 1;
        this.f95575g = j10;
        pt.c cVar = (pt.c) this.f95574f.get();
        if (cVar != null) {
            cVar.dispose();
        }
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95572c.apply(obj), "The publisher supplied is null");
            g2 g2Var = new g2(this, j10, obj);
            AtomicReference atomicReference = this.f95574f;
            while (!atomicReference.compareAndSet(cVar, g2Var)) {
                if (atomicReference.get() != cVar) {
                    return;
                }
            }
            bVar.subscribe(g2Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            this.f95571b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95573e, dVar)) {
            this.f95573e = dVar;
            this.f95571b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }
}
