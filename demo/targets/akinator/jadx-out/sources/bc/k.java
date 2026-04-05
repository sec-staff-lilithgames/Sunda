package bc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends a {
    public static BigDecimal g(int i10, int i11, byte[] bArr) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j10;
        int i15;
        long j11;
        int i16;
        boolean z11;
        int i17;
        int i18;
        long j12;
        int i19 = i10;
        int i20 = i19 + i11;
        byte bA = a.a(i19, i20, bArr);
        boolean z12 = bA == 45;
        if ((z12 || bA == 43) && (bA = a.a((i19 = i19 + 1), i20, bArr)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int iMin = Math.min(i20 - 8, 1073741824);
        int i21 = i19;
        while (i21 < iMin && g.isEightZeroes(bArr, i21)) {
            i21 += 8;
        }
        while (i21 < i20 && bArr[i21] == 48) {
            i21++;
        }
        int i22 = i21;
        while (i22 < iMin && g.isEightDigits(bArr, i22)) {
            i22 += 8;
        }
        while (i22 < i20) {
            bA = bArr[i22];
            if (((char) (bA - 48)) >= '\n') {
                break;
            }
            i22++;
        }
        if (bA == 46) {
            int i23 = i22 + 1;
            while (i23 < iMin && g.isEightZeroes(bArr, i23)) {
                i23 += 8;
            }
            while (i23 < i20 && bArr[i23] == 48) {
                i23++;
            }
            int i24 = i23;
            while (i24 < iMin && g.isEightDigits(bArr, i24)) {
                i24 += 8;
            }
            while (i24 < i20) {
                bA = bArr[i24];
                if (((char) (bA - 48)) >= '\n') {
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
        long j13 = 0;
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
        if ((bA | 32) == 101) {
            i16 = i14 + 1;
            byte bA2 = a.a(i16, i20, bArr);
            boolean z13 = bA2 == 45 ? z10 : false;
            if (z13 || bA2 == 43) {
                i16 = i14 + 2;
                bA2 = a.a(i16, i20, bArr);
            }
            char cA = (char) (bA2 - 48);
            z11 = cA >= '\n' ? z10 : false;
            while (true) {
                if (j13 < 2147483647L) {
                    i18 = i12;
                    j13 = (j13 * 10) + cA;
                } else {
                    i18 = i12;
                }
                j12 = j13;
                i16++;
                cA = (char) (a.a(i16, i20, bArr) - 48);
                if (cA >= '\n') {
                    break;
                }
                j13 = j12;
                i12 = i18;
            }
            if (z13) {
                j12 = -j12;
            }
            j11 = j10 + j12;
            i17 = i14;
            i12 = i18;
        } else {
            j11 = j10;
            i16 = i14;
            z11 = false;
            i17 = i20;
        }
        a.e(z11 | ((i19 == i12 && i12 == i17) ? z10 : false), i16, i20, i15, j11);
        return h(i21, i12, i13, i17, (int) j11, z12, bArr);
    }

    public static BigDecimal h(int i10, int i11, int i12, int i13, int i14, boolean z10, byte[] bArr) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerA;
        int i15 = (i13 - i11) - 1;
        int i16 = i13 - i12;
        int i17 = i11 - i10;
        TreeMap treeMapC = null;
        if (i17 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i17 > 400) {
            treeMapC = h.c();
            h.e(treeMapC, i10, i11);
            bigIntegerNegate = f.e(bArr, i10, i11, treeMapC);
        } else {
            bigIntegerNegate = f.a(i10, i11, bArr);
        }
        if (i15 > 0) {
            if (i16 > 400) {
                if (treeMapC == null) {
                    treeMapC = h.c();
                }
                h.e(treeMapC, i12, i13);
                bigIntegerA = f.e(bArr, i12, i13, treeMapC);
            } else {
                bigIntegerA = f.a(i12, i13, bArr);
            }
            bigIntegerNegate = bigIntegerNegate.signum() == 0 ? bigIntegerA : j.k(bigIntegerNegate, h.a(treeMapC, i15)).add(bigIntegerA);
        }
        if (z10) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i14);
    }

    public BigDecimal parseBigDecimalString(byte[] bArr, int i10, int i11) {
        long j10;
        int i12;
        byte b10;
        int i13;
        int i14;
        int i15;
        long j11;
        int iTryToParseFourDigits;
        int i16 = i10;
        try {
            int iD = a.d(bArr.length, i16, i11);
            char c10 = ' ';
            boolean z10 = true;
            if (i11 >= 32) {
                return g(i16, i11, bArr);
            }
            byte bA = a.a(i16, iD, bArr);
            boolean z11 = bA == 45;
            if ((z11 || bA == 43) && (bA = a.a((i16 = i16 + 1), iD, bArr)) == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            int i17 = -1;
            int i18 = i16;
            long j12 = 0;
            boolean z12 = false;
            while (true) {
                char c11 = c10;
                if (i18 >= iD) {
                    break;
                }
                bA = bArr[i18];
                char c12 = (char) (bA - 48);
                if (c12 >= '\n') {
                    if (bA != 46) {
                        break;
                    }
                    z12 |= i17 >= 0;
                    int i19 = i18;
                    while (i19 < iD - 4 && (iTryToParseFourDigits = g.tryToParseFourDigits(bArr, i19 + 1)) >= 0) {
                        j12 = (j12 * 10000) + iTryToParseFourDigits;
                        i19 += 4;
                    }
                    i17 = i18;
                    i18 = i19;
                } else {
                    j12 = (j12 * 10) + c12;
                }
                i18++;
                c10 = c11;
            }
            if (i17 < 0) {
                i12 = i18 - i16;
                j10 = 0;
                b10 = bA;
                i13 = i18;
            } else {
                j10 = (i17 - i18) + 1;
                i12 = (i18 - i16) - 1;
                b10 = bA;
                i13 = i17;
            }
            if ((b10 | 32) == 101) {
                int i20 = i18 + 1;
                byte bA2 = a.a(i20, iD, bArr);
                boolean z13 = bA2 == 45;
                if (z13 || bA2 == 43) {
                    i20 = i18 + 2;
                    bA2 = a.a(i20, iD, bArr);
                }
                char c13 = (char) (bA2 - 48);
                z12 |= c13 >= '\n';
                long j13 = 0;
                while (true) {
                    if (j13 < 2147483647L) {
                        j13 = (j13 * 10) + c13;
                    }
                    j11 = j13;
                    i20++;
                    char cA = (char) (a.a(i20, iD, bArr) - 48);
                    if (cA >= '\n') {
                        break;
                    }
                    j13 = j11;
                    c13 = cA;
                }
                if (z13) {
                    j11 = -j11;
                }
                j10 += j11;
                i15 = i20;
                i14 = i18;
            } else {
                i14 = iD;
                i15 = i18;
            }
            long j14 = j10;
            if (i12 != 0) {
                z10 = false;
            }
            a.e(z12 | z10, i15, iD, i12, j14);
            if (i12 >= 19) {
                return h(i16, i13, i13 + 1, i14, (int) j14, z11, bArr);
            }
            if (z11) {
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
