package o6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77949a;

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("WorkerWrapper");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f77949a = strTagWithPrefix;
    }

    public static final Object access$getUninterruptibly(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable access$nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        kotlin.jvm.internal.e0.checkNotNull(cause);
        return cause;
    }

    public static final <T> Object awaitWithin(sh.n1 n1Var, n6.b0 b0Var, zu.d<? super T> dVar) throws Throwable {
        Object obj;
        try {
            if (!n1Var.isDone()) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
                cancellableContinuationImpl.initCancellability();
                n1Var.addListener(new z(n1Var, cancellableContinuationImpl), n6.l.f75753b);
                cancellableContinuationImpl.invokeOnCancellation(new m1(b0Var, n1Var));
                Object result = cancellableContinuationImpl.getResult();
                if (result == av.e.getCOROUTINE_SUSPENDED()) {
                    bv.h.probeCoroutineSuspended(dVar);
                }
                return result;
            }
            boolean z10 = false;
            while (true) {
                try {
                    obj = n1Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            kotlin.jvm.internal.e0.checkNotNull(cause);
            throw cause;
        }
    }
}
