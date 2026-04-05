package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1598Us {
    A06(-1, 100, 1, 0),
    A07(-1, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 2, 1),
    A08(-1, 300, 3, 2),
    A09(-1, 400, 4, 3),
    A0A(-1, 50, 5, 4),
    A0B(-1, -1, 6, 5);

    public static byte[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{16, 29, 17, 31, 16, 12, 7, 105, 104, 104, 95, 82, 94, 80, 95, 67, 72, 38, 37, 39, 91, 86, 90, 84, 91, 71, 76, 32, 35, 35, 115, 126, 114, 124, 115, 111, 100, 15, 11, 11, 91, 86, 90, 84, 91, 71, 76, 38, 35, 82, 69, 67, 84, 95, 68, 89, 78, 65, 77, 73, 67};
    }

    static {
        A02();
    }

    EnumC1598Us(int i10, int i11, int i12, int i13) {
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = i13;
    }

    @Nullable
    public static EnumC1598Us A00(int i10) {
        for (EnumC1598Us enumC1598Us : values()) {
            if (enumC1598Us.A00 == i10) {
                return enumC1598Us;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return this.A02;
    }

    public final int A06() {
        return this.A03;
    }
}
