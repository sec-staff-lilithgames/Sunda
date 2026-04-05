package wr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k3 extends j {
    public abstract boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException;

    public f0 getState(boolean z10) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract boolean isShutdown();

    public abstract boolean isTerminated();

    public void notifyWhenStateChanged(f0 f0Var, Runnable runnable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract k3 shutdown();

    public abstract k3 shutdownNow();

    public void enterIdle() {
    }

    public void resetConnectBackoff() {
    }
}
