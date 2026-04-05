package xt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c2 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f93386b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f93387c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f93388e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93389f;

    public c2(Callable<Object> callable, st.o oVar, st.g gVar, boolean z10) {
        this.f93386b = callable;
        this.f93387c = oVar;
        this.f93388e = gVar;
        this.f93389f = z10;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        boolean z10 = this.f93389f;
        st.g gVar = this.f93388e;
        try {
            Object objCall = this.f93386b.call();
            try {
                ((mt.i) ut.o0.requireNonNull(this.f93387c.apply(objCall), "The completableFunction returned a null CompletableSource")).subscribe(new b2(fVar, objCall, gVar, z10));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                if (z10) {
                    try {
                        gVar.accept(objCall);
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        tt.e.error(new qt.c(th2, th3), fVar);
                        return;
                    }
                }
                tt.e.error(th2, fVar);
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
            tt.e.error(th5, fVar);
        }
    }
}
