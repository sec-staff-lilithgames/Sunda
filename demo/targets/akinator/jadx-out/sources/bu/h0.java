package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f10371c;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f10372e;

    public h0(mt.g0 g0Var, Callable<? extends mt.g0> callable, Callable<Collection<Object>> callable2) {
        super(g0Var);
        this.f10371c = callable;
        this.f10372e = callable2;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new g0(new ku.m(i0Var), this.f10372e, this.f10371c));
    }
}
