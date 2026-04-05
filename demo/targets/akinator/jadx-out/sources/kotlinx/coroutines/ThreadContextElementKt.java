package kotlinx.coroutines;

import kotlin.jvm.internal.b0;
import kotlinx.coroutines.internal.ThreadLocalElement;
import kotlinx.coroutines.internal.ThreadLocalKey;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ThreadContextElementKt {
    public static final <T> ThreadContextElement<T> asContextElement(ThreadLocal<T> threadLocal, T t10) {
        return new ThreadLocalElement(t10, threadLocal);
    }

    public static /* synthetic */ ThreadContextElement asContextElement$default(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    public static final Object ensurePresent(ThreadLocal<?> threadLocal, d<? super x0> dVar) {
        if (dVar.getContext().get(new ThreadLocalKey(threadLocal)) != null) {
            return x0.f87415a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + dVar.getContext()).toString());
    }

    private static final Object ensurePresent$$forInline(ThreadLocal<?> threadLocal, d<? super x0> dVar) {
        b0.mark(3);
        throw null;
    }

    public static final Object isPresent(ThreadLocal<?> threadLocal, d<? super Boolean> dVar) {
        return bv.b.boxBoolean(dVar.getContext().get(new ThreadLocalKey(threadLocal)) != null);
    }

    private static final Object isPresent$$forInline(ThreadLocal<?> threadLocal, d<? super Boolean> dVar) {
        b0.mark(3);
        throw null;
    }
}
