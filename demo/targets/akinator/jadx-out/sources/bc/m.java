package bc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends a {
    public static BigDecimal g(CharSequence charSequence, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j10;
        int i15;
        int i16;
        long j11;
        int i17;
        boolean z11;
        int i18;
        int i19 = i10;
        int i20 = i19 + i11;
        char c10 = a.c(charSequence, i19, i20);
        boolean z12 = c10 == '-';
        if ((z12 || c10 == '+') && (c10 = a.c(charSequence, (i19 = i19 + 1), i20)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int iMin = Math.min(i20 - 8, 1073741824);
        int i21 = i19;
        while (i21 < iMin && g.isEightZeroes(charSequence, i21)) {
            i21 += 8;
        }
        while (i21 < i20 && charSequence.charAt(i21) == '0') {
            i21++;
        }
        int i22 = i21;
        while (i22 < iMin && g.isEightDigits(charSequence, i22)) {
            i22 += 8;
        }
        while (i22 < i20) {
            c10 = charSequence.charAt(i22);
            if (!g.a(c10)) {
                break;
            }
            i22++;
        }
        if (c10 == '.') {
            int i23 = i22 + 1;
            while (i23 < iMin && g.isEightZeroes(charSequence, i23)) {
                i23 += 8;
            }
            while (i23 < i20 && charSequence.charAt(i23) == '0') {
                i23++;
            }
            int i24 = i23;
            while (i24 < iMin && g.isEightDigits(charSequence, i24)) {
                i24 += 8;
            }
            while (i24 < i20) {
                c10 = charSequence.charAt(i24);
                if (!g.a(c10)) {
                    break;
                }
                i24++;
            }
            i13 = i23;
            i12 = i22;
            i22 = i24;
        } else {
            i12 = -1;
            i13 = -1;
        }
        long j12 = 0;
        if (i12 < 0) {
            z10 = true;
            i15 = i22 - i21;
            i13 = i22;
            i12 = i13;
            i14 = i12;
            j10 = 0;
        } else {
            z10 = true;
            i14 = i22;
            j10 = (i12 - i22) + 1;
            i15 = i21 == i12 ? i22 - i13 : (i22 - i21) - 1;
        }
        if ((c10 | ' ') == 101) {
            i17 = i14 + 1;
            char c11 = a.c(charSequence, i17, i20);
            boolean z13 = c11 == '-' ? z10 : false;
            if (z13 || c11 == '+') {
                i17 = i14 + 2;
                c11 = a.c(charSequence, i17, i20);
            }
            char c12 = (char) (c11 - '0');
            z11 = c12 >= '\n' ? z10 : false;
            while (true) {
                if (j12 < 2147483647L) {
                    i16 = i13;
                    j12 = (j12 * 10) + c12;
                } else {
                    i16 = i13;
                }
                i17++;
                c12 = (char) (a.c(charSequence, i17, i20) - '0');
                if (c12 >= '\n') {
                    break;
                }
                i13 = i16;
            }
            if (z13) {
                j12 = -j12;
            }
            j11 = j10 + j12;
            i18 = i14;
        } else {
            i16 = i13;
            j11 = j10;
            i17 = i14;
            z11 = false;
            i18 = i20;
        }
        a.e(z11 | ((i19 == i12 && i12 == i18) ? z10 : false), i17, i20, i15, j11);
        return h(charSequence, i21, i12, i16, i18, z12, (int) j11);
    }

    public static BigDecimal h(CharSequence charSequence, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerC;
        int i15 = (i13 - i11) - 1;
        int i16 = i13 - i12;
        int i17 = i11 - i10;
        TreeMap treeMapC = null;
        if (i17 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i17 > 400) {
            treeMapC = h.c();
            h.e(treeMapC, i10, i11);
            bigIntegerNegate = f.d(charSequence, i10, i11, treeMapC);
        } else {
            bigIntegerNegate = f.c(charSequence, i10, i11);
        }
        if (i15 > 0) {
            if (i16 > 400) {
                if (treeMapC == null) {
                    treeMapC = h.c();
                }
                h.e(treeMapC, i12, i13);
                bigIntegerC = f.d(charSequence, i12, i13, treeMapC);
            } else {
                bigIntegerC = f.c(charSequence, i12, i13);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerC = j.k(bigIntegerNegate, h.a(treeMapC, i15)).add(bigIntegerC);
            }
            bigIntegerNegate = bigIntegerC;
        }
        if (z10) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i14);
    }

    public BigDecimal parseBigDecimalString(CharSequence charSequence, int i10, int i11) {
        int i12;
        long j10;
        char c10;
        int i13;
        int i14;
        long j11;
        int iTryToParseFourDigits;
        CharSequence charSequence2 = charSequence;
        int i15 = i10;
        try {
            int iD = a.d(charSequence2.length(), i15, i11);
            char c11 = ' ';
            if (i11 >= 32) {
                return g(charSequence, i10, i11);
            }
            char c12 = a.c(charSequence2, i15, iD);
            boolean z10 = c12 == '-';
            if ((z10 || c12 == '+') && (c12 = a.c(charSequence2, (i15 = i15 + 1), iD)) == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            int i16 = -1;
            int i17 = i15;
            long j12 = 0;
            boolean z11 = false;
            while (true) {
                char c13 = c11;
                if (i17 >= iD) {
                    break;
                }
                c12 = charSequence2.charAt(i17);
                char c14 = (char) (c12 - '0');
                if (c14 >= '\n') {
                    if (c12 != '.') {
                        break;
                    }
                    z11 |= i16 >= 0;
                    int i18 = i17;
                    while (i18 < iD - 4 && (iTryToParseFourDigits = g.tryToParseFourDigits(charSequence2, i18 + 1)) >= 0) {
                        j12 = (j12 * 10000) + iTryToParseFourDigits;
                        i18 += 4;
                    }
                    i16 = i17;
                    i17 = i18;
                } else {
                    j12 = (j12 * 10) + c14;
                }
                i17++;
                c11 = c13;
            }
            if (i16 < 0) {
                i12 = i17 - i15;
                c10 = c12;
                i13 = i17;
                j10 = 0;
            } else {
                i12 = (i17 - i15) - 1;
                j10 = (i16 - i17) + 1;
                int i19 = i16;
                c10 = c12;
                i13 = i19;
            }
            boolean z12 = true;
            if ((c10 | ' ') == 101) {
                i14 = i17 + 1;
                char c15 = a.c(charSequence2, i14, iD);
                boolean z13 = c15 == '-';
                if (z13 || c15 == '+') {
                    i14 = i17 + 2;
                    c15 = a.c(charSequence2, i14, iD);
                }
                char c16 = (char) (c15 - '0');
                z11 |= c16 >= '\n';
                long j13 = 0;
                while (true) {
                    if (j13 < 2147483647L) {
                        j13 = (j13 * 10) + c16;
                    }
                    j11 = j13;
                    i14++;
                    char c17 = (char) (a.c(charSequence2, i14, iD) - '0');
                    if (c17 >= '\n') {
                        break;
                    }
                    j13 = j11;
                    c16 = c17;
                    charSequence2 = charSequence;
                }
                if (z13) {
                    j11 = -j11;
                }
                j10 += j11;
            } else {
                i14 = i17;
                i17 = iD;
            }
            long j14 = j10;
            if (i12 != 0) {
                z12 = false;
            }
            int i20 = i12;
            a.e(z11 | z12, i14, iD, i20, j14);
            if (i20 >= 19) {
                return h(charSequence, i15, i13, i13 + 1, i17, z10, (int) j14);
            }
            if (z10) {
                j12 = -j12;
            }
            return new BigDecimal(j12).scaleByPowerOfTen((int) j14);
        } catch (ArithmeticException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }
}
