package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o9 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10756c;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f10757e;

    public o9(mt.g0 g0Var, Callable<Object> callable, st.c cVar) {
        super(g0Var);
        this.f10756c = cVar;
        this.f10757e = callable;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            this.f10053b.subscribe(new n9(i0Var, this.f10756c, ut.o0.requireNonNull(this.f10757e.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
