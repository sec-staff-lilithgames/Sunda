package tr;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f87346c = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f87347a = new ScheduledThreadPoolExecutor(f87346c);

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f87348b = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: tr.a$a, reason: collision with other inner class name */
    public class RunnableC0788a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f87349b;

        public RunnableC0788a(Runnable runnable) {
            this.f87349b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f87349b;
            int i10 = a.f87346c;
            a aVar = a.this;
            aVar.getClass();
            try {
            } catch (Throwable unused) {
            }
            runnable.run();
        }
    }

    @Override // tr.c
    public void cancel(b bVar) {
        Future future;
        try {
            bVar.setCancel(true);
            try {
                future = (Future) this.f87348b.remove(bVar);
            } catch (Throwable unused) {
                future = null;
            }
            if (future == null) {
                return;
            }
            future.cancel(false);
        } catch (Throwable unused2) {
        }
    }

    @Override // tr.c
    public void execute(Runnable runnable) {
        try {
            this.f87347a.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    @Override // tr.c
    public /* bridge */ /* synthetic */ void schedule(b bVar, long j10) {
        super.schedule(bVar, j10);
    }

    @Override // tr.c
    public void schedule(b bVar, long j10, TimeUnit timeUnit) {
        try {
            bVar.setCancel(false);
            this.f87348b.put(bVar, this.f87347a.schedule(new RunnableC0788a(bVar), j10, timeUnit));
        } catch (Throwable unused) {
        }
    }
}
