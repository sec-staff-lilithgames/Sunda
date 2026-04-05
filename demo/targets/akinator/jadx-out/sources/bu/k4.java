package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k4 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f10516b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10517c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f10518e;

    public k4(Callable<Object> callable, st.c cVar, st.g gVar) {
        this.f10516b = callable;
        this.f10517c = cVar;
        this.f10518e = gVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            j4 j4Var = new j4(i0Var, this.f10517c, this.f10518e, this.f10516b.call());
            i0Var.onSubscribe(j4Var);
            j4Var.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, i0Var);
        }
    }
}
