package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g3 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f10349b;

    public g3(Callable<? extends Throwable> callable) {
        this.f10349b = callable;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            th = (Throwable) ut.o0.requireNonNull(this.f10349b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            qt.d.throwIfFatal(th);
        }
        tt.e.error(th, i0Var);
    }
}
