package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: b, reason: collision with root package name */
    public static final z1 f56706b = new z1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f56707c = b2.TextRange(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f56708a;

    public /* synthetic */ a2(long j10) {
        this.f56708a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a2 m3948boximpl(long j10) {
        return new a2(j10);
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m3950contains5zctL8(long j10, long j11) {
        return m3958getMinimpl(j10) <= m3958getMinimpl(j11) && m3957getMaximpl(j11) <= m3957getMaximpl(j10);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3951containsimpl(long j10, int i10) {
        return i10 < m3957getMaximpl(j10) && m3958getMinimpl(j10) <= i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3952equalsimpl(long j10, Object obj) {
        return (obj instanceof a2) && j10 == ((a2) obj).m3964unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3953equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m3954getCollapsedimpl(long j10) {
        return m3960getStartimpl(j10) == m3955getEndimpl(j10);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m3955getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m3956getLengthimpl(long j10) {
        return m3957getMaximpl(j10) - m3958getMinimpl(j10);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m3957getMaximpl(long j10) {
        return m3960getStartimpl(j10) > m3955getEndimpl(j10) ? m3960getStartimpl(j10) : m3955getEndimpl(j10);
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m3958getMinimpl(long j10) {
        return m3960getStartimpl(j10) > m3955getEndimpl(j10) ? m3955getEndimpl(j10) : m3960getStartimpl(j10);
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m3959getReversedimpl(long j10) {
        return m3960getStartimpl(j10) > m3955getEndimpl(j10);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m3960getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3961hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m3962intersects5zctL8(long j10, long j11) {
        return m3958getMinimpl(j10) < m3957getMaximpl(j11) && m3958getMinimpl(j11) < m3957getMaximpl(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3963toStringimpl(long j10) {
        return "TextRange(" + m3960getStartimpl(j10) + ", " + m3955getEndimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m3952equalsimpl(this.f56708a, obj);
    }

    public int hashCode() {
        return m3961hashCodeimpl(this.f56708a);
    }

    public String toString() {
        return m3963toStringimpl(this.f56708a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3964unboximpl() {
        return this.f56708a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3949constructorimpl(long j10) {
        return j10;
    }
}
