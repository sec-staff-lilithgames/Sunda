package ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u {
    public static f0 defaultPool() {
        return threadLocalPool();
    }

    public static f0 newBoundedPool(int i10) {
        return p.construct(i10);
    }

    public static f0 newConcurrentDequePool() {
        return q.construct();
    }

    @Deprecated
    public static f0 newLockFreePool() {
        return r.construct();
    }

    public static f0 nonRecyclingPool() {
        return s.f59524b;
    }

    public static f0 sharedBoundedPool() {
        return p.f59521e;
    }

    public static f0 sharedConcurrentDequePool() {
        return q.f59522c;
    }

    @Deprecated
    public static f0 sharedLockFreePool() {
        return r.f59523c;
    }

    public static f0 threadLocalPool() {
        return t.f59525b;
    }
}
