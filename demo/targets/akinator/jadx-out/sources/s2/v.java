package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final u f85360b = new u(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85361c = m6967constructorimpl(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f85362a;

    public /* synthetic */ v(long j10) {
        this.f85362a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ v m6964boximpl(long j10) {
        return new v(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m6965component1impl(long j10) {
        return m6972getWidthimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m6966component2impl(long j10) {
        return m6971getHeightimpl(j10);
    }

    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m6968divYEO4UFw(long j10, int i10) {
        return w.IntSize(m6972getWidthimpl(j10) / i10, m6971getHeightimpl(j10) / i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6969equalsimpl(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).m6976unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6970equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m6971getHeightimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m6972getWidthimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6973hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m6974timesYEO4UFw(long j10, int i10) {
        return w.IntSize(m6972getWidthimpl(j10) * i10, m6971getHeightimpl(j10) * i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6975toStringimpl(long j10) {
        return m6972getWidthimpl(j10) + " x " + m6971getHeightimpl(j10);
    }

    public boolean equals(Object obj) {
        return m6969equalsimpl(this.f85362a, obj);
    }

    public int hashCode() {
        return m6973hashCodeimpl(this.f85362a);
    }

    public String toString() {
        return m6975toStringimpl(this.f85362a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6976unboximpl() {
        return this.f85362a;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6967constructorimpl(long j10) {
        return j10;
    }
}
