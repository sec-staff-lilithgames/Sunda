package i1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    public static final long Size(float f10, float f11) {
        return o.m4243constructorimpl((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m4258getCenteruvyYCjk(long j10) {
        return i.Offset(o.m4252getWidthimpl(j10) / 2.0f, o.m4249getHeightimpl(j10) / 2.0f);
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m4260isSpecifieduvyYCjk(long j10) {
        return j10 != o.f59366b.m4238getUnspecifiedNHjbRc();
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m4262isUnspecifieduvyYCjk(long j10) {
        return j10 == o.f59366b.m4238getUnspecifiedNHjbRc();
    }

    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m4264lerpVgWVRYQ(long j10, long j11, float f10) {
        return Size(t2.a.lerp(o.m4252getWidthimpl(j10), o.m4252getWidthimpl(j11), f10), t2.a.lerp(o.m4249getHeightimpl(j10), o.m4249getHeightimpl(j11), f10));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m4265takeOrElseTmRCtEA(long j10, kv.a block) {
        e0.checkNotNullParameter(block, "block");
        return j10 != o.f59366b.m4238getUnspecifiedNHjbRc() ? j10 : ((o) block.invoke()).m4257unboximpl();
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4268timesd16Qtg0(int i10, long j10) {
        return o.m4255times7Ah8Wj8(j10, i10);
    }

    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final j m4269toRectuvyYCjk(long j10) {
        return k.m4219Recttz77jQw(h.f59344b.m4173getZeroF1C5BW0(), j10);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4266timesd16Qtg0(double d10, long j10) {
        return o.m4255times7Ah8Wj8(j10, (float) d10);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m4267timesd16Qtg0(float f10, long j10) {
        return o.m4255times7Ah8Wj8(j10, f10);
    }

    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4259getCenteruvyYCjk$annotations(long j10) {
    }

    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4261isSpecifieduvyYCjk$annotations(long j10) {
    }

    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m4263isUnspecifieduvyYCjk$annotations(long j10) {
    }
}
