package sh;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f85788a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f85789b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f85790c = null;

    /* renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f85791d = null;

    /* renamed from: e, reason: collision with root package name */
    public ThreadFactory f85792e = null;

    public ThreadFactory build() {
        String str = this.f85788a;
        Boolean bool = this.f85789b;
        Integer num = this.f85790c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f85791d;
        ThreadFactory threadFactoryDefaultThreadFactory = this.f85792e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new b2(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public c2 setDaemon(boolean z10) {
        this.f85789b = Boolean.valueOf(z10);
        return this;
    }

    public c2 setNameFormat(String str) {
        String.format(Locale.ROOT, str, 0);
        this.f85788a = str;
        return this;
    }

    public c2 setPriority(int i10) {
        mh.p1.checkArgument(i10 >= 1, "Thread priority (%s) must be >= %s", i10, 1);
        mh.p1.checkArgument(i10 <= 10, "Thread priority (%s) must be <= %s", i10, 10);
        this.f85790c = Integer.valueOf(i10);
        return this;
    }

    public c2 setThreadFactory(ThreadFactory threadFactory) {
        this.f85792e = (ThreadFactory) mh.p1.checkNotNull(threadFactory);
        return this;
    }

    public c2 setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f85791d = (Thread.UncaughtExceptionHandler) mh.p1.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
