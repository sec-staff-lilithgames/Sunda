package bc;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends a {
    public static BigInteger g(char[] cArr, int i10, int i11, boolean z10) {
        int i12;
        boolean z11;
        int iH = h(i10, cArr, i11);
        int i13 = i11 - iH;
        if (i13 <= 0) {
            return BigInteger.ZERO;
        }
        if (i13 > 536870912) {
            throw new NumberFormatException("value exceeds limits");
        }
        byte[] bArr = new byte[((i13 + 1) >> 1) + 1];
        if ((i13 & 1) != 0) {
            int i14 = iH + 1;
            int iF = a.f(cArr[iH]);
            bArr[1] = (byte) iF;
            i12 = 2;
            z11 = iF < 0;
            iH = i14;
        } else {
            i12 = 1;
            z11 = false;
        }
        int i15 = ((i11 - iH) & 7) + iH;
        while (iH < i15) {
            char c10 = cArr[iH];
            char c11 = cArr[iH + 1];
            int iF2 = a.f(c10);
            int iF3 = a.f(c11);
            int i16 = i12 + 1;
            bArr[i12] = (byte) ((iF2 << 4) | iF3);
            z11 |= iF2 < 0 || iF3 < 0;
            iH += 2;
            i12 = i16;
        }
        while (iH < i11) {
            long jTryToParseEightHexDigits = g.tryToParseEightHexDigits(cArr, iH);
            g.writeIntBE(bArr, i12, (int) jTryToParseEightHexDigits);
            z11 |= jTryToParseEightHexDigits < 0;
            iH += 8;
            i12 += 4;
        }
        if (z11) {
            throw new NumberFormatException("illegal syntax");
        }
        BigInteger bigInteger = new BigInteger(bArr);
        return z10 ? bigInteger.negate() : bigInteger;
    }

    public static int h(int i10, char[] cArr, int i11) {
        while (i10 < i11 - 8 && g.isEightZeroes(cArr, i10)) {
            i10 += 8;
        }
        while (i10 < i11 && cArr[i10] == '0') {
            i10++;
        }
        return i10;
    }

    public BigInteger parseBigIntegerString(char[] cArr, int i10, int i11, int i12) throws NumberFormatException {
        int i13;
        try {
            int iD = a.d(cArr.length, i10, i11);
            char c10 = cArr[i10];
            boolean z10 = c10 == '-';
            if (z10 || c10 == '+') {
                i13 = i10 + 1;
                if (a.b(i13, cArr, iD) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            } else {
                i13 = i10;
            }
            if (i12 != 10) {
                return i12 != 16 ? new BigInteger(new String(cArr, i10, i11), i12) : g(cArr, i13, iD, z10);
            }
            int i14 = iD - i13;
            if (i14 > 18) {
                int iH = h(i13, cArr, iD);
                if (iD - iH > 646456993) {
                    throw new NumberFormatException("value exceeds limits");
                }
                BigInteger bigIntegerF = f.f(cArr, iH, iD, h.d(iH, iD));
                return z10 ? bigIntegerF.negate() : bigIntegerF;
            }
            int i15 = (i14 & 7) + i13;
            long jTryToParseUpTo7Digits = g.tryToParseUpTo7Digits(cArr, i13, i15);
            boolean z11 = jTryToParseUpTo7Digits >= 0;
            while (i15 < iD) {
                int iTryToParseEightDigits = g.tryToParseEightDigits(cArr, i15);
                z11 &= iTryToParseEightDigits >= 0;
                jTryToParseUpTo7Digits = (jTryToParseUpTo7Digits * 100000000) + iTryToParseEightDigits;
                i15 += 8;
            }
            if (!z11) {
                throw new NumberFormatException("illegal syntax");
            }
            if (z10) {
                jTryToParseUpTo7Digits = -jTryToParseUpTo7Digits;
            }
            return BigInteger.valueOf(jTryToParseUpTo7Digits);
        } catch (ArithmeticException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }
}
