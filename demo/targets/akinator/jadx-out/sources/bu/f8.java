package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f8 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f10308b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10309c;

    public f8(Callable callable, st.o oVar) {
        this.f10308b = callable;
        this.f10309c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        try {
            ju.a aVar = (ju.a) ut.o0.requireNonNull(this.f10308b.call(), "The connectableFactory returned a null ConnectableObservable");
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10309c.apply(aVar), "The selector returned a null ObservableSource");
            rd rdVar = new rd(i0Var);
            g0Var.subscribe(rdVar);
            aVar.connect(new d8(rdVar));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
