package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h9 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f95594b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95595c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95596e;

    public h9(tw.b bVar, Callable<Object> callable, st.c cVar) {
        this.f95594b = bVar;
        this.f95595c = callable;
        this.f95596e = cVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        try {
            this.f95594b.subscribe(new f9(q0Var, this.f95596e, ut.o0.requireNonNull(this.f95595c.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, q0Var);
        }
    }
}
