package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f50214a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f50214a = charArray;
    }

    public static final String a(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            int i12 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = f50214a;
            cArr[i11] = cArr2[i12];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
