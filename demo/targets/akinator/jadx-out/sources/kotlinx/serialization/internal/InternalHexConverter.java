package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    private final int hexToInt(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return internalHexConverter.printHexBinary(bArr, z10);
    }

    public final byte[] parseHexBinary(String s10) {
        e0.checkNotNullParameter(s10, "s");
        int length = s10.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iHexToInt = hexToInt(s10.charAt(i10));
            int i11 = i10 + 1;
            int iHexToInt2 = hexToInt(s10.charAt(i11));
            if (iHexToInt == -1 || iHexToInt2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s10.charAt(i10) + s10.charAt(i11)).toString());
            }
            bArr[i10 / 2] = (byte) ((iHexToInt << 4) + iHexToInt2);
        }
        return bArr;
    }

    public final String printHexBinary(byte[] data, boolean z10) {
        e0.checkNotNullParameter(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b10 : data) {
            sb2.append(hexCode.charAt((b10 >> 4) & 15));
            sb2.append(hexCode.charAt(b10 & 15));
        }
        if (!z10) {
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String string2 = sb2.toString();
        e0.checkNotNullExpressionValue(string2, "toString(...)");
        String lowerCase = string2.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String toHexString(int i10) {
        byte[] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = (byte) (i10 >> (24 - (i11 * 8)));
        }
        String strTrimStart = n0.trimStart(printHexBinary(bArr, true), '0');
        if (strTrimStart.length() <= 0) {
            strTrimStart = null;
        }
        return strTrimStart == null ? "0" : strTrimStart;
    }
}
