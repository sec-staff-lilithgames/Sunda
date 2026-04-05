package zt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r4 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f98760b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98761c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f98762e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98763f;

    public r4(Callable<Object> callable, st.o oVar, st.g gVar, boolean z10) {
        this.f98760b = callable;
        this.f98761c = oVar;
        this.f98762e = gVar;
        this.f98763f = z10;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        boolean z10 = this.f98763f;
        st.g gVar = this.f98762e;
        try {
            Object objCall = this.f98760b.call();
            try {
                ((mt.y) ut.o0.requireNonNull(this.f98761c.apply(objCall), "The sourceSupplier returned a null MaybeSource")).subscribe(new q4(vVar, objCall, gVar, z10));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                if (z10) {
                    try {
                        gVar.accept(objCall);
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        tt.e.error(new qt.c(th2, th3), vVar);
                        return;
                    }
                }
                tt.e.error(th2, vVar);
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
            tt.e.error(th5, vVar);
        }
    }
}
