package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final v3 f56382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56383b;

    public d2(v3 v3Var, int i10, kotlin.jvm.internal.u uVar) {
        this.f56382a = v3Var;
        this.f56383b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56382a, d2Var.f56382a) && d4.m3863equalsimpl0(this.f56383b, d2Var.f56383b);
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        if (d4.m3864hasAnybkgdKaI$foundation_layout_release(this.f56383b, d4.f56385b.m3850getBottomJoeWqyM())) {
            return this.f56382a.getBottom(density);
        }
        return 0;
    }

    public final v3 getInsets() {
        return this.f56382a;
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (d4.m3864hasAnybkgdKaI$foundation_layout_release(this.f56383b, layoutDirection == s2.x.f85363b ? d4.f56385b.m3846getAllowLeftInLtrJoeWqyM$foundation_layout_release() : d4.f56385b.m3847getAllowLeftInRtlJoeWqyM$foundation_layout_release())) {
            return this.f56382a.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (d4.m3864hasAnybkgdKaI$foundation_layout_release(this.f56383b, layoutDirection == s2.x.f85363b ? d4.f56385b.m3848getAllowRightInLtrJoeWqyM$foundation_layout_release() : d4.f56385b.m3849getAllowRightInRtlJoeWqyM$foundation_layout_release())) {
            return this.f56382a.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m3859getSidesJoeWqyM() {
        return this.f56383b;
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        if (d4.m3864hasAnybkgdKaI$foundation_layout_release(this.f56383b, d4.f56385b.m3856getTopJoeWqyM())) {
            return this.f56382a.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return d4.m3865hashCodeimpl(this.f56383b) + (this.f56382a.hashCode() * 31);
    }

    public String toString() {
        return "(" + this.f56382a + " only " + ((Object) d4.m3867toStringimpl(this.f56383b)) + ')';
    }
}
