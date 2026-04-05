package xr;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h8 extends wr.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f92587a;

    public h8(q8 q8Var) {
        this.f92587a = q8Var;
    }

    @Override // wr.j
    public String authority() {
        return this.f92587a.f92925b;
    }

    @Override // wr.j
    public <RequestT, ResponseT> wr.p newCall(wr.k4 k4Var, wr.i iVar) {
        u8 u8Var = this.f92587a.f92927d;
        Logger logger = u8.f93089l0;
        Executor executor = iVar.getExecutor();
        if (executor == null) {
            executor = u8Var.f93119l;
        }
        u8 u8Var2 = this.f92587a.f92927d;
        j1 j1Var = new j1(k4Var, executor, iVar, u8Var2.f93114i0, u8Var2.Q ? null : this.f92587a.f92927d.f93113i.getScheduledExecutorService(), this.f92587a.f92927d.T);
        u8 u8Var3 = this.f92587a.f92927d;
        j1Var.f92690q = u8Var3.f93127t;
        j1Var.f92691r = u8Var3.f93128u;
        return j1Var;
    }
}
