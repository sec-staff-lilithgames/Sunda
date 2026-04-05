package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class EventLoopImplPlatform extends EventLoop {
    public abstract Thread getThread();

    public void reschedule(long j10, EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.INSTANCE.schedule(j10, delayedTask);
    }

    public final void unpark() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
            if (abstractTimeSource != null) {
                abstractTimeSource.unpark(thread);
            } else {
                LockSupport.unpark(thread);
            }
        }
    }
}
