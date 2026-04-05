package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e6 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10258c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10259e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f10260f;

    public e6(mt.g0 g0Var, st.o oVar, st.o oVar2, Callable<? extends mt.g0> callable) {
        super(g0Var);
        this.f10258c = oVar;
        this.f10259e = oVar2;
        this.f10260f = callable;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new d6(i0Var, this.f10258c, this.f10259e, this.f10260f));
    }
}
