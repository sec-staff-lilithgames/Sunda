package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.mU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2470mU {
    public static int A00(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }

    public static int A01(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (iHighestOneBit * loadFactor))) {
            int tableSize = iHighestOneBit << 1;
            if (tableSize > 0) {
                return tableSize;
            }
            return 1073741824;
        }
        return iHighestOneBit;
    }

    public static int A02(@CheckForNull Object o10) {
        return A00(o10 == null ? 0 : o10.hashCode());
    }
}
