package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 extends mt.n0 implements vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f11196b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f11197c;

    /* renamed from: e, reason: collision with root package name */
    public final st.b f11198e;

    public x0(mt.g0 g0Var, Callable<Object> callable, st.b bVar) {
        this.f11196b = g0Var;
        this.f11197c = callable;
        this.f11198e = bVar;
    }

    @Override // vt.d
    public mt.b0 fuseToObservable() {
        return mu.a.onAssembly(new v0(this.f11196b, this.f11197c, this.f11198e));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        try {
            this.f11196b.subscribe(new w0(q0Var, ut.o0.requireNonNull(this.f11197c.call(), "The initialSupplier returned a null value"), this.f11198e));
        } catch (Throwable th2) {
            tt.e.error(th2, q0Var);
        }
    }
}
