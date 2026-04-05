package sh;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public f2 f85800b;

    @Override // java.lang.Runnable
    public void run() {
        n1 n1Var;
        f2 f2Var = this.f85800b;
        if (f2Var == null || (n1Var = f2Var.f85806j) == null) {
            return;
        }
        this.f85800b = null;
        if (n1Var.isDone()) {
            f2Var.setFuture(n1Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = f2Var.f85807k;
            f2Var.f85807k = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    f2Var.setException(new e2(str));
                    throw th2;
                }
            }
            f2Var.setException(new e2(str + ": " + n1Var));
        } finally {
            n1Var.cancel(true);
        }
    }
}
