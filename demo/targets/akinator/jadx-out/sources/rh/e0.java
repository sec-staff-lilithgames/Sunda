package rh;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e0 {
    public static byte checkedCast(long j10) {
        p1.checkArgument((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int compare(byte b10, byte b11) {
        return (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static String join(String str, byte... bArr) {
        p1.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((str.length() + 3) * bArr.length);
        sb2.append(bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        for (int i10 = 1; i10 < bArr.length; i10++) {
            sb2.append(str);
            sb2.append(toString(bArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return d0.f84357a;
    }

    public static byte max(byte... bArr) {
        p1.checkArgument(bArr.length > 0);
        int i10 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return (byte) i10;
    }

    public static byte min(byte... bArr) {
        p1.checkArgument(bArr.length > 0);
        int i10 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return (byte) i10;
    }

    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte saturatedCast(long j10) {
        if (j10 > 255) {
            return (byte) -1;
        }
        if (j10 < 0) {
            return (byte) 0;
        }
        return (byte) j10;
    }

    public static void sort(byte[] bArr) {
        p1.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr) {
        p1.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static int toInt(byte b10) {
        return b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public static String toString(byte b10) {
        return toString(b10, 10);
    }

    public static byte parseUnsignedByte(String str, int i10) throws NumberFormatException {
        int i11 = Integer.parseInt((String) p1.checkNotNull(str), i10);
        if ((i11 >> 8) == 0) {
            return (byte) i11;
        }
        throw new NumberFormatException(a.b.e(i11, "out of range: "));
    }

    public static String toString(byte b10, int i10) {
        p1.checkArgument(i10 >= 2 && i10 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i10);
        return Integer.toString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i10);
    }

    public static void sort(byte[] bArr, int i10, int i11) {
        p1.checkNotNull(bArr);
        p1.checkPositionIndexes(i10, i11, bArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ 128);
        }
        Arrays.sort(bArr, i10, i11);
        while (i10 < i11) {
            bArr[i10] = (byte) (bArr[i10] ^ 128);
            i10++;
        }
    }

    public static void sortDescending(byte[] bArr, int i10, int i11) {
        p1.checkNotNull(bArr);
        p1.checkPositionIndexes(i10, i11, bArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ AbstractJsonLexerKt.TC_INVALID);
        }
        Arrays.sort(bArr, i10, i11);
        while (i10 < i11) {
            bArr[i10] = (byte) (bArr[i10] ^ AbstractJsonLexerKt.TC_INVALID);
            i10++;
        }
    }
}
