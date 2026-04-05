package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p7 extends tc {
    public final /* synthetic */ wr.k4 E;
    public final /* synthetic */ wr.i F;
    public final /* synthetic */ wr.u0 G;
    public final /* synthetic */ q7 H;

    /* JADX WARN: Illegal instructions before constructor call */
    public p7(q7 q7Var, wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, uc ucVar, e5 e5Var, wr.u0 u0Var) {
        this.H = q7Var;
        this.E = k4Var;
        this.F = iVar;
        this.G = u0Var;
        u8 u8Var = q7Var.f92923b;
        androidx.recyclerview.widget.l1 l1Var = u8Var.f93102c0;
        long j10 = u8Var.f93104d0;
        long j11 = u8Var.f93106e0;
        Executor executor = iVar.getExecutor();
        super(k4Var, e4Var, l1Var, j10, j11, executor == null ? u8Var.f93119l : executor, q7Var.f92923b.f93113i.getScheduledExecutorService(), ucVar, e5Var, q7Var.f92922a);
    }
}
