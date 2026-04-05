package du;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f52746b;

    public i(Callable<? extends mt.t0> callable) {
        this.f52746b = callable;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        try {
            ((mt.t0) ut.o0.requireNonNull(this.f52746b.call(), "The singleSupplier returned a null SingleSource")).subscribe(q0Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, q0Var);
        }
    }
}
