package du;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i1 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f52749b;

    public i1(Callable<Object> callable) {
        this.f52749b = callable;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        pt.c cVarEmpty = pt.d.empty();
        q0Var.onSubscribe(cVarEmpty);
        if (cVarEmpty.isDisposed()) {
            return;
        }
        try {
            Object objRequireNonNull = ut.o0.requireNonNull(this.f52749b.call(), "The callable returned a null value");
            if (cVarEmpty.isDisposed()) {
                return;
            }
            q0Var.onSuccess(objRequireNonNull);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (cVarEmpty.isDisposed()) {
                mu.a.onError(th2);
            } else {
                q0Var.onError(th2);
            }
        }
    }
}
