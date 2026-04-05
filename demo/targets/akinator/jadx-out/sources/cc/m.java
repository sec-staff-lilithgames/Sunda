package cc;

import bc.v;
import bc.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import j1.o2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12097a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b, reason: collision with root package name */
    public static final String f12098b = String.valueOf(Long.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f12099c = Pattern.compile("[+-]?[0-9]*[\\.]?[0-9]+([eE][+-]?[0-9]+)?");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f12100d = Pattern.compile("[+-]?[0-9]+[\\.]");

    public static boolean inLongRange(char[] cArr, int i10, int i11, boolean z10) {
        String str = z10 ? f12097a : f12098b;
        int length = str.length();
        if (i11 < length) {
            return true;
        }
        if (i11 > length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int iCharAt = cArr[i10 + i12] - str.charAt(i12);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean looksLikeValidNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() != 1) {
            return f12099c.matcher(str).matches() || f12100d.matcher(str).matches();
        }
        char cCharAt = str.charAt(0);
        return cCharAt <= '9' && cCharAt >= '0';
    }

    public static double parseAsDouble(String str, double d10) {
        return parseAsDouble(str, d10, false);
    }

    public static int parseAsInt(String str, int i10) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i10;
        }
        int i11 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i11 = 1;
        }
        while (i11 < length) {
            char cCharAt2 = strTrim.charAt(i11);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (int) parseDouble(strTrim, true);
                } catch (NumberFormatException unused) {
                    return i10;
                }
            }
            i11++;
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException unused2) {
            return i10;
        }
    }

    public static long parseAsLong(String str, long j10) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return j10;
        }
        int i10 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i10 = 1;
        }
        while (i10 < length) {
            char cCharAt2 = strTrim.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) parseDouble(strTrim, true);
                } catch (NumberFormatException unused) {
                    return j10;
                }
            }
            i10++;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused2) {
            return j10;
        }
    }

    @Deprecated
    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        return parseBigDecimal(str, false);
    }

    @Deprecated
    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        return parseBigInteger(str, false);
    }

    public static BigInteger parseBigIntegerWithRadix(String str, int i10, boolean z10) throws NumberFormatException {
        return z10 ? b.parseWithFastParser(str, i10) : new BigInteger(str, i10);
    }

    @Deprecated
    public static double parseDouble(String str) throws NumberFormatException {
        return parseDouble(str, false);
    }

    @Deprecated
    public static float parseFloat(String str) throws NumberFormatException {
        return parseFloat(str, false);
    }

    public static int parseInt(char[] cArr, int i10, int i11) {
        if (i11 > 0 && cArr[i10] == '+') {
            i10++;
            i11--;
        }
        int iB = cArr[(i10 + i11) - 1] - '0';
        switch (i11) {
            case 9:
                iB = o2.b(cArr[i10], 48, 100000000, iB);
                i10++;
            case 8:
                iB = o2.b(cArr[i10], 48, 10000000, iB);
                i10++;
            case 7:
                iB = o2.b(cArr[i10], 48, 1000000, iB);
                i10++;
            case 6:
                iB = o2.b(cArr[i10], 48, DefaultOggSeeker.MATCH_BYTE_RANGE, iB);
                i10++;
            case 5:
                iB = o2.b(cArr[i10], 48, 10000, iB);
                i10++;
            case 4:
                iB = o2.b(cArr[i10], 48, 1000, iB);
                i10++;
            case 3:
                iB = o2.b(cArr[i10], 48, 100, iB);
                i10++;
            case 2:
                return o2.b(cArr[i10], 48, 10, iB);
            default:
                return iB;
        }
    }

    public static long parseLong(char[] cArr, int i10, int i11) {
        int i12 = i11 - 9;
        return (parseInt(cArr, i10, i12) * C.NANOS_PER_SECOND) + parseInt(cArr, i10 + i12, 9);
    }

    public static long parseLong19(char[] cArr, int i10, boolean z10) {
        long j10 = 0;
        for (int i11 = 0; i11 < 19; i11++) {
            j10 = (j10 * 10) + (cArr[i10 + i11] - '0');
        }
        return z10 ? -j10 : j10;
    }

    public static double parseAsDouble(String str, double d10, boolean z10) {
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                try {
                    return parseDouble(strTrim, z10);
                } catch (NumberFormatException unused) {
                    return d10;
                }
            }
        }
        return d10;
    }

    public static BigDecimal parseBigDecimal(String str, boolean z10) throws NumberFormatException {
        return z10 ? a.parseWithFastParser(str) : a.parse(str);
    }

    public static BigInteger parseBigInteger(String str, boolean z10) throws NumberFormatException {
        return z10 ? b.parseWithFastParser(str) : new BigInteger(str);
    }

    public static double parseDouble(String str, boolean z10) throws NumberFormatException {
        return z10 ? v.parseDouble(str) : Double.parseDouble(str);
    }

    public static float parseFloat(String str, boolean z10) throws NumberFormatException {
        return z10 ? z.parseFloat(str) : Float.parseFloat(str);
    }

    public static double parseDouble(char[] cArr, boolean z10) throws NumberFormatException {
        return parseDouble(cArr, 0, cArr.length, z10);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z10) {
        String str2 = z10 ? f12097a : f12098b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = str.charAt(i10) - str2.charAt(i10);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    @Deprecated
    public static BigDecimal parseBigDecimal(char[] cArr, int i10, int i11) throws NumberFormatException {
        return a.parse(cArr, i10, i11);
    }

    public static double parseDouble(char[] cArr, int i10, int i11, boolean z10) throws NumberFormatException {
        if (z10) {
            return v.parseDouble(cArr, i10, i11);
        }
        return Double.parseDouble(new String(cArr, i10, i11));
    }

    public static float parseFloat(char[] cArr, boolean z10) throws NumberFormatException {
        return parseFloat(cArr, 0, cArr.length, z10);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i10, int i11, boolean z10) throws NumberFormatException {
        if (z10) {
            return a.parseWithFastParser(cArr, i10, i11);
        }
        return a.parse(cArr, i10, i11);
    }

    public static float parseFloat(char[] cArr, int i10, int i11, boolean z10) throws NumberFormatException {
        if (z10) {
            return z.parseFloat(cArr, i10, i11);
        }
        return Float.parseFloat(new String(cArr, i10, i11));
    }

    @Deprecated
    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return a.parse(cArr);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, boolean z10) throws NumberFormatException {
        if (z10) {
            return a.parseWithFastParser(cArr, 0, cArr.length);
        }
        return a.parse(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseInt(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = r4
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = r3
            goto L2d
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 <= r6) goto L2d
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2d:
            r6 = 57
            if (r1 > r6) goto L82
            r7 = 48
            if (r1 >= r7) goto L36
            goto L82
        L36:
            int r1 = r1 - r7
            if (r4 >= r2) goto L7d
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L78
            if (r9 >= r7) goto L44
            goto L78
        L44:
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L7d
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L73
            if (r3 >= r7) goto L54
            goto L73
        L54:
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L7d
        L5a:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6e
            if (r4 >= r7) goto L65
            goto L6e
        L65:
            int r1 = r1 * r5
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6c
            goto L7d
        L6c:
            r4 = r3
            goto L5a
        L6e:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L73:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L78:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7d:
            if (r0 == 0) goto L81
            int r10 = -r1
            return r10
        L81:
            return r1
        L82:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.m.parseInt(java.lang.String):int");
    }
}
