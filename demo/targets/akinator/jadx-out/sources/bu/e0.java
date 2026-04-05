package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f10233c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f10234e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f10235f;

    public e0(mt.g0 g0Var, mt.g0 g0Var2, st.o oVar, Callable<Collection<Object>> callable) {
        super(g0Var);
        this.f10234e = g0Var2;
        this.f10235f = oVar;
        this.f10233c = callable;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        c0 c0Var = new c0(i0Var, this.f10234e, this.f10235f, this.f10233c);
        i0Var.onSubscribe(c0Var);
        this.f10053b.subscribe(c0Var);
    }
}
