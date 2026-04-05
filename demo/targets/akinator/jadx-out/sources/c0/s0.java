package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11602a;

    public /* synthetic */ s0(long j10) {
        this.f11602a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ s0 m187boximpl(long j10) {
        return new s0(j10);
    }

    /* renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m189copyXB9eQnU(long j10, float f10, float f11) {
        return h1.Motion(f10, f11);
    }

    /* renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m190copyXB9eQnU$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m193getValueimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m194getVelocityimpl(j10);
        }
        return m189copyXB9eQnU(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m191equalsimpl(long j10, Object obj) {
        return (obj instanceof s0) && j10 == ((s0) obj).m197unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m192equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m193getValueimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m194getVelocityimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m195hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m196toStringimpl(long j10) {
        return "Motion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m191equalsimpl(this.f11602a, obj);
    }

    public final long getPackedValue() {
        return this.f11602a;
    }

    public int hashCode() {
        return m195hashCodeimpl(this.f11602a);
    }

    public String toString() {
        return m196toStringimpl(this.f11602a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m197unboximpl() {
        return this.f11602a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m188constructorimpl(long j10) {
        return j10;
    }
}
