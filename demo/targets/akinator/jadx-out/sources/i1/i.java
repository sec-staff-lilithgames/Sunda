package i1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static final long Offset(float f10, float f11) {
        return h.m4177constructorimpl((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m4196isFinitek4lQ0M(long j10) {
        float fM4185getXimpl = h.m4185getXimpl(j10);
        if (Float.isInfinite(fM4185getXimpl) || Float.isNaN(fM4185getXimpl)) {
            return false;
        }
        float fM4186getYimpl = h.m4186getYimpl(j10);
        return (Float.isInfinite(fM4186getYimpl) || Float.isNaN(fM4186getYimpl)) ? false : true;
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m4198isSpecifiedk4lQ0M(long j10) {
        return j10 != h.f59344b.m4172getUnspecifiedF1C5BW0();
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m4200isUnspecifiedk4lQ0M(long j10) {
        return j10 == h.f59344b.m4172getUnspecifiedF1C5BW0();
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m4202lerpWko1d7g(long j10, long j11, float f10) {
        return Offset(t2.a.lerp(h.m4185getXimpl(j10), h.m4185getXimpl(j11), f10), t2.a.lerp(h.m4186getYimpl(j10), h.m4186getYimpl(j11), f10));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m4203takeOrElse3MmeM6k(long j10, kv.a block) {
        e0.checkNotNullParameter(block, "block");
        return m4198isSpecifiedk4lQ0M(j10) ? j10 : ((h) block.invoke()).m4195unboximpl();
    }

    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m4197isFinitek4lQ0M$annotations(long j10) {
    }

    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m4199isSpecifiedk4lQ0M$annotations(long j10) {
    }

    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m4201isUnspecifiedk4lQ0M$annotations(long j10) {
    }
}
