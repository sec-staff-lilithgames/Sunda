package kotlinx.coroutines.scheduling;

import cv.a;
import cv.b;
import io.ktor.util.date.GMTDateParser;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import kv.l;
import p0.o2;
import qv.v;
import tu.t;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int corePoolSize;
    public final GlobalQueue globalBlockingQueue;
    public final GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String schedulerName;
    public final ResizableAtomicArray<Worker> workers;
    public static final Companion Companion = new Companion(null);
    private static final /* synthetic */ AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater controlState$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _isTerminated$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Symbol NOT_IN_STACK = new Symbol("NOT_IN_STACK");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WorkerState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ WorkerState[] $VALUES;
        public static final WorkerState CPU_ACQUIRED = new WorkerState("CPU_ACQUIRED", 0);
        public static final WorkerState BLOCKING = new WorkerState("BLOCKING", 1);
        public static final WorkerState PARKING = new WorkerState("PARKING", 2);
        public static final WorkerState DORMANT = new WorkerState("DORMANT", 3);
        public static final WorkerState TERMINATED = new WorkerState("TERMINATED", 4);

        private static final /* synthetic */ WorkerState[] $values() {
            return new WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            WorkerState[] workerStateArr$values = $values();
            $VALUES = workerStateArr$values;
            $ENTRIES = b.enumEntries(workerStateArr$values);
        }

        private WorkerState(String str, int i10) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(o2.k(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(i.a(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(o2.k(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(o2.n(j10, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray<>((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
    }

    private final boolean addToGlobalQueue(Task task) {
        return task.taskContext ? this.globalBlockingQueue.addLast(task) : this.globalCpuQueue.addLast(task);
    }

    private final int blockingTasks(long j10) {
        return (int) ((j10 & BLOCKING_MASK) >> 21);
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = controlState$volatile$FU.get(this);
                int i10 = (int) (j10 & 2097151);
                int iCoerceAtLeast = v.coerceAtLeast(i10 - ((int) ((j10 & BLOCKING_MASK) >> 21)), 0);
                if (iCoerceAtLeast >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (getControlState$volatile$FU().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.get(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(this, i11);
                this.workers.setSynchronized(i11, worker);
                if (i11 != ((int) (2097151 & controlState$volatile$FU.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iCoerceAtLeast + 1;
                worker.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final int createdWorkers(long j10) {
        return (int) (j10 & 2097151);
    }

    private final Worker currentWorker() {
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !e0.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    private final void decrementBlockingTasks() {
        getControlState$volatile$FU().addAndGet(this, PARKED_VERSION_MASK);
    }

    private final int decrementCreatedWorkers() {
        return (int) (getControlState$volatile$FU().getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        coroutineScheduler.dispatch(runnable, z10, z11);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((controlState$volatile$FU.get(this) & CPU_PERMITS_MASK) >> 42);
    }

    private final /* synthetic */ long getControlState$volatile() {
        return this.controlState$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getControlState$volatile$FU() {
        return controlState$volatile$FU;
    }

    private final int getCreatedWorkers() {
        return (int) (getControlState$volatile$FU().get(this) & 2097151);
    }

    private final /* synthetic */ long getParkedWorkersStack$volatile() {
        return this.parkedWorkersStack$volatile;
    }

    private final /* synthetic */ int get_isTerminated$volatile() {
        return this._isTerminated$volatile;
    }

    private final long incrementBlockingTasks() {
        return controlState$volatile$FU.addAndGet(this, 2097152L);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$volatile$FU.incrementAndGet(this) & 2097151);
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int parkedWorkersStackNextIndex(Worker worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            Worker worker2 = (Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    private final Worker parkedWorkersStackPop() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            Worker worker = this.workers.get((int) (2097151 & j10));
            if (worker == null) {
                return null;
            }
            long j11 = (2097152 + j10) & PARKED_VERSION_MASK;
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(worker);
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$volatile$FU.compareAndSet(this, j10, iParkedWorkersStackNextIndex | j11)) {
                worker.setNextParkedWorker(NOT_IN_STACK);
                return worker;
            }
        }
    }

    private final long releaseCpuPermit() {
        return getControlState$volatile$FU().addAndGet(this, 4398046511104L);
    }

    private final /* synthetic */ void setControlState$volatile(long j10) {
        this.controlState$volatile = j10;
    }

    private final /* synthetic */ void setParkedWorkersStack$volatile(long j10) {
        this.parkedWorkersStack$volatile = j10;
    }

    private final /* synthetic */ void set_isTerminated$volatile(int i10) {
        this._isTerminated$volatile = i10;
    }

    private final void signalBlockingWork(long j10) {
        if (tryUnpark() || tryCreateWorker(j10)) {
            return;
        }
        tryUnpark();
    }

    private final Task submitToLocalQueue(Worker worker, Task task, boolean z10) {
        WorkerState workerState;
        if (worker == null || (workerState = worker.state) == WorkerState.TERMINATED) {
            return task;
        }
        if (!task.taskContext && workerState == WorkerState.BLOCKING) {
            return task;
        }
        worker.mayHaveLocalTasks = true;
        return worker.localQueue.add(task, z10);
    }

    private final boolean tryAcquireCpuPermit() {
        long j10;
        AtomicLongFieldUpdater controlState$volatile$FU2 = getControlState$volatile$FU();
        do {
            j10 = controlState$volatile$FU2.get(this);
            if (((int) ((CPU_PERMITS_MASK & j10) >> 42)) == 0) {
                return false;
            }
        } while (!getControlState$volatile$FU().compareAndSet(this, j10, j10 - 4398046511104L));
        return true;
    }

    private final boolean tryCreateWorker(long j10) {
        if (v.coerceAtLeast(((int) (2097151 & j10)) - ((int) ((j10 & BLOCKING_MASK) >> 21)), 0) < this.corePoolSize) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = controlState$volatile$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j10);
    }

    private final boolean tryUnpark() {
        Worker workerParkedWorkersStackPop;
        do {
            workerParkedWorkersStackPop = parkedWorkersStackPop();
            if (workerParkedWorkersStackPop == null) {
                return false;
            }
        } while (!Worker.workerCtl$volatile$FU.compareAndSet(workerParkedWorkersStackPop, -1, 0));
        LockSupport.unpark(workerParkedWorkersStackPop);
        return true;
    }

    public final int availableCpuPermits(long j10) {
        return (int) ((j10 & CPU_PERMITS_MASK) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        shutdown(10000L);
    }

    public final Task createTask(Runnable runnable, boolean z10) {
        long jNanoTime = TasksKt.schedulerTimeSource.nanoTime();
        if (!(runnable instanceof Task)) {
            return TasksKt.asTask(runnable, jNanoTime, z10);
        }
        Task task = (Task) runnable;
        task.submissionTime = jNanoTime;
        task.taskContext = z10;
        return task;
    }

    public final void dispatch(Runnable runnable, boolean z10, boolean z11) {
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.trackTask();
        }
        Task taskCreateTask = createTask(runnable, z10);
        boolean z12 = taskCreateTask.taskContext;
        long jAddAndGet = z12 ? controlState$volatile$FU.addAndGet(this, 2097152L) : 0L;
        Task taskSubmitToLocalQueue = submitToLocalQueue(currentWorker(), taskCreateTask, z11);
        if (taskSubmitToLocalQueue != null && !addToGlobalQueue(taskSubmitToLocalQueue)) {
            throw new RejectedExecutionException(j1.o2.o(new StringBuilder(), this.schedulerName, " was terminated"));
        }
        if (z12) {
            signalBlockingWork(jAddAndGet);
        } else {
            signalCpuWork();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch$default(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return _isTerminated$volatile$FU.get(this) == 1;
    }

    public final boolean parkedWorkersStackPush(Worker worker) {
        long j10;
        long j11;
        int indexInArray;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (2097152 + j10) & PARKED_VERSION_MASK;
            indexInArray = worker.getIndexInArray();
            worker.setNextParkedWorker(this.workers.get((int) (2097151 & j10)));
        } while (!parkedWorkersStack$volatile$FU.compareAndSet(this, j10, j11 | indexInArray));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(Worker worker, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iParkedWorkersStackNextIndex = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & PARKED_VERSION_MASK;
            if (iParkedWorkersStackNextIndex == i10) {
                iParkedWorkersStackNextIndex = i11 == 0 ? parkedWorkersStackNextIndex(worker) : i11;
            }
            if (iParkedWorkersStackNextIndex >= 0) {
                if (parkedWorkersStack$volatile$FU.compareAndSet(this, j10, j11 | iParkedWorkersStackNextIndex)) {
                    return;
                }
            }
        }
    }

    public final void runSafely(Task task) {
        try {
            task.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource != null) {
                    abstractTimeSource.unTrackTask();
                }
            } finally {
                AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource2 != null) {
                    abstractTimeSource2.unTrackTask();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void shutdown(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isTerminated$volatile$FU()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r7.currentWorker()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r7.workers
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getControlState$volatile$FU()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r4 = r7.workers
            java.lang.Object r4 = r4.get(r1)
            kotlin.jvm.internal.e0.checkNotNull(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            kotlinx.coroutines.scheduling.WorkQueue r4 = r4.localQueue
            kotlinx.coroutines.scheduling.GlobalQueue r5 = r7.globalBlockingQueue
            r4.offloadAllWorkTo(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalBlockingQueue
            r8.close()
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalCpuQueue
            r8.close()
        L57:
            if (r0 == 0) goto L5f
            kotlinx.coroutines.scheduling.Task r8 = r0.findTask(r2)
            if (r8 != 0) goto L8b
        L5f:
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r8 = (kotlinx.coroutines.scheduling.Task) r8
            if (r8 != 0) goto L8b
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r8 = (kotlinx.coroutines.scheduling.Task) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.tryReleaseCpu(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = getParkedWorkersStack$volatile$FU()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = getControlState$volatile$FU()
            r8.set(r7, r0)
            return
        L8b:
            r7.runSafely(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.shutdown(long):void");
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iCurrentLength = this.workers.currentLength();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iCurrentLength; i15++) {
            Worker worker = this.workers.get(i15);
            if (worker != null) {
                int size$kotlinx_coroutines_core = worker.localQueue.getSize$kotlinx_coroutines_core();
                int i16 = WhenMappings.$EnumSwitchMapping$0[worker.state.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(size$kotlinx_coroutines_core);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (size$kotlinx_coroutines_core > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(size$kotlinx_coroutines_core);
                        sb4.append(GMTDateParser.DAY_OF_MONTH);
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i16 != 5) {
                        throw new t();
                    }
                    i14++;
                }
            }
        }
        long j10 = controlState$volatile$FU.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.schedulerName);
        sb5.append('@');
        sb5.append(DebugStringsKt.getHexAddress(this));
        sb5.append("[Pool Size {core = ");
        sb5.append(this.corePoolSize);
        sb5.append(", max = ");
        a.b.x(this.maxPoolSize, i10, "}, Worker States {CPU = ", ", blocking = ", sb5);
        a.b.x(i11, i12, ", parked = ", ", dormant = ", sb5);
        a.b.x(i13, i14, ", terminated = ", "}, running workers queues = ", sb5);
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.globalCpuQueue.getSize());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.globalBlockingQueue.getSize());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((BLOCKING_MASK & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(this.corePoolSize - ((int) ((CPU_PERMITS_MASK & j10) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class Worker extends Thread {
        private static final /* synthetic */ AtomicIntegerFieldUpdater workerCtl$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        private volatile int indexInArray;
        public final WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        private int rngState;
        public WorkerState state;
        private final b1 stolenTask;
        private long terminationDeadline;
        private volatile /* synthetic */ int workerCtl$volatile;

        private Worker() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new WorkQueue();
            this.stolenTask = new b1();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void executeTask(Task task) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
            if (!task.taskContext) {
                CoroutineScheduler.this.runSafely(task);
                return;
            }
            if (tryReleaseCpu(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.signalCpuWork();
            }
            CoroutineScheduler.this.runSafely(task);
            CoroutineScheduler.getControlState$volatile$FU().addAndGet(CoroutineScheduler.this, CoroutineScheduler.PARKED_VERSION_MASK);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        private final Task findAnyTask(boolean z10) {
            Task taskPollGlobalQueues;
            Task taskPollGlobalQueues2;
            if (z10) {
                boolean z11 = nextInt(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z11 && (taskPollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues2;
                }
                Task taskPoll = this.localQueue.poll();
                if (taskPoll != null) {
                    return taskPoll;
                }
                if (!z11 && (taskPollGlobalQueues = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues;
                }
            } else {
                Task taskPollGlobalQueues3 = pollGlobalQueues();
                if (taskPollGlobalQueues3 != null) {
                    return taskPollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final Task findBlockingTask() {
            Task taskPollBlocking = this.localQueue.pollBlocking();
            if (taskPollBlocking != null) {
                return taskPollBlocking;
            }
            Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(1) : taskRemoveFirstOrNull;
        }

        private final Task findCpuTask() {
            Task taskPollCpu = this.localQueue.pollCpu();
            if (taskPollCpu != null) {
                return taskPollCpu;
            }
            Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(2) : taskRemoveFirstOrNull;
        }

        private final boolean inStack() {
            return this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK;
        }

        private final void park() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                tryTerminateWorker();
            }
        }

        private final Task pollGlobalQueues() {
            if (nextInt(2) == 0) {
                Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return taskRemoveFirstOrNull != null ? taskRemoveFirstOrNull : CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            Task taskRemoveFirstOrNull2 = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull2 != null ? taskRemoveFirstOrNull2 : CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                    Task taskFindTask = findTask(this.mayHaveLocalTasks);
                    if (taskFindTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        executeTask(taskFindTask);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            tryPark();
                        } else if (z10) {
                            tryReleaseCpu(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        private final boolean tryAcquireCpuPermit() {
            long j10;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater controlState$volatile$FU = CoroutineScheduler.getControlState$volatile$FU();
            do {
                j10 = controlState$volatile$FU.get(coroutineScheduler);
                if (((int) ((CoroutineScheduler.CPU_PERMITS_MASK & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.getControlState$volatile$FU().compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void tryPark() {
            if (!inStack()) {
                CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            workerCtl$volatile$FU.set(this, -1);
            while (inStack() && workerCtl$volatile$FU.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                tryReleaseCpu(WorkerState.PARKING);
                Thread.interrupted();
                park();
            }
        }

        private final Task trySteal(int i10) {
            int i11 = (int) (CoroutineScheduler.getControlState$volatile$FU().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iNextInt = nextInt(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iNextInt++;
                if (iNextInt > i11) {
                    iNextInt = 1;
                }
                Worker worker = coroutineScheduler.workers.get(iNextInt);
                if (worker != null && worker != this) {
                    long jTrySteal = worker.localQueue.trySteal(i10, this.stolenTask);
                    if (jTrySteal == -1) {
                        b1 b1Var = this.stolenTask;
                        Task task = (Task) b1Var.f71816b;
                        b1Var.f71816b = null;
                        return task;
                    }
                    if (jTrySteal > 0) {
                        jMin = Math.min(jMin, jTrySteal);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void tryTerminateWorker() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.getControlState$volatile$FU().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                        return;
                    }
                    if (workerCtl$volatile$FU.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        setIndexInArray(0);
                        coroutineScheduler.parkedWorkersStackTopUpdate(this, i10, 0);
                        int andDecrement = (int) (CoroutineScheduler.getControlState$volatile$FU().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i10) {
                            Worker worker = coroutineScheduler.workers.get(andDecrement);
                            e0.checkNotNull(worker);
                            Worker worker2 = worker;
                            coroutineScheduler.workers.setSynchronized(i10, worker2);
                            worker2.setIndexInArray(i10);
                            coroutineScheduler.parkedWorkersStackTopUpdate(worker2, andDecrement, i10);
                        }
                        coroutineScheduler.workers.setSynchronized(andDecrement, null);
                        this.state = WorkerState.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final Task findTask(boolean z10) {
            return tryAcquireCpuPermit() ? findAnyTask(z10) : findBlockingTask();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final CoroutineScheduler getScheduler() {
            return CoroutineScheduler.this;
        }

        public final /* synthetic */ int getWorkerCtl$volatile() {
            return this.workerCtl$volatile;
        }

        public final boolean isIo() {
            return this.state == WorkerState.BLOCKING;
        }

        public final int nextInt(int i10) {
            int i11 = this.rngState;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.rngState = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        public final long runSingleTask() {
            boolean z10 = this.state == WorkerState.CPU_ACQUIRED;
            Task taskFindCpuTask = z10 ? findCpuTask() : findBlockingTask();
            if (taskFindCpuTask == null) {
                long j10 = this.minDelayUntilStealableTaskNs;
                if (j10 == 0) {
                    return -1L;
                }
                return j10;
            }
            CoroutineScheduler.this.runSafely(taskFindCpuTask);
            if (!z10) {
                CoroutineScheduler.getControlState$volatile$FU().addAndGet(CoroutineScheduler.this, CoroutineScheduler.PARKED_VERSION_MASK);
            }
            return 0L;
        }

        public final void setIndexInArray(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void setNextParkedWorker(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final /* synthetic */ void setWorkerCtl$volatile(int i10) {
            this.workerCtl$volatile = i10;
        }

        public final boolean tryReleaseCpu(WorkerState workerState) {
            WorkerState workerState2 = this.state;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.getControlState$volatile$FU().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.state = workerState;
            }
            return z10;
        }

        public Worker(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            setIndexInArray(i10);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i10, int i11, long j10, String str, int i12, u uVar) {
        this(i10, i11, (i12 & 4) != 0 ? TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j10, (i12 & 8) != 0 ? TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }
}
