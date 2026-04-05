package io.bidmachine;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class BidTokenTaskManager {
    private static volatile tr.a instance;

    public static void cancel(tr.b bVar) {
        get().cancel(bVar);
    }

    public static void execute(Runnable runnable) {
        get().execute(runnable);
    }

    private static tr.a get() {
        tr.a aVar;
        tr.a aVar2 = instance;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (tr.a.class) {
            try {
                aVar = instance;
                if (aVar == null) {
                    aVar = new tr.a();
                    instance = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static void schedule(tr.b bVar, long j10, TimeUnit timeUnit) {
        get().schedule(bVar, j10, timeUnit);
    }
}
