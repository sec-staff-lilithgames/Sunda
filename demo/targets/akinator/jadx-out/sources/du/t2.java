package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t2 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52846b;

    public t2(mt.t0 t0Var) {
        this.f52846b = t0Var;
    }

    public static <T> mt.q0 create(mt.i0 i0Var) {
        return new s2(i0Var);
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f52846b.subscribe(create(i0Var));
    }
}
