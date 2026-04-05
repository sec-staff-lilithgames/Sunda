package bv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> zu.d<T> probeCoroutineCreated(zu.d<? super T> completion) {
        e0.checkNotNullParameter(completion, "completion");
        return completion;
    }

    public static final void probeCoroutineResumed(zu.d<?> frame) {
        e0.checkNotNullParameter(frame, "frame");
    }

    public static final void probeCoroutineSuspended(zu.d<?> frame) {
        e0.checkNotNullParameter(frame, "frame");
    }
}
