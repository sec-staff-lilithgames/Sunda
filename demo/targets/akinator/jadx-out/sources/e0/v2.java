package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 implements o2, n2 {

    /* renamed from: a, reason: collision with root package name */
    public final v5 f53345a;

    /* renamed from: b, reason: collision with root package name */
    public d3 f53346b;

    public v2(v5 scrollLogic) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.f53345a = scrollLogic;
        this.f53346b = p3.f53240a;
    }

    @Override // e0.o2
    public void dispatchRawDelta(float f10) {
        z3 z3Var = (z3) this.f53345a.getValue();
        z3Var.m3795performRawScrollMKHz9U(z3Var.m3799toOffsettuRUvjQ(f10));
    }

    @Override // e0.o2
    public Object drag(d0.l3 l3Var, kv.p pVar, zu.d<? super tu.x0> dVar) {
        ((z3) this.f53345a.getValue()).getScrollableState();
        new u2(this, pVar, null);
        throw null;
    }

    @Override // e0.n2
    /* renamed from: dragBy-Uv8p0NA */
    public void mo3765dragByUv8p0NA(float f10, long j10) {
        z3 z3Var = (z3) this.f53345a.getValue();
        z3Var.m3793dispatchScrollf0eR0lY(this.f53346b, z3Var.m3799toOffsettuRUvjQ(f10), i1.h.m4174boximpl(j10), t1.o.f86279b.m7020getDragWNlRxjI());
    }

    public final d3 getLatestScrollScope() {
        return this.f53346b;
    }

    public final v5 getScrollLogic() {
        return this.f53345a;
    }

    public final void setLatestScrollScope(d3 d3Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d3Var, "<set-?>");
        this.f53346b = d3Var;
    }
}
