package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4Q<V> {
    public int A00;
    public int A01;
    public long[] A02;
    public V[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public C4Q() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public C4Q(int i10) {
        this.A02 = new long[i10];
        this.A03 = (V[]) A00(i10);
    }

    public static <V> V[] A00(int i10) {
        return (V[]) new Object[i10];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public final synchronized int A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.facebook.ads.androidx.media3.common.util.TimedValueQueue<V> */
    public final synchronized void A02() {
        this.A00 = 0;
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
    }
}
