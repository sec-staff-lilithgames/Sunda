package bc;

import com.inmobi.commons.core.configs.AdConfig;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends a {
    public static BigInteger g(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        boolean z11;
        int iH = h(i10, i11, bArr);
        int i13 = i11 - iH;
        if (i13 <= 0) {
            return BigInteger.ZERO;
        }
        if (i13 > 536870912) {
            throw new NumberFormatException("value exceeds limits");
        }
        byte[] bArr2 = new byte[((i13 + 1) >> 1) + 1];
        int i14 = i13 & 1;
        byte[] bArr3 = a.f9022a;
        if (i14 != 0) {
            int i15 = iH + 1;
            byte b10 = bArr3[bArr[iH] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            bArr2[1] = b10;
            i12 = 2;
            z11 = b10 < 0;
            iH = i15;
        } else {
            i12 = 1;
            z11 = false;
        }
        int i16 = ((i11 - iH) & 7) + iH;
        while (iH < i16) {
            byte b11 = bArr[iH];
            byte b12 = bArr[iH + 1];
            byte b13 = bArr3[b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            byte b14 = bArr3[b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            int i17 = i12 + 1;
            bArr2[i12] = (byte) ((b13 << 4) | b14);
            z11 |= b13 < 0 || b14 < 0;
            iH += 2;
            i12 = i17;
        }
        while (iH < i11) {
            long jTryToParseEightHexDigits = g.tryToParseEightHexDigits(bArr, iH);
            g.writeIntBE(bArr2, i12, (int) jTryToParseEightHexDigits);
            z11 |= jTryToParseEightHexDigits < 0;
            iH += 8;
            i12 += 4;
        }
        if (z11) {
            throw new NumberFormatException("illegal syntax");
        }
        BigInteger bigInteger = new BigInteger(bArr2);
        return z10 ? bigInteger.negate() : bigInteger;
    }

    public static int h(int i10, int i11, byte[] bArr) {
        while (i10 < i11 - 8 && g.isEightZeroes(bArr, i10)) {
            i10 += 8;
        }
        while (i10 < i11 && bArr[i10] == 48) {
            i10++;
        }
        return i10;
    }

    public BigInteger parseBigIntegerString(byte[] bArr, int i10, int i11, int i12) throws NumberFormatException {
        int i13;
        try {
            int iD = a.d(bArr.length, i10, i11);
            byte b10 = bArr[i10];
            boolean z10 = b10 == 45;
            if (z10 || b10 == 43) {
                i13 = i10 + 1;
                if (a.a(i13, iD, bArr) == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            } else {
                i13 = i10;
            }
            if (i12 != 10) {
                return i12 != 16 ? new BigInteger(new String(bArr, i10, i11, StandardCharsets.ISO_8859_1), i12) : g(bArr, i13, iD, z10);
            }
            int i14 = iD - i13;
            if (i14 > 18) {
                int iH = h(i13, iD, bArr);
                if (iD - iH > 646456993) {
                    throw new NumberFormatException("value exceeds limits");
                }
                BigInteger bigIntegerE = f.e(bArr, iH, iD, h.d(iH, iD));
                return z10 ? bigIntegerE.negate() : bigIntegerE;
            }
            int i15 = (i14 & 7) + i13;
            long jTryToParseUpTo7Digits = g.tryToParseUpTo7Digits(bArr, i13, i15);
            boolean z11 = jTryToParseUpTo7Digits >= 0;
            while (i15 < iD) {
                int iTryToParseEightDigitsUtf8 = g.tryToParseEightDigitsUtf8(bArr, i15);
                z11 &= iTryToParseEightDigitsUtf8 >= 0;
                jTryToParseUpTo7Digits = (jTryToParseUpTo7Digits * 100000000) + iTryToParseEightDigitsUtf8;
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
