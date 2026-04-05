package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f97328a;

    public /* synthetic */ k(long j10) {
        this.f97328a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k m8035boximpl(long j10) {
        return new k(j10);
    }

    /* renamed from: compareTo-S_HNhKs, reason: not valid java name */
    public static final int m8036compareToS_HNhKs(long j10, long j11) {
        boolean zM8042isInLayerimpl = m8042isInLayerimpl(j10);
        return zM8042isInLayerimpl != m8042isInLayerimpl(j11) ? zM8042isInLayerimpl ? -1 : 1 : (int) Math.signum(m8040getDistanceimpl(j10) - m8040getDistanceimpl(j11));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8038equalsimpl(long j10, Object obj) {
        return (obj instanceof k) && j10 == ((k) obj).m8044unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8039equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m8040getDistanceimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8041hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m8042isInLayerimpl(long j10) {
        return ((int) (j10 & 4294967295L)) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8043toStringimpl(long j10) {
        return "DistanceAndInLayer(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m8038equalsimpl(this.f97328a, obj);
    }

    public final long getPackedValue() {
        return this.f97328a;
    }

    public int hashCode() {
        return m8041hashCodeimpl(this.f97328a);
    }

    public String toString() {
        return m8043toStringimpl(this.f97328a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8044unboximpl() {
        return this.f97328a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8037constructorimpl(long j10) {
        return j10;
    }
}
