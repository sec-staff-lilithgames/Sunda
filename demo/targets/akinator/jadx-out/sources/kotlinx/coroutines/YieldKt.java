package kotlinx.coroutines;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class YieldKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object yield(zu.d<? super tu.x0> r4) {
        /*
            zu.m r0 = r4.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            zu.d r1 = av.b.intercepted(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r2 == 0) goto L12
            kotlinx.coroutines.internal.DispatchedContinuation r1 = (kotlinx.coroutines.internal.DispatchedContinuation) r1
            goto L13
        L12:
            r1 = 0
        L13:
            tu.x0 r2 = tu.x0.f87415a
            if (r1 != 0) goto L19
        L17:
            r0 = r2
            goto L44
        L19:
            kotlinx.coroutines.CoroutineDispatcher r3 = r1.dispatcher
            boolean r3 = kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(r3, r0)
            if (r3 == 0) goto L25
            r1.dispatchYield$kotlinx_coroutines_core(r0, r2)
            goto L40
        L25:
            kotlinx.coroutines.YieldContext r3 = new kotlinx.coroutines.YieldContext
            r3.<init>()
            zu.m r0 = r0.plus(r3)
            r1.dispatchYield$kotlinx_coroutines_core(r0, r2)
            boolean r0 = r3.dispatcherWasUnconfined
            if (r0 == 0) goto L40
            boolean r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r1)
            if (r0 == 0) goto L17
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            goto L44
        L40:
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
        L44:
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L4d
            bv.h.probeCoroutineSuspended(r4)
        L4d:
            java.lang.Object r4 = av.e.getCOROUTINE_SUSPENDED()
            if (r0 != r4) goto L54
            return r0
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.YieldKt.yield(zu.d):java.lang.Object");
    }
}
