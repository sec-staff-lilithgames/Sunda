package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class PD {
    public static int A00(boolean a10, boolean b10) {
        if (a10 == b10) {
            return 0;
        }
        return a10 ? 1 : -1;
    }
}
