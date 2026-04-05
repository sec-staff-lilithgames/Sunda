package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f72351a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f72352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72354d;

    public p1(int i10, c1 c1Var, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this.f72351a = i10;
        this.f72352b = c1Var;
        this.f72353c = i11;
        this.f72354d = i12;
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ p1 m5455copyRetOiIg$default(p1 p1Var, int i10, c1 c1Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = p1Var.f72351a;
        }
        if ((i12 & 2) != 0) {
            c1Var = p1Var.getWeight();
        }
        if ((i12 & 4) != 0) {
            i11 = p1Var.mo5433getStyle_LCdwA();
        }
        return p1Var.m5458copyRetOiIg(i10, c1Var, i11);
    }

    /* renamed from: copy-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ p1 m5456copyYpTlLL0$default(p1 p1Var, int i10, c1 c1Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = p1Var.f72351a;
        }
        if ((i13 & 2) != 0) {
            c1Var = p1Var.getWeight();
        }
        if ((i13 & 4) != 0) {
            i11 = p1Var.mo5433getStyle_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = p1Var.mo5432getLoadingStrategyPKNRLFQ();
        }
        return p1Var.m5459copyYpTlLL0(i10, c1Var, i11, i12);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final p1 m5458copyRetOiIg(int i10, c1 weight, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weight, "weight");
        return m5459copyYpTlLL0(i10, weight, i11, mo5432getLoadingStrategyPKNRLFQ());
    }

    /* renamed from: copy-YpTlLL0, reason: not valid java name */
    public final p1 m5459copyYpTlLL0(int i10, c1 weight, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weight, "weight");
        return new p1(i10, weight, i11, i12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f72351a == p1Var.f72351a && kotlin.jvm.internal.e0.areEqual(getWeight(), p1Var.getWeight()) && y0.m5485equalsimpl0(mo5433getStyle_LCdwA(), p1Var.mo5433getStyle_LCdwA()) && v0.m5471equalsimpl0(mo5432getLoadingStrategyPKNRLFQ(), p1Var.mo5432getLoadingStrategyPKNRLFQ());
    }

    @Override // l2.w
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo5432getLoadingStrategyPKNRLFQ() {
        return this.f72354d;
    }

    public final int getResId() {
        return this.f72351a;
    }

    @Override // l2.w
    /* renamed from: getStyle-_-LCdwA */
    public int mo5433getStyle_LCdwA() {
        return this.f72353c;
    }

    @Override // l2.w
    public c1 getWeight() {
        return this.f72352b;
    }

    public int hashCode() {
        return v0.m5472hashCodeimpl(mo5432getLoadingStrategyPKNRLFQ()) + ((y0.m5486hashCodeimpl(mo5433getStyle_LCdwA()) + ((getWeight().hashCode() + (this.f72351a * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f72351a + ", weight=" + getWeight() + ", style=" + ((Object) y0.m5487toStringimpl(mo5433getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) v0.m5473toStringimpl(mo5432getLoadingStrategyPKNRLFQ())) + ')';
    }

    public /* synthetic */ p1(int i10, c1 c1Var, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this(i10, (i13 & 2) != 0 ? c1.f72258c.getNormal() : c1Var, (i13 & 4) != 0 ? y0.f72394b.m5480getNormal_LCdwA() : i11, (i13 & 8) != 0 ? v0.f72378b.m5460getAsyncPKNRLFQ() : i12, null);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m5457getLoadingStrategyPKNRLFQ$annotations() {
    }
}
