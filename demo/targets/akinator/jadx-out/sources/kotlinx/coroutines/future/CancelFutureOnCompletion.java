package kotlinx.coroutines.future;

import java.util.concurrent.Future;
import kotlinx.coroutines.JobNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class CancelFutureOnCompletion extends JobNode {
    private final Future<?> future;

    public CancelFutureOnCompletion(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th2) {
        if (th2 == null || this.future.isDone()) {
            return;
        }
        this.future.cancel(false);
    }
}
