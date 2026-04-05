package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.fA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2048fA {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{0, 58, 59, 111, 32, 41, 111, 61, 46, 33, 40, 42, 117, 111, 106, 60};
    }

    public static char A00(byte b12, byte b22) {
        return (char) ((b12 << 8) | (b22 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static char A01(long value) {
        char c10 = (char) value;
        AbstractC2279jA.A0H(((long) c10) == value, A02(0, 16, 126), value);
        return c10;
    }

    public static boolean A04(char[] array, char target) {
        for (char c10 : array) {
            if (c10 == target) {
                return true;
            }
        }
        return false;
    }
}
