package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98693b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98694c;

    public m1(mt.y yVar, st.o oVar) {
        this.f98693b = yVar;
        this.f98694c = oVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f98693b.subscribe(new k1(q0Var, this.f98694c));
    }
}
