package nr;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends mr.a {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f77198a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f77199b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(m coroutineContext) {
        this(CoroutineScopeKt.CoroutineScope(coroutineContext));
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
    }

    @Override // mr.a
    public final void a(Runnable task) {
        e0.checkNotNullParameter(task, "task");
        Job job = (Job) this.f77199b.remove(task);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // mr.a
    public final void b(Runnable task, long j10) {
        e0.checkNotNullParameter(task, "task");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f77198a, null, CoroutineStart.LAZY, new a(j10, this, task, null), 1, null);
        this.f77199b.put(task, jobLaunch$default);
        jobLaunch$default.start();
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    public final CoroutineScope getCoroutineScope() {
        return this.f77198a;
    }

    public final int getScheduledTaskCount() {
        return this.f77199b.size();
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    public b(CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f77198a = coroutineScope;
        this.f77199b = new ConcurrentHashMap();
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }
}
