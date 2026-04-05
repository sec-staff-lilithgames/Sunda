package o5;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ThreadContextElementKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o1 {
    public static final Object a(y0 y0Var, zu.m mVar, kv.p pVar, zu.d dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            y0Var.getTransactionExecutor().execute(new l1(mVar, cancellableContinuationImpl, y0Var, pVar));
        } catch (RejectedExecutionException e10) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final zu.m access$createTransactionContext(y0 y0Var, zu.g gVar) {
        d2 d2Var = new d2(gVar);
        return gVar.plus(d2Var).plus(ThreadContextElementKt.asContextElement(y0Var.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(d2Var))));
    }

    @tu.f
    public static final Flow<Set<String>> invalidationTrackerFlow(y0 y0Var, String[] tables, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        return y0Var.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tables, tables.length), z10);
    }

    public static /* synthetic */ Flow invalidationTrackerFlow$default(y0 y0Var, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return f1.invalidationTrackerFlow(y0Var, strArr, z10);
    }

    public static final <R> Object withTransaction(y0 y0Var, kv.l lVar, zu.d<? super R> dVar) {
        return f1.withTransactionContext(y0Var, new m1(y0Var, lVar, null), dVar);
    }

    public static final <R> Object withTransactionContext(y0 y0Var, kv.l lVar, zu.d<? super R> dVar) {
        n1 n1Var = new n1(lVar, null);
        d2 d2Var = (d2) dVar.getContext().get(d2.f77529e);
        zu.g transactionDispatcher$room_runtime_release = d2Var != null ? d2Var.getTransactionDispatcher$room_runtime_release() : null;
        return transactionDispatcher$room_runtime_release != null ? BuildersKt.withContext(transactionDispatcher$room_runtime_release, n1Var, dVar) : a(y0Var, dVar.getContext(), n1Var, dVar);
    }
}
