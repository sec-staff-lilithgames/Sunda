package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.y f8216b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8217c;

    public y(mt.y yVar, st.o oVar) {
        this.f8216b = yVar;
        this.f8217c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        x xVar = new x(i0Var, this.f8217c);
        i0Var.onSubscribe(xVar);
        this.f8216b.subscribe(xVar);
    }
}
