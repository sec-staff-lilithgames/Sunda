package bw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.y0;
import yv.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f11362k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f11363l;

    /* renamed from: a, reason: collision with root package name */
    public final f f11364a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f11365b;

    /* renamed from: c, reason: collision with root package name */
    public int f11366c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11367d;

    /* renamed from: e, reason: collision with root package name */
    public long f11368e;

    /* renamed from: f, reason: collision with root package name */
    public int f11369f;

    /* renamed from: g, reason: collision with root package name */
    public int f11370g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11371h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f11372i;

    /* renamed from: j, reason: collision with root package name */
    public final h f11373j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final Logger getLogger() {
            return g.f11362k;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f11374a;

        public b(ThreadFactory threadFactory) {
            e0.checkNotNullParameter(threadFactory, "threadFactory");
            this.f11374a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // bw.f
        public void coordinatorNotify(g taskRunner) {
            e0.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // bw.f
        public void coordinatorWait(g taskRunner, long j10) throws InterruptedException {
            e0.checkNotNullParameter(taskRunner, "taskRunner");
            TimeZone timeZone = i.f96667a;
            if (j10 > 0) {
                long j11 = j10 / 1000000;
                long j12 = j10 - (1000000 * j11);
                if (j11 > 0 || j10 > 0) {
                    taskRunner.wait(j11, (int) j12);
                }
            }
        }

        @Override // bw.f
        public <T> BlockingQueue<T> decorate(BlockingQueue<T> queue) {
            e0.checkNotNullParameter(queue, "queue");
            return queue;
        }

        @Override // bw.f
        public void execute(g taskRunner, Runnable runnable) {
            e0.checkNotNullParameter(taskRunner, "taskRunner");
            e0.checkNotNullParameter(runnable, "runnable");
            this.f11374a.execute(runnable);
        }

        public final ThreadPoolExecutor getExecutor() {
            return this.f11374a;
        }

        @Override // bw.f
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.f11374a.shutdown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new a(null);
        Logger logger = Logger.getLogger(g.class.getName());
        e0.checkNotNullExpressionValue(logger, "getLogger(...)");
        f11362k = logger;
        f11363l = new g(new b(i.threadFactory(i.f96668b + " TaskRunner", true)), null, 2, 0 == true ? 1 : 0);
    }

    public g(f backend, Logger logger) {
        e0.checkNotNullParameter(backend, "backend");
        e0.checkNotNullParameter(logger, "logger");
        this.f11364a = backend;
        this.f11365b = logger;
        this.f11366c = 10000;
        this.f11371h = new ArrayList();
        this.f11372i = new ArrayList();
        this.f11373j = new h(this);
    }

    public static final void access$afterRun(g gVar, bw.a aVar, long j10, boolean z10) {
        gVar.getClass();
        TimeZone timeZone = i.f96667a;
        c queue$okhttp = aVar.getQueue$okhttp();
        e0.checkNotNull(queue$okhttp);
        if (queue$okhttp.getActiveTask$okhttp() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
        queue$okhttp.setCancelActiveTask$okhttp(false);
        queue$okhttp.setActiveTask$okhttp(null);
        gVar.f11371h.remove(queue$okhttp);
        if (j10 != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
            queue$okhttp.scheduleAndDecide$okhttp(aVar, j10, true);
        }
        if (queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
            return;
        }
        gVar.f11372i.add(queue$okhttp);
        if (z10) {
            return;
        }
        gVar.a();
    }

    public final void a() {
        TimeZone timeZone = i.f96667a;
        int i10 = this.f11369f;
        if (i10 > this.f11370g) {
            return;
        }
        this.f11369f = i10 + 1;
        this.f11364a.execute(this, this.f11373j);
    }

    public final List<c> activeQueues() {
        List<c> listPlus;
        synchronized (this) {
            listPlus = y0.plus((Collection) this.f11371h, (Iterable) this.f11372i);
        }
        return listPlus;
    }

    public final bw.a awaitTaskToRun() {
        long j10;
        bw.a aVar;
        boolean z10;
        TimeZone timeZone = i.f96667a;
        while (true) {
            ArrayList arrayList = this.f11372i;
            if (arrayList.isEmpty()) {
                return null;
            }
            f fVar = this.f11364a;
            long jNanoTime = fVar.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            bw.a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j10 = jNanoTime;
                    aVar = null;
                    z10 = false;
                    break;
                }
                bw.a aVar3 = ((c) it.next()).getFutureTasks$okhttp().get(0);
                j10 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.getNextExecuteNanoTime$okhttp() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z10 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j10;
            }
            if (aVar2 != null) {
                TimeZone timeZone2 = i.f96667a;
                aVar2.setNextExecuteNanoTime$okhttp(-1L);
                c queue$okhttp = aVar2.getQueue$okhttp();
                e0.checkNotNull(queue$okhttp);
                queue$okhttp.getFutureTasks$okhttp().remove(aVar2);
                arrayList.remove(queue$okhttp);
                queue$okhttp.setActiveTask$okhttp(aVar2);
                this.f11371h.add(queue$okhttp);
                if (z10 || (!this.f11367d && !arrayList.isEmpty())) {
                    a();
                }
                return aVar2;
            }
            if (this.f11367d) {
                if (jMin >= this.f11368e - j10) {
                    return aVar;
                }
                fVar.coordinatorNotify(this);
                return aVar;
            }
            this.f11367d = true;
            this.f11368e = j10 + jMin;
            try {
                try {
                    fVar.coordinatorWait(this, jMin);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
            } finally {
                this.f11367d = false;
            }
        }
    }

    public final void cancelAll() {
        TimeZone timeZone = i.f96667a;
        ArrayList arrayList = this.f11371h;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((c) arrayList.get(size)).cancelAllAndDecide$okhttp();
            }
        }
        ArrayList arrayList2 = this.f11372i;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.cancelAllAndDecide$okhttp();
            if (cVar.getFutureTasks$okhttp().isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final f getBackend() {
        return this.f11364a;
    }

    public final Logger getLogger$okhttp() {
        return this.f11365b;
    }

    public final void kickCoordinator$okhttp(c taskQueue) {
        e0.checkNotNullParameter(taskQueue, "taskQueue");
        TimeZone timeZone = i.f96667a;
        if (taskQueue.getActiveTask$okhttp() == null) {
            boolean zIsEmpty = taskQueue.getFutureTasks$okhttp().isEmpty();
            ArrayList arrayList = this.f11372i;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                yv.h.addIfAbsent(arrayList, taskQueue);
            }
        }
        if (this.f11367d) {
            this.f11364a.coordinatorNotify(this);
        } else {
            a();
        }
    }

    public final c newQueue() {
        int i10;
        synchronized (this) {
            i10 = this.f11366c;
            this.f11366c = i10 + 1;
        }
        return new c(this, a.b.e(i10, "Q"));
    }

    public /* synthetic */ g(f fVar, Logger logger, int i10, u uVar) {
        this(fVar, (i10 & 2) != 0 ? f11362k : logger);
    }
}
