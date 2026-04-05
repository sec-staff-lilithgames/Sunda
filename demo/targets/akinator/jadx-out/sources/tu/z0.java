package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class z0 {
    public static final int doubleToUInt(double d10) {
        if (Double.isNaN(d10) || d10 <= uintToDouble(0)) {
            return 0;
        }
        if (d10 >= uintToDouble(-1)) {
            return -1;
        }
        if (d10 <= 2.147483647E9d) {
            return k0.m7056constructorimpl((int) d10);
        }
        return k0.m7056constructorimpl(k0.m7056constructorimpl(Integer.MAX_VALUE) + k0.m7056constructorimpl((int) (d10 - Integer.MAX_VALUE)));
    }

    public static final long doubleToULong(double d10) {
        if (Double.isNaN(d10) || d10 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d10 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d10 < 9.223372036854776E18d ? o0.m7081constructorimpl((long) d10) : o0.m7081constructorimpl(o0.m7081constructorimpl((long) (d10 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final int uintCompare(int i10, int i11) {
        return kotlin.jvm.internal.e0.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m7140uintDivideJ1ME1BU(int i10, int i11) {
        return k0.m7056constructorimpl((int) ((i10 & 4294967295L) / (i11 & 4294967295L)));
    }

    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m7141uintRemainderJ1ME1BU(int i10, int i11) {
        return k0.m7056constructorimpl((int) ((i10 & 4294967295L) % (i11 & 4294967295L)));
    }

    public static final double uintToDouble(int i10) {
        return (((i10 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i10);
    }

    public static final int ulongCompare(long j10, long j11) {
        return kotlin.jvm.internal.e0.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m7142ulongDivideeb3DHEI(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? o0.m7081constructorimpl(0L) : o0.m7081constructorimpl(1L);
        }
        if (j10 >= 0) {
            return o0.m7081constructorimpl(j10 / j11);
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return o0.m7081constructorimpl(j12 + (Long.compare(o0.m7081constructorimpl(j10 - (j12 * j11)) ^ Long.MIN_VALUE, o0.m7081constructorimpl(j11) ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m7143ulongRemaindereb3DHEI(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j10 : o0.m7081constructorimpl(j10 - j11);
        }
        if (j10 >= 0) {
            return o0.m7081constructorimpl(j10 % j11);
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (Long.compare(o0.m7081constructorimpl(j12) ^ Long.MIN_VALUE, o0.m7081constructorimpl(j11) ^ Long.MIN_VALUE) < 0) {
            j11 = 0;
        }
        return o0.m7081constructorimpl(j12 - j11);
    }

    public static final double ulongToDouble(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    public static final String ulongToString(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, sv.e.checkRadix(i10));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, sv.e.checkRadix(i10));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, sv.e.checkRadix(i10));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
