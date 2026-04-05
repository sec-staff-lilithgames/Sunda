package pt;

import java.util.concurrent.Future;
import ut.m0;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d {
    public static c disposed() {
        return tt.e.f87354b;
    }

    public static c empty() {
        return fromRunnable(m0.f88679b);
    }

    public static c fromAction(st.a aVar) {
        o0.requireNonNull(aVar, "run is null");
        return new a(aVar, 0);
    }

    public static c fromFuture(Future<?> future) {
        o0.requireNonNull(future, "future is null");
        return fromFuture(future, true);
    }

    public static c fromRunnable(Runnable runnable) {
        o0.requireNonNull(runnable, "run is null");
        return new g(runnable);
    }

    public static c fromSubscription(tw.d dVar) {
        o0.requireNonNull(dVar, "subscription is null");
        return new a(dVar, 1);
    }

    public static c fromFuture(Future<?> future, boolean z10) {
        o0.requireNonNull(future, "future is null");
        return new e(future, z10);
    }
}
