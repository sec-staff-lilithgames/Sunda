package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class BX extends AbstractC2255il {
    public static int A00(@CheckForNull Object... objects) {
        return Arrays.hashCode(objects);
    }

    public static boolean A01(@CheckForNull Object a10, @CheckForNull Object b10) {
        return a10 == b10 || (a10 != null && a10.equals(b10));
    }
}
