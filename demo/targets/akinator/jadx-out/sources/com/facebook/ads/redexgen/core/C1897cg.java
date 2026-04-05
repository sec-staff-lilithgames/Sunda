package com.facebook.ads.redexgen.core;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1897cg {
    public final SparseArray<int[]> A00 = new SparseArray<>();

    public final void A00(int i10, int[] iArr) {
        this.A00.put(i10, iArr);
    }

    public final boolean A01(int i10) {
        return this.A00.indexOfKey(i10) >= 0;
    }

    public final int[] A02(int i10) {
        return this.A00.get(i10);
    }
}
