package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: b, reason: collision with root package name */
    public static final y1 f91456b = new y1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f91457c = a2.ScaleFactor(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f91458a;

    public /* synthetic */ z1(long j10) {
        this.f91458a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z1 m7855boximpl(long j10) {
        return new z1(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m7856component1impl(long j10) {
        return m7864getScaleXimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m7857component2impl(long j10) {
        return m7865getScaleYimpl(j10);
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m7859copy8GGzs04(long j10, float f10, float f11) {
        return a2.ScaleFactor(f10, f11);
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m7860copy8GGzs04$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m7864getScaleXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m7865getScaleYimpl(j10);
        }
        return m7859copy8GGzs04(j10, f10, f11);
    }

    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m7861div44nBxM0(long j10, float f10) {
        return a2.ScaleFactor(m7864getScaleXimpl(j10) / f10, m7865getScaleYimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7862equalsimpl(long j10, Object obj) {
        return (obj instanceof z1) && j10 == ((z1) obj).m7869unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7863equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m7864getScaleXimpl(long j10) {
        if (j10 != f91457c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m7865getScaleYimpl(long j10) {
        if (j10 != f91457c) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7866hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m7867times44nBxM0(long j10, float f10) {
        return a2.ScaleFactor(m7864getScaleXimpl(j10) * f10, m7865getScaleYimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7868toStringimpl(long j10) {
        return "ScaleFactor(" + a2.access$roundToTenths(m7864getScaleXimpl(j10)) + ", " + a2.access$roundToTenths(m7865getScaleYimpl(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return m7862equalsimpl(this.f91458a, obj);
    }

    public int hashCode() {
        return m7866hashCodeimpl(this.f91458a);
    }

    public String toString() {
        return m7868toStringimpl(this.f91458a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7869unboximpl() {
        return this.f91458a;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getScaleX$annotations() {
    }

    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7858constructorimpl(long j10) {
        return j10;
    }
}
