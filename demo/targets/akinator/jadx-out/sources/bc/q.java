package bc;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends a {
    public static BigInteger g(CharSequence charSequence, int i10, int i11, boolean z10) {
        int i12;
        boolean z11;
        while (i10 < i11 && charSequence.charAt(i10) == '0') {
            i10++;
        }
        int i13 = i11 - i10;
        if (i13 <= 0) {
            return BigInteger.ZERO;
        }
        if (i13 > 536870912) {
            throw new NumberFormatException("value exceeds limits");
        }
        byte[] bArr = new byte[((i13 + 1) >> 1) + 1];
        if ((i13 & 1) != 0) {
            int i14 = i10 + 1;
            int iF = a.f(charSequence.charAt(i10));
            bArr[1] = (byte) iF;
            i12 = 2;
            z11 = iF < 0;
            i10 = i14;
        } else {
            i12 = 1;
            z11 = false;
        }
        int i15 = ((i11 - i10) & 7) + i10;
        while (i10 < i15) {
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = charSequence.charAt(i10 + 1);
            int iF2 = a.f(cCharAt);
            int iF3 = a.f(cCharAt2);
            int i16 = i12 + 1;
            bArr[i12] = (byte) ((iF2 << 4) | iF3);
            z11 |= iF3 < 0 || iF2 < 0;
            i10 += 2;
            i12 = i16;
        }
        while (i10 < i11) {
            long jTryToParseEightHexDigits = g.tryToParseEightHexDigits(charSequence, i10);
            g.writeIntBE(bArr, i12, (int) jTryToParseEightHexDigits);
            z11 |= jTryToParseEightHexDigits < 0;
            i10 += 8;
            i12 += 4;
        }
        if (z11) {
            throw new NumberFormatException("illegal syntax");
        }
        BigInteger bigInteger = new BigInteger(bArr);
        return z10 ? bigInteger.negate() : bigInteger;
    }

    public BigInteger parseBigIntegerString(CharSequence charSequence, int i10, int i11, int i12) throws NumberFormatException {
        int i13;
        try {
            int iD = a.d(charSequence.length(), i10, i11);
            char cCharAt = charSequence.charAt(i10);
            boolean z10 = cCharAt == '-';
            if (z10 || cCharAt == '+') {
                i13 = i10 + 1;
                if (a.c(charSequence, i13, iD) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            } else {
                i13 = i10;
            }
            if (i12 != 10) {
                return i12 != 16 ? new BigInteger(charSequence.subSequence(i10, i11).toString(), i12) : g(charSequence, i13, iD, z10);
            }
            int i14 = iD - i13;
            if (i14 > 18) {
                while (i13 < iD && charSequence.charAt(i13) == '0') {
                    i13++;
                }
                if (iD - i13 > 646456993) {
                    throw new NumberFormatException("value exceeds limits");
                }
                BigInteger bigIntegerD = f.d(charSequence, i13, iD, h.d(i13, iD));
                return z10 ? bigIntegerD.negate() : bigIntegerD;
            }
            int i15 = (i14 & 7) + i13;
            long jTryToParseUpTo7Digits = g.tryToParseUpTo7Digits(charSequence, i13, i15);
            boolean z11 = jTryToParseUpTo7Digits >= 0;
            while (i15 < iD) {
                int iTryToParseEightDigits = g.tryToParseEightDigits(charSequence, i15);
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
