package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.EventLoopImplBase;
import qv.v;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;
    private static final int FRESH = 0;
    public static final DefaultExecutor INSTANCE;
    private static final long KEEP_ALIVE_NANOS;
    private static final int SHUTDOWN = 4;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l9;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        INSTANCE = defaultExecutor;
        EventLoop.incrementUseCount$default(defaultExecutor, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l9.longValue());
    }

    private DefaultExecutor() {
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
        if (isShutdownRequested()) {
            debugStatus = 3;
            resetAll();
            e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread createThreadSync() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, THREAD_NAME);
            _thread = thread;
            thread.setContextClassLoader(INSTANCE.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean isShutDown() {
        return debugStatus == 4;
    }

    private final boolean isShutdownRequested() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean notifyStartup() {
        if (isShutdownRequested()) {
            return false;
        }
        debugStatus = 1;
        e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void shutdownError() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(Runnable runnable) {
        if (isShutDown()) {
            shutdownError();
        }
        super.enqueue(runnable);
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
        debugStatus = 0;
        createThreadSync();
        while (debugStatus == 0) {
            e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? createThreadSync() : thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j10, Runnable runnable, m mVar) {
        return scheduleInvokeOnTimeout(j10, runnable);
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
        return _thread != null;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    public void reschedule(long j10, EventLoopImplBase.DelayedTask delayedTask) {
        shutdownError();
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadLocalEventLoop.INSTANCE.setEventLoop$kotlinx_coroutines_core(this);
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.registerTimeLoopThread();
        }
        try {
            if (!notifyStartup()) {
                _thread = null;
                acknowledgeShutdownIfNeeded();
                AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource2 != null) {
                    abstractTimeSource2.unregisterTimeLoopThread();
                }
                if (isEmpty()) {
                    return;
                }
                getThread();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jProcessNextEvent = processNextEvent();
                if (jProcessNextEvent == Long.MAX_VALUE) {
                    AbstractTimeSource abstractTimeSource3 = AbstractTimeSourceKt.timeSource;
                    long jNanoTime = abstractTimeSource3 != null ? abstractTimeSource3.nanoTime() : System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        acknowledgeShutdownIfNeeded();
                        AbstractTimeSource abstractTimeSource4 = AbstractTimeSourceKt.timeSource;
                        if (abstractTimeSource4 != null) {
                            abstractTimeSource4.unregisterTimeLoopThread();
                        }
                        if (isEmpty()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    jProcessNextEvent = v.coerceAtMost(jProcessNextEvent, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jProcessNextEvent > 0) {
                    if (isShutdownRequested()) {
                        _thread = null;
                        acknowledgeShutdownIfNeeded();
                        AbstractTimeSource abstractTimeSource5 = AbstractTimeSourceKt.timeSource;
                        if (abstractTimeSource5 != null) {
                            abstractTimeSource5.unregisterTimeLoopThread();
                        }
                        if (isEmpty()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    AbstractTimeSource abstractTimeSource6 = AbstractTimeSourceKt.timeSource;
                    if (abstractTimeSource6 != null) {
                        abstractTimeSource6.parkNanos(this, jProcessNextEvent);
                    } else {
                        LockSupport.parkNanos(this, jProcessNextEvent);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            acknowledgeShutdownIfNeeded();
            AbstractTimeSource abstractTimeSource7 = AbstractTimeSourceKt.timeSource;
            if (abstractTimeSource7 != null) {
                abstractTimeSource7.unregisterTimeLoopThread();
            }
            if (!isEmpty()) {
                getThread();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void shutdownForTests(long j10) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + j10;
            if (!isShutdownRequested()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
                    if (abstractTimeSource != null) {
                        abstractTimeSource.unpark(thread);
                    } else {
                        LockSupport.unpark(thread);
                    }
                }
                if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait(j10);
            }
            debugStatus = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DefaultExecutor";
    }

    private static /* synthetic */ void get_thread$annotations() {
    }
}
