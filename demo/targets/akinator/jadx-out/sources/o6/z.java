package o6;

import hr.kNq.ikJMrW;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CancellableContinuation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final sh.n1 f77998b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellableContinuation f77999c;

    public final CancellableContinuation<Object> getContinuation() {
        return this.f77999c;
    }

    public final sh.n1 getFutureToObserve() {
        return this.f77998b;
    }

    @Override // java.lang.Runnable
    public void run() {
        sh.n1 n1Var = this.f77998b;
        boolean zIsCancelled = n1Var.isCancelled();
        CancellableContinuation cancellableContinuation = this.f77999c;
        if (zIsCancelled) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            return;
        }
        try {
            int i10 = tu.z.f87419c;
            cancellableContinuation.resumeWith(tu.z.m7131constructorimpl(n1.access$getUninterruptibly(n1Var)));
        } catch (ExecutionException e10) {
            int i11 = tu.z.f87419c;
            cancellableContinuation.resumeWith(tu.z.m7131constructorimpl(tu.a0.createFailure(n1.access$nonNullCause(e10))));
        }
    }

    public z(sh.n1 futureToObserve, CancellableContinuation<Object> cancellableContinuation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(futureToObserve, "futureToObserve");
        kotlin.jvm.internal.e0.checkNotNullParameter(cancellableContinuation, ikJMrW.EdcyK);
        this.f77998b = futureToObserve;
        this.f77999c = cancellableContinuation;
    }
}
