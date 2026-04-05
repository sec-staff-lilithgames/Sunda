package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2246ia {
    public static byte[] A00;
    public static final Charset A01;
    public static final Charset A02;
    public static final Charset A03;
    public static final Charset A04;
    public static final Charset A05;
    public static final Charset A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-74, -64, -68, -102, -91, -91, -94, -90, -102, -98, -43, -45, -83, -63, -45, -61, -55, -55, -69, -70, -84, -109, -105, -100, 14, 13, -1, -26, -22, -17, -5, -2, 34, 33, 19, -6, -2, 3, 25, 18, 21, 20, 6, -19, -8};
    }

    static {
        A01();
        A02 = Charset.forName(A00(10, 8, 43));
        A01 = Charset.forName(A00(0, 10, 24));
        A06 = Charset.forName(A00(40, 5, 107));
        A04 = Charset.forName(A00(24, 8, 100));
        A05 = Charset.forName(A00(32, 8, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        A03 = Charset.forName(A00(18, 6, 17));
    }
}
