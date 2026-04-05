package sh;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85877a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f85878b;

    public x0(b5 b5Var, boolean z10) {
        this.f85877a = z10;
        this.f85878b = b5Var;
    }

    public <C> n1 call(Callable<C> callable, Executor executor) {
        k0 k0Var = new k0(this.f85878b, this.f85877a, false);
        k0Var.f85829r = new i0(k0Var, callable, executor);
        k0Var.r();
        return k0Var;
    }

    public <C> n1 callAsync(d0 d0Var, Executor executor) {
        k0 k0Var = new k0(this.f85878b, this.f85877a, false);
        k0Var.f85829r = new h0(k0Var, executor);
        k0Var.r();
        return k0Var;
    }

    public n1 run(Runnable runnable, Executor executor) {
        return call(new w0(runnable), executor);
    }
}
