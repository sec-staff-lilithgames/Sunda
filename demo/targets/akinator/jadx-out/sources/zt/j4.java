package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j4 extends mt.b0 implements vt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98661b;

    public j4(mt.y yVar) {
        this.f98661b = yVar;
    }

    public static <T> mt.v create(mt.i0 i0Var) {
        return new i4(i0Var);
    }

    @Override // vt.f
    public mt.y source() {
        return this.f98661b;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f98661b.subscribe(create(i0Var));
    }
}
