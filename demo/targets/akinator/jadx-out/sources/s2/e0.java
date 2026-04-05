package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f85330b = new d0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85331c = f0.Velocity(0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f85332a;

    public /* synthetic */ e0(long j10) {
        this.f85332a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e0 m6790boximpl(long j10) {
        return new e0(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m6791component1impl(long j10) {
        return m6799getXimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m6792component2impl(long j10) {
        return m6800getYimpl(j10);
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m6794copyOhffZ5M(long j10, float f10, float f11) {
        return f0.Velocity(f10, f11);
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m6795copyOhffZ5M$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m6799getXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m6800getYimpl(j10);
        }
        return m6794copyOhffZ5M(j10, f10, f11);
    }

    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m6796divadjELrA(long j10, float f10) {
        return f0.Velocity(m6799getXimpl(j10) / f10, m6800getYimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6797equalsimpl(long j10, Object obj) {
        return (obj instanceof e0) && j10 == ((e0) obj).m6808unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6798equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m6799getXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m6800getYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6801hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m6802minusAH228Gc(long j10, long j11) {
        return f0.Velocity(m6799getXimpl(j10) - m6799getXimpl(j11), m6800getYimpl(j10) - m6800getYimpl(j11));
    }

    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m6803plusAH228Gc(long j10, long j11) {
        return f0.Velocity(m6799getXimpl(j11) + m6799getXimpl(j10), m6800getYimpl(j11) + m6800getYimpl(j10));
    }

    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m6804remadjELrA(long j10, float f10) {
        return f0.Velocity(m6799getXimpl(j10) % f10, m6800getYimpl(j10) % f10);
    }

    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m6805timesadjELrA(long j10, float f10) {
        return f0.Velocity(m6799getXimpl(j10) * f10, m6800getYimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6806toStringimpl(long j10) {
        return "(" + m6799getXimpl(j10) + ", " + m6800getYimpl(j10) + ") px/sec";
    }

    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m6807unaryMinus9UxMQ8M(long j10) {
        return f0.Velocity(-m6799getXimpl(j10), -m6800getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m6797equalsimpl(this.f85332a, obj);
    }

    public int hashCode() {
        return m6801hashCodeimpl(this.f85332a);
    }

    public String toString() {
        return m6806toStringimpl(this.f85332a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6808unboximpl() {
        return this.f85332a;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6793constructorimpl(long j10) {
        return j10;
    }
}
