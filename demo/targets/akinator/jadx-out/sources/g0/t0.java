package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f56581a;

    /* renamed from: b, reason: collision with root package name */
    public final float f56582b;

    /* renamed from: c, reason: collision with root package name */
    public final float f56583c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56584d;

    public t0(float f10, float f11, float f12, float f13, kotlin.jvm.internal.u uVar) {
        this.f56581a = f10;
        this.f56582b = f11;
        this.f56583c = f12;
        this.f56584d = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return s2.i.m6822equalsimpl0(this.f56581a, t0Var.f56581a) && s2.i.m6822equalsimpl0(this.f56582b, t0Var.f56582b) && s2.i.m6822equalsimpl0(this.f56583c, t0Var.f56583c) && s2.i.m6822equalsimpl0(this.f56584d, t0Var.f56584d);
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return density.mo3419roundToPx0680j_4(this.f56584d);
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo3419roundToPx0680j_4(this.f56581a);
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo3419roundToPx0680j_4(this.f56583c);
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return density.mo3419roundToPx0680j_4(this.f56582b);
    }

    public int hashCode() {
        return s2.i.m6823hashCodeimpl(this.f56584d) + ((s2.i.m6823hashCodeimpl(this.f56583c) + ((s2.i.m6823hashCodeimpl(this.f56582b) + (s2.i.m6823hashCodeimpl(this.f56581a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Insets(left=" + ((Object) s2.i.m6828toStringimpl(this.f56581a)) + ", top=" + ((Object) s2.i.m6828toStringimpl(this.f56582b)) + ", right=" + ((Object) s2.i.m6828toStringimpl(this.f56583c)) + ", bottom=" + ((Object) s2.i.m6828toStringimpl(this.f56584d)) + ')';
    }
}
