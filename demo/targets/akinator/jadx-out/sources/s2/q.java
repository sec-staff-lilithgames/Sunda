package s2;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final p f85352b = new p(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85353c = r.IntOffset(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f85354a;

    public /* synthetic */ q(long j10) {
        this.f85354a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ q m6921boximpl(long j10) {
        return new q(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m6922component1impl(long j10) {
        return m6930getXimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m6923component2impl(long j10) {
        return m6931getYimpl(j10);
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m6925copyiSbpLlY(long j10, int i10, int i11) {
        return r.IntOffset(i10, i11);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m6926copyiSbpLlY$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = m6930getXimpl(j10);
        }
        if ((i12 & 2) != 0) {
            i11 = m6931getYimpl(j10);
        }
        return m6925copyiSbpLlY(j10, i10, i11);
    }

    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m6927divBjo55l4(long j10, float f10) {
        return r.IntOffset(mv.d.roundToInt(m6930getXimpl(j10) / f10), mv.d.roundToInt(m6931getYimpl(j10) / f10));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6928equalsimpl(long j10, Object obj) {
        return (obj instanceof q) && j10 == ((q) obj).m6939unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6929equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m6930getXimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m6931getYimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6932hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m6933minusqkQi6aY(long j10, long j11) {
        return r.IntOffset(m6930getXimpl(j10) - m6930getXimpl(j11), m6931getYimpl(j10) - m6931getYimpl(j11));
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m6934plusqkQi6aY(long j10, long j11) {
        return o2.d(m6931getYimpl(j10), m6930getXimpl(j11) + m6930getXimpl(j10), j11);
    }

    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m6935remBjo55l4(long j10, int i10) {
        return r.IntOffset(m6930getXimpl(j10) % i10, m6931getYimpl(j10) % i10);
    }

    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m6936timesBjo55l4(long j10, float f10) {
        return r.IntOffset(mv.d.roundToInt(m6930getXimpl(j10) * f10), mv.d.roundToInt(m6931getYimpl(j10) * f10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6937toStringimpl(long j10) {
        return "(" + m6930getXimpl(j10) + ", " + m6931getYimpl(j10) + ')';
    }

    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m6938unaryMinusnOccac(long j10) {
        return r.IntOffset(-m6930getXimpl(j10), -m6931getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m6928equalsimpl(this.f85354a, obj);
    }

    public int hashCode() {
        return m6932hashCodeimpl(this.f85354a);
    }

    public String toString() {
        return m6937toStringimpl(this.f85354a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6939unboximpl() {
        return this.f85354a;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6924constructorimpl(long j10) {
        return j10;
    }
}
