package xr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o4 extends wr.k3 {

    /* renamed from: a, reason: collision with root package name */
    public final u8 f92844a;

    public o4(u8 u8Var) {
        this.f92844a = u8Var;
    }

    @Override // wr.j
    public String authority() {
        return this.f92844a.authority();
    }

    @Override // wr.k3
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f92844a.awaitTermination(j10, timeUnit);
    }

    @Override // wr.k3
    public void enterIdle() {
        this.f92844a.enterIdle();
    }

    @Override // wr.k3
    public wr.f0 getState(boolean z10) {
        return this.f92844a.getState(z10);
    }

    @Override // wr.k3
    public boolean isShutdown() {
        return this.f92844a.isShutdown();
    }

    @Override // wr.k3
    public boolean isTerminated() {
        return this.f92844a.isTerminated();
    }

    @Override // wr.j
    public <RequestT, ResponseT> wr.p newCall(wr.k4 k4Var, wr.i iVar) {
        return this.f92844a.newCall(k4Var, iVar);
    }

    @Override // wr.k3
    public void notifyWhenStateChanged(wr.f0 f0Var, Runnable runnable) {
        this.f92844a.notifyWhenStateChanged(f0Var, runnable);
    }

    @Override // wr.k3
    public void resetConnectBackoff() {
        this.f92844a.resetConnectBackoff();
    }

    @Override // wr.k3
    public wr.k3 shutdown() {
        return this.f92844a.shutdown();
    }

    @Override // wr.k3
    public wr.k3 shutdownNow() {
        return this.f92844a.shutdownNow();
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", this.f92844a).toString();
    }
}
