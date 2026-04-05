package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f56501a;

    /* renamed from: b, reason: collision with root package name */
    public final float f56502b;

    /* renamed from: c, reason: collision with root package name */
    public final float f56503c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56504d;

    public k2(float f10, float f11, float f12, float f13, kotlin.jvm.internal.u uVar) {
        this.f56501a = f10;
        this.f56502b = f11;
        this.f56503c = f12;
        this.f56504d = f13;
    }

    @Override // g0.i2
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo3841calculateBottomPaddingD9Ej5fM() {
        return this.f56504d;
    }

    @Override // g0.i2
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo3842calculateLeftPaddingu2uoSUM(s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == s2.x.f85363b ? this.f56501a : this.f56503c;
    }

    @Override // g0.i2
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo3843calculateRightPaddingu2uoSUM(s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == s2.x.f85363b ? this.f56503c : this.f56501a;
    }

    @Override // g0.i2
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo3844calculateTopPaddingD9Ej5fM() {
        return this.f56502b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return s2.i.m6822equalsimpl0(this.f56501a, k2Var.f56501a) && s2.i.m6822equalsimpl0(this.f56502b, k2Var.f56502b) && s2.i.m6822equalsimpl0(this.f56503c, k2Var.f56503c) && s2.i.m6822equalsimpl0(this.f56504d, k2Var.f56504d);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m3917getBottomD9Ej5fM() {
        return this.f56504d;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m3918getEndD9Ej5fM() {
        return this.f56503c;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m3919getStartD9Ej5fM() {
        return this.f56501a;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m3920getTopD9Ej5fM() {
        return this.f56502b;
    }

    public int hashCode() {
        return s2.i.m6823hashCodeimpl(this.f56504d) + ((s2.i.m6823hashCodeimpl(this.f56503c) + ((s2.i.m6823hashCodeimpl(this.f56502b) + (s2.i.m6823hashCodeimpl(this.f56501a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) s2.i.m6828toStringimpl(this.f56501a)) + ", top=" + ((Object) s2.i.m6828toStringimpl(this.f56502b)) + ", end=" + ((Object) s2.i.m6828toStringimpl(this.f56503c)) + ", bottom=" + ((Object) s2.i.m6828toStringimpl(this.f56504d)) + ')';
    }

    public /* synthetic */ k2(float f10, float f11, float f12, float f13, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s2.i.m6817constructorimpl(0) : f10, (i10 & 2) != 0 ? s2.i.m6817constructorimpl(0) : f11, (i10 & 4) != 0 ? s2.i.m6817constructorimpl(0) : f12, (i10 & 8) != 0 ? s2.i.m6817constructorimpl(0) : f13, null);
    }

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3913getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3914getEndD9Ej5fM$annotations() {
    }

    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3915getStartD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3916getTopD9Ej5fM$annotations() {
    }
}
