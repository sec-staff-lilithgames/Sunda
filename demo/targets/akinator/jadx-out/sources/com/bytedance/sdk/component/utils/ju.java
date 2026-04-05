package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {
    private static final byte[] jpo = jpo("VP8X");

    private static byte[] jpo(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean jpo(byte[] bArr, int i10) {
        boolean zJpo;
        int i11;
        try {
            zJpo = jpo(bArr, i10 + 12, jpo);
            i11 = i10 + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i11) {
            return false;
        }
        return zJpo && ((bArr[i11] & 2) == 2);
    }

    private static boolean jpo(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
