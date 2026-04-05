package kotlinx.coroutines.intrinsics;

import av.b;
import av.e;
import bv.a;
import bv.h;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kv.p;
import tu.a0;
import tu.k;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UndispatchedKt {
    private static final Void dispatchExceptionAndMakeCompleting(ScopeCoroutine<?> scopeCoroutine, DispatchException dispatchException) throws Throwable {
        scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    private static final boolean notOwnTimeout(ScopeCoroutine<?> scopeCoroutine, Throwable th2) {
        return ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == scopeCoroutine) ? false : true;
    }

    public static final <R, T> void startCoroutineUndispatched(p pVar, R r10, d<? super T> dVar) {
        d dVarProbeCoroutineCreated = h.probeCoroutineCreated(dVar);
        try {
            m context = dVarProbeCoroutineCreated.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                h.probeCoroutineResumed(dVarProbeCoroutineCreated);
                Object objWrapWithContinuationImpl = !(pVar instanceof a) ? b.wrapWithContinuationImpl(pVar, r10, dVarProbeCoroutineCreated) : ((p) h1.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r10, dVarProbeCoroutineCreated);
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                if (objWrapWithContinuationImpl != e.getCOROUTINE_SUSPENDED()) {
                    dVarProbeCoroutineCreated.resumeWith(z.m7131constructorimpl(objWrapWithContinuationImpl));
                }
            } catch (Throwable th2) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            int i10 = z.f87419c;
            dVarProbeCoroutineCreated.resumeWith(z.m7131constructorimpl(a0.createFailure(th)));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(ScopeCoroutine<? super T> scopeCoroutine, R r10, p pVar) {
        return startUndspatched(scopeCoroutine, true, r10, pVar);
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine<? super T> scopeCoroutine, R r10, p pVar) {
        return startUndspatched(scopeCoroutine, false, r10, pVar);
    }

    private static final <T, R> Object startUndspatched(ScopeCoroutine<? super T> scopeCoroutine, boolean z10, R r10, p pVar) throws Throwable {
        Object completedExceptionally;
        try {
            completedExceptionally = !(pVar instanceof a) ? b.wrapWithContinuationImpl(pVar, r10, scopeCoroutine) : ((p) h1.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r10, scopeCoroutine);
        } catch (DispatchException e10) {
            dispatchExceptionAndMakeCompleting(scopeCoroutine, e10);
            throw new k();
        } catch (Throwable th2) {
            completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        }
        if (completedExceptionally == e.getCOROUTINE_SUSPENDED()) {
            return e.getCOROUTINE_SUSPENDED();
        }
        Object objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally);
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return e.getCOROUTINE_SUSPENDED();
        }
        scopeCoroutine.afterCompletionUndispatched();
        if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
            return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        if (z10 || notOwnTimeout(scopeCoroutine, ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause)) {
            throw ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
        }
        if (completedExceptionally instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) completedExceptionally).cause;
        }
        return completedExceptionally;
    }
}
