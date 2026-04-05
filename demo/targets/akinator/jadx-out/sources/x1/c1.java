package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final y f91338b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f91339c;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f91340e;

    public c1(y measurable, e1 minMax, f1 widthHeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        kotlin.jvm.internal.e0.checkNotNullParameter(minMax, "minMax");
        kotlin.jvm.internal.e0.checkNotNullParameter(widthHeight, "widthHeight");
        this.f91338b = measurable;
        this.f91339c = minMax;
        this.f91340e = widthHeight;
    }

    public final y getMeasurable() {
        return this.f91338b;
    }

    public final e1 getMinMax() {
        return this.f91339c;
    }

    @Override // x1.w0, x1.y
    public Object getParentData() {
        return this.f91338b.getParentData();
    }

    public final f1 getWidthHeight() {
        return this.f91340e;
    }

    @Override // x1.w0, x1.y
    public int maxIntrinsicHeight(int i10) {
        return this.f91338b.maxIntrinsicHeight(i10);
    }

    @Override // x1.w0, x1.y
    public int maxIntrinsicWidth(int i10) {
        return this.f91338b.maxIntrinsicWidth(i10);
    }

    @Override // x1.w0
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public q1 mo7826measureBRTryo0(long j10) {
        f1 f1Var = this.f91340e;
        f1 f1Var2 = f1.f91347b;
        e1 e1Var = e1.f91345c;
        e1 e1Var2 = this.f91339c;
        y yVar = this.f91338b;
        if (f1Var == f1Var2) {
            return new d1(e1Var2 == e1Var ? yVar.maxIntrinsicWidth(s2.c.m6754getMaxHeightimpl(j10)) : yVar.minIntrinsicWidth(s2.c.m6754getMaxHeightimpl(j10)), s2.c.m6754getMaxHeightimpl(j10));
        }
        return new d1(s2.c.m6755getMaxWidthimpl(j10), e1Var2 == e1Var ? yVar.maxIntrinsicHeight(s2.c.m6755getMaxWidthimpl(j10)) : yVar.minIntrinsicHeight(s2.c.m6755getMaxWidthimpl(j10)));
    }

    @Override // x1.w0, x1.y
    public int minIntrinsicHeight(int i10) {
        return this.f91338b.minIntrinsicHeight(i10);
    }

    @Override // x1.w0, x1.y
    public int minIntrinsicWidth(int i10) {
        return this.f91338b.minIntrinsicWidth(i10);
    }
}
