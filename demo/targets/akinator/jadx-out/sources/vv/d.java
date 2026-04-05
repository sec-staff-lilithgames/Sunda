package vv;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.shadow.okio.Utf8;
import kotlin.jvm.internal.e0;
import p0.o2;
import sv.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d extends c {
    public static final String access$truncateForErrorMessage(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        return sb2.toString();
    }

    public static final void checkHyphenAt(String str, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbT = o2.t(i10, "Expected '-' (hyphen) at index ", ", but was '");
        sbT.append(str.charAt(i10));
        sbT.append('\'');
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public static final void formatBytesIntoCommonImpl(long j10, byte[] dst, int i10, int i11, int i12) {
        e0.checkNotNullParameter(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = k.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final long getLongAtCommonImpl(byte[] bArr, int i10) {
        e0.checkNotNullParameter(bArr, "<this>");
        return (bArr[i10 + 7] & 255) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    public static final void setLongAtCommonImpl(byte[] bArr, int i10, long j10) {
        e0.checkNotNullParameter(bArr, "<this>");
        int i11 = 7;
        while (-1 < i11) {
            bArr[i10] = (byte) (j10 >> (i11 << 3));
            i11--;
            i10++;
        }
    }

    public static final b uuidFromRandomBytes(byte[] randomBytes) {
        e0.checkNotNullParameter(randomBytes, "randomBytes");
        byte b10 = (byte) (randomBytes[6] & 15);
        randomBytes[6] = b10;
        randomBytes[6] = (byte) (b10 | 64);
        byte b11 = (byte) (randomBytes[8] & Utf8.REPLACEMENT_BYTE);
        randomBytes[8] = b11;
        randomBytes[8] = (byte) (b11 | 128);
        return b.f89658e.fromByteArray(randomBytes);
    }

    public static final b uuidParseHexCommonImpl(String hexString) {
        e0.checkNotNullParameter(hexString, "hexString");
        return b.f89658e.fromLongs(k.hexToLong$default(hexString, 0, 16, null, 4, null), k.hexToLong$default(hexString, 16, 32, null, 4, null));
    }

    public static final b uuidParseHexDashCommonImpl(String hexDashString) {
        e0.checkNotNullParameter(hexDashString, "hexDashString");
        long jHexToLong$default = k.hexToLong$default(hexDashString, 0, 8, null, 4, null);
        checkHyphenAt(hexDashString, 8);
        long jHexToLong$default2 = k.hexToLong$default(hexDashString, 9, 13, null, 4, null);
        checkHyphenAt(hexDashString, 13);
        long jHexToLong$default3 = k.hexToLong$default(hexDashString, 14, 18, null, 4, null);
        checkHyphenAt(hexDashString, 18);
        long jHexToLong$default4 = k.hexToLong$default(hexDashString, 19, 23, null, 4, null);
        checkHyphenAt(hexDashString, 23);
        return b.f89658e.fromLongs((jHexToLong$default2 << 16) | (jHexToLong$default << 32) | jHexToLong$default3, (jHexToLong$default4 << 48) | k.hexToLong$default(hexDashString, 24, 36, null, 4, null));
    }
}
