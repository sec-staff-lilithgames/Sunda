package x1;

import a2.z3;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements z1.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.q f91374a;

    public j0(kv.q qVar) {
        this.f91374a = qVar;
    }

    @Override // z1.e1
    public int maxIntrinsicHeight(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return g0.access$MeasuringMaxIntrinsicHeight(intrinsicMeasureScope, this.f91374a, measurables, i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // z1.e1
    public int maxIntrinsicWidth(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return g0.access$MeasuringMaxIntrinsicWidth(intrinsicMeasureScope, this.f91374a, measurables, i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // z1.e1
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public y0 mo7833measure3p2s80s(a1 measureScope, List<? extends w0> measurables, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measureScope, "measureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return (y0) this.f91374a.invoke(measureScope, measurables, s2.c.m6744boximpl(j10));
    }

    @Override // z1.e1
    public int minIntrinsicHeight(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return g0.access$MeasuringMinIntrinsicHeight(intrinsicMeasureScope, this.f91374a, measurables, i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // z1.e1
    public int minIntrinsicWidth(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return g0.access$MeasuringMinIntrinsicWidth(intrinsicMeasureScope, this.f91374a, measurables, i10, intrinsicMeasureScope.getLayoutDirection());
    }

    public String toString() {
        return z3.simpleIdentityToString(this, "MeasuringIntrinsicsMeasureBlocks") + "{ measureBlock=" + z3.simpleIdentityToString(this.f91374a, null) + " }";
    }
}
