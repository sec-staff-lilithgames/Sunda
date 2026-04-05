package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class DispatcherExecutor implements Executor {
    public final CoroutineDispatcher dispatcher;

    public DispatcherExecutor(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        n nVar = n.f98854b;
        if (DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, nVar)) {
            DispatchedContinuationKt.safeDispatch(this.dispatcher, nVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
