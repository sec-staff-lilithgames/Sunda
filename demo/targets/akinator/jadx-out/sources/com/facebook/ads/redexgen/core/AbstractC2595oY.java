package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2595oY {
    public static <K, V> Map<K, V> A00(int expectedSize) {
        return C2436lv.A0B(expectedSize);
    }

    public static <T> T[] A01(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] A02(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }
}
