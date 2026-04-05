package kotlinx.coroutines.internal;

import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(a.b.e(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final CoroutineDispatcher namedOrThis(CoroutineDispatcher coroutineDispatcher, String str) {
        return str != null ? new NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}
