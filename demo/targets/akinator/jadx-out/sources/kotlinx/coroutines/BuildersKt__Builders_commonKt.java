package kotlinx.coroutines;

import av.e;
import bv.h;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kv.p;
import zu.d;
import zu.f;
import zu.m;
import zu.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar) {
        m mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, mVar);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart.isLazy() ? new LazyDeferredCoroutine(mVarNewCoroutineContext, pVar) : new DeferredCoroutine(mVarNewCoroutineContext, true);
        ((AbstractCoroutine) lazyDeferredCoroutine).start(coroutineStart, lazyDeferredCoroutine, pVar);
        return (Deferred<T>) lazyDeferredCoroutine;
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.async(coroutineScope, mVar, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        return BuildersKt.withContext(coroutineDispatcher, pVar, dVar);
    }

    private static final <T> Object invoke$$forInline(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        b0.mark(0);
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, pVar, dVar);
        b0.mark(1);
        return objWithContext;
    }

    public static final Job launch(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar) {
        m mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, mVar);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.isLazy() ? new LazyStandaloneCoroutine(mVarNewCoroutineContext, pVar) : new StandaloneCoroutine(mVarNewCoroutineContext, true);
        lazyStandaloneCoroutine.start(coroutineStart, lazyStandaloneCoroutine, pVar);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.launch(coroutineScope, mVar, coroutineStart, pVar);
    }

    public static final <T> Object withContext(m mVar, p pVar, d<? super T> dVar) {
        Object result$kotlinx_coroutines_core;
        m context = dVar.getContext();
        m mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, mVar);
        JobKt.ensureActive(mVarNewCoroutineContext);
        if (mVarNewCoroutineContext == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(mVarNewCoroutineContext, dVar);
            result$kotlinx_coroutines_core = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pVar);
        } else {
            f fVar = f.f98853b;
            if (e0.areEqual(mVarNewCoroutineContext.get(fVar), context.get(fVar))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(mVarNewCoroutineContext, dVar);
                m context2 = undispatchedCoroutine.getContext();
                Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
                try {
                    Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, pVar);
                    ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    result$kotlinx_coroutines_core = objStartUndispatchedOrReturn;
                } catch (Throwable th2) {
                    ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    throw th2;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(mVarNewCoroutineContext, dVar);
                CancellableKt.startCoroutineCancellable(pVar, dispatchedCoroutine, dispatchedCoroutine);
                result$kotlinx_coroutines_core = dispatchedCoroutine.getResult$kotlinx_coroutines_core();
            }
        }
        if (result$kotlinx_coroutines_core == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result$kotlinx_coroutines_core;
    }
}
