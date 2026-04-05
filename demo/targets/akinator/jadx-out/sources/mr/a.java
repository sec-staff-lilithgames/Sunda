package mr;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements c {
    public abstract void a(Runnable runnable);

    public abstract void b(Runnable runnable, long j10);

    @Override // mr.c
    public void cancel(Runnable task) {
        e0.checkNotNullParameter(task, "task");
        ir.a aVar = task instanceof ir.a ? (ir.a) task : null;
        if (aVar != null) {
            try {
                aVar.setCancel(true);
            } catch (Throwable unused) {
            }
        }
        try {
            a(task);
        } catch (Throwable unused2) {
        }
    }

    @Override // mr.c
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // mr.c
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // mr.c
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // mr.c
    public void schedule(Runnable task, long j10) throws Throwable {
        e0.checkNotNullParameter(task, "task");
        ir.a aVar = task instanceof ir.a ? (ir.a) task : null;
        if (aVar != null) {
            try {
                aVar.setCancel(false);
            } catch (Throwable unused) {
            }
        }
        try {
            a(task);
        } catch (Throwable unused2) {
        }
        b(task, j10);
    }

    @Override // mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }
}
