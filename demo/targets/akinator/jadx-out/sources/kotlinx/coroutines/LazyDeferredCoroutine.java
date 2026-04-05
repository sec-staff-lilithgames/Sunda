package kotlinx.coroutines;

import kotlinx.coroutines.intrinsics.CancellableKt;
import kv.p;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class LazyDeferredCoroutine<T> extends DeferredCoroutine<T> {
    private final d<x0> continuation;

    public LazyDeferredCoroutine(m mVar, p pVar) {
        super(mVar, false);
        this.continuation = av.b.createCoroutineUnintercepted(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }
}
