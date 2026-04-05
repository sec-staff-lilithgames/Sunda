package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g4 extends a2.x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final p0 f56435e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56436f;

    /* renamed from: g, reason: collision with root package name */
    public final kv.p f56437g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f56438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(p0 direction, boolean z10, kv.p alignmentCallback, Object align, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        kotlin.jvm.internal.e0.checkNotNullParameter(align, "align");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56435e = direction;
        this.f56436f = z10;
        this.f56437g = alignmentCallback;
        this.f56438h = align;
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
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.f56435e == g4Var.f56435e && this.f56436f == g4Var.f56436f && kotlin.jvm.internal.e0.areEqual(this.f56438h, g4Var.f56438h);
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
        return this.f56438h.hashCode() + com.google.android.gms.internal.play_billing.a.c(this.f56435e.hashCode() * 31, 31, this.f56436f);
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
        p0 p0Var = this.f56435e;
        p0 p0Var2 = p0.f56549b;
        int iM6757getMinWidthimpl = p0Var != p0Var2 ? 0 : s2.c.m6757getMinWidthimpl(j10);
        p0 p0Var3 = p0.f56550c;
        int iM6756getMinHeightimpl = p0Var == p0Var3 ? s2.c.m6756getMinHeightimpl(j10) : 0;
        boolean z10 = this.f56436f;
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(s2.d.Constraints(iM6757getMinWidthimpl, (p0Var == p0Var2 || !z10) ? s2.c.m6755getMaxWidthimpl(j10) : Integer.MAX_VALUE, iM6756getMinHeightimpl, (p0Var == p0Var3 || !z10) ? s2.c.m6754getMaxHeightimpl(j10) : Integer.MAX_VALUE));
        int iCoerceIn = qv.v.coerceIn(q1VarMo7826measureBRTryo0.getWidth(), s2.c.m6757getMinWidthimpl(j10), s2.c.m6755getMaxWidthimpl(j10));
        int iCoerceIn2 = qv.v.coerceIn(q1VarMo7826measureBRTryo0.getHeight(), s2.c.m6756getMinHeightimpl(j10), s2.c.m6754getMaxHeightimpl(j10));
        return x1.a1.layout$default(measure, iCoerceIn, iCoerceIn2, null, new f4(this, iCoerceIn, q1VarMo7826measureBRTryo0, iCoerceIn2, measure), 4, null);
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
