package bw;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f11375b;

    public h(g gVar) {
        this.f11375b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVarAwaitTaskToRun;
        long jNanoTime;
        a aVarAwaitTaskToRun2;
        g gVar = this.f11375b;
        synchronized (gVar) {
            gVar.f11370g++;
            aVarAwaitTaskToRun = gVar.awaitTaskToRun();
        }
        if (aVarAwaitTaskToRun == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(aVarAwaitTaskToRun.getName());
                Logger logger$okhttp = this.f11375b.getLogger$okhttp();
                c queue$okhttp = aVarAwaitTaskToRun.getQueue$okhttp();
                e0.checkNotNull(queue$okhttp);
                boolean zIsLoggable = logger$okhttp.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                    b.access$log(logger$okhttp, aVarAwaitTaskToRun, queue$okhttp, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jRunOnce = aVarAwaitTaskToRun.runOnce();
                    if (zIsLoggable) {
                        b.access$log(logger$okhttp, aVarAwaitTaskToRun, queue$okhttp, "finished run in " + b.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                    }
                    g gVar2 = this.f11375b;
                    synchronized (gVar2) {
                        g.access$afterRun(gVar2, aVarAwaitTaskToRun, jRunOnce, true);
                        aVarAwaitTaskToRun2 = gVar2.awaitTaskToRun();
                    }
                    if (aVarAwaitTaskToRun2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    aVarAwaitTaskToRun = aVarAwaitTaskToRun2;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        b.access$log(logger$okhttp, aVarAwaitTaskToRun, queue$okhttp, "failed a run in " + b.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    g gVar3 = this.f11375b;
                    synchronized (gVar3) {
                        g.access$afterRun(gVar3, aVarAwaitTaskToRun, -1L, false);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    threadCurrentThread.setName(name);
                    throw th4;
                }
            }
        }
    }
}
