package kotlinx.coroutines;

import tu.a0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CompletionStateKt {
    public static final <T> Object recoverResult(Object obj, d<? super T> dVar) {
        if (!(obj instanceof CompletedExceptionally)) {
            return z.m7131constructorimpl(obj);
        }
        int i10 = z.f87419c;
        return z.m7131constructorimpl(a0.createFailure(((CompletedExceptionally) obj).cause));
    }

    public static final <T> Object toState(Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        return thM7134exceptionOrNullimpl == null ? obj : new CompletedExceptionally(thM7134exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        return thM7134exceptionOrNullimpl == null ? obj : new CompletedExceptionally(thM7134exceptionOrNullimpl, false, 2, null);
    }
}
