package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10489c;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f10490e;

    public k0(mt.g0 g0Var, mt.g0 g0Var2, Callable<Collection<Object>> callable) {
        super(g0Var);
        this.f10489c = g0Var2;
        this.f10490e = callable;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new j0(new ku.m(i0Var), this.f10490e, this.f10489c));
    }
}
