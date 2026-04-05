package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f11108c;

    /* renamed from: e, reason: collision with root package name */
    public final st.b f11109e;

    public v0(mt.g0 g0Var, Callable<Object> callable, st.b bVar) {
        super(g0Var);
        this.f11108c = callable;
        this.f11109e = bVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        try {
            this.f10053b.subscribe(new u0(i0Var, ut.o0.requireNonNull(this.f11108c.call(), "The initialSupplier returned a null value"), this.f11109e));
        } catch (Throwable th2) {
            tt.e.error(th2, i0Var);
        }
    }
}
