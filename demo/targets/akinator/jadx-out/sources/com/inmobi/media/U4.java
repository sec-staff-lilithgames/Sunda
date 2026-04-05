package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U4 extends Pa {

    /* renamed from: g, reason: collision with root package name */
    public final Object f32343g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f32344h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f32345i;

    /* renamed from: j, reason: collision with root package name */
    public ExecutorService f32346j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(Za dao, C2782g5 listener, Ua networkHandler) {
        super(dao, listener, networkHandler);
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkHandler, "networkHandler");
        this.f32343g = new Object();
    }

    public static final void a(U4 this$0, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
        int high = this$0.f32136f.getMaxBatchSize().getHigh();
        Za za2 = this$0.f32131a;
        Integer numValueOf = Integer.valueOf(high);
        kotlin.jvm.internal.e0.checkNotNullParameter("high", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        List listFilterNotNull = uu.y0.filterNotNull(V1.a(za2, "priority = ? AND retry_count = 0 AND time_created < ?", new String[]{"high", String.valueOf(j10)}, null, null, "time_created ASC", numValueOf, 12));
        while (!listFilterNotNull.isEmpty() && this$0.f32134d != Ma.f32031a) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
            listFilterNotNull.size();
            Iterator it = listFilterNotNull.iterator();
            while (it.hasNext()) {
                this$0.a((Ja) it.next(), this$0.f32346j, new T4(this$0));
            }
            Za za3 = this$0.f32131a;
            kotlin.jvm.internal.e0.checkNotNullParameter("high", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            List listFilterNotNull2 = uu.y0.filterNotNull(V1.a(za3, "priority = ? AND retry_count = 0 AND time_created < ?", new String[]{"high", String.valueOf(j10)}, null, null, "time_created ASC", null, 12));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listFilterNotNull2) {
                if (!this$0.f32135e.containsKey(((Ja) obj).f31914b)) {
                    arrayList.add(obj);
                }
            }
            listFilterNotNull = uu.y0.take(arrayList, high);
        }
    }

    public static final Thread b(Runnable runnable) {
        Thread thread = new Thread(runnable, "TIM-HighPriorityParallelPing");
        thread.setDaemon(true);
        return thread;
    }

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExecutorService executorService = this.f32346j;
        if (executorService != null) {
            executorService.execute(new com.google.android.exoplayer2.audio.y(this, jCurrentTimeMillis, 4));
        }
    }

    public final void d() {
        synchronized (this.f32343g) {
            ScheduledFuture scheduledFuture = this.f32345i;
            if (scheduledFuture != null) {
                kotlin.jvm.internal.e0.checkNotNull(scheduledFuture);
                if (!scheduledFuture.isDone()) {
                    return;
                }
            }
            long high = this.f32136f.getInterval().getHigh();
            if (high <= 0) {
                return;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
            ScheduledExecutorService scheduledExecutorService = this.f32344h;
            this.f32345i = scheduledExecutorService != null ? scheduledExecutorService.scheduleWithFixedDelay(new zg.h(this, 9), 0L, high, TimeUnit.SECONDS) : null;
        }
    }

    public final void e() {
        synchronized (this.f32343g) {
            try {
                ScheduledFuture scheduledFuture = this.f32345i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.f32345i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ExecutorService executorService = this.f32346j;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public final void b() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
        Ma ma2 = Ma.f32032b;
        if (a(ma2)) {
            this.f32134d = ma2;
        }
        synchronized (this.f32343g) {
            try {
                ScheduledFuture scheduledFuture = this.f32345i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f32345i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:11:0x0013), top: B:21:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f32343g
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = r3.f32344h     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            kotlin.jvm.internal.e0.checkNotNull(r1)     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L1f
            goto L13
        L11:
            r1 = move-exception
            goto L3a
        L13:
            com.applovin.impl.communicator.a r1 = new com.applovin.impl.communicator.a     // Catch: java.lang.Throwable -> L11
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r1)     // Catch: java.lang.Throwable -> L11
            r3.f32344h = r1     // Catch: java.lang.Throwable -> L11
        L1f:
            java.util.concurrent.ExecutorService r1 = r3.f32346j     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L2c
            kotlin.jvm.internal.e0.checkNotNull(r1)     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L38
        L2c:
            com.applovin.impl.communicator.a r1 = new com.applovin.impl.communicator.a     // Catch: java.lang.Throwable -> L11
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool(r1)     // Catch: java.lang.Throwable -> L11
            r3.f32346j = r1     // Catch: java.lang.Throwable -> L11
        L38:
            monitor-exit(r0)
            return
        L3a:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U4.a():void");
    }

    public static final Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "TIM-HighPriorityPollingPing");
        thread.setDaemon(true);
        return thread;
    }

    public static final void a(U4 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        try {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
            if (this$0.f32134d != Ma.f32031a) {
                int high = this$0.f32136f.getMaxBatchSize().getHigh();
                this$0.f32131a.a("time_created < ?", new String[]{String.valueOf(System.currentTimeMillis() - (this$0.f32136f.getExpiry().getHigh() * 1000))});
                List listFilterNotNull = uu.y0.filterNotNull(this$0.f32131a.a(Integer.valueOf(high)));
                if (listFilterNotNull.isEmpty()) {
                    Za za2 = this$0.f32131a;
                    kotlin.jvm.internal.e0.checkNotNullParameter("high", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                    if (V1.a(za2, "priority = ?", new String[]{"high"}, 12) == 0) {
                        this$0.b();
                        return;
                    }
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
                listFilterNotNull.size();
                Iterator it = listFilterNotNull.iterator();
                while (it.hasNext()) {
                    this$0.a((Ja) it.next(), this$0.f32346j, new S4(this$0));
                }
            }
        } catch (Error unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
        } catch (Exception unused2) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U4", "TAG");
        }
    }
}
