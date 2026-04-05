package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1591Ul {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, -128, -128, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    EnumC1591Ul(long j10, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j10;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static EnumC1591Ul A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (EnumC1591Ul enumC1591Ul : values()) {
            if (enumC1591Ul.A01 == mediaCacheFlag) {
                return enumC1591Ul;
            }
        }
        return null;
    }
}
