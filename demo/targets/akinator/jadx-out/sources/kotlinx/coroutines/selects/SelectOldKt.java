package kotlinx.coroutines.selects;

import av.e;
import bv.h;
import kotlin.jvm.internal.b0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kv.l;
import tu.a0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(CancellableContinuation<? super T> cancellableContinuation, T t10) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, t10);
        } else {
            cancellableContinuation.resumeWith(z.m7131constructorimpl(t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(CancellableContinuation<?> cancellableContinuation, Throwable th2) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th2);
        } else {
            int i10 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
        }
    }

    public static final <R> Object selectOld(l lVar, d<? super R> dVar) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(dVar);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th2) {
            selectBuilderImpl.handleBuilderException(th2);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    private static final <R> Object selectOld$$forInline(l lVar, d<? super R> dVar) {
        b0.mark(0);
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(dVar);
        try {
            lVar.invoke(selectBuilderImpl);
        } catch (Throwable th2) {
            selectBuilderImpl.handleBuilderException(th2);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        b0.mark(1);
        return result;
    }

    public static final <R> Object selectUnbiasedOld(l lVar, d<? super R> dVar) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(dVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th2) {
            unbiasedSelectBuilderImpl.handleBuilderException(th2);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return objInitSelectResult;
    }

    private static final <R> Object selectUnbiasedOld$$forInline(l lVar, d<? super R> dVar) {
        b0.mark(0);
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(dVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th2) {
            unbiasedSelectBuilderImpl.handleBuilderException(th2);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        b0.mark(1);
        return objInitSelectResult;
    }
}
