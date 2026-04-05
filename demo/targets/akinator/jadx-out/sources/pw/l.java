package pw;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import j1.o2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l implements Serializable, Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f81911f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final l f81912g = new l(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f81913b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f81914c;

    /* renamed from: e, reason: collision with root package name */
    public transient String f81915e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ l encodeString$default(a aVar, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = sv.g.f86134b;
            }
            return aVar.encodeString(str, charset);
        }

        public static /* synthetic */ l of$default(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = b.getDEFAULT__ByteString_size();
            }
            return aVar.of(bArr, i10, i11);
        }

        @tu.f
        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final l m5883deprecated_decodeBase64(String string) {
            kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
            return decodeBase64(string);
        }

        @tu.f
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final l m5884deprecated_decodeHex(String string) {
            kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
            return decodeHex(string);
        }

        @tu.f
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final l m5885deprecated_encodeString(String string, Charset charset) {
            kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
            kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
            return encodeString(string, charset);
        }

        @tu.f
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final l m5886deprecated_encodeUtf8(String string) {
            kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
            return encodeUtf8(string);
        }

        @tu.f
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final l m5887deprecated_of(ByteBuffer buffer) {
            kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
            return of(buffer);
        }

        @tu.f
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final l m5889deprecated_read(InputStream inputstream, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(inputstream, "inputstream");
            return read(inputstream, i10);
        }

        public final l decodeBase64(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            byte[] bArrDecodeBase64ToArray = pw.a.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new l(bArrDecodeBase64ToArray);
            }
            return null;
        }

        public final l decodeHex(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (qw.c.access$decodeHexDigit(str.charAt(i11 + 1)) + (qw.c.access$decodeHexDigit(str.charAt(i11)) << 4));
            }
            return new l(bArr);
        }

        public final l encodeString(String str, Charset charset) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new l(bytes);
        }

        public final l encodeUtf8(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            l lVar = new l(h1.asUtf8ToByteArray(str));
            lVar.setUtf8$okio(str);
            return lVar;
        }

        public final l of(ByteBuffer byteBuffer) {
            kotlin.jvm.internal.e0.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new l(bArr);
        }

        public final l read(InputStream inputStream, int i10) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(a.b.e(i10, "byteCount < 0: ").toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new l(bArr);
        }

        @tu.f
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final l m5888deprecated_of(byte[] array, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
            return of(array, i10, i11);
        }

        public final l of(byte... data) {
            kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new l(bArrCopyOf);
        }

        public final l of(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
            int iResolveDefaultParameter = b.resolveDefaultParameter(bArr, i11);
            b.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
            return new l(uu.f0.copyOfRange(bArr, i10, iResolveDefaultParameter + i10));
        }
    }

    public l(byte[] data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        this.f81913b = data;
    }

    public static /* synthetic */ void copyInto$default(l lVar, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        lVar.copyInto(i10, bArr, i11, i12);
    }

    public static final l decodeBase64(String str) {
        return f81911f.decodeBase64(str);
    }

    public static final l decodeHex(String str) {
        return f81911f.decodeHex(str);
    }

    public static final l encodeString(String str, Charset charset) {
        return f81911f.encodeString(str, charset);
    }

    public static final l encodeUtf8(String str) {
        return f81911f.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(l lVar, l lVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return lVar.indexOf(lVar2, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(l lVar, l lVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = b.getDEFAULT__ByteString_size();
        }
        return lVar.lastIndexOf(lVar2, i10);
    }

    public static final l of(ByteBuffer byteBuffer) {
        return f81911f.of(byteBuffer);
    }

    public static final l read(InputStream inputStream, int i10) throws IOException {
        return f81911f.read(inputStream, i10);
    }

    public static /* synthetic */ l substring$default(l lVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = b.getDEFAULT__ByteString_size();
        }
        return lVar.substring(i10, i11);
    }

    @tu.f
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m5881deprecated_getByte(int i10) {
        return getByte(i10);
    }

    @tu.f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m5882deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f81913b).asReadOnlyBuffer();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public String base64() {
        return pw.a.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return pw.a.encodeBase64(getData$okio(), pw.a.getBASE64_URL_SAFE());
    }

    public void copyInto(int i10, byte[] target, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        uu.f0.copyInto(getData$okio(), target, i11, i10, i12 + i10);
    }

    public l digest$okio(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f81913b, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.e0.checkNotNull(bArrDigest);
        return new l(bArrDigest);
    }

    public final boolean endsWith(l suffix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.size() == getData$okio().length && lVar.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i10) {
        return internalGet$okio(i10);
    }

    public final byte[] getData$okio() {
        return this.f81913b;
    }

    public final int getHashCode$okio() {
        return this.f81914c;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.f81915e;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = qw.b.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = qw.b.getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return sv.k0.concatToString(cArr);
    }

    public l hmac$okio(String algorithm, l key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.f81913b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new l(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public l hmacSha1(l key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public l hmacSha256(l key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public l hmacSha512(l key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(l other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i10) {
        return getData$okio()[i10];
    }

    public final int lastIndexOf(l other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public final l md5() {
        return digest$okio(SameMD5.TAG);
    }

    public boolean rangeEquals(int i10, l other, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return other.rangeEquals(i11, getData$okio(), i10, i12);
    }

    public final void setHashCode$okio(int i10) {
        this.f81914c = i10;
    }

    public final void setUtf8$okio(String str) {
        this.f81915e = str;
    }

    public final l sha1() {
        return digest$okio(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final l sha256() {
        return digest$okio("SHA-256");
    }

    public final l sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(l prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public String string(Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        return new String(this.f81913b, charset);
    }

    public final l substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public l toAsciiLowercase() {
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b10 = getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new l(bArrCopyOf);
            }
        }
        return this;
    }

    public l toAsciiUppercase() {
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b10 = getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new l(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iAccess$codePointIndexToCharIndex = qw.b.access$codePointIndexToCharIndex(getData$okio(), 64);
        if (iAccess$codePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            String strSubstring = strUtf8.substring(0, iAccess$codePointIndexToCharIndex);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strReplace$default = sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (iAccess$codePointIndexToCharIndex >= strUtf8.length()) {
                return o2.f(AbstractJsonLexerKt.END_LIST, "[text=", strReplace$default);
            }
            return "[size=" + getData$okio().length + " text=" + strReplace$default + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = b.resolveDefaultParameter(this, 64);
        if (iResolveDefaultParameter > getData$okio().length) {
            throw new IllegalArgumentException(e3.g.m(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((iResolveDefaultParameter == getData$okio().length ? this : new l(uu.f0.copyOfRange(getData$okio(), 0, iResolveDefaultParameter))).hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = h1.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream out) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        out.write(this.f81913b);
    }

    public void write$okio(g buffer, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        qw.b.commonWrite(this, buffer, i10, i11);
    }

    public static /* synthetic */ int indexOf$default(l lVar, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return lVar.indexOf(bArr, i10);
    }

    public static final l of(byte... bArr) {
        return f81911f.of(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(l other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int size = size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = getByte(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
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

    public final boolean endsWith(byte[] suffix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public final int indexOf(byte[] other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.arrayRangeEquals(getData$okio(), i10, other, i11, i12);
    }

    public final boolean startsWith(byte[] prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final l substring(int i10) {
        return substring$default(this, i10, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(l lVar, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = b.getDEFAULT__ByteString_size();
        }
        return lVar.lastIndexOf(bArr, i10);
    }

    public static final l of(byte[] bArr, int i10, int i11) {
        return f81911f.of(bArr, i10, i11);
    }

    public final int indexOf(l other, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return indexOf(other.internalArray$okio(), i10);
    }

    public final int lastIndexOf(l other, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return lastIndexOf(other.internalArray$okio(), i10);
    }

    public l substring(int i10, int i11) {
        int iResolveDefaultParameter = b.resolveDefaultParameter(this, i11);
        if (i10 >= 0) {
            if (iResolveDefaultParameter > getData$okio().length) {
                throw new IllegalArgumentException(e3.g.m(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
            }
            if (iResolveDefaultParameter - i10 >= 0) {
                return (i10 == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new l(uu.f0.copyOfRange(getData$okio(), i10, iResolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public int indexOf(byte[] other, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int lastIndexOf(byte[] other, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(b.resolveDefaultParameter(this, i10), getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (b.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
