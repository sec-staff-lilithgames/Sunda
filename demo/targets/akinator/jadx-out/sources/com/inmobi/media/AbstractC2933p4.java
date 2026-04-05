package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2933p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33247a = 0;

    public static byte[] a(String str) {
        int i10;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        String strValueOf = String.valueOf(str != null ? sv.p0.reversed(str).toString() : null);
        for (int i11 = 0; i11 < i10; i11++) {
            strValueOf = strValueOf + com.ironsource.G5.T;
        }
        byte[] bytes = strValueOf.getBytes(sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String data, byte[] bArr) {
        byte[] bArrDoFinal;
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("p4", "TAG");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(sv.g.f86134b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th2) {
            Log.d("p4", "SDK encountered unexpected error in getting encrypted AES bytes; " + th2.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        String str = new String(bArrEncode, sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("p4", "TAG");
        return str;
    }
}
