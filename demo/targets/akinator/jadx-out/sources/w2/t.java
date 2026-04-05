package w2;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import sh.n1;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final n1 f90363b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellableContinuation f90364c;

    public t(n1 futureToObserve, CancellableContinuation<Object> continuation) {
        e0.checkParameterIsNotNull(futureToObserve, "futureToObserve");
        e0.checkParameterIsNotNull(continuation, "continuation");
        this.f90363b = futureToObserve;
        this.f90364c = continuation;
    }

    public final CancellableContinuation<Object> getContinuation() {
        return this.f90364c;
    }

    public final n1 getFutureToObserve() {
        return this.f90363b;
    }

    @Override // java.lang.Runnable
    public void run() {
        n1 n1Var = this.f90363b;
        boolean zIsCancelled = n1Var.isCancelled();
        CancellableContinuation cancellableContinuation = this.f90364c;
        if (zIsCancelled) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            return;
        }
        try {
            int i10 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(i.g(n1Var)));
        } catch (ExecutionException e10) {
            Throwable thAccess$nonNullCause = r.access$nonNullCause(e10);
            int i11 = z.f87419c;
            cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(thAccess$nonNullCause)));
        }
    }
}
