package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b6 extends m4 {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f92271a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f92272b;

    public b6(a2 a2Var, v0 v0Var) {
        this.f92271a = a2Var;
        this.f92272b = v0Var;
    }

    @Override // xr.m4
    public final a2 a() {
        return this.f92271a;
    }

    @Override // xr.m4, xr.a2, xr.h9, xr.o1
    public k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        return new a6(this, super.newStream(k4Var, e4Var, iVar, uVarArr));
    }
}
