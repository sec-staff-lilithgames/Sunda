package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e f70028b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f70029c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f70030d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f70031e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f70032f;

    /* renamed from: a, reason: collision with root package name */
    public final long f70033a;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f70029c = m5102constructorimpl((0 & 4294967295L) | j11);
        f70030d = m5102constructorimpl((1 & 4294967295L) | j11);
        f70031e = m5102constructorimpl(j11 | (2 & 4294967295L));
        f70032f = m5102constructorimpl((j10 & 4294967295L) | (4 << 32));
    }

    public /* synthetic */ f(long j10) {
        this.f70033a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f m5101boximpl(long j10) {
        return new f(j10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5103equalsimpl(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).m5108unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5104equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m5105getComponentCountimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5106hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5107toStringimpl(long j10) {
        return m5104equalsimpl0(j10, f70029c) ? "Rgb" : m5104equalsimpl0(j10, f70030d) ? "Xyz" : m5104equalsimpl0(j10, f70031e) ? "Lab" : m5104equalsimpl0(j10, f70032f) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5103equalsimpl(this.f70033a, obj);
    }

    public int hashCode() {
        return m5106hashCodeimpl(this.f70033a);
    }

    public String toString() {
        return m5107toStringimpl(this.f70033a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5108unboximpl() {
        return this.f70033a;
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5102constructorimpl(long j10) {
        return j10;
    }
}
