package sh;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class j0 extends l1 {

    /* renamed from: e, reason: collision with root package name */
    public final Executor f85826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f85827f;

    public j0(k0 k0Var, Executor executor) {
        this.f85827f = k0Var;
        this.f85826e = (Executor) mh.p1.checkNotNull(executor);
    }

    @Override // sh.l1
    public final void a(Throwable th2) {
        k0 k0Var = this.f85827f;
        k0Var.f85829r = null;
        if (th2 instanceof ExecutionException) {
            k0Var.setException(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            k0Var.cancel(false);
        } else {
            k0Var.setException(th2);
        }
    }

    @Override // sh.l1
    public final void b(Object obj) {
        this.f85827f.f85829r = null;
        h(obj);
    }

    @Override // sh.l1
    public final boolean d() {
        return this.f85827f.isDone();
    }

    public abstract void h(Object obj);
}
