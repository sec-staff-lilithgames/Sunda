package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/kotlin/compilerplugins/dataclassgenerate/annotation/Mode;", "", "(Ljava/lang/String;I)V", "KEEP", "OMIT", "fbandroid.java.com.facebook.kotlin.compilerplugins.dataclassgenerate.annotation.dataclassgenerate-annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.h1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2159h1 {
    A03,
    A04;

    public static byte[] A00;
    public static final /* synthetic */ InterfaceC10659w A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-84, -90, -90, -79, -64, -66, -70, -59};
    }

    static {
        A01();
        A01 = AbstractC2630pB.A01(A02);
    }
}
