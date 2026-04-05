package n6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f75698b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f75699c;

    public c(boolean z10) {
        this.f75699c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        StringBuilder sbU = o2.u(this.f75699c ? "WM.task-" : "androidx.work-");
        sbU.append(this.f75698b.incrementAndGet());
        return new Thread(runnable, sbU.toString());
    }
}
