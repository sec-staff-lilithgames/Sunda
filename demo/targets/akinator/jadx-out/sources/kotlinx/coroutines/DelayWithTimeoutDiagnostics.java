package kotlinx.coroutines;

import av.e;
import kotlinx.coroutines.Delay;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface DelayWithTimeoutDiagnostics extends Delay {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @f
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j10, d<? super x0> dVar) {
            Object objDelay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j10, dVar);
            return objDelay == e.getCOROUTINE_SUSPENDED() ? objDelay : x0.f87415a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j10, Runnable runnable, m mVar) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j10, runnable, mVar);
        }
    }

    /* renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String m5130timeoutMessageLRDsOJo(long j10);
}
