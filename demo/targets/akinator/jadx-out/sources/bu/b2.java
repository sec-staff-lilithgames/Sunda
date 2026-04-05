package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b2 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f10111b;

    public b2(Callable<? extends mt.g0> callable) {
        this.f10111b = callable;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            ((mt.g0) ut.o0.requireNonNull(this.f10111b.call(), "null ObservableSource supplied")).subscribe(i0Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
