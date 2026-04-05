package sh;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b2 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f85774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f85775c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f85776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Boolean f85777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f85778g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f85779h;

    public b2(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f85774b = threadFactory;
        this.f85775c = str;
        this.f85776e = atomicLong;
        this.f85777f = bool;
        this.f85778g = num;
        this.f85779h = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f85774b.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f85775c;
        if (str != null) {
            AtomicLong atomicLong = this.f85776e;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f85777f;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        Integer num = this.f85778g;
        if (num != null) {
            threadNewThread.setPriority(num.intValue());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f85779h;
        if (uncaughtExceptionHandler != null) {
            threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        return threadNewThread;
    }
}
