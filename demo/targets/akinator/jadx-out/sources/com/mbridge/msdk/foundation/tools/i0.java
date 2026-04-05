package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f41125a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f41126b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f41125a = charArray;
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        f41126b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f41126b[f41125a[i10]] = i10;
        }
        f41126b[61] = 0;
    }

    public static String a(String str) {
        byte[] bArrB = b(str);
        return (bArrB == null || bArrB.length == 0) ? "" : new String(bArrB, StandardCharsets.UTF_8);
    }

    public static byte[] b(String str) {
        int i10;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < i11 && f41126b[str.charAt(i12) & 255] < 0) {
            i12++;
        }
        while (i11 > 0 && f41126b[str.charAt(i11) & 255] < 0) {
            i11--;
        }
        int i13 = str.charAt(i11) == '=' ? str.charAt(i11 + (-1)) == '=' ? 2 : 1 : 0;
        int i14 = (i11 - i12) + 1;
        if (length > 76) {
            i10 = (str.charAt(76) == '\r' ? i14 / 78 : 0) << 1;
        } else {
            i10 = 0;
        }
        int i15 = (((i14 - i10) * 6) >> 3) - i13;
        byte[] bArr = new byte[i15];
        int i16 = (i15 / 3) * 3;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int[] iArr = f41126b;
            int i19 = i12 + 4;
            int i20 = iArr[str.charAt(i12 + 3)] | (iArr[str.charAt(i12 + 1)] << 12) | (iArr[str.charAt(i12)] << 18) | (iArr[str.charAt(i12 + 2)] << 6);
            bArr[i17] = (byte) (i20 >> 16);
            int i21 = i17 + 2;
            bArr[i17 + 1] = (byte) (i20 >> 8);
            i17 += 3;
            bArr[i21] = (byte) i20;
            if (i10 <= 0 || (i18 = i18 + 1) != 19) {
                i12 = i19;
            } else {
                i12 += 6;
                i18 = 0;
            }
        }
        if (i17 < i15) {
            int i22 = 0;
            int i23 = 0;
            while (i12 <= i11 - i13) {
                i22 |= f41126b[str.charAt(i12)] << (18 - (i23 * 6));
                i23++;
                i12++;
            }
            int i24 = 16;
            while (i17 < i15) {
                bArr[i17] = (byte) (i22 >> i24);
                i24 -= 8;
                i17++;
            }
        }
        return bArr;
    }
}
