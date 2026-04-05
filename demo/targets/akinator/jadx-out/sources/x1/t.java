package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final y f91436b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f91437c;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f91438e;

    public t(y measurable, a0 minMax, b0 widthHeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        kotlin.jvm.internal.e0.checkNotNullParameter(minMax, "minMax");
        kotlin.jvm.internal.e0.checkNotNullParameter(widthHeight, "widthHeight");
        this.f91436b = measurable;
        this.f91437c = minMax;
        this.f91438e = widthHeight;
    }

    public final y getMeasurable() {
        return this.f91436b;
    }

    public final a0 getMinMax() {
        return this.f91437c;
    }

    @Override // x1.w0, x1.y
    public Object getParentData() {
        return this.f91436b.getParentData();
    }

    public final b0 getWidthHeight() {
        return this.f91438e;
    }

    @Override // x1.w0, x1.y
    public int maxIntrinsicHeight(int i10) {
        return this.f91436b.maxIntrinsicHeight(i10);
    }

    @Override // x1.w0, x1.y
    public int maxIntrinsicWidth(int i10) {
        return this.f91436b.maxIntrinsicWidth(i10);
    }

    @Override // x1.w0
    /* renamed from: measure-BRTryo0 */
    public q1 mo7826measureBRTryo0(long j10) {
        b0 b0Var = this.f91438e;
        b0 b0Var2 = b0.f91332b;
        a0 a0Var = a0.f91329c;
        a0 a0Var2 = this.f91437c;
        y yVar = this.f91436b;
        if (b0Var == b0Var2) {
            return new v(a0Var2 == a0Var ? yVar.maxIntrinsicWidth(s2.c.m6754getMaxHeightimpl(j10)) : yVar.minIntrinsicWidth(s2.c.m6754getMaxHeightimpl(j10)), s2.c.m6754getMaxHeightimpl(j10));
        }
        return new v(s2.c.m6755getMaxWidthimpl(j10), a0Var2 == a0Var ? yVar.maxIntrinsicHeight(s2.c.m6755getMaxWidthimpl(j10)) : yVar.minIntrinsicHeight(s2.c.m6755getMaxWidthimpl(j10)));
    }

    @Override // x1.w0, x1.y
    public int minIntrinsicHeight(int i10) {
        return this.f91436b.minIntrinsicHeight(i10);
    }

    @Override // x1.w0, x1.y
    public int minIntrinsicWidth(int i10) {
        return this.f91436b.minIntrinsicWidth(i10);
    }
}
