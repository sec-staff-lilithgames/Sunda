package qw;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.util.date.GMTDateParser;
import j1.o2;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.h1;
import sv.k0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f83555a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:176:0x01a1, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int access$codePointIndexToCharIndex(byte[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.b.access$codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return pw.a.encodeBase64$default(lVar.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return pw.a.encodeBase64(lVar.getData$okio(), pw.a.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(pw.l lVar, pw.l other) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        int size = lVar.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = lVar.getByte(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
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

    public static final void commonCopyInto(pw.l lVar, int i10, byte[] target, int i11, int i12) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(target, "target");
        f0.copyInto(lVar.getData$okio(), target, i11, i10, i12 + i10);
    }

    public static final pw.l commonDecodeBase64(String str) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64ToArray = pw.a.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new pw.l(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final pw.l commonEncodeUtf8(String str) {
        e0.checkNotNullParameter(str, "<this>");
        pw.l lVar = new pw.l(h1.asUtf8ToByteArray(str));
        lVar.setUtf8$okio(str);
        return lVar;
    }

    public static final boolean commonEndsWith(pw.l lVar, pw.l suffix) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(suffix, "suffix");
        return lVar.rangeEquals(lVar.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(pw.l lVar, Object obj) {
        e0.checkNotNullParameter(lVar, "<this>");
        if (obj == lVar) {
            return true;
        }
        if (obj instanceof pw.l) {
            pw.l lVar2 = (pw.l) obj;
            if (lVar2.size() == lVar.getData$okio().length && lVar2.rangeEquals(0, lVar.getData$okio(), 0, lVar.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(pw.l lVar, int i10) {
        e0.checkNotNullParameter(lVar, "<this>");
        return lVar.getData$okio()[i10];
    }

    public static final int commonGetSize(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return lVar.getData$okio().length;
    }

    public static final int commonHashCode(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        int hashCode$okio = lVar.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(lVar.getData$okio());
        lVar.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        char[] cArr = new char[lVar.getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : lVar.getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return k0.concatToString(cArr);
    }

    public static final int commonIndexOf(pw.l lVar, byte[] other, int i10) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        int length = lVar.getData$okio().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!pw.b.arrayRangeEquals(lVar.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        return lVar.getData$okio();
    }

    public static final int commonLastIndexOf(pw.l lVar, pw.l other, int i10) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        return lVar.lastIndexOf(other.internalArray$okio(), i10);
    }

    public static final pw.l commonOf(byte[] data) {
        e0.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new pw.l(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(pw.l lVar, int i10, pw.l other, int i11, int i12) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        return other.rangeEquals(i11, lVar.getData$okio(), i10, i12);
    }

    public static final boolean commonStartsWith(pw.l lVar, pw.l prefix) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(prefix, "prefix");
        return lVar.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final pw.l commonSubstring(pw.l lVar, int i10, int i11) {
        e0.checkNotNullParameter(lVar, "<this>");
        int iResolveDefaultParameter = pw.b.resolveDefaultParameter(lVar, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > lVar.getData$okio().length) {
            throw new IllegalArgumentException(e3.g.m(new StringBuilder("endIndex > length("), lVar.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter - i10 >= 0) {
            return (i10 == 0 && iResolveDefaultParameter == lVar.getData$okio().length) ? lVar : new pw.l(f0.copyOfRange(lVar.getData$okio(), i10, iResolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public static final pw.l commonToAsciiLowercase(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        for (int i10 = 0; i10 < lVar.getData$okio().length; i10++) {
            byte b10 = lVar.getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = lVar.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new pw.l(bArrCopyOf);
            }
        }
        return lVar;
    }

    public static final pw.l commonToAsciiUppercase(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        for (int i10 = 0; i10 < lVar.getData$okio().length; i10++) {
            byte b10 = lVar.getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = lVar.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new pw.l(bArrCopyOf);
            }
        }
        return lVar;
    }

    public static final byte[] commonToByteArray(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        byte[] data$okio = lVar.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final pw.l commonToByteString(byte[] bArr, int i10, int i11) {
        e0.checkNotNullParameter(bArr, "<this>");
        int iResolveDefaultParameter = pw.b.resolveDefaultParameter(bArr, i11);
        pw.b.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
        return new pw.l(f0.copyOfRange(bArr, i10, iResolveDefaultParameter + i10));
    }

    public static final String commonToString(pw.l lVar) {
        pw.l lVar2 = lVar;
        e0.checkNotNullParameter(lVar2, "<this>");
        if (lVar2.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iAccess$codePointIndexToCharIndex = access$codePointIndexToCharIndex(lVar2.getData$okio(), 64);
        if (iAccess$codePointIndexToCharIndex != -1) {
            String strUtf8 = lVar2.utf8();
            String strSubstring = strUtf8.substring(0, iAccess$codePointIndexToCharIndex);
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strReplace$default = k0.replace$default(k0.replace$default(k0.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (iAccess$codePointIndexToCharIndex >= strUtf8.length()) {
                return o2.f(AbstractJsonLexerKt.END_LIST, "[text=", strReplace$default);
            }
            return "[size=" + lVar2.getData$okio().length + " text=" + strReplace$default + "…]";
        }
        if (lVar2.getData$okio().length <= 64) {
            return "[hex=" + lVar2.hex() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(lVar2.getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = pw.b.resolveDefaultParameter(lVar2, 64);
        if (iResolveDefaultParameter > lVar2.getData$okio().length) {
            throw new IllegalArgumentException(e3.g.m(new StringBuilder("endIndex > length("), lVar2.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != lVar2.getData$okio().length) {
            lVar2 = new pw.l(f0.copyOfRange(lVar2.getData$okio(), 0, iResolveDefaultParameter));
        }
        sb2.append(lVar2.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public static final String commonUtf8(pw.l lVar) {
        e0.checkNotNullParameter(lVar, "<this>");
        String utf8$okio = lVar.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = h1.toUtf8String(lVar.internalArray$okio());
        lVar.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(pw.l lVar, pw.g buffer, int i10, int i11) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        buffer.write(lVar.getData$okio(), i10, i11);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return f83555a;
    }

    public static final boolean commonEndsWith(pw.l lVar, byte[] suffix) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(suffix, "suffix");
        return lVar.rangeEquals(lVar.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(pw.l lVar, byte[] other, int i10) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(pw.b.resolveDefaultParameter(lVar, i10), lVar.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (pw.b.arrayRangeEquals(lVar.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(pw.l lVar, int i10, byte[] other, int i11, int i12) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= lVar.getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && pw.b.arrayRangeEquals(lVar.getData$okio(), i10, other, i11, i12);
    }

    public static final boolean commonStartsWith(pw.l lVar, byte[] prefix) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(prefix, "prefix");
        return lVar.rangeEquals(0, prefix, 0, prefix.length);
    }
}
