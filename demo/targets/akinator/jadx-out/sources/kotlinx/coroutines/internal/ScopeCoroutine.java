package kotlinx.coroutines.internal;

import bv.e;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements e {
    public final d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(m mVar, d<? super T> dVar) {
        super(mVar, true, true);
        this.uCont = dVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        DispatchedContinuationKt.resumeCancellableWith(av.b.intercepted(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        d<T> dVar = this.uCont;
        dVar.resumeWith(CompletionStateKt.recoverResult(obj, dVar));
    }

    @Override // bv.e
    public final e getCallerFrame() {
        d<T> dVar = this.uCont;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // bv.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
        return true;
    }

    public void afterCompletionUndispatched() {
    }
}
