package sv;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j0 extends i0 {
    public static final Void numberFormatError(String input) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        throw new NumberFormatException(o2.f('\'', "Invalid number format: '", input));
    }

    public static final Byte toByteOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toByteOrNull(str, 10);
    }

    public static Integer toIntOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    public static Long toLongOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    public static final Short toShortOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toShortOrNull(str, 10);
    }

    public static final Byte toByteOrNull(String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i10);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    public static final Integer toIntOrNull(String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        e.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (kotlin.jvm.internal.e0.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigitOf = e.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iDigitOf) {
                return null;
            }
            i13 = i12 - iDigitOf;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    public static final Long toLongOrNull(String str, int i10) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        e.checkRadix(i10);
        int length = str.length();
        Long l9 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int iCompare = kotlin.jvm.internal.e0.compare((int) cCharAt, 48);
        long j10 = C.TIME_UNSET;
        if (iCompare < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iDigitOf = e.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return l9;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l9;
                }
                j12 = j10 / i10;
                if (j11 < j12) {
                    return l9;
                }
            }
            Long l10 = l9;
            int i12 = i11;
            long j13 = j11 * i10;
            long j14 = iDigitOf;
            if (j13 < j10 + j14) {
                return l10;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l9 = l10;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    public static final Short toShortOrNull(String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i10);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
