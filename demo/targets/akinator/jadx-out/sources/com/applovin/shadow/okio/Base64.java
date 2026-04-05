package com.applovin.shadow.okio;

import com.applovin.shadow.okio.ByteString;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.-Base64, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Base64 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i10;
        char cCharAt;
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt2 = str.charAt(i15);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i10 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i10 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i10 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i10 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i10 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i13 = (i13 << 6) | i10;
            i12++;
            if (i12 % 4 == 0) {
                bArr[i14] = (byte) (i13 >> 16);
                int i16 = i14 + 2;
                bArr[i14 + 1] = (byte) (i13 >> 8);
                i14 += 3;
                bArr[i16] = (byte) i13;
            }
        }
        int i17 = i12 % 4;
        if (i17 == 1) {
            return null;
        }
        if (i17 == 2) {
            bArr[i14] = (byte) ((i13 << 12) >> 16);
            i14++;
        } else if (i17 == 3) {
            int i18 = i13 << 6;
            int i19 = i14 + 1;
            bArr[i14] = (byte) (i18 >> 16);
            i14 += 2;
            bArr[i19] = (byte) (i18 >> 8);
        }
        if (i14 == i11) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i14);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static final String encodeBase64(byte[] bArr, byte[] map) {
        e0.checkNotNullParameter(bArr, "<this>");
        e0.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            bArr2[i11 + 2] = map[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return _JvmPlatformKt.toUtf8String(bArr2);
    }

    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static /* synthetic */ void getBASE64$annotations() {
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
    }
}
