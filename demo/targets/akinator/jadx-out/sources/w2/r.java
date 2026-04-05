package w2;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {
    public static final Throwable access$nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            e0.throwNpe();
        }
        return cause;
    }

    public static final <T> Object await(n1 n1Var, zu.d<? super T> dVar) throws Throwable {
        try {
            if (n1Var.isDone()) {
                return i.g(n1Var);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
            n1Var.addListener(new t(n1Var, cancellableContinuationImpl), p.f90360b);
            cancellableContinuationImpl.invokeOnCancellation(new q(n1Var));
            Object result = cancellableContinuationImpl.getResult();
            if (result == av.e.getCOROUTINE_SUSPENDED()) {
                bv.h.probeCoroutineSuspended(dVar);
            }
            return result;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                e0.throwNpe();
            }
            throw cause;
        }
    }
}
