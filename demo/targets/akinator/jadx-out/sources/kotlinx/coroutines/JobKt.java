package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* loaded from: classes10.dex */
public final class JobKt {
    public static final CompletableJob Job(Job job) {
        return JobKt__JobKt.Job(job);
    }

    public static final void cancel(Job job, String str, Throwable th2) {
        JobKt__JobKt.cancel(job, str, th2);
    }

    public static final Object cancelAndJoin(Job job, d<? super x0> dVar) {
        return JobKt__JobKt.cancelAndJoin(job, dVar);
    }

    @f
    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final void ensureActive(Job job) {
        JobKt__JobKt.ensureActive(job);
    }

    public static final Job getJob(m mVar) {
        return JobKt__JobKt.getJob(mVar);
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z10, JobNode jobNode) {
        return JobKt__JobKt.invokeOnCompletion(job, z10, jobNode);
    }

    public static final boolean isActive(m mVar) {
        return JobKt__JobKt.isActive(mVar);
    }

    public static final void ensureActive(m mVar) {
        JobKt__JobKt.ensureActive(mVar);
    }

    public static final void cancel(m mVar, CancellationException cancellationException) {
        JobKt__JobKt.cancel(mVar, cancellationException);
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(job, cancellationException);
    }

    public static final void cancelChildren(m mVar, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(mVar, cancellationException);
    }
}
