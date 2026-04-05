package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f8189b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8190c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8191e;

    public s0(mt.b0 b0Var, st.o oVar, boolean z10) {
        this.f8189b = b0Var;
        this.f8190c = oVar;
        this.f8191e = z10;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.b0 b0Var = this.f8189b;
        st.o oVar = this.f8190c;
        if (jh.i.R(b0Var, oVar, i0Var)) {
            return;
        }
        b0Var.subscribe(new r0(i0Var, oVar, this.f8191e));
    }
}
