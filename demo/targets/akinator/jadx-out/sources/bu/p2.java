package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10790c;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f10791e;

    public p2(mt.g0 g0Var, st.o oVar, Callable<? extends Collection<Object>> callable) {
        super(g0Var);
        this.f10790c = oVar;
        this.f10791e = callable;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        try {
            this.f10053b.subscribe(new o2(i0Var, this.f10790c, (Collection) ut.o0.requireNonNull(this.f10791e.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
