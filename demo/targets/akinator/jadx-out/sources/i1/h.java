package i1;

import com.moloco.sdk.BKC.JzVV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final g f59344b = new g(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f59345c = i.Offset(0.0f, 0.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final long f59346d = i.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final long f59347e = i.Offset(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f59348a;

    public /* synthetic */ h(long j10) {
        this.f59348a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ h m4174boximpl(long j10) {
        return new h(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4175component1impl(long j10) {
        return m4185getXimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4176component2impl(long j10) {
        return m4186getYimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4177constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m4178copydBAh8RU(long j10, float f10, float f11) {
        return i.Offset(f10, f11);
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m4179copydBAh8RU$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m4185getXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m4186getYimpl(j10);
        }
        return m4178copydBAh8RU(j10, f10, f11);
    }

    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m4180divtuRUvjQ(long j10, float f10) {
        return i.Offset(m4185getXimpl(j10) / f10, m4186getYimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4181equalsimpl(long j10, Object obj) {
        return (obj instanceof h) && j10 == ((h) obj).m4195unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4182equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m4183getDistanceimpl(long j10) {
        return (float) Math.sqrt((m4186getYimpl(j10) * m4186getYimpl(j10)) + (m4185getXimpl(j10) * m4185getXimpl(j10)));
    }

    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m4184getDistanceSquaredimpl(long j10) {
        return (m4186getYimpl(j10) * m4186getYimpl(j10)) + (m4185getXimpl(j10) * m4185getXimpl(j10));
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m4185getXimpl(long j10) {
        if (j10 != f59347e) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m4186getYimpl(long j10) {
        if (j10 != f59347e) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4187hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m4188isValidimpl(long j10) {
        if (Float.isNaN(m4185getXimpl(j10)) || Float.isNaN(m4186getYimpl(j10))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m4189minusMKHz9U(long j10, long j11) {
        return i.Offset(m4185getXimpl(j10) - m4185getXimpl(j11), m4186getYimpl(j10) - m4186getYimpl(j11));
    }

    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m4190plusMKHz9U(long j10, long j11) {
        return i.Offset(m4185getXimpl(j11) + m4185getXimpl(j10), m4186getYimpl(j11) + m4186getYimpl(j10));
    }

    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m4191remtuRUvjQ(long j10, float f10) {
        return i.Offset(m4185getXimpl(j10) % f10, m4186getYimpl(j10) % f10);
    }

    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m4192timestuRUvjQ(long j10, float f10) {
        return i.Offset(m4185getXimpl(j10) * f10, m4186getYimpl(j10) * f10);
    }

    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m4194unaryMinusF1C5BW0(long j10) {
        return i.Offset(-m4185getXimpl(j10), -m4186getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m4181equalsimpl(this.f59348a, obj);
    }

    public int hashCode() {
        return m4187hashCodeimpl(this.f59348a);
    }

    public String toString() {
        return m4193toStringimpl(this.f59348a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4195unboximpl() {
        return this.f59348a;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4193toStringimpl(long j10) {
        if (!i.m4198isSpecifiedk4lQ0M(j10)) {
            return JzVV.LOVRPIe;
        }
        return "Offset(" + d.toStringAsFixed(m4185getXimpl(j10), 1) + ", " + d.toStringAsFixed(m4186getYimpl(j10), 1) + ')';
    }
}
