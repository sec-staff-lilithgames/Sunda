package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k3 extends a2.x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final float f56505e;

    /* renamed from: f, reason: collision with root package name */
    public final float f56506f;

    /* renamed from: g, reason: collision with root package name */
    public final float f56507g;

    /* renamed from: h, reason: collision with root package name */
    public final float f56508h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56509i;

    public /* synthetic */ k3(float f10, float f11, float f12, float f13, boolean z10, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? s2.i.f85335c.m6814getUnspecifiedD9Ej5fM() : f13, z10, lVar, null);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final long b(x1.z zVar) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        s2.h hVar = s2.i.f85335c;
        float fM6814getUnspecifiedD9Ej5fM = hVar.m6814getUnspecifiedD9Ej5fM();
        float f10 = this.f56507g;
        int i10 = 0;
        int iMo3419roundToPx0680j_4 = !s2.i.m6822equalsimpl0(f10, fM6814getUnspecifiedD9Ej5fM) ? zVar.mo3419roundToPx0680j_4(((s2.i) qv.v.coerceAtLeast(s2.i.m6815boximpl(f10), s2.i.m6815boximpl(s2.i.m6817constructorimpl(0)))).m6831unboximpl()) : Integer.MAX_VALUE;
        float fM6814getUnspecifiedD9Ej5fM2 = hVar.m6814getUnspecifiedD9Ej5fM();
        float f11 = this.f56508h;
        int iMo3419roundToPx0680j_42 = !s2.i.m6822equalsimpl0(f11, fM6814getUnspecifiedD9Ej5fM2) ? zVar.mo3419roundToPx0680j_4(((s2.i) qv.v.coerceAtLeast(s2.i.m6815boximpl(f11), s2.i.m6815boximpl(s2.i.m6817constructorimpl(0)))).m6831unboximpl()) : Integer.MAX_VALUE;
        float fM6814getUnspecifiedD9Ej5fM3 = hVar.m6814getUnspecifiedD9Ej5fM();
        float f12 = this.f56505e;
        if (s2.i.m6822equalsimpl0(f12, fM6814getUnspecifiedD9Ej5fM3) || (iCoerceAtLeast = qv.v.coerceAtLeast(qv.v.coerceAtMost(zVar.mo3419roundToPx0680j_4(f12), iMo3419roundToPx0680j_4), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        float fM6814getUnspecifiedD9Ej5fM4 = hVar.m6814getUnspecifiedD9Ej5fM();
        float f13 = this.f56506f;
        if (!s2.i.m6822equalsimpl0(f13, fM6814getUnspecifiedD9Ej5fM4) && (iCoerceAtLeast2 = qv.v.coerceAtLeast(qv.v.coerceAtMost(zVar.mo3419roundToPx0680j_4(f13), iMo3419roundToPx0680j_42), 0)) != Integer.MAX_VALUE) {
            i10 = iCoerceAtLeast2;
        }
        return s2.d.Constraints(iCoerceAtLeast, iMo3419roundToPx0680j_4, i10, iMo3419roundToPx0680j_42);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return s2.i.m6822equalsimpl0(this.f56505e, k3Var.f56505e) && s2.i.m6822equalsimpl0(this.f56506f, k3Var.f56506f) && s2.i.m6822equalsimpl0(this.f56507g, k3Var.f56507g) && s2.i.m6822equalsimpl0(this.f56508h, k3Var.f56508h) && this.f56509i == k3Var.f56509i;
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public int hashCode() {
        return (s2.i.m6823hashCodeimpl(this.f56508h) + ((s2.i.m6823hashCodeimpl(this.f56507g) + ((s2.i.m6823hashCodeimpl(this.f56506f) + (s2.i.m6823hashCodeimpl(this.f56505e) * 31)) * 31)) * 31)) * 31;
    }

    @Override // x1.o0
    public int maxIntrinsicHeight(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        long jB = b(zVar);
        return s2.c.m6752getHasFixedHeightimpl(jB) ? s2.c.m6754getMaxHeightimpl(jB) : s2.d.m6771constrainHeightK40F9xA(jB, measurable.maxIntrinsicHeight(i10));
    }

    @Override // x1.o0
    public int maxIntrinsicWidth(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        long jB = b(zVar);
        return s2.c.m6753getHasFixedWidthimpl(jB) ? s2.c.m6755getMaxWidthimpl(jB) : s2.d.m6772constrainWidthK40F9xA(jB, measurable.maxIntrinsicWidth(i10));
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        long jConstraints;
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        long jB = b(measure);
        if (this.f56509i) {
            jConstraints = s2.d.m6770constrainN9IONVI(j10, jB);
        } else {
            s2.h hVar = s2.i.f85335c;
            jConstraints = s2.d.Constraints(!s2.i.m6822equalsimpl0(this.f56505e, hVar.m6814getUnspecifiedD9Ej5fM()) ? s2.c.m6757getMinWidthimpl(jB) : qv.v.coerceAtMost(s2.c.m6757getMinWidthimpl(j10), s2.c.m6755getMaxWidthimpl(jB)), !s2.i.m6822equalsimpl0(this.f56507g, hVar.m6814getUnspecifiedD9Ej5fM()) ? s2.c.m6755getMaxWidthimpl(jB) : qv.v.coerceAtLeast(s2.c.m6755getMaxWidthimpl(j10), s2.c.m6757getMinWidthimpl(jB)), !s2.i.m6822equalsimpl0(this.f56506f, hVar.m6814getUnspecifiedD9Ej5fM()) ? s2.c.m6756getMinHeightimpl(jB) : qv.v.coerceAtMost(s2.c.m6756getMinHeightimpl(j10), s2.c.m6754getMaxHeightimpl(jB)), !s2.i.m6822equalsimpl0(this.f56508h, hVar.m6814getUnspecifiedD9Ej5fM()) ? s2.c.m6754getMaxHeightimpl(jB) : qv.v.coerceAtLeast(s2.c.m6754getMaxHeightimpl(j10), s2.c.m6756getMinHeightimpl(jB)));
        }
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(jConstraints);
        return x1.a1.layout$default(measure, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new j3(q1VarMo7826measureBRTryo0), 4, null);
    }

    @Override // x1.o0
    public int minIntrinsicHeight(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        long jB = b(zVar);
        return s2.c.m6752getHasFixedHeightimpl(jB) ? s2.c.m6754getMaxHeightimpl(jB) : s2.d.m6771constrainHeightK40F9xA(jB, measurable.minIntrinsicHeight(i10));
    }

    @Override // x1.o0
    public int minIntrinsicWidth(x1.z zVar, x1.y measurable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        long jB = b(zVar);
        return s2.c.m6753getHasFixedWidthimpl(jB) ? s2.c.m6755getMaxWidthimpl(jB) : s2.d.m6772constrainWidthK40F9xA(jB, measurable.minIntrinsicWidth(i10));
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public k3(float f10, float f11, float f12, float f13, boolean z10, kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
        this.f56505e = f10;
        this.f56506f = f11;
        this.f56507g = f12;
        this.f56508h = f13;
        this.f56509i = z10;
    }
}
