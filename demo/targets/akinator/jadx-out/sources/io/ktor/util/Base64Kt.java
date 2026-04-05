package io.ktor.util;

import a.b;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.InputArraysKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import sv.g;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Base64Kt {
    private static final String BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final int[] BASE64_INVERSE_ALPHABET;
    private static final byte BASE64_MASK = 63;
    private static final int BASE64_MASK_INT = 63;
    private static final char BASE64_PAD = '=';

    static {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = n0.indexOf$default((CharSequence) BASE64_ALPHABET, (char) i10, 0, false, 6, (Object) null);
        }
        BASE64_INVERSE_ALPHABET = iArr;
    }

    public static final byte[] decodeBase64Bytes(String str) {
        String strSubstring;
        e0.checkNotNullParameter(str, "<this>");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            int lastIndex = n0.getLastIndex(str);
            while (true) {
                if (-1 >= lastIndex) {
                    strSubstring = "";
                    break;
                }
                if (str.charAt(lastIndex) != '=') {
                    strSubstring = str.substring(0, lastIndex + 1);
                    e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                }
                lastIndex--;
            }
            StringsKt.writeText$default(bytePacketBuilder, strSubstring, 0, 0, (Charset) null, 14, (Object) null);
            return StringsKt.readBytes(decodeBase64Bytes(bytePacketBuilder.build()));
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final String decodeBase64String(String str) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bArrDecodeBase64Bytes = decodeBase64Bytes(str);
        return new String(bArrDecodeBase64Bytes, 0, bArrDecodeBase64Bytes.length, g.f86134b);
    }

    public static final String encodeBase64(byte[] bArr) {
        int i10;
        int i11;
        e0.checkNotNullParameter(bArr, "<this>");
        int i12 = 3;
        char[] cArr = new char[b.a(bArr.length, 8, 6, 3)];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i13 + 3;
            if (i15 > bArr.length) {
                break;
            }
            byte b10 = bArr[i13];
            byte b11 = bArr[i13 + 1];
            int i16 = (bArr[i13 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            int i17 = 3;
            while (-1 < i17) {
                cArr[i14] = BASE64_ALPHABET.charAt((i16 >> (i17 * 6)) & 63);
                i17--;
                i14++;
            }
            i13 = i15;
        }
        int length = bArr.length - i13;
        if (length == 0) {
            return k0.concatToString(cArr, 0, i14);
        }
        if (length == 1) {
            i10 = (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        } else {
            i10 = ((bArr[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        int i18 = ((3 - length) * 8) / 6;
        if (i18 <= 3) {
            while (true) {
                i11 = i14 + 1;
                cArr[i14] = BASE64_ALPHABET.charAt((i10 >> (i12 * 6)) & 63);
                if (i12 == i18) {
                    break;
                }
                i12--;
                i14 = i11;
            }
            i14 = i11;
        }
        int i19 = 0;
        while (i19 < i18) {
            cArr[i14] = '=';
            i19++;
            i14++;
        }
        return k0.concatToString(cArr, 0, i14);
    }

    public static final byte fromBase64(byte b10) {
        return (byte) (((byte) BASE64_INVERSE_ALPHABET[b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) & 63);
    }

    public static final char toBase64(int i10) {
        return BASE64_ALPHABET.charAt(i10);
    }

    public static final Input decodeBase64Bytes(ByteReadPacket byteReadPacket) {
        int i10;
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            byte[] bArr = new byte[4];
            while (byteReadPacket.getRemaining() > 0) {
                ByteReadPacket byteReadPacket2 = byteReadPacket;
                int available$default = InputArraysKt.readAvailable$default((Input) byteReadPacket2, bArr, 0, 0, 6, (Object) null);
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < 4) {
                    i12 |= ((byte) (((byte) BASE64_INVERSE_ALPHABET[bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) & 63)) << ((3 - i13) * 6);
                    i11++;
                    i13++;
                }
                int i14 = 4 - available$default;
                if (i14 <= 2) {
                    while (true) {
                        bytePacketBuilder.writeByte((byte) ((i12 >> (i10 * 8)) & 255));
                        i10 = i10 != i14 ? i10 - 1 : 2;
                    }
                }
                byteReadPacket = byteReadPacket2;
            }
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final String encodeBase64(ByteReadPacket byteReadPacket) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        return encodeBase64(StringsKt.readBytes$default(byteReadPacket, 0, 1, null));
    }

    public static final String encodeBase64(String str) {
        e0.checkNotNullParameter(str, "<this>");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            StringsKt.writeText$default(bytePacketBuilder, str, 0, 0, (Charset) null, 14, (Object) null);
            return encodeBase64(bytePacketBuilder.build());
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }
}
