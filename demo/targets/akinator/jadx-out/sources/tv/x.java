package tv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x implements d {

    /* renamed from: b, reason: collision with root package name */
    public final long f87464b;

    public /* synthetic */ x(long j10) {
        this.f87464b = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x m7236boximpl(long j10) {
        return new x(j10);
    }

    /* renamed from: compareTo-6eNON_k, reason: not valid java name */
    public static final int m7237compareTo6eNON_k(long j10, long j11) {
        return f.m7183compareToLRDsOJo(m7246minus6eNON_k(j10, j11), f.f87433c.m7177getZEROUwyO8pc());
    }

    /* renamed from: compareTo-impl, reason: not valid java name */
    public static int m7238compareToimpl(long j10, d other) {
        e0.checkNotNullParameter(other, "other");
        return m7236boximpl(j10).compareTo(other);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7241equalsimpl(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).m7253unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7242equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hasNotPassedNow-impl, reason: not valid java name */
    public static boolean m7243hasNotPassedNowimpl(long j10) {
        return f.m7205isNegativeimpl(m7240elapsedNowUwyO8pc(j10));
    }

    /* renamed from: hasPassedNow-impl, reason: not valid java name */
    public static boolean m7244hasPassedNowimpl(long j10) {
        return !f.m7205isNegativeimpl(m7240elapsedNowUwyO8pc(j10));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7245hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: minus-6eNON_k, reason: not valid java name */
    public static final long m7246minus6eNON_k(long j10, long j11) {
        return u.f87462a.m7231differenceBetweenfRLX17w(j10, j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7250toStringimpl(long j10) {
        return "ValueTimeMark(reading=" + j10 + ')';
    }

    @Override // tv.d, tv.w
    /* renamed from: elapsedNow-UwyO8pc */
    public long mo7144elapsedNowUwyO8pc() {
        return m7240elapsedNowUwyO8pc(this.f87464b);
    }

    @Override // tv.d
    public boolean equals(Object obj) {
        return m7241equalsimpl(this.f87464b, obj);
    }

    @Override // tv.d, tv.w
    public boolean hasNotPassedNow() {
        return m7243hasNotPassedNowimpl(this.f87464b);
    }

    @Override // tv.d, tv.w
    public boolean hasPassedNow() {
        return m7244hasPassedNowimpl(this.f87464b);
    }

    @Override // tv.d
    public int hashCode() {
        return m7245hashCodeimpl(this.f87464b);
    }

    @Override // tv.d, tv.w
    /* renamed from: minus-LRDsOJo */
    public /* bridge */ /* synthetic */ d mo7146minusLRDsOJo(long j10) {
        return m7236boximpl(m7251minusLRDsOJo(j10));
    }

    @Override // tv.d
    /* renamed from: minus-UwyO8pc */
    public long mo7153minusUwyO8pc(d other) {
        e0.checkNotNullParameter(other, "other");
        return m7248minusUwyO8pc(this.f87464b, other);
    }

    @Override // tv.d, tv.w
    /* renamed from: plus-LRDsOJo */
    public /* bridge */ /* synthetic */ d mo7147plusLRDsOJo(long j10) {
        return m7236boximpl(m7252plusLRDsOJo(j10));
    }

    public String toString() {
        return m7250toStringimpl(this.f87464b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7253unboximpl() {
        return this.f87464b;
    }

    /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
    public static long m7240elapsedNowUwyO8pc(long j10) {
        return u.f87462a.m7232elapsedFrom6eNON_k(j10);
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    public static long m7248minusUwyO8pc(long j10, d other) {
        e0.checkNotNullParameter(other, "other");
        if (other instanceof x) {
            return m7246minus6eNON_k(j10, ((x) other).m7253unboximpl());
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m7250toStringimpl(j10)) + " and " + other);
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        return c.compareTo(this, dVar);
    }

    @Override // tv.d, tv.w
    /* renamed from: minus-LRDsOJo */
    public /* bridge */ /* synthetic */ w mo7146minusLRDsOJo(long j10) {
        return m7236boximpl(m7251minusLRDsOJo(j10));
    }

    @Override // tv.d, tv.w
    /* renamed from: plus-LRDsOJo */
    public /* bridge */ /* synthetic */ w mo7147plusLRDsOJo(long j10) {
        return m7236boximpl(m7252plusLRDsOJo(j10));
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public long m7251minusLRDsOJo(long j10) {
        return m7247minusLRDsOJo(this.f87464b, j10);
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public long m7252plusLRDsOJo(long j10) {
        return m7249plusLRDsOJo(this.f87464b, j10);
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static long m7247minusLRDsOJo(long j10, long j11) {
        return u.f87462a.m7230adjustReading6QKq23U(j10, f.m7223unaryMinusUwyO8pc(j11));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static long m7249plusLRDsOJo(long j10, long j11) {
        return u.f87462a.m7230adjustReading6QKq23U(j10, j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7239constructorimpl(long j10) {
        return j10;
    }
}
