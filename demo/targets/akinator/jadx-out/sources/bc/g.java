package bc;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {
    public static boolean a(char c10) {
        return ((char) (c10 + 65488)) < '\n';
    }

    public static double fma(double d10, double d11, double d12) {
        return (d10 * d11) + d12;
    }

    public static boolean isEightDigits(byte[] bArr, int i10) {
        return isEightDigitsUtf8(readLongLE(bArr, i10));
    }

    public static boolean isEightDigitsUtf16(long j10, long j11) {
        return ((((j10 + 19703549022044230L) | (j10 - 13511005043687472L)) | ((j11 + 19703549022044230L) | (j11 - 13511005043687472L))) & (-35747867511423104L)) == 0;
    }

    public static boolean isEightDigitsUtf8(long j10) {
        return (((j10 + 5063812098665367110L) | (j10 - 3472328296227680304L)) & (-9187201950435737472L)) == 0;
    }

    public static boolean isEightZeroes(byte[] bArr, int i10) {
        return isEightZeroesUtf8(readLongLE(bArr, i10));
    }

    public static boolean isEightZeroesUtf16(long j10, long j11) {
        return j10 == 13511005043687472L && j11 == 13511005043687472L;
    }

    public static boolean isEightZeroesUtf8(long j10) {
        return j10 == 3472328296227680304L;
    }

    public static int readIntBE(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static int readIntLE(byte[] bArr, int i10) {
        return (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long readLongBE(byte[] bArr, int i10) {
        return (bArr[i10 + 7] & 255) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    public static long readLongLE(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 7] & 255) << 56) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static int tryToParseEightDigits(char[] cArr, int i10) {
        return tryToParseEightDigitsUtf16(cArr[i10] | (cArr[i10 + 1] << 16) | (cArr[i10 + 2] << 32) | (cArr[i10 + 3] << 48), (cArr[i10 + 7] << 48) | cArr[i10 + 4] | (cArr[i10 + 5] << 16) | (cArr[i10 + 6] << 32));
    }

    public static int tryToParseEightDigitsUtf16(long j10, long j11) {
        long j12 = j10 - 13511005043687472L;
        long j13 = j11 - 13511005043687472L;
        if ((((j10 + 19703549022044230L) | j12 | (j11 + 19703549022044230L) | j13) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (((int) ((j12 * 281475406208040961L) >>> 48)) * 10000) + ((int) ((j13 * 281475406208040961L) >>> 48));
    }

    public static int tryToParseEightDigitsUtf8(byte[] bArr, int i10) {
        return tryToParseEightDigitsUtf8(readLongLE(bArr, i10));
    }

    public static long tryToParseEightHexDigits(CharSequence charSequence, int i10) {
        return tryToParseEightHexDigitsUtf16((charSequence.charAt(i10) << 48) | (charSequence.charAt(i10 + 1) << 32) | (charSequence.charAt(i10 + 2) << 16) | charSequence.charAt(i10 + 3), charSequence.charAt(i10 + 7) | (charSequence.charAt(i10 + 4) << 48) | (charSequence.charAt(i10 + 5) << 32) | (charSequence.charAt(i10 + 6) << 16));
    }

    public static long tryToParseEightHexDigitsUtf16(long j10, long j11) {
        if (((j10 | j11) & (-71777214294589696L)) != 0) {
            return -1L;
        }
        long j12 = j10 * 65792;
        long j13 = j11 * 65792;
        return tryToParseEightHexDigitsUtf8(((j12 & 4294901760L) << 16) | (j12 & (-281474976710656L)) | (((-281474976710656L) & j13) >>> 32) | ((j13 & 4294901760L) >>> 16));
    }

    public static long tryToParseEightHexDigitsUtf8(long j10) {
        long j11 = (j10 - 3472328296227680304L) & (-9187201950435737472L);
        long j12 = (5063812098665367110L + j10) & (-9187201950435737472L);
        long j13 = j10 | 2314885530818453536L;
        long j14 = j13 - 3472328296227680304L;
        if ((j11 | j12) != ((j13 - 7451037802321897319L) & (-9187201950435737472L) & (j13 - (-2242545357980376863L)))) {
            return -1L;
        }
        long j15 = (j12 >>> 7) * 255;
        long j16 = ((~j15) & j14) | (j14 - (j15 & 2821266740684990247L));
        long j17 = (j16 | (j16 >>> 4)) & 71777214294589695L;
        long j18 = j17 | (j17 >>> 8);
        return (j18 & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((j18 >>> 16) & 4294901760L);
    }

    public static int tryToParseFourDigits(char[] cArr, int i10) {
        return tryToParseFourDigitsUtf16((cArr[i10 + 3] << 48) | cArr[i10] | (cArr[i10 + 1] << 16) | (cArr[i10 + 2] << 32));
    }

    public static int tryToParseFourDigitsUtf16(long j10) {
        long j11 = j10 - 13511005043687472L;
        if ((((j10 + 19703549022044230L) | j11) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j11 * 281475406208040961L) >>> 48);
    }

    public static int tryToParseFourDigitsUtf8(int i10) {
        int i11 = i10 - 808464432;
        if ((((i10 + 1179010630) | i11) & (-2139062144)) != 0) {
            return -1;
        }
        int i12 = (i11 * 2561) >>> 8;
        return ((i12 & 255) * 100) + ((i12 & 16711680) >> 16);
    }

    public static int tryToParseUpTo7Digits(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        boolean z10 = true;
        while (i10 < i11) {
            byte b10 = bArr[i10];
            z10 &= ((char) (b10 + (-48))) < '\n';
            i12 = ((i12 * 10) + b10) - 48;
            i10++;
        }
        if (z10) {
            return i12;
        }
        return -1;
    }

    public static void writeIntBE(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void writeLongBE(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >>> 56);
        bArr[i10 + 1] = (byte) (j10 >>> 48);
        bArr[i10 + 2] = (byte) (j10 >>> 40);
        bArr[i10 + 3] = (byte) (j10 >>> 32);
        bArr[i10 + 4] = (byte) (j10 >>> 24);
        bArr[i10 + 5] = (byte) (j10 >>> 16);
        bArr[i10 + 6] = (byte) (j10 >>> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    public static boolean isEightDigits(char[] cArr, int i10) {
        return isEightDigitsUtf16(cArr[i10] | (cArr[i10 + 1] << 16) | (cArr[i10 + 2] << 32) | (cArr[i10 + 3] << 48), (cArr[i10 + 7] << 48) | cArr[i10 + 4] | (cArr[i10 + 5] << 16) | (cArr[i10 + 6] << 32));
    }

    public static boolean isEightZeroes(CharSequence charSequence, int i10) {
        boolean z10 = true;
        for (int i11 = 0; i11 < 8; i11++) {
            z10 &= '0' == charSequence.charAt(i11 + i10);
        }
        return z10;
    }

    public static int tryToParseEightDigitsUtf8(long j10) {
        long j11 = j10 - 3472328296227680304L;
        if ((((j10 + 5063812098665367110L) | j11) & (-9187201950435737472L)) != 0) {
            return -1;
        }
        long j12 = (10 * j11) + (j11 >>> 8);
        return (int) (((((j12 >>> 16) & 1095216660735L) * 42949672960001L) + ((j12 & 1095216660735L) * 4294967296000100L)) >>> 32);
    }

    public static int tryToParseUpTo7Digits(char[] cArr, int i10, int i11) {
        int i12 = 0;
        boolean zA = true;
        while (i10 < i11) {
            char c10 = cArr[i10];
            zA &= a(c10);
            i12 = ((i12 * 10) + c10) - 48;
            i10++;
        }
        if (zA) {
            return i12;
        }
        return -1;
    }

    public static boolean isEightZeroes(char[] cArr, int i10) {
        return isEightZeroesUtf16(cArr[i10] | (cArr[i10 + 1] << 16) | (cArr[i10 + 2] << 32) | (cArr[i10 + 3] << 48), (cArr[i10 + 7] << 48) | cArr[i10 + 4] | (cArr[i10 + 5] << 16) | (cArr[i10 + 6] << 32));
    }

    public static int tryToParseFourDigits(CharSequence charSequence, int i10) {
        return tryToParseFourDigitsUtf16((charSequence.charAt(i10 + 3) << 48) | charSequence.charAt(i10) | (charSequence.charAt(i10 + 1) << 16) | (charSequence.charAt(i10 + 2) << 32));
    }

    public static int tryToParseEightDigits(byte[] bArr, int i10) {
        return tryToParseEightDigitsUtf8(readLongLE(bArr, i10));
    }

    public static int tryToParseUpTo7Digits(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        boolean zA = true;
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            zA &= a(cCharAt);
            i12 = ((i12 * 10) + cCharAt) - 48;
            i10++;
        }
        if (zA) {
            return i12;
        }
        return -1;
    }

    public static boolean isEightDigits(CharSequence charSequence, int i10) {
        boolean zA = true;
        for (int i11 = 0; i11 < 8; i11++) {
            zA &= a(charSequence.charAt(i11 + i10));
        }
        return zA;
    }

    public static int tryToParseEightDigits(CharSequence charSequence, int i10) {
        return tryToParseEightDigitsUtf16(charSequence.charAt(i10) | (charSequence.charAt(i10 + 1) << 16) | (charSequence.charAt(i10 + 2) << 32) | (charSequence.charAt(i10 + 3) << 48), (charSequence.charAt(i10 + 7) << 48) | charSequence.charAt(i10 + 4) | (charSequence.charAt(i10 + 5) << 16) | (charSequence.charAt(i10 + 6) << 32));
    }

    public static int tryToParseFourDigits(byte[] bArr, int i10) {
        return tryToParseFourDigitsUtf8(readIntLE(bArr, i10));
    }

    public static long tryToParseEightHexDigits(char[] cArr, int i10) {
        return tryToParseEightHexDigitsUtf16((cArr[i10] << 48) | (cArr[i10 + 1] << 32) | (cArr[i10 + 2] << 16) | cArr[i10 + 3], cArr[i10 + 7] | (cArr[i10 + 4] << 48) | (cArr[i10 + 5] << 32) | (cArr[i10 + 6] << 16));
    }

    public static long tryToParseEightHexDigits(byte[] bArr, int i10) {
        return tryToParseEightHexDigitsUtf8(readLongBE(bArr, i10));
    }
}
