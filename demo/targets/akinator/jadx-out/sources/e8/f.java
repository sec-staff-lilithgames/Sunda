package e8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f53920f = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final ThreadGroup f53921b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f53922c = new AtomicInteger(1);

    /* renamed from: e, reason: collision with root package name */
    public final String f53923e;

    public f() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f53921b = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f53923e = "lottie-" + f53920f.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f53921b, runnable, this.f53923e + this.f53922c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
