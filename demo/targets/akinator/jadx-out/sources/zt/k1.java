package zt;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k1 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98671b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98672c;

    public k1(mt.q0 q0Var, st.o oVar) {
        this.f98671b = q0Var;
        this.f98672c = oVar;
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
        this.f98671b.onError(new NoSuchElementException());
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98671b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98671b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            mt.t0 t0Var = (mt.t0) ut.o0.requireNonNull(this.f98672c.apply(obj), "The mapper returned a null SingleSource");
            if (isDisposed()) {
                return;
            }
            t0Var.subscribe(new l1(this, this.f98671b));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            onError(th2);
        }
    }
}
