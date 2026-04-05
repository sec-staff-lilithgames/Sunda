package kotlinx.coroutines.intrinsics;

import av.b;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kv.a;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(d<?> dVar, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        int i10 = z.f87419c;
        dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
        throw th2;
    }

    private static final void runSafely(d<?> dVar, a aVar) throws Throwable {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            dispatcherFailure(dVar, th2);
        }
    }

    public static final <T> void startCoroutineCancellable(l lVar, d<? super T> dVar) throws Throwable {
        try {
            d dVarIntercepted = b.intercepted(b.createCoroutineUnintercepted(lVar, dVar));
            int i10 = z.f87419c;
            DispatchedContinuationKt.resumeCancellableWith(dVarIntercepted, z.m7131constructorimpl(x0.f87415a));
        } catch (Throwable th2) {
            dispatcherFailure(dVar, th2);
        }
    }

    public static final <R, T> void startCoroutineCancellable(p pVar, R r10, d<? super T> dVar) {
        try {
            d dVarIntercepted = b.intercepted(b.createCoroutineUnintercepted(pVar, r10, dVar));
            int i10 = z.f87419c;
            DispatchedContinuationKt.resumeCancellableWith(dVarIntercepted, z.m7131constructorimpl(x0.f87415a));
        } catch (Throwable th2) {
            dispatcherFailure(dVar, th2);
        }
    }

    public static final void startCoroutineCancellable(d<? super x0> dVar, d<?> dVar2) throws Throwable {
        try {
            d dVarIntercepted = b.intercepted(dVar);
            int i10 = z.f87419c;
            DispatchedContinuationKt.resumeCancellableWith(dVarIntercepted, z.m7131constructorimpl(x0.f87415a));
        } catch (Throwable th2) {
            dispatcherFailure(dVar2, th2);
        }
    }
}
