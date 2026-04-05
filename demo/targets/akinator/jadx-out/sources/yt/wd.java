package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class wd extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96517b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96518c;

    public wd(mt.l lVar) {
        this(lVar, iu.c.asCallable());
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new ud(this.f96517b, this.f96518c));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        try {
            this.f96517b.subscribe((mt.q) new vd(q0Var, (Collection) ut.o0.requireNonNull(this.f96518c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, q0Var);
        }
    }

    public wd(mt.l lVar, Callable<Collection<Object>> callable) {
        this.f96517b = lVar;
        this.f96518c = callable;
    }
}
