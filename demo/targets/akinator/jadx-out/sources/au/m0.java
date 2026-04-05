package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f8133b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8134c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8135e;

    public m0(mt.b0 b0Var, st.o oVar, boolean z10) {
        this.f8133b = b0Var;
        this.f8134c = oVar;
        this.f8135e = z10;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        mt.b0 b0Var = this.f8133b;
        st.o oVar = this.f8134c;
        if (jh.i.P(b0Var, oVar, fVar)) {
            return;
        }
        b0Var.subscribe(new l0(fVar, oVar, this.f8135e));
    }
}
