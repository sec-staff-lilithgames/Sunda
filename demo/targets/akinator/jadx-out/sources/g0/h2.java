package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 extends a2.x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final float f56441e;

    /* renamed from: f, reason: collision with root package name */
    public final float f56442f;

    /* renamed from: g, reason: collision with root package name */
    public final float f56443g;

    /* renamed from: h, reason: collision with root package name */
    public final float f56444h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56445i;

    public h2(float f10, float f11, float f12, float f13, boolean z10, kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
        this.f56441e = f10;
        this.f56442f = f11;
        this.f56443g = f12;
        this.f56444h = f13;
        this.f56445i = z10;
        if ((f10 < 0.0f && !s2.i.m6822equalsimpl0(f10, s2.i.f85335c.m6814getUnspecifiedD9Ej5fM())) || ((f11 < 0.0f && !s2.i.m6822equalsimpl0(f11, s2.i.f85335c.m6814getUnspecifiedD9Ej5fM())) || ((f12 < 0.0f && !s2.i.m6822equalsimpl0(f12, s2.i.f85335c.m6814getUnspecifiedD9Ej5fM())) || (f13 < 0.0f && !s2.i.m6822equalsimpl0(f13, s2.i.f85335c.m6814getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        h2 h2Var = obj instanceof h2 ? (h2) obj : null;
        return h2Var != null && s2.i.m6822equalsimpl0(this.f56441e, h2Var.f56441e) && s2.i.m6822equalsimpl0(this.f56442f, h2Var.f56442f) && s2.i.m6822equalsimpl0(this.f56443g, h2Var.f56443g) && s2.i.m6822equalsimpl0(this.f56444h, h2Var.f56444h) && this.f56445i == h2Var.f56445i;
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m3885getBottomD9Ej5fM() {
        return this.f56444h;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m3886getEndD9Ej5fM() {
        return this.f56443g;
    }

    public final boolean getRtlAware() {
        return this.f56445i;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m3887getStartD9Ej5fM() {
        return this.f56441e;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m3888getTopD9Ej5fM() {
        return this.f56442f;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f56445i) + ((s2.i.m6823hashCodeimpl(this.f56444h) + ((s2.i.m6823hashCodeimpl(this.f56443g) + ((s2.i.m6823hashCodeimpl(this.f56442f) + (s2.i.m6823hashCodeimpl(this.f56441e) * 31)) * 31)) * 31)) * 31);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        int iMo3419roundToPx0680j_4 = measure.mo3419roundToPx0680j_4(this.f56443g) + measure.mo3419roundToPx0680j_4(this.f56441e);
        int iMo3419roundToPx0680j_42 = measure.mo3419roundToPx0680j_4(this.f56444h) + measure.mo3419roundToPx0680j_4(this.f56442f);
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(s2.d.m6774offsetNN6EwU(j10, -iMo3419roundToPx0680j_4, -iMo3419roundToPx0680j_42));
        return x1.a1.layout$default(measure, s2.d.m6772constrainWidthK40F9xA(j10, q1VarMo7826measureBRTryo0.getWidth() + iMo3419roundToPx0680j_4), s2.d.m6771constrainHeightK40F9xA(j10, q1VarMo7826measureBRTryo0.getHeight() + iMo3419roundToPx0680j_42), null, new g2(this, q1VarMo7826measureBRTryo0, measure), 4, null);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public /* synthetic */ h2(float f10, float f11, float f12, float f13, boolean z10, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s2.i.m6817constructorimpl(0) : f10, (i10 & 2) != 0 ? s2.i.m6817constructorimpl(0) : f11, (i10 & 4) != 0 ? s2.i.m6817constructorimpl(0) : f12, (i10 & 8) != 0 ? s2.i.m6817constructorimpl(0) : f13, z10, lVar, null);
    }
}
