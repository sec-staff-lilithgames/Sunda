package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j2 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10448b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10449c;

    public j2(mt.g0 g0Var, mt.g0 g0Var2) {
        this.f10448b = g0Var;
        this.f10449c = g0Var2;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        tt.h hVar = new tt.h();
        i0Var.onSubscribe(hVar);
        this.f10449c.subscribe(new i2(this, hVar, i0Var));
    }
}
