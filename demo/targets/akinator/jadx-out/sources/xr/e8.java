package xr;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g8 f92468c;

    public e8(g8 g8Var, wr.m6 m6Var) {
        this.f92468c = g8Var;
        this.f92467b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger = u8.f93089l0;
        Level level = Level.WARNING;
        g8 g8Var = this.f92468c;
        u8 u8Var = g8Var.f92561c;
        wr.n2 logId = u8Var.getLogId();
        wr.m6 m6Var = this.f92467b;
        logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{logId, m6Var});
        q8 q8Var = u8Var.X;
        if (q8Var.f92924a.get() == u8.f93095r0) {
            q8Var.b(null);
        }
        if (u8Var.f93118k0 != 3) {
            u8Var.V.log(wr.l.f91019e, "Failed to resolve name: {0}", m6Var);
            u8Var.f93118k0 = 3;
        }
        d8 d8Var = g8Var.f92559a;
        if (d8Var != u8Var.E) {
            return;
        }
        d8Var.f92425a.getDelegate().handleNameResolutionError(m6Var);
    }
}
