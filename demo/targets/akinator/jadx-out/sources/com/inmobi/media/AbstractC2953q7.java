package com.inmobi.media;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2953q7 {
    public static void a(C2767f7 dao, long j10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        if (AbstractC2969r7.f33310d.getAndSet(true)) {
            return;
        }
        et.b runnable = new et.b(dao, j10, i10, 2);
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2809hf.f32906a.schedule(runnable, 10000L, TimeUnit.MILLISECONDS);
    }

    public static final void b(C2767f7 dao, long j10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "$dao");
        dao.getClass();
        StringBuilder sb2 = new StringBuilder("id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > ");
        sb2.append(j10);
        for (C2750e7 c2750e7 : V1.a(dao, b0.e2.n(sb2, " ORDER BY saveTimestamp DESC LIMIT ", i10, ") AS foo);"), null, null, null, null, null, 62)) {
            if (c2750e7 != null) {
                AbstractC2986s7.a(c2750e7.f32807a);
                dao.a(c2750e7);
            }
        }
        AbstractC2969r7.f33310d.set(false);
    }

    public static Object a(kv.a run) {
        Semaphore semaphore;
        kotlin.jvm.internal.e0.checkNotNullParameter(run, "run");
        try {
            int i10 = tu.z.f87419c;
            try {
                try {
                    semaphore = AbstractC2969r7.f33309c;
                    semaphore.acquire();
                    run.invoke();
                } catch (Exception e10) {
                    Y5 y52 = Y5.f32563a;
                    C2796h2 event = new C2796h2(e10);
                    kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                    Y5.f32566d.a(event);
                    semaphore = AbstractC2969r7.f33309c;
                }
                semaphore.release();
                return tu.z.m7131constructorimpl(tu.x0.f87415a);
            } catch (Throwable th2) {
                AbstractC2969r7.f33309c.release();
                throw th2;
            }
        } catch (Throwable th3) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
        }
    }
}
