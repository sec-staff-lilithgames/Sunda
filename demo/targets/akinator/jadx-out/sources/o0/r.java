package o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final float f77369a = s2.i.m6817constructorimpl(10);

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m5757getRippleEndRadiuscSwnlzA(s2.e getRippleEndRadius, boolean z10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float fM4183getDistanceimpl = i1.h.m4183getDistanceimpl(i1.i.Offset(i1.o.m4252getWidthimpl(j10), i1.o.m4249getHeightimpl(j10))) / 2.0f;
        return z10 ? getRippleEndRadius.mo3425toPx0680j_4(f77369a) + fM4183getDistanceimpl : fM4183getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m5758getRippleStartRadiusuvyYCjk(long j10) {
        return Math.max(i1.o.m4252getWidthimpl(j10), i1.o.m4249getHeightimpl(j10)) * 0.3f;
    }
}
