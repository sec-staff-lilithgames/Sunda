package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e2 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52718b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52719c;

    public e2(mt.q0 q0Var, st.o oVar) {
        this.f52718b = q0Var;
        this.f52719c = oVar;
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
        mt.q0 q0Var = this.f52718b;
        try {
            ((mt.t0) ut.o0.requireNonNull(this.f52719c.apply(th2), "The nextFunction returned a null SingleSource.")).subscribe(new wt.v(this, q0Var));
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            q0Var.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f52718b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52718b.onSuccess(obj);
    }
}
