package kotlinx.coroutines;

import av.e;
import bv.h;
import kotlin.jvm.internal.b0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kv.l;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CancellableContinuationKt {
    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, DisposableHandle disposableHandle) {
        invokeOnCancellation(cancellableContinuation, new DisposeOnCancel(disposableHandle));
    }

    public static final <T> CancellableContinuationImpl<T> getOrCreateCancellableContinuation(d<? super T> dVar) {
        if (!(dVar instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(dVar, 1);
        }
        CancellableContinuationImpl<T> cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) dVar).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new CancellableContinuationImpl<>(dVar, 2);
    }

    public static final <T> void invokeOnCancellation(CancellableContinuation<? super T> cancellableContinuation, CancelHandler cancelHandler) {
        if (!(cancellableContinuation instanceof CancellableContinuationImpl)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((CancellableContinuationImpl) cancellableContinuation).invokeOnCancellationInternal$kotlinx_coroutines_core(cancelHandler);
    }

    public static final <T> Object suspendCancellableCoroutine(l lVar, d<? super T> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        lVar.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(l lVar, d<? super T> dVar) {
        b0.mark(0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        lVar.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        b0.mark(1);
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(l lVar, d<? super T> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(av.b.intercepted(dVar));
        try {
            lVar.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return result;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(l lVar, d<? super T> dVar) {
        b0.mark(0);
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(av.b.intercepted(dVar));
        try {
            lVar.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            b0.mark(1);
            return result;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }
}
