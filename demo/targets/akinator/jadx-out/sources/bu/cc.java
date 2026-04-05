package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class cc extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f10186c;

    public cc(mt.g0 g0Var, int i10) {
        super(g0Var);
        this.f10186c = ut.m0.createArrayList(i10);
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            this.f10053b.subscribe(new bc(i0Var, (Collection) ut.o0.requireNonNull(this.f10186c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }

    public cc(mt.g0 g0Var, Callable<Collection<Object>> callable) {
        super(g0Var);
        this.f10186c = callable;
    }
}
