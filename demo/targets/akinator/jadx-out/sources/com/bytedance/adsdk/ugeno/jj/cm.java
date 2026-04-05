package com.bytedance.adsdk.ugeno.jj;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static int jpo(boolean z10, int i10, int i11) {
        if (i11 == 0 || !z10) {
            return i10;
        }
        int i12 = i10 - 512;
        int iAbs = Math.abs(i12) % i11;
        return (i12 >= 0 || iAbs == 0) ? iAbs : i11 - iAbs;
    }

    public static boolean jpo(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
