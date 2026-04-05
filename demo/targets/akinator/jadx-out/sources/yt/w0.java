package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.l f96477b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96478c;

    /* renamed from: e, reason: collision with root package name */
    public final st.b f96479e;

    public w0(mt.l lVar, Callable<Object> callable, st.b bVar) {
        this.f96477b = lVar;
        this.f96478c = callable;
        this.f96479e = bVar;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new u0(this.f96477b, this.f96478c, this.f96479e));
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        try {
            this.f96477b.subscribe((mt.q) new v0(q0Var, ut.o0.requireNonNull(this.f96478c.call(), "The initialSupplier returned a null value"), this.f96479e));
        } catch (Throwable th2) {
            tt.e.error(th2, q0Var);
        }
    }
}
