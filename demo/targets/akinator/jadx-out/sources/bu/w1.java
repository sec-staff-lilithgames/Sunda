package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w1 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f11147b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11148c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11149e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f11150f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public volatile long f11151g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11152h;

    public w1(ku.m mVar, st.o oVar) {
        this.f11147b = mVar;
        this.f11148c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11149e.dispose();
        tt.d.dispose(this.f11150f);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11149e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11152h) {
            return;
        }
        this.f11152h = true;
        AtomicReference atomicReference = this.f11150f;
        pt.c cVar = (pt.c) atomicReference.get();
        if (cVar != tt.d.f87352b) {
            v1 v1Var = (v1) cVar;
            if (v1Var != null) {
                v1Var.a();
            }
            tt.d.dispose(atomicReference);
            this.f11147b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f11150f);
        this.f11147b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11152h) {
            return;
        }
        long j10 = this.f11151g + 1;
        this.f11151g = j10;
        pt.c cVar = (pt.c) this.f11150f.get();
        if (cVar != null) {
            cVar.dispose();
        }
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f11148c.apply(obj), "The ObservableSource supplied is null");
            v1 v1Var = new v1(this, j10, obj);
            AtomicReference atomicReference = this.f11150f;
            while (!atomicReference.compareAndSet(cVar, v1Var)) {
                if (atomicReference.get() != cVar) {
                    return;
                }
            }
            g0Var.subscribe(v1Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            dispose();
            this.f11147b.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11149e, cVar)) {
            this.f11149e = cVar;
            this.f11147b.onSubscribe(this);
        }
    }
}
