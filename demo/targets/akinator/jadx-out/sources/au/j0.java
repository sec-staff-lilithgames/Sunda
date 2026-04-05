package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f8100b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8101c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.k f8102e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8103f;

    public j0(mt.b0 b0Var, st.o oVar, iu.k kVar, int i10) {
        this.f8100b = b0Var;
        this.f8101c = oVar;
        this.f8102e = kVar;
        this.f8103f = i10;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.b0 b0Var = this.f8100b;
        st.o oVar = this.f8101c;
        if (jh.i.R(b0Var, oVar, i0Var)) {
            return;
        }
        b0Var.subscribe(new i0(i0Var, oVar, this.f8103f, this.f8102e));
    }
}
