package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jc extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f10477b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10478c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f10479e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10480f;

    public jc(Callable<Object> callable, st.o oVar, st.g gVar, boolean z10) {
        this.f10477b = callable;
        this.f10478c = oVar;
        this.f10479e = gVar;
        this.f10480f = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        st.g gVar = this.f10479e;
        try {
            Object objCall = this.f10477b.call();
            try {
                ((mt.g0) ut.o0.requireNonNull(this.f10478c.apply(objCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new ic(i0Var, objCall, gVar, this.f10480f));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                try {
                    gVar.accept(objCall);
                    tt.e.error(th2, i0Var);
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    tt.e.error(new qt.c(th2, th3), i0Var);
                }
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            tt.e.error(th4, i0Var);
        }
    }
}
