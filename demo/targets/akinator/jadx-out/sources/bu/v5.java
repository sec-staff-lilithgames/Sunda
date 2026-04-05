package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v5 extends mt.b0 implements vt.m {

    /* renamed from: b, reason: collision with root package name */
    public final Object f11119b;

    public v5(Object obj) {
        this.f11119b = obj;
    }

    @Override // vt.m, java.util.concurrent.Callable
    public Object call() {
        return this.f11119b;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        i9 i9Var = new i9(i0Var, this.f11119b);
        i0Var.onSubscribe(i9Var);
        i9Var.run();
    }
}
