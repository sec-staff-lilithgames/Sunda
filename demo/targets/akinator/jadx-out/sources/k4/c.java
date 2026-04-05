package k4;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f70288a;

    public c(int i10) {
        this.f70288a = new AtomicInteger(i10);
    }

    public final int decrementAndGet() {
        return this.f70288a.decrementAndGet();
    }

    public final int get() {
        return this.f70288a.get();
    }

    public final int getAndIncrement() {
        return this.f70288a.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.f70288a.incrementAndGet();
    }

    public /* synthetic */ c(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
