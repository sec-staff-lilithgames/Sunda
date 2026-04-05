package s8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f85496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85497c;

    /* renamed from: e, reason: collision with root package name */
    public final g f85498e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85499f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f85500g = new AtomicInteger();

    public e(ThreadFactory threadFactory, String str, g gVar, boolean z10) {
        this.f85496b = threadFactory;
        this.f85497c = str;
        this.f85498e = gVar;
        this.f85499f = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f85496b.newThread(new d(this, runnable));
        threadNewThread.setName("glide-" + this.f85497c + "-thread-" + this.f85500g.getAndIncrement());
        return threadNewThread;
    }
}
