package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class jpo {
    private static final String jpo = wqx();

    /* renamed from: jd, reason: collision with root package name */
    private static final String f20462jd = sq.cm().wqx();

    public static String jd() {
        return new String(Base64.decode(f20462jd, 0)).substring(2);
    }

    public static String jpo() {
        return new String(Base64.decode(jpo, 0)).substring(2);
    }

    private static String wqx() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i10 = 23; i10 >= 0; i10--) {
            cArr2[23 - i10] = (char) (cArr[i10] ^ 255);
        }
        return new String(cArr2);
    }
}
