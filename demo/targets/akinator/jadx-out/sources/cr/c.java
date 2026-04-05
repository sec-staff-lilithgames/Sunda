package cr;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f50893b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f50894c;

    public c(int i10, Runnable runnable) {
        this.f50893b = runnable;
        this.f50894c = new AtomicInteger(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f50894c.decrementAndGet() > 0) {
            return;
        }
        this.f50893b.run();
    }
}
