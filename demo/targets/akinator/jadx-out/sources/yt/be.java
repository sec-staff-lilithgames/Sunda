package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class be extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95237c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95238e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f95239f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95240g;

    public be(Callable<Object> callable, st.o oVar, st.g gVar, boolean z10) {
        this.f95237c = callable;
        this.f95238e = oVar;
        this.f95239f = gVar;
        this.f95240g = z10;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        st.g gVar = this.f95239f;
        try {
            Object objCall = this.f95237c.call();
            try {
                ((tw.b) ut.o0.requireNonNull(this.f95238e.apply(objCall), "The sourceSupplier returned a null Publisher")).subscribe(new ae(cVar, objCall, gVar, this.f95240g));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                try {
                    gVar.accept(objCall);
                    hu.d.error(th2, cVar);
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    hu.d.error(new qt.c(th2, th3), cVar);
                }
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            hu.d.error(th4, cVar);
        }
    }
}
