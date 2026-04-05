package xr;

import com.ironsource.C3191e4;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l7 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u8 f92758a;

    public l7(u8 u8Var) {
        this.f92758a = u8Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        Logger logger = u8.f93089l0;
        Level level = Level.SEVERE;
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        u8 u8Var = this.f92758a;
        sb2.append(u8Var.getLogId());
        sb2.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb2.toString(), th2);
        if (u8Var.G) {
            return;
        }
        u8Var.G = true;
        u8Var.d(true);
        u8Var.i(false);
        e7 e7Var = new e7(th2);
        u8Var.F = e7Var;
        u8Var.L.b(e7Var);
        u8Var.X.b(null);
        u8Var.V.log(wr.l.f91020f, "PANIC! Entering TRANSIENT_FAILURE");
        u8Var.f93131x.a(wr.f0.f90914e);
    }
}
