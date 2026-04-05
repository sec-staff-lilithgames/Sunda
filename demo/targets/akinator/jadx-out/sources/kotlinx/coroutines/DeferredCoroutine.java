package kotlinx.coroutines;

import av.e;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.selects.SelectClause1;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(m mVar, boolean z10) {
        super(mVar, true, z10);
    }

    public static /* synthetic */ <T> Object await$suspendImpl(DeferredCoroutine<T> deferredCoroutine, d<? super T> dVar) throws Throwable {
        Object objAwaitInternal = deferredCoroutine.awaitInternal(dVar);
        e.getCOROUTINE_SUSPENDED();
        return objAwaitInternal;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(d<? super T> dVar) {
        return await$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        SelectClause1<T> selectClause1 = (SelectClause1<T>) getOnAwaitInternal();
        e0.checkNotNull(selectClause1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return selectClause1;
    }
}
