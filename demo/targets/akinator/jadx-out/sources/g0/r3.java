package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 extends a2.x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final float f56571e;

    /* renamed from: f, reason: collision with root package name */
    public final float f56572f;

    public /* synthetic */ r3(float f10, float f11, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f11, lVar, null);
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
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return s2.i.m6822equalsimpl0(this.f56571e, r3Var.f56571e) && s2.i.m6822equalsimpl0(this.f56572f, r3Var.f56572f);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m3927getMinHeightD9Ej5fM() {
        return this.f56572f;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m3928getMinWidthD9Ej5fM() {
        return this.f56571e;
    }

    public int hashCode() {
        return s2.i.m6823hashCodeimpl(this.f56572f) + (s2.i.m6823hashCodeimpl(this.f56571e) * 31);
    }

    @Override // x1.o0
    public int maxIntrinsicHeight(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        int iMaxIntrinsicHeight = measurable.maxIntrinsicHeight(i10);
        float fM6814getUnspecifiedD9Ej5fM = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        float f10 = this.f56572f;
        return qv.v.coerceAtLeast(iMaxIntrinsicHeight, !s2.i.m6822equalsimpl0(f10, fM6814getUnspecifiedD9Ej5fM) ? zVar.mo3419roundToPx0680j_4(f10) : 0);
    }

    @Override // x1.o0
    public int maxIntrinsicWidth(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(i10);
        float fM6814getUnspecifiedD9Ej5fM = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        float f10 = this.f56571e;
        return qv.v.coerceAtLeast(iMaxIntrinsicWidth, !s2.i.m6822equalsimpl0(f10, fM6814getUnspecifiedD9Ej5fM) ? zVar.mo3419roundToPx0680j_4(f10) : 0);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        s2.h hVar = s2.i.f85335c;
        float fM6814getUnspecifiedD9Ej5fM = hVar.m6814getUnspecifiedD9Ej5fM();
        float f10 = this.f56571e;
        int iM6757getMinWidthimpl = (s2.i.m6822equalsimpl0(f10, fM6814getUnspecifiedD9Ej5fM) || s2.c.m6757getMinWidthimpl(j10) != 0) ? s2.c.m6757getMinWidthimpl(j10) : qv.v.coerceAtLeast(qv.v.coerceAtMost(measure.mo3419roundToPx0680j_4(f10), s2.c.m6755getMaxWidthimpl(j10)), 0);
        int iM6755getMaxWidthimpl = s2.c.m6755getMaxWidthimpl(j10);
        float fM6814getUnspecifiedD9Ej5fM2 = hVar.m6814getUnspecifiedD9Ej5fM();
        float f11 = this.f56572f;
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(s2.d.Constraints(iM6757getMinWidthimpl, iM6755getMaxWidthimpl, (s2.i.m6822equalsimpl0(f11, fM6814getUnspecifiedD9Ej5fM2) || s2.c.m6756getMinHeightimpl(j10) != 0) ? s2.c.m6756getMinHeightimpl(j10) : qv.v.coerceAtLeast(qv.v.coerceAtMost(measure.mo3419roundToPx0680j_4(f11), s2.c.m6754getMaxHeightimpl(j10)), 0), s2.c.m6754getMaxHeightimpl(j10)));
        return x1.a1.layout$default(measure, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new q3(q1VarMo7826measureBRTryo0), 4, null);
    }

    @Override // x1.o0
    public int minIntrinsicHeight(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        int iMinIntrinsicHeight = measurable.minIntrinsicHeight(i10);
        float fM6814getUnspecifiedD9Ej5fM = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        float f10 = this.f56572f;
        return qv.v.coerceAtLeast(iMinIntrinsicHeight, !s2.i.m6822equalsimpl0(f10, fM6814getUnspecifiedD9Ej5fM) ? zVar.mo3419roundToPx0680j_4(f10) : 0);
    }

    @Override // x1.o0
    public int minIntrinsicWidth(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        int iMinIntrinsicWidth = measurable.minIntrinsicWidth(i10);
        float fM6814getUnspecifiedD9Ej5fM = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        float f10 = this.f56571e;
        return qv.v.coerceAtLeast(iMinIntrinsicWidth, !s2.i.m6822equalsimpl0(f10, fM6814getUnspecifiedD9Ej5fM) ? zVar.mo3419roundToPx0680j_4(f10) : 0);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public r3(float f10, float f11, kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
        this.f56571e = f10;
        this.f56572f = f11;
    }
}
