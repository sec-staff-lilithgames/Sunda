package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f87397c = new n0(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f87398b;

    public /* synthetic */ o0(long j10) {
        this.f87398b = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o0 m7080boximpl(long j10) {
        return new o0(j10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7082equalsimpl(long j10, Object obj) {
        return (obj instanceof o0) && j10 == ((o0) obj).m7086unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7083equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7084hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7085toStringimpl(long j10) {
        return z0.ulongToString(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return z0.ulongCompare(m7086unboximpl(), ((o0) obj).m7086unboximpl());
    }

    public boolean equals(Object obj) {
        return m7082equalsimpl(this.f87398b, obj);
    }

    public int hashCode() {
        return m7084hashCodeimpl(this.f87398b);
    }

    public String toString() {
        return m7085toStringimpl(this.f87398b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7086unboximpl() {
        return this.f87398b;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7081constructorimpl(long j10) {
        return j10;
    }
}
