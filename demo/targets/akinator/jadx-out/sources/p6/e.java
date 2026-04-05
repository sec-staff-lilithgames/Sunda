package p6;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import n6.r0;
import o6.t0;
import o6.u;
import on.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f80710a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f80711b;

    /* renamed from: c, reason: collision with root package name */
    public final long f80712c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f80713d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f80714e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(r0 runnableScheduler, t0 launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        e0.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        e0.checkNotNullParameter(launcher, "launcher");
    }

    public final void cancel(u token) {
        Runnable runnable;
        e0.checkNotNullParameter(token, "token");
        synchronized (this.f80713d) {
            runnable = (Runnable) this.f80714e.remove(token);
        }
        if (runnable != null) {
            this.f80710a.cancel(runnable);
        }
    }

    public final void track(u token) {
        e0.checkNotNullParameter(token, "token");
        z zVar = new z(7, this, token);
        synchronized (this.f80713d) {
        }
        this.f80710a.scheduleWithDelay(this.f80712c, zVar);
    }

    public e(r0 runnableScheduler, t0 launcher, long j10) {
        e0.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        e0.checkNotNullParameter(launcher, "launcher");
        this.f80710a = runnableScheduler;
        this.f80711b = launcher;
        this.f80712c = j10;
        this.f80713d = new Object();
        this.f80714e = new LinkedHashMap();
    }

    public /* synthetic */ e(r0 r0Var, t0 t0Var, long j10, int i10, kotlin.jvm.internal.u uVar) {
        this(r0Var, t0Var, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
