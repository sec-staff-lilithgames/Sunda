package wr;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f91141f = Logger.getLogger(u0.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final u0 f91142g = new u0();

    /* renamed from: b, reason: collision with root package name */
    public final n0 f91143b;

    /* renamed from: c, reason: collision with root package name */
    public final e5 f91144c;

    /* renamed from: e, reason: collision with root package name */
    public final int f91145e;

    public u0(e5 e5Var, int i10) {
        this.f91143b = null;
        this.f91144c = e5Var;
        this.f91145e = i10;
        if (i10 == 1000) {
            f91141f.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static u0 current() {
        u0 u0VarCurrent = s0.f91124a.current();
        return u0VarCurrent == null ? f91142g : u0VarCurrent;
    }

    public static Executor currentContextExecutor(Executor executor) {
        return new i0(executor);
    }

    public static <T> r0 key(String str) {
        return new r0(str, null);
    }

    public static <T> r0 keyWithDefault(String str, T t10) {
        return new r0(str, t10);
    }

    public void addListener(o0 o0Var, Executor executor) {
        a(o0Var, "cancellationListener");
        a(executor, "executor");
        n0 n0Var = this.f91143b;
        if (n0Var == null) {
            return;
        }
        n0Var.b(new q0(executor, o0Var, this));
    }

    public u0 attach() {
        u0 u0VarDoAttach = s0.f91124a.doAttach(this);
        return u0VarDoAttach == null ? f91142g : u0VarDoAttach;
    }

    public <V> V call(Callable<V> callable) throws Exception {
        u0 u0VarAttach = attach();
        try {
            return callable.call();
        } finally {
            detach(u0VarAttach);
        }
    }

    public Throwable cancellationCause() {
        n0 n0Var = this.f91143b;
        if (n0Var == null) {
            return null;
        }
        return n0Var.cancellationCause();
    }

    public void detach(u0 u0Var) {
        a(u0Var, "toAttach");
        s0.f91124a.detach(this, u0Var);
    }

    public Executor fixedContextExecutor(Executor executor) {
        return new j0(this, executor);
    }

    public u0 fork() {
        return new u0(this.f91144c, this.f91145e + 1);
    }

    public z0 getDeadline() {
        n0 n0Var = this.f91143b;
        if (n0Var == null) {
            return null;
        }
        return n0Var.getDeadline();
    }

    public boolean isCancelled() {
        n0 n0Var = this.f91143b;
        if (n0Var == null) {
            return false;
        }
        return n0Var.isCancelled();
    }

    public void removeListener(o0 o0Var) {
        n0 n0Var = this.f91143b;
        if (n0Var == null) {
            return;
        }
        n0Var.c(o0Var, this);
    }

    public void run(Runnable runnable) {
        u0 u0VarAttach = attach();
        try {
            runnable.run();
        } finally {
            detach(u0VarAttach);
        }
    }

    public n0 withCancellation() {
        return new n0(this);
    }

    public n0 withDeadline(z0 z0Var, ScheduledExecutorService scheduledExecutorService) {
        boolean z10;
        a(z0Var, "deadline");
        a(scheduledExecutorService, "scheduler");
        z0 deadline = getDeadline();
        if (deadline == null || deadline.compareTo(z0Var) > 0) {
            z10 = true;
        } else {
            z10 = false;
            z0Var = deadline;
        }
        n0 n0Var = new n0(this, z0Var);
        if (z10) {
            if (!z0Var.isExpired()) {
                synchronized (n0Var) {
                    n0Var.f91059m = z0Var.runOnExpiration(new m0(n0Var), scheduledExecutorService);
                }
                return n0Var;
            }
            n0Var.cancel(new TimeoutException("context timed out"));
        }
        return n0Var;
    }

    public n0 withDeadlineAfter(long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return withDeadline(z0.after(j10, timeUnit), scheduledExecutorService);
    }

    public <V> u0 withValue(r0 r0Var, V v10) {
        return new u0(this, kotlin.jvm.internal.d0.A(this.f91144c, r0Var, v10));
    }

    public <V1, V2> u0 withValues(r0 r0Var, V1 v12, r0 r0Var2, V2 v22) {
        return new u0(this, kotlin.jvm.internal.d0.A(kotlin.jvm.internal.d0.A(this.f91144c, r0Var, v12), r0Var2, v22));
    }

    public Runnable wrap(Runnable runnable) {
        return new h0(this, runnable);
    }

    public <C> Callable<C> wrap(Callable<C> callable) {
        return new k0(this, callable);
    }

    public <V1, V2, V3> u0 withValues(r0 r0Var, V1 v12, r0 r0Var2, V2 v22, r0 r0Var3, V3 v32) {
        return new u0(this, kotlin.jvm.internal.d0.A(kotlin.jvm.internal.d0.A(kotlin.jvm.internal.d0.A(this.f91144c, r0Var, v12), r0Var2, v22), r0Var3, v32));
    }

    public u0(u0 u0Var, e5 e5Var) {
        n0 n0Var;
        if (u0Var instanceof n0) {
            n0Var = (n0) u0Var;
        } else {
            n0Var = u0Var.f91143b;
        }
        this.f91143b = n0Var;
        this.f91144c = e5Var;
        int i10 = u0Var.f91145e + 1;
        this.f91145e = i10;
        if (i10 == 1000) {
            f91141f.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public <V1, V2, V3, V4> u0 withValues(r0 r0Var, V1 v12, r0 r0Var2, V2 v22, r0 r0Var3, V3 v32, r0 r0Var4, V4 v42) {
        return new u0(this, kotlin.jvm.internal.d0.A(kotlin.jvm.internal.d0.A(kotlin.jvm.internal.d0.A(kotlin.jvm.internal.d0.A(this.f91144c, r0Var, v12), r0Var2, v22), r0Var3, v32), r0Var4, v42));
    }

    public u0() {
        this.f91143b = null;
        this.f91144c = null;
        this.f91145e = 0;
    }
}
