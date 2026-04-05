package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52858b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52859c;

    public v0(mt.q0 q0Var, st.o oVar) {
        this.f52858b = q0Var;
        this.f52859c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52858b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f52858b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.q0 q0Var = this.f52858b;
        try {
            mt.t0 t0Var = (mt.t0) ut.o0.requireNonNull(this.f52859c.apply(obj), "The single returned by the mapper is null");
            if (isDisposed()) {
                return;
            }
            t0Var.subscribe(new u0(this, q0Var));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            q0Var.onError(th2);
        }
    }
}
