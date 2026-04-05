package zt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u1 extends mt.s implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f98790b;

    public u1(Callable<Object> callable) {
        this.f98790b = callable;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f98790b.call();
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        pt.c cVarEmpty = pt.d.empty();
        vVar.onSubscribe(cVarEmpty);
        if (cVarEmpty.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f98790b.call();
            if (cVarEmpty.isDisposed()) {
                return;
            }
            if (objCall == null) {
                vVar.onComplete();
            } else {
                vVar.onSuccess(objCall);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (cVarEmpty.isDisposed()) {
                mu.a.onError(th2);
            } else {
                vVar.onError(th2);
            }
        }
    }
}
