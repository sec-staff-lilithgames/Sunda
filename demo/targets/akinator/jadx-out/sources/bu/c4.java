package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c4 extends mt.b0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f10165b;

    public c4(Callable<Object> callable) {
        this.f10165b = callable;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return ut.o0.requireNonNull(this.f10165b.call(), "The callable returned a null value");
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        wt.l lVar = new wt.l(i0Var);
        i0Var.onSubscribe(lVar);
        if (lVar.isDisposed()) {
            return;
        }
        try {
            lVar.complete(ut.o0.requireNonNull(this.f10165b.call(), "Callable returned null"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (lVar.isDisposed()) {
                mu.a.onError(th2);
            } else {
                i0Var.onError(th2);
            }
        }
    }
}
