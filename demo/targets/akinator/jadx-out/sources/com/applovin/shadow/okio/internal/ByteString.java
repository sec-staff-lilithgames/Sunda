package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Base64;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio._JvmPlatformKt;
import com.inmobi.commons.core.configs.AdConfig;
import e3.g;
import io.ktor.util.date.GMTDateParser;
import j1.o2;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.internal.-ByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString other) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = byteString.getByte(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = other.getByte(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(com.applovin.shadow.okio.ByteString byteString, int i10, byte[] target, int i11, int i12) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(target, "target");
        f0.copyInto(byteString.getData$okio(), target, i11, i10, i12 + i10);
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeBase64(String str) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new com.applovin.shadow.okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeHex(String str) {
        e0.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (decodeHexDigit(str.charAt(i11 + 1)) + (decodeHexDigit(str.charAt(i11)) << 4));
        }
        return new com.applovin.shadow.okio.ByteString(bArr);
    }

    public static final com.applovin.shadow.okio.ByteString commonEncodeUtf8(String str) {
        e0.checkNotNullParameter(str, "<this>");
        com.applovin.shadow.okio.ByteString byteString = new com.applovin.shadow.okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString suffix) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.ByteString byteString, Object obj) {
        e0.checkNotNullParameter(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof com.applovin.shadow.okio.ByteString) {
            com.applovin.shadow.okio.ByteString byteString2 = (com.applovin.shadow.okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(com.applovin.shadow.okio.ByteString byteString, int i10) {
        e0.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio()[i10];
    }

    public static final int commonGetSize(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : byteString.getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return k0.concatToString(cArr);
    }

    public static final int commonIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] other, int i10) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString other, int i10) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i10);
    }

    public static final com.applovin.shadow.okio.ByteString commonOf(byte[] data) {
        e0.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i10, com.applovin.shadow.okio.ByteString other, int i11, int i12) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        return other.rangeEquals(i11, byteString.getData$okio(), i10, i12);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString prefix) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final com.applovin.shadow.okio.ByteString commonSubstring(com.applovin.shadow.okio.ByteString byteString, int i10, int i11) {
        e0.checkNotNullParameter(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(g.m(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter - i10 >= 0) {
            return (i10 == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new com.applovin.shadow.okio.ByteString(f0.copyOfRange(byteString.getData$okio(), i10, iResolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiLowercase(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        for (int i10 = 0; i10 < byteString.getData$okio().length; i10++) {
            byte b10 = byteString.getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiUppercase(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        for (int i10 = 0; i10 < byteString.getData$okio().length; i10++) {
            byte b10 = byteString.getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final com.applovin.shadow.okio.ByteString commonToByteString(byte[] bArr, int i10, int i11) {
        e0.checkNotNullParameter(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i11);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
        return new com.applovin.shadow.okio.ByteString(f0.copyOfRange(bArr, i10, iResolveDefaultParameter + i10));
    }

    public static final String commonToString(com.applovin.shadow.okio.ByteString byteString) {
        com.applovin.shadow.okio.ByteString byteString2 = byteString;
        e0.checkNotNullParameter(byteString2, "<this>");
        if (byteString2.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString2.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString2.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strReplace$default = k0.replace$default(k0.replace$default(k0.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return o2.f(AbstractJsonLexerKt.END_LIST, "[text=", strReplace$default);
            }
            return "[size=" + byteString2.getData$okio().length + " text=" + strReplace$default + "…]";
        }
        if (byteString2.getData$okio().length <= 64) {
            return "[hex=" + byteString2.hex() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(byteString2.getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString2, 64);
        if (iResolveDefaultParameter > byteString2.getData$okio().length) {
            throw new IllegalArgumentException(g.m(new StringBuilder("endIndex > length("), byteString2.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString2.getData$okio().length) {
            byteString2 = new com.applovin.shadow.okio.ByteString(f0.copyOfRange(byteString2.getData$okio(), 0, iResolveDefaultParameter));
        }
        sb2.append(byteString2.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public static final String commonUtf8(com.applovin.shadow.okio.ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(com.applovin.shadow.okio.ByteString byteString, Buffer buffer, int i10, int i11) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, byte[] suffix) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] other, int i10) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i10), byteString.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i10, byte[] other, int i11, int i12) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= byteString.getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i10, other, i11, i12);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, byte[] prefix) {
        e0.checkNotNullParameter(byteString, "<this>");
        e0.checkNotNullParameter(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }
}
