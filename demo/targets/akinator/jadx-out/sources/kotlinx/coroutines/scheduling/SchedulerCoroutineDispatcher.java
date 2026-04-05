package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    private final int corePoolSize;
    private CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;
    private final String schedulerName;

    public SchedulerCoroutineDispatcher() {
        this(0, 0, 0L, null, 15, null);
    }

    private final CoroutineScheduler createScheduler() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo5197dispatch(m mVar, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, runnable, false, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(Runnable runnable, boolean z10, boolean z11) {
        this.coroutineScheduler.dispatch(runnable, z10, z11);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(m mVar, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, runnable, false, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long j10) {
        this.coroutineScheduler.shutdown(j10);
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
        this.coroutineScheduler.shutdown(1000L);
        this.coroutineScheduler = createScheduler();
    }

    public /* synthetic */ SchedulerCoroutineDispatcher(int i10, int i11, long j10, String str, int i12, u uVar) {
        this((i12 & 1) != 0 ? TasksKt.CORE_POOL_SIZE : i10, (i12 & 2) != 0 ? TasksKt.MAX_POOL_SIZE : i11, (i12 & 4) != 0 ? TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public SchedulerCoroutineDispatcher(int i10, int i11, long j10, String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        this.coroutineScheduler = createScheduler();
    }
}
