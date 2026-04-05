package x1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.q f91367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.q f91368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.q f91369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.q f91370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.q f91371e;

    public i0(kv.q qVar, kv.q qVar2, kv.q qVar3, kv.q qVar4, kv.q qVar5) {
        this.f91367a = qVar;
        this.f91368b = qVar2;
        this.f91369c = qVar3;
        this.f91370d = qVar4;
        this.f91371e = qVar5;
    }

    @Override // x1.x0
    public int maxIntrinsicHeight(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91371e.invoke(zVar, measurables, Integer.valueOf(i10))).intValue();
    }

    @Override // x1.x0
    public int maxIntrinsicWidth(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91370d.invoke(zVar, measurables, Integer.valueOf(i10))).intValue();
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public y0 mo79measure3p2s80s(a1 measure, List<? extends w0> measurables, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return (y0) this.f91367a.invoke(measure, measurables, s2.c.m6744boximpl(j10));
    }

    @Override // x1.x0
    public int minIntrinsicHeight(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91369c.invoke(zVar, measurables, Integer.valueOf(i10))).intValue();
    }

    @Override // x1.x0
    public int minIntrinsicWidth(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return ((Number) this.f91368b.invoke(zVar, measurables, Integer.valueOf(i10))).intValue();
    }
}
