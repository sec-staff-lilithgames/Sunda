package xr;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x6 implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f93234c = Logger.getLogger(x6.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f93235b;

    public x6(Runnable runnable) {
        this.f93235b = (Runnable) mh.p1.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f93235b;
        try {
            runnable.run();
        } catch (Throwable th2) {
            f93234c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
            mh.g3.throwIfUnchecked(th2);
            throw new AssertionError(th2);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f93235b + ")";
    }
}
