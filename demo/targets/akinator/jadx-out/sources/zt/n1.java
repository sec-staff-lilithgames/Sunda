package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n1 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98702b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98703c;

    public n1(mt.v vVar, st.o oVar) {
        this.f98702b = vVar;
        this.f98703c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98702b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98702b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98702b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            ((mt.t0) ut.o0.requireNonNull(this.f98703c.apply(obj), "The mapper returned a null SingleSource")).subscribe(new o1(this, this.f98702b));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            onError(th2);
        }
    }
}
