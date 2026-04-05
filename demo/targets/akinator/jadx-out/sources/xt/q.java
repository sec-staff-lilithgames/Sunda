package xt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f93476b;

    public q(Callable<? extends mt.i> callable) {
        this.f93476b = callable;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        try {
            ((mt.i) ut.o0.requireNonNull(this.f93476b.call(), "The completableSupplier returned a null CompletableSource")).subscribe(fVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, fVar);
        }
    }
}
