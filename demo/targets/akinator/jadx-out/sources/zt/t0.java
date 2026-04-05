package zt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f98777b;

    public t0(Callable<? extends Throwable> callable) {
        this.f98777b = callable;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        vVar.onSubscribe(pt.d.disposed());
        try {
            th = (Throwable) ut.o0.requireNonNull(this.f98777b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            qt.d.throwIfFatal(th);
        }
        vVar.onError(th);
    }
}
