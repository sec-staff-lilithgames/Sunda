package kotlinx.coroutines;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import uu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private u unconfinedQueue;
    private long useCount;

    public static /* synthetic */ void decrementUseCount$default(EventLoop eventLoop, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        eventLoop.decrementUseCount(z10);
    }

    private final long delta(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(EventLoop eventLoop, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        eventLoop.incrementUseCount(z10);
    }

    public final void decrementUseCount(boolean z10) {
        long jDelta = this.useCount - delta(z10);
        this.useCount = jDelta;
        if (jDelta <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(DispatchedTask<?> dispatchedTask) {
        u uVar = this.unconfinedQueue;
        if (uVar == null) {
            uVar = new u();
            this.unconfinedQueue = uVar;
        }
        uVar.addLast(dispatchedTask);
    }

    public long getNextTime() {
        u uVar = this.unconfinedQueue;
        return (uVar == null || uVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void incrementUseCount(boolean z10) {
        this.useCount += delta(z10);
        if (z10) {
            return;
        }
        this.shared = true;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    public boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public final boolean isUnconfinedLoopActive() {
        return this.useCount >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        u uVar = this.unconfinedQueue;
        if (uVar != null) {
            return uVar.isEmpty();
        }
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i10, String str) {
        LimitedDispatcherKt.checkParallelism(i10);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        DispatchedTask dispatchedTask;
        u uVar = this.unconfinedQueue;
        if (uVar == null || (dispatchedTask = (DispatchedTask) uVar.removeFirstOrNull()) == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
