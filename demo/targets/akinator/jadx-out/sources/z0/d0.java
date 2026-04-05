package z0;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f97049a = new AtomicReference(e0.f97063a);

    /* renamed from: b, reason: collision with root package name */
    public final Object f97050b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Object f97051c;

    public final Object get() {
        long jCurrentThreadId = i0.currentThreadId();
        return jCurrentThreadId == h0.getMainThreadId() ? this.f97051c : ((g0) this.f97049a.get()).get(jCurrentThreadId);
    }

    public final void set(Object obj) {
        long jCurrentThreadId = i0.currentThreadId();
        if (jCurrentThreadId == h0.getMainThreadId()) {
            this.f97051c = obj;
            return;
        }
        synchronized (this.f97050b) {
            g0 g0Var = (g0) this.f97049a.get();
            if (g0Var.trySet(jCurrentThreadId, obj)) {
                return;
            }
            this.f97049a.set(g0Var.newWith(jCurrentThreadId, obj));
        }
    }
}
