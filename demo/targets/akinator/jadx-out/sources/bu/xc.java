package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xc extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f11225c;

    /* renamed from: e, reason: collision with root package name */
    public final int f11226e;

    public xc(mt.g0 g0Var, Callable<? extends mt.g0> callable, int i10) {
        super(g0Var);
        this.f11225c = callable;
        this.f11226e = i10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new wc(i0Var, this.f11226e, this.f11225c));
    }
}
