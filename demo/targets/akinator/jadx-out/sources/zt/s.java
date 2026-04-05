package zt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f98764b;

    public s(Callable<? extends mt.y> callable) {
        this.f98764b = callable;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        try {
            ((mt.y) ut.o0.requireNonNull(this.f98764b.call(), "The maybeSupplier returned a null MaybeSource")).subscribe(vVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, vVar);
        }
    }
}
