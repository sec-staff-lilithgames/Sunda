package or;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a extends mr.a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f79820a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Looper looper) {
        this(new Handler(looper));
        e0.checkNotNullParameter(looper, "looper");
    }

    @Override // mr.a
    public final void a(Runnable task) {
        e0.checkNotNullParameter(task, "task");
        this.f79820a.removeCallbacks(task);
    }

    @Override // mr.a
    public final void b(Runnable task, long j10) {
        e0.checkNotNullParameter(task, "task");
        Handler handler = this.f79820a;
        if (j10 > 0) {
            handler.postDelayed(task, j10);
        } else if (e0.areEqual(Looper.myLooper(), handler.getLooper())) {
            task.run();
        } else {
            handler.post(task);
        }
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    public final Handler getHandler() {
        return this.f79820a;
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    public a(Handler handler) {
        e0.checkNotNullParameter(handler, "handler");
        this.f79820a = handler;
    }

    @Override // mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }
}
