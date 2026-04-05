package i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f59366b = new n(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f59367c = p.Size(0.0f, 0.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final long f59368d = p.Size(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f59369a;

    public /* synthetic */ o(long j10) {
        this.f59369a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o m4240boximpl(long j10) {
        return new o(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4241component1impl(long j10) {
        return m4252getWidthimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4242component2impl(long j10) {
        return m4249getHeightimpl(j10);
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m4244copyxjbvk4A(long j10, float f10, float f11) {
        return p.Size(f10, f11);
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m4245copyxjbvk4A$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m4252getWidthimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m4249getHeightimpl(j10);
        }
        return m4244copyxjbvk4A(j10, f10, f11);
    }

    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m4246div7Ah8Wj8(long j10, float f10) {
        return p.Size(m4252getWidthimpl(j10) / f10, m4249getHeightimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4247equalsimpl(long j10, Object obj) {
        return (obj instanceof o) && j10 == ((o) obj).m4257unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4248equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m4249getHeightimpl(long j10) {
        if (j10 != f59368d) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m4250getMaxDimensionimpl(long j10) {
        return Math.max(Math.abs(m4252getWidthimpl(j10)), Math.abs(m4249getHeightimpl(j10)));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m4251getMinDimensionimpl(long j10) {
        return Math.min(Math.abs(m4252getWidthimpl(j10)), Math.abs(m4249getHeightimpl(j10)));
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m4252getWidthimpl(long j10) {
        if (j10 != f59368d) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4253hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m4254isEmptyimpl(long j10) {
        return m4252getWidthimpl(j10) <= 0.0f || m4249getHeightimpl(j10) <= 0.0f;
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m4255times7Ah8Wj8(long j10, float f10) {
        return p.Size(m4252getWidthimpl(j10) * f10, m4249getHeightimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4256toStringimpl(long j10) {
        if (j10 == f59366b.m4238getUnspecifiedNHjbRc()) {
            return "Size.Unspecified";
        }
        return "Size(" + d.toStringAsFixed(m4252getWidthimpl(j10), 1) + ", " + d.toStringAsFixed(m4249getHeightimpl(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m4247equalsimpl(this.f59369a, obj);
    }

    public int hashCode() {
        return m4253hashCodeimpl(this.f59369a);
    }

    public String toString() {
        return m4256toStringimpl(this.f59369a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4257unboximpl() {
        return this.f59369a;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4243constructorimpl(long j10) {
        return j10;
    }
}
