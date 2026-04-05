package kotlinx.coroutines;

import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import tu.e0;
import tu.v;
import zu.d;
import zu.f;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<v> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(m mVar, d<? super T> dVar) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.INSTANCE;
        super(mVar.get(undispatchedMarker) == null ? mVar.plus(undispatchedMarker) : mVar, dVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (dVar.getContext().get(f.f98853b) instanceof CoroutineDispatcher) {
            return;
        }
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(mVar, null);
        ThreadContextKt.restoreThreadContext(mVar, objUpdateThreadContext);
        saveThreadContext(mVar, objUpdateThreadContext);
    }

    private final void clearThreadLocal() {
        if (this.threadLocalIsSet) {
            v vVar = this.threadStateToRecover.get();
            if (vVar != null) {
                ThreadContextKt.restoreThreadContext((m) vVar.component1(), vVar.component2());
            }
            this.threadStateToRecover.remove();
        }
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterCompletionUndispatched() {
        clearThreadLocal();
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        clearThreadLocal();
        Object objRecoverResult = CompletionStateKt.recoverResult(obj, this.uCont);
        d<T> dVar = this.uCont;
        m context = dVar.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        } catch (Throwable th2) {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
            throw th2;
        }
    }

    public final boolean clearThreadContext() {
        boolean z10 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z10;
    }

    public final void saveThreadContext(m mVar, Object obj) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(e0.to(mVar, obj));
    }
}
