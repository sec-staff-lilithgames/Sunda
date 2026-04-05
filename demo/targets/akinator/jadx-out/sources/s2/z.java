package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final y f85366b = new y(null);

    /* renamed from: c, reason: collision with root package name */
    public static final c0[] f85367c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f85368d;

    /* renamed from: a, reason: collision with root package name */
    public final long f85369a;

    static {
        b0 b0Var = c0.f85325b;
        f85367c = new c0[]{c0.m6762boximpl(b0Var.m6743getUnspecifiedUIouoOA()), c0.m6762boximpl(b0Var.m6742getSpUIouoOA()), c0.m6762boximpl(b0Var.m6741getEmUIouoOA())};
        f85368d = a0.pack(0L, Float.NaN);
    }

    public /* synthetic */ z(long j10) {
        this.f85369a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z m6984boximpl(long j10) {
        return new z(j10);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m6985compareToR2X_6o(long j10, long j11) {
        a0.m6726checkArithmeticNB67dxo(j10, j11);
        return Float.compare(m6994getValueimpl(j10), m6994getValueimpl(j11));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m6988divkPz2Gy4(long j10, float f10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), m6994getValueimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6990equalsimpl(long j10, Object obj) {
        return (obj instanceof z) && j10 == ((z) obj).m7003unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6991equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m6992getRawTypeimpl(long j10) {
        return j10 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m6993getTypeUIouoOA(long j10) {
        return f85367c[(int) (m6992getRawTypeimpl(j10) >>> 32)].m6768unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m6994getValueimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6995hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m6996isEmimpl(long j10) {
        return m6992getRawTypeimpl(j10) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m6997isSpimpl(long j10) {
        return m6992getRawTypeimpl(j10) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m6999timeskPz2Gy4(long j10, float f10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), m6994getValueimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7001toStringimpl(long j10) {
        long jM6993getTypeUIouoOA = m6993getTypeUIouoOA(j10);
        b0 b0Var = c0.f85325b;
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6743getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA())) {
            return m6994getValueimpl(j10) + ".sp";
        }
        if (!c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA())) {
            return "Invalid";
        }
        return m6994getValueimpl(j10) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m7002unaryMinusXSAIIZE(long j10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), -m6994getValueimpl(j10));
    }

    public boolean equals(Object obj) {
        return m6990equalsimpl(this.f85369a, obj);
    }

    public int hashCode() {
        return m6995hashCodeimpl(this.f85369a);
    }

    public String toString() {
        return m7001toStringimpl(this.f85369a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7003unboximpl() {
        return this.f85369a;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m6987divkPz2Gy4(long j10, double d10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), (float) (m6994getValueimpl(j10) / d10));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m6998timeskPz2Gy4(long j10, double d10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), (float) (m6994getValueimpl(j10) * d10));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m6989divkPz2Gy4(long j10, int i10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), m6994getValueimpl(j10) / i10);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7000timeskPz2Gy4(long j10, int i10) {
        a0.m6725checkArithmeticR2X_6o(j10);
        return a0.pack(m6992getRawTypeimpl(j10), m6994getValueimpl(j10) * i10);
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6986constructorimpl(long j10) {
        return j10;
    }
}
