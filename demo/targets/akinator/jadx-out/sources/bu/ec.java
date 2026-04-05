package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ec extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10279b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f10280c;

    public ec(mt.g0 g0Var, int i10) {
        this.f10279b = g0Var;
        this.f10280c = ut.m0.createArrayList(i10);
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new cc(this.f10279b, (Callable<Collection<Object>>) this.f10280c));
    }

    @Override // mt.n0
    public void subscribeActual(mt.q0 q0Var) {
        try {
            this.f10279b.subscribe(new dc(q0Var, (Collection) ut.o0.requireNonNull(this.f10280c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, q0Var);
        }
    }

    public ec(mt.g0 g0Var, Callable<Collection<Object>> callable) {
        this.f10279b = g0Var;
        this.f10280c = callable;
    }
}
