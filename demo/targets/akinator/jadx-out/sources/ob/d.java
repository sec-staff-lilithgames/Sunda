package ob;

import av.e;
import bv.h;
import kotlinx.coroutines.CancellableContinuationImpl;
import xv.j;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class d {
    public static final Object await(j jVar, zu.d<? super v0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        jVar.enqueue(new b(cancellableContinuationImpl));
        cancellableContinuationImpl.invokeOnCancellation(new c(jVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }
}
