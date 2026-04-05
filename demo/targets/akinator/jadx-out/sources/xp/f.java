package xp;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static f f92185c;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f92186b;

    public f() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f92186b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
    }

    public static f getInstance() {
        if (f92185c == null) {
            f92185c = new f();
        }
        return f92185c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f92186b.execute(runnable);
    }
}
