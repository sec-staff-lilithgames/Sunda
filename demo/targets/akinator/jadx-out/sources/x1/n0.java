package x1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 implements z1.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.q f91384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.q f91385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.q f91386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.q f91387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.q f91388e;

    public n0(kv.q qVar, kv.q qVar2, kv.q qVar3, kv.q qVar4, kv.q qVar5) {
        this.f91384a = qVar;
        this.f91385b = qVar2;
        this.f91386c = qVar3;
        this.f91387d = qVar4;
        this.f91388e = qVar5;
    }

    @Override // z1.e1
    public int maxIntrinsicHeight(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91388e.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i10))).intValue();
    }

    @Override // z1.e1
    public int maxIntrinsicWidth(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91387d.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i10))).intValue();
    }

    @Override // z1.e1
    /* renamed from: measure-3p2s80s */
    public y0 mo7833measure3p2s80s(a1 measureScope, List<? extends w0> measurables, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measureScope, "measureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return (y0) this.f91384a.invoke(measureScope, measurables, s2.c.m6744boximpl(j10));
    }

    @Override // z1.e1
    public int minIntrinsicHeight(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91386c.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i10))).intValue();
    }

    @Override // z1.e1
    public int minIntrinsicWidth(z intrinsicMeasureScope, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91385b.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i10))).intValue();
    }
}
