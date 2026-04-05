package xr;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p8 extends u2 {

    /* renamed from: l, reason: collision with root package name */
    public final wr.u0 f92876l;

    /* renamed from: m, reason: collision with root package name */
    public final wr.k4 f92877m;

    /* renamed from: n, reason: collision with root package name */
    public final wr.i f92878n;

    /* renamed from: o, reason: collision with root package name */
    public final long f92879o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q8 f92880p;

    /* JADX WARN: Illegal instructions before constructor call */
    public p8(q8 q8Var, wr.u0 u0Var, wr.k4 k4Var, wr.i iVar) {
        this.f92880p = q8Var;
        u8 u8Var = q8Var.f92927d;
        Logger logger = u8.f93089l0;
        Executor executor = iVar.getExecutor();
        super(executor == null ? u8Var.f93119l : executor, u8Var.f93117k, iVar.getDeadline());
        this.f92876l = u0Var;
        this.f92877m = k4Var;
        this.f92878n = iVar;
        this.f92879o = u8Var.f93110g0.nanoTime();
    }

    public final void d() {
        wr.i iVar = this.f92878n;
        q8 q8Var = this.f92880p;
        u8 u8Var = q8Var.f92927d;
        wr.u0 u0Var = this.f92876l;
        wr.u0 u0VarAttach = u0Var.attach();
        try {
            wr.p pVarA = q8Var.a(this.f92877m, iVar.withOption(wr.u.f91140a, Long.valueOf(u8Var.f93110g0.nanoTime() - this.f92879o)));
            u0Var.detach(u0VarAttach);
            Runnable call = setCall(pVarA);
            if (call == null) {
                u8Var.f93126s.execute(new o8(this));
                return;
            }
            Executor executor = iVar.getExecutor();
            if (executor == null) {
                executor = u8Var.f93119l;
            }
            executor.execute(new n8(this, call));
        } catch (Throwable th2) {
            u0Var.detach(u0VarAttach);
            throw th2;
        }
    }
}
