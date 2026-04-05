package kotlinx.coroutines;

import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class EventLoopKt {
    public static final EventLoop createEventLoop() {
        return new BlockingEventLoop(Thread.currentThread());
    }

    public static final boolean isIoDispatcherThread(Thread thread) {
        if (thread instanceof CoroutineScheduler.Worker) {
            return ((CoroutineScheduler.Worker) thread).isIo();
        }
        return false;
    }

    public static final void platformAutoreleasePool(kv.a aVar) {
        aVar.invoke();
    }

    public static final long processNextEventInCurrentThread() {
        EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (eventLoopCurrentOrNull$kotlinx_coroutines_core != null) {
            return eventLoopCurrentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof CoroutineScheduler.Worker) {
            return ((CoroutineScheduler.Worker) threadCurrentThread).runSingleTask();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
    }
}
