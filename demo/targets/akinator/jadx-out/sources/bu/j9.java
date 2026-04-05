package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j9 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10468b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10469c;

    public j9(Object obj, st.o oVar) {
        this.f10468b = obj;
        this.f10469c = oVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10469c.apply(this.f10468b), "The mapper returned a null ObservableSource");
            if (!(g0Var instanceof Callable)) {
                g0Var.subscribe(i0Var);
                return;
            }
            try {
                Object objCall = ((Callable) g0Var).call();
                if (objCall == null) {
                    tt.e.complete(i0Var);
                    return;
                }
                i9 i9Var = new i9(i0Var, objCall);
                i0Var.onSubscribe(i9Var);
                i9Var.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                tt.e.error(th2, i0Var);
            }
        } catch (Throwable th3) {
            tt.e.error(th3, i0Var);
        }
    }
}
