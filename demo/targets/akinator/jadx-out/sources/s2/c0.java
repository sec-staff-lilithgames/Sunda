package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f85325b = new b0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85326c = m6763constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final long f85327d = m6763constructorimpl(4294967296L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f85328e = m6763constructorimpl(8589934592L);

    /* renamed from: a, reason: collision with root package name */
    public final long f85329a;

    public /* synthetic */ c0(long j10) {
        this.f85329a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ c0 m6762boximpl(long j10) {
        return new c0(j10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6764equalsimpl(long j10, Object obj) {
        return (obj instanceof c0) && j10 == ((c0) obj).m6768unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6765equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6766hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6767toStringimpl(long j10) {
        return m6765equalsimpl0(j10, f85326c) ? "Unspecified" : m6765equalsimpl0(j10, f85327d) ? "Sp" : m6765equalsimpl0(j10, f85328e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6764equalsimpl(this.f85329a, obj);
    }

    public int hashCode() {
        return m6766hashCodeimpl(this.f85329a);
    }

    public String toString() {
        return m6767toStringimpl(this.f85329a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6768unboximpl() {
        return this.f85329a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6763constructorimpl(long j10) {
        return j10;
    }
}
