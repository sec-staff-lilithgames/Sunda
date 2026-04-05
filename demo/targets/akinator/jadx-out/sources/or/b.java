package or;

import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        Looper mainLooper = Looper.getMainLooper();
        e0.checkNotNullExpressionValue(mainLooper, "getMainLooper()");
        super(mainLooper);
    }

    @Override // or.a, mr.a, mr.c
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // or.a, mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // or.a, mr.a, mr.c
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // or.a, mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // or.a, mr.a, mr.c
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }
}
