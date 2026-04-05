package xr;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class bd implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f92289e = Logger.getLogger(bd.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public boolean f92290b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayDeque f92291c;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f92291c.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th2) {
                f92289e.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mh.p1.checkNotNull(runnable, "'task' must not be null.");
        if (this.f92290b) {
            if (this.f92291c == null) {
                this.f92291c = new ArrayDeque(4);
            }
            this.f92291c.add(runnable);
            return;
        }
        this.f92290b = true;
        try {
            runnable.run();
        } catch (Throwable th2) {
            try {
                f92289e.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
                if (this.f92291c != null) {
                    a();
                }
                this.f92290b = false;
            } finally {
                if (this.f92291c != null) {
                    a();
                }
                this.f92290b = false;
            }
        }
    }
}
