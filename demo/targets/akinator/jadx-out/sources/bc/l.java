package bc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends a {
    public static BigDecimal g(int i10, char[] cArr, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j10;
        int i15;
        boolean z11;
        long j11;
        int i16;
        boolean z12;
        int i17;
        int i18 = i10;
        int i19 = i18 + i11;
        char cB = a.b(i18, cArr, i19);
        boolean z13 = cB == '-';
        if ((z13 || cB == '+') && (cB = a.b((i18 = i18 + 1), cArr, i19)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int iMin = Math.min(i19 - 8, 1073741824);
        int i20 = i18;
        while (i20 < iMin && g.isEightZeroes(cArr, i20)) {
            i20 += 8;
        }
        while (i20 < i19 && cArr[i20] == '0') {
            i20++;
        }
        int i21 = i20;
        while (i21 < iMin && g.isEightDigits(cArr, i21)) {
            i21 += 8;
        }
        while (i21 < i19) {
            cB = cArr[i21];
            if (!g.a(cB)) {
                break;
            }
            i21++;
        }
        if (cB == '.') {
            int i22 = i21 + 1;
            while (i22 < iMin && g.isEightZeroes(cArr, i22)) {
                i22 += 8;
            }
            while (i22 < i19 && cArr[i22] == '0') {
                i22++;
            }
            int i23 = i22;
            while (i23 < iMin && g.isEightDigits(cArr, i23)) {
                i23 += 8;
            }
            while (i23 < i19) {
                cB = cArr[i23];
                if (!g.a(cB)) {
                    break;
                }
                i23++;
            }
            i13 = i22;
            i12 = i21;
            i21 = i23;
        } else {
            i12 = -1;
            i13 = -1;
        }
        long j12 = 0;
        if (i12 < 0) {
            z10 = true;
            i15 = i21 - i20;
            i13 = i21;
            i12 = i13;
            i14 = i12;
            j10 = 0;
        } else {
            z10 = true;
            i14 = i21;
            j10 = (i12 - i21) + 1;
            i15 = i20 == i12 ? i21 - i13 : (i21 - i20) - 1;
        }
        if ((cB | ' ') == 101) {
            int i24 = i14 + 1;
            char cB2 = a.b(i24, cArr, i19);
            boolean z14 = cB2 == '-' ? z10 : false;
            if (z14 || cB2 == '+') {
                i24 = i14 + 2;
                cB2 = a.b(i24, cArr, i19);
            }
            char cB3 = (char) (cB2 - '0');
            z12 = cB3 >= '\n' ? z10 : false;
            while (true) {
                if (j12 < 2147483647L) {
                    z11 = z13;
                    j12 = (j12 * 10) + cB3;
                } else {
                    z11 = z13;
                }
                i24++;
                cB3 = (char) (a.b(i24, cArr, i19) - '0');
                if (cB3 >= '\n') {
                    break;
                }
                z13 = z11;
            }
            if (z14) {
                j12 = -j12;
            }
            i16 = i24;
            j11 = j10 + j12;
            i17 = i14;
        } else {
            z11 = z13;
            j11 = j10;
            i16 = i14;
            z12 = false;
            i17 = i19;
        }
        a.e(z12 | ((i18 == i12 && i12 == i17) ? z10 : false), i16, i19, i15, j11);
        return h(cArr, i20, i12, i13, i17, z11, (int) j11);
    }

    public static BigDecimal h(char[] cArr, int i10, int i11, int i12, int i13, boolean z10, int i14) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerB;
        int i15 = (i13 - i11) - 1;
        int i16 = i13 - i12;
        int i17 = i11 - i10;
        TreeMap treeMapC = null;
        if (i17 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i17 > 400) {
            treeMapC = h.c();
            h.e(treeMapC, i10, i11);
            bigIntegerNegate = f.f(cArr, i10, i11, treeMapC);
        } else {
            bigIntegerNegate = f.b(i10, cArr, i11);
        }
        if (i15 > 0) {
            if (i16 > 400) {
                if (treeMapC == null) {
                    treeMapC = h.c();
                }
                h.e(treeMapC, i12, i13);
                bigIntegerB = f.f(cArr, i12, i13, treeMapC);
            } else {
                bigIntegerB = f.b(i12, cArr, i13);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerB = j.k(bigIntegerNegate, h.a(treeMapC, i15)).add(bigIntegerB);
            }
            bigIntegerNegate = bigIntegerB;
        }
        if (z10) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i14);
    }

    public BigDecimal parseBigDecimalString(char[] cArr, int i10, int i11) {
        int i12;
        long j10;
        char c10;
        int i13;
        int i14;
        long j11;
        int iTryToParseFourDigits;
        char[] cArr2 = cArr;
        int i15 = i10;
        try {
            int iD = a.d(cArr2.length, i15, i11);
            char c11 = ' ';
            if (i11 >= 32) {
                return g(i15, cArr2, i11);
            }
            char cB = a.b(i15, cArr2, iD);
            boolean z10 = cB == '-';
            if ((z10 || cB == '+') && (cB = a.b((i15 = i15 + 1), cArr2, iD)) == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            int i16 = -1;
            int i17 = i15;
            long j12 = 0;
            boolean z11 = false;
            while (true) {
                char c12 = c11;
                if (i17 >= iD) {
                    break;
                }
                cB = cArr2[i17];
                char c13 = (char) (cB - '0');
                if (c13 >= '\n') {
                    if (cB != '.') {
                        break;
                    }
                    z11 |= i16 >= 0;
                    int i18 = i17;
                    while (i18 < iD - 4 && (iTryToParseFourDigits = g.tryToParseFourDigits(cArr2, i18 + 1)) >= 0) {
                        j12 = (j12 * 10000) + iTryToParseFourDigits;
                        i18 += 4;
                    }
                    i16 = i17;
                    i17 = i18;
                } else {
                    j12 = (j12 * 10) + c13;
                }
                i17++;
                c11 = c12;
            }
            if (i16 < 0) {
                i12 = i17 - i15;
                c10 = cB;
                i13 = i17;
                j10 = 0;
            } else {
                i12 = (i17 - i15) - 1;
                j10 = (i16 - i17) + 1;
                int i19 = i16;
                c10 = cB;
                i13 = i19;
            }
            boolean z12 = true;
            if ((c10 | ' ') == 101) {
                i14 = i17 + 1;
                char cB2 = a.b(i14, cArr2, iD);
                boolean z13 = cB2 == '-';
                if (z13 || cB2 == '+') {
                    i14 = i17 + 2;
                    cB2 = a.b(i14, cArr2, iD);
                }
                char c14 = (char) (cB2 - '0');
                z11 |= c14 >= '\n';
                long j13 = 0;
                while (true) {
                    if (j13 < 2147483647L) {
                        j13 = (j13 * 10) + c14;
                    }
                    j11 = j13;
                    i14++;
                    char cB3 = (char) (a.b(i14, cArr2, iD) - '0');
                    if (cB3 >= '\n') {
                        break;
                    }
                    j13 = j11;
                    c14 = cB3;
                    cArr2 = cArr;
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
                return h(cArr, i15, i13, i13 + 1, i17, z10, (int) j14);
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
