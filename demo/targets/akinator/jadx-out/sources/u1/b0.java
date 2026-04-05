package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f87520a;

    public /* synthetic */ b0(long j10) {
        this.f87520a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b0 m7255boximpl(long j10) {
        return new b0(j10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7257equalsimpl(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).m7261unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7258equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7259hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7260toStringimpl(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m7257equalsimpl(this.f87520a, obj);
    }

    public final long getValue() {
        return this.f87520a;
    }

    public int hashCode() {
        return m7259hashCodeimpl(this.f87520a);
    }

    public String toString() {
        return m7260toStringimpl(this.f87520a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7261unboximpl() {
        return this.f87520a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7256constructorimpl(long j10) {
        return j10;
    }
}
