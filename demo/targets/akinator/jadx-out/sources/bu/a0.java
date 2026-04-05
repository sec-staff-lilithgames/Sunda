package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final int f10054c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10055e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f10056f;

    public a0(mt.g0 g0Var, int i10, int i11, Callable<Collection<Object>> callable) {
        super(g0Var);
        this.f10054c = i10;
        this.f10055e = i11;
        this.f10056f = callable;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.g0 g0Var = this.f10053b;
        Callable callable = this.f10056f;
        int i10 = this.f10055e;
        int i11 = this.f10054c;
        if (i10 != i11) {
            g0Var.subscribe(new z(i0Var, i11, i10, callable));
            return;
        }
        y yVar = new y(i0Var, i11, callable);
        if (yVar.a()) {
            g0Var.subscribe(yVar);
        }
    }
}
