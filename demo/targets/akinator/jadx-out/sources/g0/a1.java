package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final v3 f56336a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.e f56337b;

    public a1(v3 insets, s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f56336a = insets;
        this.f56337b = density;
    }

    @Override // g0.i2
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float mo3841calculateBottomPaddingD9Ej5fM() {
        v3 v3Var = this.f56336a;
        s2.e eVar = this.f56337b;
        return eVar.mo3422toDpu2uoSUM(v3Var.getBottom(eVar));
    }

    @Override // g0.i2
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo3842calculateLeftPaddingu2uoSUM(s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        v3 v3Var = this.f56336a;
        s2.e eVar = this.f56337b;
        return eVar.mo3422toDpu2uoSUM(v3Var.getLeft(eVar, layoutDirection));
    }

    @Override // g0.i2
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo3843calculateRightPaddingu2uoSUM(s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        v3 v3Var = this.f56336a;
        s2.e eVar = this.f56337b;
        return eVar.mo3422toDpu2uoSUM(v3Var.getRight(eVar, layoutDirection));
    }

    @Override // g0.i2
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float mo3844calculateTopPaddingD9Ej5fM() {
        v3 v3Var = this.f56336a;
        s2.e eVar = this.f56337b;
        return eVar.mo3422toDpu2uoSUM(v3Var.getTop(eVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56336a, a1Var.f56336a) && kotlin.jvm.internal.e0.areEqual(this.f56337b, a1Var.f56337b);
    }

    public final v3 getInsets() {
        return this.f56336a;
    }

    public int hashCode() {
        return this.f56337b.hashCode() + (this.f56336a.hashCode() * 31);
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f56336a + ", density=" + this.f56337b + ')';
    }
}
