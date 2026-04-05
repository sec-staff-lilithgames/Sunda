package kotlinx.coroutines;

import av.e;
import bv.h;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Delay {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @f
        public static Object delay(Delay delay, long j10, d<? super x0> dVar) {
            x0 x0Var = x0.f87415a;
            if (j10 <= 0) {
                return x0Var;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
            cancellableContinuationImpl.initCancellability();
            delay.mo5198scheduleResumeAfterDelay(j10, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return result == e.getCOROUTINE_SUSPENDED() ? result : x0Var;
        }

        public static DisposableHandle invokeOnTimeout(Delay delay, long j10, Runnable runnable, m mVar) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j10, runnable, mVar);
        }
    }

    @f
    Object delay(long j10, d<? super x0> dVar);

    DisposableHandle invokeOnTimeout(long j10, Runnable runnable, m mVar);

    /* renamed from: scheduleResumeAfterDelay */
    void mo5198scheduleResumeAfterDelay(long j10, CancellableContinuation<? super x0> cancellableContinuation);
}
