package kotlinx.coroutines;

import av.e;
import bv.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kv.p;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutineScopeKt {
    public static final CoroutineScope CoroutineScope(m mVar) {
        if (mVar.get(Job.Key) == null) {
            mVar = mVar.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        }
        return new ContextScope(mVar);
    }

    public static final CoroutineScope MainScope() {
        return new ContextScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    }

    public static final void cancel(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        cancel(coroutineScope, cancellationException);
    }

    public static final <R> Object coroutineScope(p pVar, d<? super R> dVar) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(dVar.getContext(), dVar);
        Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pVar);
        if (objStartUndispatchedOrReturn == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return objStartUndispatchedOrReturn;
    }

    public static final Object currentCoroutineContext(d<? super m> dVar) {
        return dVar.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(d<? super m> dVar) {
        b0.mark(3);
        throw null;
    }

    public static final void ensureActive(CoroutineScope coroutineScope) {
        JobKt.ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final boolean isActive(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final CoroutineScope plus(CoroutineScope coroutineScope, m mVar) {
        return new ContextScope(coroutineScope.getCoroutineContext().plus(mVar));
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        cancel(coroutineScope, str, th2);
    }

    public static final void cancel(CoroutineScope coroutineScope, String str, Throwable th2) {
        cancel(coroutineScope, ExceptionsKt.CancellationException(str, th2));
    }

    public static /* synthetic */ void isActive$annotations(CoroutineScope coroutineScope) {
    }
}
