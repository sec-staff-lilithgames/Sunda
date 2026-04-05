package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements x1.o0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f75165b;

    public q0(long j10, kotlin.jvm.internal.u uVar) {
        this.f75165b = j10;
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
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var == null) {
            return false;
        }
        return s2.o.m6908equalsimpl0(this.f75165b, q0Var.f75165b);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m5703getSizeMYxV2XQ() {
        return this.f75165b;
    }

    public int hashCode() {
        return s2.o.m6913hashCodeimpl(this.f75165b);
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
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(j10);
        int width = q1VarMo7826measureBRTryo0.getWidth();
        long j11 = this.f75165b;
        int iMax = Math.max(width, measure.mo3419roundToPx0680j_4(s2.o.m6911getWidthD9Ej5fM(j11)));
        int iMax2 = Math.max(q1VarMo7826measureBRTryo0.getHeight(), measure.mo3419roundToPx0680j_4(s2.o.m6909getHeightD9Ej5fM(j11)));
        return x1.a1.layout$default(measure, iMax, iMax2, null, new p0(iMax, iMax2, q1VarMo7826measureBRTryo0), 4, null);
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
