package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f8031b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8032c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.k f8033e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8034f;

    public d0(mt.b0 b0Var, st.o oVar, iu.k kVar, int i10) {
        this.f8031b = b0Var;
        this.f8032c = oVar;
        this.f8033e = kVar;
        this.f8034f = i10;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        mt.b0 b0Var = this.f8031b;
        st.o oVar = this.f8032c;
        if (jh.i.P(b0Var, oVar, fVar)) {
            return;
        }
        b0Var.subscribe(new c0(fVar, oVar, this.f8033e, this.f8034f));
    }
}
