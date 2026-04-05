package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class za {
    public static <T, U> mt.l scalarXMap(T t10, st.o oVar) {
        return mu.a.onAssembly(new ya(t10, oVar));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(tw.b bVar, tw.c cVar, st.o oVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) bVar).call();
            if (objCall == null) {
                hu.d.complete(cVar);
                return true;
            }
            try {
                tw.b bVar2 = (tw.b) ut.o0.requireNonNull(oVar.apply(objCall), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object objCall2 = ((Callable) bVar2).call();
                        if (objCall2 == null) {
                            hu.d.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new hu.e(cVar, objCall2));
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        hu.d.error(th2, cVar);
                        return true;
                    }
                } else {
                    bVar2.subscribe(cVar);
                }
                return true;
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                hu.d.error(th3, cVar);
                return true;
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            hu.d.error(th4, cVar);
            return true;
        }
    }
}
