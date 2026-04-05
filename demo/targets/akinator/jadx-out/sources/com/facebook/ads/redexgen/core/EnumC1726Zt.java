package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1726Zt {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC1726Zt(int i10) {
        this.A00 = i10;
    }

    public static EnumC1726Zt A00(int i10) {
        for (EnumC1726Zt enumC1726Zt : values()) {
            if (enumC1726Zt.A00 == i10) {
                return enumC1726Zt;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
