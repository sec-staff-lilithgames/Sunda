package i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f59337b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f59338c = c.CornerRadius$default(0.0f, 0.0f, 2, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f59339a;

    public /* synthetic */ b(long j10) {
        this.f59339a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m4147boximpl(long j10) {
        return new b(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4148component1impl(long j10) {
        return m4156getXimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4149component2impl(long j10) {
        return m4157getYimpl(j10);
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m4151copyOHQCggk(long j10, float f10, float f11) {
        return c.CornerRadius(f10, f11);
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m4152copyOHQCggk$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m4156getXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m4157getYimpl(j10);
        }
        return m4151copyOHQCggk(j10, f10, f11);
    }

    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m4153divBz7bX_o(long j10, float f10) {
        return c.CornerRadius(m4156getXimpl(j10) / f10, m4157getYimpl(j10) / f10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4154equalsimpl(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).m4164unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4155equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m4156getXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m4157getYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4158hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m4159minusvF7bmM(long j10, long j11) {
        return c.CornerRadius(m4156getXimpl(j10) - m4156getXimpl(j11), m4157getYimpl(j10) - m4157getYimpl(j11));
    }

    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m4160plusvF7bmM(long j10, long j11) {
        return c.CornerRadius(m4156getXimpl(j11) + m4156getXimpl(j10), m4157getYimpl(j11) + m4157getYimpl(j10));
    }

    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m4161timesBz7bX_o(long j10, float f10) {
        return c.CornerRadius(m4156getXimpl(j10) * f10, m4157getYimpl(j10) * f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4162toStringimpl(long j10) {
        if (m4156getXimpl(j10) == m4157getYimpl(j10)) {
            return "CornerRadius.circular(" + d.toStringAsFixed(m4156getXimpl(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + d.toStringAsFixed(m4156getXimpl(j10), 1) + ", " + d.toStringAsFixed(m4157getYimpl(j10), 1) + ')';
    }

    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m4163unaryMinuskKHJgLs(long j10) {
        return c.CornerRadius(-m4156getXimpl(j10), -m4157getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m4154equalsimpl(this.f59339a, obj);
    }

    public int hashCode() {
        return m4158hashCodeimpl(this.f59339a);
    }

    public String toString() {
        return m4162toStringimpl(this.f59339a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4164unboximpl() {
        return this.f59339a;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4150constructorimpl(long j10) {
        return j10;
    }
}
