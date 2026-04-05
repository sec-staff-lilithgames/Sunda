package nr;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends b {
    public c() {
        super(new CoroutineName("NetworkTaskManager").plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(Dispatchers.getIO()));
    }

    @Override // nr.b, mr.a, mr.c
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // nr.b, mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // nr.b, mr.a, mr.c
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // nr.b, mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // nr.b, mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }
}
