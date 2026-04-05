package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f98616b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98617c;

    public g1(mt.y yVar, st.o oVar) {
        this.f98616b = yVar;
        this.f98617c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f98616b.subscribe(new f1(i0Var, this.f98617c));
    }
}
