package com.bytedance.sdk.component.embedapplog;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class PangleEncryptUtils {
    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        } catch (UnsatisfiedLinkError e10) {
            Log.e("pangle-encrypt", e10.getMessage());
        }
    }

    public static byte[] decrypt(byte[] bArr, int i10) {
        try {
            return ttDecrypt(bArr, i10);
        } catch (Throwable th2) {
            Log.e("pangle-encrypt", "decrypt exception " + th2.getMessage());
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, int i10) {
        try {
            return ttEncrypt(bArr, i10);
        } catch (Throwable th2) {
            Log.e("pangle-encrypt", "encrypt exception " + th2.getMessage());
            return null;
        }
    }

    private static native byte[] ttDecrypt(byte[] bArr, int i10);

    private static native byte[] ttEncrypt(byte[] bArr, int i10);
}
