package kotlinx.coroutines;

import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class StandaloneCoroutine extends AbstractCoroutine<x0> {
    public StandaloneCoroutine(m mVar, boolean z10) {
        super(mVar, true, z10);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean handleJobException(Throwable th2) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
        return true;
    }
}
