package du;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f52878b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52879c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f52880e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f52881f;

    public x2(Callable<Object> callable, st.o oVar, st.g gVar, boolean z10) {
        this.f52878b = callable;
        this.f52879c = oVar;
        this.f52880e = gVar;
        this.f52881f = z10;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        st.g gVar = this.f52880e;
        boolean z10 = this.f52881f;
        try {
            Object objCall = this.f52878b.call();
            try {
                ((mt.t0) ut.o0.requireNonNull(this.f52879c.apply(objCall), "The singleFunction returned a null SingleSource")).subscribe(new w2(q0Var, objCall, z10, gVar));
            } catch (Throwable th2) {
                th = th2;
                qt.d.throwIfFatal(th);
                if (z10) {
                    try {
                        gVar.accept(objCall);
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        th = new qt.c(th, th3);
                    }
                }
                tt.e.error(th, q0Var);
                if (z10) {
                    return;
                }
                try {
                    gVar.accept(objCall);
                } catch (Throwable th4) {
                    qt.d.throwIfFatal(th4);
                    mu.a.onError(th4);
                }
            }
        } catch (Throwable th5) {
            qt.d.throwIfFatal(th5);
            tt.e.error(th5, q0Var);
        }
    }
}
