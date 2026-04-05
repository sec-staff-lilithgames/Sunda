package bw;

import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.e0;
import uu.y0;
import yv.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final g f11353a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11354b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11355c;

    /* renamed from: d, reason: collision with root package name */
    public bw.a f11356d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11357e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11358f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bw.a {

        /* renamed from: e, reason: collision with root package name */
        public final CountDownLatch f11359e;

        public a() {
            super(o2.o(new StringBuilder(), i.f96668b, " awaitIdle"), false);
            this.f11359e = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.f11359e;
        }

        @Override // bw.a
        public long runOnce() {
            this.f11359e.countDown();
            return -1L;
        }
    }

    public c(g taskRunner, String name) {
        e0.checkNotNullParameter(taskRunner, "taskRunner");
        e0.checkNotNullParameter(name, "name");
        this.f11353a = taskRunner;
        this.f11354b = name;
        this.f11357e = new ArrayList();
    }

    public static /* synthetic */ void execute$default(c cVar, String str, long j10, boolean z10, kv.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        cVar.execute(str, j11, z10, aVar);
    }

    public static /* synthetic */ void schedule$default(c cVar, bw.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.schedule(aVar, j10);
    }

    public final void cancelAll() {
        g gVar = this.f11353a;
        TimeZone timeZone = i.f96667a;
        synchronized (gVar) {
            if (cancelAllAndDecide$okhttp()) {
                this.f11353a.kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        bw.a aVar = this.f11356d;
        if (aVar != null) {
            e0.checkNotNull(aVar);
            if (aVar.getCancelable()) {
                this.f11358f = true;
            }
        }
        ArrayList arrayList = this.f11357e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((bw.a) arrayList.get(size)).getCancelable()) {
                Logger logger$okhttp = this.f11353a.getLogger$okhttp();
                bw.a aVar2 = (bw.a) arrayList.get(size);
                if (logger$okhttp.isLoggable(Level.FINE)) {
                    b.access$log(logger$okhttp, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void execute(String name, long j10, boolean z10, kv.a block) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(block, "block");
        schedule(new d(name, z10, block), j10);
    }

    public final bw.a getActiveTask$okhttp() {
        return this.f11356d;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.f11358f;
    }

    public final List<bw.a> getFutureTasks$okhttp() {
        return this.f11357e;
    }

    public final String getName$okhttp() {
        return this.f11354b;
    }

    public final List<bw.a> getScheduledTasks() {
        List<bw.a> list;
        synchronized (this.f11353a) {
            list = y0.toList(this.f11357e);
        }
        return list;
    }

    public final boolean getShutdown$okhttp() {
        return this.f11355c;
    }

    public final g getTaskRunner$okhttp() {
        return this.f11353a;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.f11353a) {
            if (this.f11356d == null && this.f11357e.isEmpty()) {
                return new CountDownLatch(0);
            }
            bw.a aVar = this.f11356d;
            if (aVar instanceof a) {
                return ((a) aVar).getLatch();
            }
            Iterator it = this.f11357e.iterator();
            while (it.hasNext()) {
                bw.a aVar2 = (bw.a) it.next();
                if (aVar2 instanceof a) {
                    return ((a) aVar2).getLatch();
                }
            }
            a aVar3 = new a();
            if (scheduleAndDecide$okhttp(aVar3, 0L, false)) {
                this.f11353a.kickCoordinator$okhttp(this);
            }
            return aVar3.getLatch();
        }
    }

    public final void schedule(bw.a task, long j10) {
        e0.checkNotNullParameter(task, "task");
        synchronized (this.f11353a) {
            if (!this.f11355c) {
                if (scheduleAndDecide$okhttp(task, j10, false)) {
                    this.f11353a.kickCoordinator$okhttp(this);
                }
            } else if (task.getCancelable()) {
                Logger logger$okhttp = this.f11353a.getLogger$okhttp();
                if (logger$okhttp.isLoggable(Level.FINE)) {
                    b.access$log(logger$okhttp, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger$okhttp2 = this.f11353a.getLogger$okhttp();
                if (logger$okhttp2.isLoggable(Level.FINE)) {
                    b.access$log(logger$okhttp2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean scheduleAndDecide$okhttp(bw.a r12, long r13, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.e0.checkNotNullParameter(r12, r0)
            r12.initQueue$okhttp(r11)
            bw.g r0 = r11.f11353a
            bw.f r1 = r0.getBackend()
            long r1 = r1.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f11357e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L3b
            long r9 = r12.getNextExecuteNanoTime$okhttp()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L38
            java.util.logging.Logger r13 = r0.getLogger$okhttp()
            java.util.logging.Level r14 = java.util.logging.Level.FINE
            boolean r14 = r13.isLoggable(r14)
            if (r14 == 0) goto La2
            java.lang.String r14 = "already scheduled"
            bw.b.access$log(r13, r12, r11, r14)
            return r7
        L38:
            r5.remove(r6)
        L3b:
            r12.setNextExecuteNanoTime$okhttp(r3)
            java.util.logging.Logger r0 = r0.getLogger$okhttp()
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L76
            if (r15 == 0) goto L60
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "run again after "
            r15.<init>(r6)
            long r3 = r3 - r1
            java.lang.String r3 = bw.b.formatDuration(r3)
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            goto L73
        L60:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "scheduled after "
            r15.<init>(r6)
            long r3 = r3 - r1
            java.lang.String r3 = bw.b.formatDuration(r3)
            r15.append(r3)
            java.lang.String r15 = r15.toString()
        L73:
            bw.b.access$log(r0, r12, r11, r15)
        L76:
            java.util.Iterator r15 = r5.iterator()
            r0 = r7
        L7b:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r15.next()
            bw.a r3 = (bw.a) r3
            long r3 = r3.getNextExecuteNanoTime$okhttp()
            long r3 = r3 - r1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L91
            goto L95
        L91:
            int r0 = r0 + 1
            goto L7b
        L94:
            r0 = r8
        L95:
            if (r0 != r8) goto L9b
            int r0 = r5.size()
        L9b:
            r5.add(r0, r12)
            if (r0 != 0) goto La2
            r12 = 1
            return r12
        La2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bw.c.scheduleAndDecide$okhttp(bw.a, long, boolean):boolean");
    }

    public final void setActiveTask$okhttp(bw.a aVar) {
        this.f11356d = aVar;
    }

    public final void setCancelActiveTask$okhttp(boolean z10) {
        this.f11358f = z10;
    }

    public final void setShutdown$okhttp(boolean z10) {
        this.f11355c = z10;
    }

    public final void shutdown() {
        g gVar = this.f11353a;
        TimeZone timeZone = i.f96667a;
        synchronized (gVar) {
            this.f11355c = true;
            if (cancelAllAndDecide$okhttp()) {
                this.f11353a.kickCoordinator$okhttp(this);
            }
        }
    }

    public String toString() {
        return this.f11354b;
    }

    public static /* synthetic */ void schedule$default(c cVar, String str, long j10, kv.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.schedule(str, j10, aVar);
    }

    public final void schedule(String name, long j10, kv.a block) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(block, "block");
        schedule(new e(name, block), j10);
    }
}
