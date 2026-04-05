package zt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y1 extends mt.s implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f98836b;

    public y1(Runnable runnable) {
        this.f98836b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        this.f98836b.run();
        return null;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        pt.c cVarEmpty = pt.d.empty();
        vVar.onSubscribe(cVarEmpty);
        if (cVarEmpty.isDisposed()) {
            return;
        }
        try {
            this.f98836b.run();
            if (cVarEmpty.isDisposed()) {
                return;
            }
            vVar.onComplete();
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
