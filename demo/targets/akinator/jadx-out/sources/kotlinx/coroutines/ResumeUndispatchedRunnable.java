package kotlinx.coroutines;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ResumeUndispatchedRunnable implements Runnable {
    private final CancellableContinuation<x0> continuation;
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(CoroutineDispatcher coroutineDispatcher, CancellableContinuation<? super x0> cancellableContinuation) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.resumeUndispatched(this.dispatcher, x0.f87415a);
    }
}
