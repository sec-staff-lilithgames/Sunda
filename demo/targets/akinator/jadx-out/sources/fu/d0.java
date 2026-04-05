package fu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Iterator it = new ArrayList(f0.f56022d.keySet()).iterator();
        while (it.hasNext()) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
            if (scheduledThreadPoolExecutor.isShutdown()) {
                f0.f56022d.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
