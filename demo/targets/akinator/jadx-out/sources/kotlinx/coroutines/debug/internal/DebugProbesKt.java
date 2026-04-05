package kotlinx.coroutines.debug.internal;

import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DebugProbesKt {
    public static final <T> d<T> probeCoroutineCreated(d<? super T> dVar) {
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(dVar);
    }

    public static final void probeCoroutineResumed(d<?> dVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(dVar);
    }

    public static final void probeCoroutineSuspended(d<?> dVar) {
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(dVar);
    }
}
