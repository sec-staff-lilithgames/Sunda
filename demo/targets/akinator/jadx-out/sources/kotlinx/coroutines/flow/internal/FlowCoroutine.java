package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.ScopeCoroutine;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class FlowCoroutine<T> extends ScopeCoroutine<T> {
    public FlowCoroutine(m mVar, d<? super T> dVar) {
        super(mVar, dVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th2);
    }
}
