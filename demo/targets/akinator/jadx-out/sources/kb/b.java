package kb;

import com.applovin.shadow.okio.Utf8;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f70779a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f70780b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f70781c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f70782d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    public static int a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        byte b10 = bArr[2];
        if (b10 == 61) {
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (b11 == 61) {
            int i11 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18);
            bArr2[i10] = (byte) (i11 >>> 16);
            bArr2[i10 + 1] = (byte) (i11 >>> 8);
            return 2;
        }
        int i12 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18) | ((bArr3[b11] << 24) >>> 24);
        bArr2[i10] = (byte) (i12 >> 16);
        bArr2[i10 + 1] = (byte) (i12 >> 8);
        bArr2[i10 + 2] = (byte) i12;
        return 3;
    }

    public static byte[] decode(String str) throws c {
        byte[] bytes = str.getBytes();
        return decode(bytes, 0, bytes.length);
    }

    public static byte[] decodeWebSafe(String str) throws c {
        byte[] bytes = str.getBytes();
        return decodeWebSafe(bytes, 0, bytes.length);
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length, f70779a, true);
    }

    public static String encodeWebSafe(byte[] bArr, boolean z10) {
        return encode(bArr, 0, bArr.length, f70780b, z10);
    }

    public static String encode(byte[] bArr, int i10, int i11, byte[] bArr2, boolean z10) {
        byte[] bArrEncode = encode(bArr, i10, i11, bArr2, Integer.MAX_VALUE);
        int length = bArrEncode.length;
        while (!z10 && length > 0 && bArrEncode[length - 1] == 61) {
            length--;
        }
        return new String(bArrEncode, 0, length);
    }

    public static byte[] decode(byte[] bArr) throws c {
        return decode(bArr, 0, bArr.length);
    }

    public static byte[] decodeWebSafe(byte[] bArr) throws c {
        return decodeWebSafe(bArr, 0, bArr.length);
    }

    public static byte[] decode(byte[] bArr, int i10, int i11) throws c {
        return decode(bArr, i10, i11, f70781c);
    }

    public static byte[] decodeWebSafe(byte[] bArr, int i10, int i11) throws c {
        return decode(bArr, i10, i11, f70782d);
    }

    public static byte[] decode(byte[] bArr, int i10, int i11, byte[] bArr2) throws c {
        byte[] bArr3 = new byte[a.b.a(i11, 3, 4, 2)];
        byte[] bArr4 = new byte[4];
        int i12 = 0;
        int i13 = 0;
        int iA = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i14 = i12 + i10;
            byte b10 = (byte) (bArr[i14] & AbstractJsonLexerKt.TC_INVALID);
            byte b11 = bArr2[b10];
            if (b11 < -5) {
                throw new c(a.b.f(bArr[i14], "(decimal)", o2.t(i12, "Bad Base64 input character at ", KGUkpTlXZlJLy.MDrNBNBkOzBSipL)));
            }
            if (b11 >= -1) {
                if (b10 == 61) {
                    int i15 = i11 - i12;
                    byte b12 = (byte) (bArr[(i11 - 1) + i10] & AbstractJsonLexerKt.TC_INVALID);
                    if (i13 == 0 || i13 == 1) {
                        throw new c(a.b.e(i12, "invalid padding byte '=' at byte offset "));
                    }
                    if ((i13 == 3 && i15 > 2) || (i13 == 4 && i15 > 1)) {
                        throw new c(a.b.e(i12, "padding byte '=' falsely signals end of encoded value at offset "));
                    }
                    if (b12 != 61 && b12 != 10) {
                        throw new c("encoded value has invalid trailing byte");
                    }
                } else {
                    int i16 = i13 + 1;
                    bArr4[i13] = b10;
                    if (i16 == 4) {
                        iA += a(bArr4, bArr3, iA, bArr2);
                        i13 = 0;
                    } else {
                        i13 = i16;
                    }
                }
            }
            i12++;
        }
        if (i13 != 0) {
            if (i13 != 1) {
                bArr4[i13] = 61;
                iA += a(bArr4, bArr3, iA, bArr2);
            } else {
                throw new c("single trailing character at offset " + (i11 - 1));
            }
        }
        byte[] bArr5 = new byte[iA];
        System.arraycopy(bArr3, 0, bArr5, 0, iA);
        return bArr5;
    }

    public static byte[] encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = ((i11 + 2) / 3) * 4;
        byte[] bArr3 = new byte[(i13 / i12) + i13];
        int i14 = i11 - 2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            int i18 = ((bArr[i15 + i10] << 24) >>> 8) | ((bArr[(i15 + 1) + i10] << 24) >>> 16) | ((bArr[(i15 + 2) + i10] << 24) >>> 24);
            bArr3[i16] = bArr2[i18 >>> 18];
            int i19 = i16 + 1;
            bArr3[i19] = bArr2[(i18 >>> 12) & 63];
            bArr3[i16 + 2] = bArr2[(i18 >>> 6) & 63];
            bArr3[i16 + 3] = bArr2[i18 & 63];
            i17 += 4;
            if (i17 == i12) {
                bArr3[i16 + 4] = 10;
                i17 = 0;
                i16 = i19;
            }
            i15 += 3;
            i16 += 4;
        }
        if (i15 < i11) {
            int i20 = i10 + i15;
            int i21 = i11 - i15;
            int i22 = (i21 > 0 ? (bArr[i20] << 24) >>> 8 : 0) | (i21 > 1 ? (bArr[i20 + 1] << 24) >>> 16 : 0) | (i21 > 2 ? (bArr[i20 + 2] << 24) >>> 24 : 0);
            if (i21 == 1) {
                bArr3[i16] = bArr2[i22 >>> 18];
                bArr3[i16 + 1] = bArr2[(i22 >>> 12) & 63];
                bArr3[i16 + 2] = 61;
                bArr3[i16 + 3] = 61;
            } else if (i21 == 2) {
                bArr3[i16] = bArr2[i22 >>> 18];
                bArr3[i16 + 1] = bArr2[(i22 >>> 12) & 63];
                bArr3[i16 + 2] = bArr2[(i22 >>> 6) & 63];
                bArr3[i16 + 3] = 61;
            } else if (i21 == 3) {
                bArr3[i16] = bArr2[i22 >>> 18];
                bArr3[i16 + 1] = bArr2[(i22 >>> 12) & 63];
                bArr3[i16 + 2] = bArr2[(i22 >>> 6) & 63];
                bArr3[i16 + 3] = bArr2[i22 & 63];
            }
            if (i17 + 4 == i12) {
                bArr3[i16 + 4] = 10;
            }
        }
        return bArr3;
    }
}
