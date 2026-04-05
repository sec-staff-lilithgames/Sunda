package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k9 {
    public static <T, U> mt.b0 scalarXMap(T t10, st.o oVar) {
        return mu.a.onAssembly(new j9(t10, oVar));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(mt.g0 g0Var, mt.i0 i0Var, st.o oVar) {
        if (!(g0Var instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) g0Var).call();
            if (objCall == null) {
                tt.e.complete(i0Var);
                return true;
            }
            try {
                mt.g0 g0Var2 = (mt.g0) ut.o0.requireNonNull(oVar.apply(objCall), "The mapper returned a null ObservableSource");
                if (g0Var2 instanceof Callable) {
                    try {
                        Object objCall2 = ((Callable) g0Var2).call();
                        if (objCall2 == null) {
                            tt.e.complete(i0Var);
                            return true;
                        }
                        i9 i9Var = new i9(i0Var, objCall2);
                        i0Var.onSubscribe(i9Var);
                        i9Var.run();
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        tt.e.error(th2, i0Var);
                        return true;
                    }
                } else {
                    g0Var2.subscribe(i0Var);
                }
                return true;
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                tt.e.error(th3, i0Var);
                return true;
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            tt.e.error(th4, i0Var);
            return true;
        }
    }
}
