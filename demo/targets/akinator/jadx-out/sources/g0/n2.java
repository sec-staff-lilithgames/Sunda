package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 extends a2.x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final i2 f56531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(i2 paddingValues, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(paddingValues, "paddingValues");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56531e = paddingValues;
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
        n2 n2Var = obj instanceof n2 ? (n2) obj : null;
        if (n2Var == null) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f56531e, n2Var.f56531e);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final i2 getPaddingValues() {
        return this.f56531e;
    }

    public int hashCode() {
        return this.f56531e.hashCode();
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
        s2.x layoutDirection = measure.getLayoutDirection();
        i2 i2Var = this.f56531e;
        float f10 = 0;
        if (s2.i.m6816compareTo0680j_4(i2Var.mo3842calculateLeftPaddingu2uoSUM(layoutDirection), s2.i.m6817constructorimpl(f10)) < 0 || s2.i.m6816compareTo0680j_4(i2Var.mo3844calculateTopPaddingD9Ej5fM(), s2.i.m6817constructorimpl(f10)) < 0 || s2.i.m6816compareTo0680j_4(i2Var.mo3843calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), s2.i.m6817constructorimpl(f10)) < 0 || s2.i.m6816compareTo0680j_4(i2Var.mo3841calculateBottomPaddingD9Ej5fM(), s2.i.m6817constructorimpl(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iMo3419roundToPx0680j_4 = measure.mo3419roundToPx0680j_4(i2Var.mo3843calculateRightPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo3419roundToPx0680j_4(i2Var.mo3842calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()));
        int iMo3419roundToPx0680j_42 = measure.mo3419roundToPx0680j_4(i2Var.mo3841calculateBottomPaddingD9Ej5fM()) + measure.mo3419roundToPx0680j_4(i2Var.mo3844calculateTopPaddingD9Ej5fM());
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(s2.d.m6774offsetNN6EwU(j10, -iMo3419roundToPx0680j_4, -iMo3419roundToPx0680j_42));
        return x1.a1.layout$default(measure, s2.d.m6772constrainWidthK40F9xA(j10, q1VarMo7826measureBRTryo0.getWidth() + iMo3419roundToPx0680j_4), s2.d.m6771constrainHeightK40F9xA(j10, q1VarMo7826measureBRTryo0.getHeight() + iMo3419roundToPx0680j_42), null, new m2(q1VarMo7826measureBRTryo0, measure, this), 4, null);
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
