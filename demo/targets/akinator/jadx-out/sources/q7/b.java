package q7;

import kotlinx.coroutines.CancellableContinuationImpl;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final Object await(xv.j jVar, zu.d<? super v0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        o oVar = new o(jVar, cancellableContinuationImpl);
        jVar.enqueue(oVar);
        cancellableContinuationImpl.invokeOnCancellation(oVar);
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }
}
