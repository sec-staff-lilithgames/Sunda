package kotlinx.coroutines;

import kotlinx.coroutines.internal.ScopeCoroutine;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class SupervisorCoroutine<T> extends ScopeCoroutine<T> {
    public SupervisorCoroutine(m mVar, d<? super T> dVar) {
        super(mVar, dVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th2) {
        return false;
    }
}
