package w6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z implements x6.a {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f90440c;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f90441e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f90439b = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final Object f90442f = new Object();

    public z(Executor executor) {
        this.f90440c = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f90439b.poll();
        this.f90441e = runnable;
        if (runnable != null) {
            this.f90440c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f90442f) {
            try {
                this.f90439b.add(new y(this, runnable));
                if (this.f90441e == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Executor getDelegatedExecutor() {
        return this.f90440c;
    }

    @Override // x6.a
    public boolean hasPendingTasks() {
        boolean z10;
        synchronized (this.f90442f) {
            z10 = !this.f90439b.isEmpty();
        }
        return z10;
    }
}
