package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends a2.x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final p0 f56574e;

    /* renamed from: f, reason: collision with root package name */
    public final float f56575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p0 direction, float f10, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56574e = direction;
        this.f56575f = f10;
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
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f56574e == s0Var.f56574e && this.f56575f == s0Var.f56575f;
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
        return Float.hashCode(this.f56575f) + (this.f56574e.hashCode() * 31);
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
        int iM6757getMinWidthimpl;
        int iM6755getMaxWidthimpl;
        int iM6754getMaxHeightimpl;
        int iCoerceIn;
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        boolean zM6751getHasBoundedWidthimpl = s2.c.m6751getHasBoundedWidthimpl(j10);
        float f10 = this.f56575f;
        p0 p0Var = this.f56574e;
        if (!zM6751getHasBoundedWidthimpl || p0Var == p0.f56549b) {
            iM6757getMinWidthimpl = s2.c.m6757getMinWidthimpl(j10);
            iM6755getMaxWidthimpl = s2.c.m6755getMaxWidthimpl(j10);
        } else {
            iM6757getMinWidthimpl = qv.v.coerceIn(mv.d.roundToInt(s2.c.m6755getMaxWidthimpl(j10) * f10), s2.c.m6757getMinWidthimpl(j10), s2.c.m6755getMaxWidthimpl(j10));
            iM6755getMaxWidthimpl = iM6757getMinWidthimpl;
        }
        if (!s2.c.m6750getHasBoundedHeightimpl(j10) || p0Var == p0.f56550c) {
            int iM6756getMinHeightimpl = s2.c.m6756getMinHeightimpl(j10);
            iM6754getMaxHeightimpl = s2.c.m6754getMaxHeightimpl(j10);
            iCoerceIn = iM6756getMinHeightimpl;
        } else {
            iCoerceIn = qv.v.coerceIn(mv.d.roundToInt(s2.c.m6754getMaxHeightimpl(j10) * f10), s2.c.m6756getMinHeightimpl(j10), s2.c.m6754getMaxHeightimpl(j10));
            iM6754getMaxHeightimpl = iCoerceIn;
        }
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(s2.d.Constraints(iM6757getMinWidthimpl, iM6755getMaxWidthimpl, iCoerceIn, iM6754getMaxHeightimpl));
        return x1.a1.layout$default(measure, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new r0(q1VarMo7826measureBRTryo0), 4, null);
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
}
