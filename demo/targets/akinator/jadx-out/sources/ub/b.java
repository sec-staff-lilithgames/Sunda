package ub;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final transient int[] f88188b;

    /* renamed from: c, reason: collision with root package name */
    public final transient char[] f88189c;

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[] f88190e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88191f;

    /* renamed from: g, reason: collision with root package name */
    public final char f88192g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88193h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f88194i;

    /* renamed from: j, reason: collision with root package name */
    public final a f88195j;

    public b(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f88188b = iArr;
        char[] cArr = new char[64];
        this.f88189c = cArr;
        this.f88190e = new byte[64];
        this.f88191f = str;
        this.f88194i = z10;
        this.f88192g = c10;
        this.f88193h = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(o2.k(length, "Base64Alphabet length must be exactly 64 (was ", ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this.f88189c[i11];
            this.f88190e[i11] = (byte) c11;
            this.f88188b[c11] = i11;
        }
        if (z10) {
            this.f88188b[c10] = -2;
        }
        this.f88195j = z10 ? a.f88185c : a.f88184b;
    }

    public final void a(char c10, String str, int i10) {
        String strD;
        if (c10 <= ' ') {
            strD = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c10)) {
            strD = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            strD = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            strD = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            strD = w0.i.d(strD, ": ", str);
        }
        throw new IllegalArgumentException(strD);
    }

    public boolean acceptsPaddingOnRead() {
        return this.f88195j != a.f88184b;
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        ic.d dVar = new ic.d();
        decode(str, dVar);
        return dVar.toByteArray();
    }

    public int decodeBase64Byte(byte b10) {
        if (b10 < 0) {
            return -1;
        }
        return this.f88188b[b10];
    }

    public int decodeBase64Char(char c10) {
        if (c10 <= 127) {
            return this.f88188b[c10];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i10) {
        return this.f88190e[i10];
    }

    public char encodeBase64BitsAsChar(int i10) {
        return this.f88189c[i10];
    }

    public int encodeBase64Chunk(int i10, char[] cArr, int i11) {
        char[] cArr2 = this.f88189c;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        cArr[i11 + 1] = cArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        cArr[i11 + 2] = cArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        cArr[i12] = cArr2[i10 & 63];
        return i13;
    }

    public int encodeBase64Partial(int i10, int i11, char[] cArr, int i12) {
        char[] cArr2 = this.f88189c;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        cArr[i12 + 1] = cArr2[(i10 >> 12) & 63];
        if (!usesPadding()) {
            if (i11 != 2) {
                return i13;
            }
            int i14 = i12 + 3;
            cArr[i13] = cArr2[(i10 >> 6) & 63];
            return i14;
        }
        int i15 = i12 + 3;
        char c10 = this.f88192g;
        cArr[i13] = i11 == 2 ? cArr2[(i10 >> 6) & 63] : c10;
        int i16 = i12 + 4;
        cArr[i15] = c10;
        return i16;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == b.class) {
            b bVar = (b) obj;
            if (bVar.f88192g == this.f88192g && bVar.f88193h == this.f88193h && bVar.f88194i == this.f88194i && bVar.f88195j == this.f88195j && this.f88191f.equals(bVar.f88191f)) {
                return true;
            }
        }
        return false;
    }

    public int getMaxLineLength() {
        return this.f88193h;
    }

    public String getName() {
        return this.f88191f;
    }

    public byte getPaddingByte() {
        return (byte) this.f88192g;
    }

    public char getPaddingChar() {
        return this.f88192g;
    }

    public int hashCode() {
        return this.f88191f.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }

    public a paddingReadBehaviour() {
        return this.f88195j;
    }

    public boolean requiresPaddingOnRead() {
        return this.f88195j == a.f88185c;
    }

    public String toString() {
        return this.f88191f;
    }

    public boolean usesPadding() {
        return this.f88194i;
    }

    public boolean usesPaddingChar(char c10) {
        return c10 == this.f88192g;
    }

    public b withPaddingAllowed() {
        return withReadPadding(a.f88186e);
    }

    public b withPaddingForbidden() {
        return withReadPadding(a.f88184b);
    }

    public b withPaddingRequired() {
        return withReadPadding(a.f88185c);
    }

    public b withReadPadding(a aVar) {
        if (aVar == this.f88195j) {
            return this;
        }
        return new b(this, this.f88191f, this.f88194i, this.f88192g, aVar, this.f88193h);
    }

    public b withWritePadding(boolean z10) {
        if (z10 == this.f88194i) {
            return this;
        }
        return new b(this, this.f88191f, z10, this.f88192g, this.f88193h);
    }

    public int decodeBase64Char(int i10) {
        if (i10 <= 127) {
            return this.f88188b[i10];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append(AbstractJsonLexerKt.STRING);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i11] << 8)) << 8;
            i11 += 3;
            encodeBase64Chunk(sb2, i13 | (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append(AbstractJsonLexerKt.STRING_ESC);
                sb2.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i14 = length - i11;
        if (i14 > 0) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            }
            encodeBase64Partial(sb2, i16, i14);
        }
        if (z10) {
            sb2.append(AbstractJsonLexerKt.STRING);
        }
        return sb2.toString();
    }

    public boolean usesPaddingChar(int i10) {
        return i10 == this.f88192g;
    }

    public void decode(String str, ic.d dVar) throws IllegalArgumentException {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt > ' ') {
                int iDecodeBase64Char = decodeBase64Char(cCharAt);
                if (iDecodeBase64Char < 0) {
                    a(cCharAt, null, 0);
                    throw null;
                }
                if (i11 < length) {
                    int i12 = i10 + 2;
                    char cCharAt2 = str.charAt(i11);
                    int iDecodeBase64Char2 = decodeBase64Char(cCharAt2);
                    if (iDecodeBase64Char2 < 0) {
                        a(cCharAt2, null, 1);
                        throw null;
                    }
                    int i13 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                    if (i12 >= length) {
                        if (!requiresPaddingOnRead()) {
                            dVar.append(i13 >> 4);
                            return;
                        }
                        throw new IllegalArgumentException(missingPaddingMessage());
                    }
                    int i14 = i10 + 3;
                    char cCharAt3 = str.charAt(i12);
                    int iDecodeBase64Char3 = decodeBase64Char(cCharAt3);
                    if (iDecodeBase64Char3 >= 0) {
                        int i15 = (i13 << 6) | iDecodeBase64Char3;
                        if (i14 >= length) {
                            if (!requiresPaddingOnRead()) {
                                dVar.appendTwoBytes(i15 >> 2);
                                return;
                            }
                            throw new IllegalArgumentException(missingPaddingMessage());
                        }
                        i10 += 4;
                        char cCharAt4 = str.charAt(i14);
                        int iDecodeBase64Char4 = decodeBase64Char(cCharAt4);
                        if (iDecodeBase64Char4 >= 0) {
                            dVar.appendThreeBytes((i15 << 6) | iDecodeBase64Char4);
                        } else if (iDecodeBase64Char4 == -2) {
                            if (acceptsPaddingOnRead()) {
                                dVar.appendTwoBytes(i15 >> 2);
                            } else {
                                throw new IllegalArgumentException(a.b.l("Unexpected end of base64-encoded String: base64 variant '", getName(), "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                            }
                        } else {
                            a(cCharAt4, null, 3);
                            throw null;
                        }
                    } else if (iDecodeBase64Char3 == -2) {
                        if (!acceptsPaddingOnRead()) {
                            throw new IllegalArgumentException(a.b.l("Unexpected end of base64-encoded String: base64 variant '", getName(), "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                        }
                        if (i14 < length) {
                            i10 += 4;
                            char cCharAt5 = str.charAt(i14);
                            if (usesPaddingChar(cCharAt5)) {
                                dVar.append(i13 >> 4);
                            } else {
                                a(cCharAt5, "expected padding character '" + getPaddingChar() + "'", 3);
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException(missingPaddingMessage());
                        }
                    } else {
                        a(cCharAt3, null, 2);
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException(missingPaddingMessage());
                }
            } else {
                i10 = i11;
            }
        }
    }

    public void encodeBase64Chunk(StringBuilder sb2, int i10) {
        char[] cArr = this.f88189c;
        sb2.append(cArr[(i10 >> 18) & 63]);
        sb2.append(cArr[(i10 >> 12) & 63]);
        sb2.append(cArr[(i10 >> 6) & 63]);
        sb2.append(cArr[i10 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb2, int i10, int i11) {
        char[] cArr = this.f88189c;
        sb2.append(cArr[(i10 >> 18) & 63]);
        sb2.append(cArr[(i10 >> 12) & 63]);
        if (usesPadding()) {
            char c10 = this.f88192g;
            sb2.append(i11 == 2 ? cArr[(i10 >> 6) & 63] : c10);
            sb2.append(c10);
        } else if (i11 == 2) {
            sb2.append(cArr[(i10 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i10, byte[] bArr, int i11) {
        byte[] bArr2 = this.f88190e;
        bArr[i11] = bArr2[(i10 >> 18) & 63];
        bArr[i11 + 1] = bArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        bArr[i11 + 2] = bArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        bArr[i12] = bArr2[i10 & 63];
        return i13;
    }

    public int encodeBase64Partial(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = this.f88190e;
        bArr[i12] = bArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        bArr[i12 + 1] = bArr2[(i10 >> 12) & 63];
        if (!usesPadding()) {
            if (i11 != 2) {
                return i13;
            }
            int i14 = i12 + 3;
            bArr[i13] = bArr2[(i10 >> 6) & 63];
            return i14;
        }
        byte b10 = (byte) this.f88192g;
        int i15 = i12 + 3;
        bArr[i13] = i11 == 2 ? bArr2[(i10 >> 6) & 63] : b10;
        int i16 = i12 + 4;
        bArr[i15] = b10;
        return i16;
    }

    public String encode(byte[] bArr, boolean z10, String str) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append(AbstractJsonLexerKt.STRING);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i11] << 8)) << 8;
            i11 += 3;
            encodeBase64Chunk(sb2, i13 | (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append(str);
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i14 = length - i11;
        if (i14 > 0) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            }
            encodeBase64Partial(sb2, i16, i14);
        }
        if (z10) {
            sb2.append(AbstractJsonLexerKt.STRING);
        }
        return sb2.toString();
    }

    public b(b bVar, String str, int i10) {
        this(bVar, str, bVar.f88194i, bVar.f88192g, i10);
    }

    public b(b bVar, String str, boolean z10, char c10, int i10) {
        this(bVar, str, z10, c10, bVar.f88195j, i10);
    }

    public b(b bVar, String str, boolean z10, char c10, a aVar, int i10) {
        int[] iArr = new int[128];
        this.f88188b = iArr;
        char[] cArr = new char[64];
        this.f88189c = cArr;
        byte[] bArr = new byte[64];
        this.f88190e = bArr;
        this.f88191f = str;
        byte[] bArr2 = bVar.f88190e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = bVar.f88189c;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = bVar.f88188b;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f88194i = z10;
        this.f88192g = c10;
        this.f88193h = i10;
        this.f88195j = aVar;
    }
}
