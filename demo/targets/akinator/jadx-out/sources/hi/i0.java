package hi;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f58830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f58831c;

    public i0(String str, AtomicLong atomicLong) {
        this.f58830b = str;
        this.f58831c = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new h0(runnable));
        threadNewThread.setName(this.f58830b + this.f58831c.getAndIncrement());
        return threadNewThread;
    }
}
