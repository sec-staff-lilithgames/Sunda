package g0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 implements x1.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f56554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f56555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f56556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.s f56557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f56558e;

    public p2(b2 b2Var, kv.s sVar, float f10, i3 i3Var, l0 l0Var) {
        this.f56554a = b2Var;
        this.f56555b = f10;
        this.f56556c = i3Var;
        this.f56557d = sVar;
        this.f56558e = l0Var;
    }

    @Override // x1.x0
    public int maxIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) q2.access$MaxIntrinsicHeightMeasureBlock(this.f56554a).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(zVar.mo3419roundToPx0680j_4(this.f56555b)))).intValue();
    }

    @Override // x1.x0
    public int maxIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) q2.access$MaxIntrinsicWidthMeasureBlock(this.f56554a).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(zVar.mo3419roundToPx0680j_4(this.f56555b)))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x1.y0 mo79measure3p2s80s(x1.a1 r29, java.util.List<? extends x1.w0> r30, long r31) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.p2.mo79measure3p2s80s(x1.a1, java.util.List, long):x1.y0");
    }

    @Override // x1.x0
    public int minIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) q2.access$MinIntrinsicHeightMeasureBlock(this.f56554a).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(zVar.mo3419roundToPx0680j_4(this.f56555b)))).intValue();
    }

    @Override // x1.x0
    public int minIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) q2.access$MinIntrinsicWidthMeasureBlock(this.f56554a).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(zVar.mo3419roundToPx0680j_4(this.f56555b)))).intValue();
    }
}
