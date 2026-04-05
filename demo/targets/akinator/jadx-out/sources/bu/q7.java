package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q7 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10855b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f10856c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f10857e;

    public q7(mt.g0 g0Var, Callable<Object> callable, st.c cVar) {
        this.f10855b = g0Var;
        this.f10856c = callable;
        this.f10857e = cVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        try {
            this.f10855b.subscribe(new o7(q0Var, this.f10857e, ut.o0.requireNonNull(this.f10856c.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, q0Var);
        }
    }
}
