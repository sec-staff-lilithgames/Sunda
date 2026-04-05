package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Or, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1443Or<T> extends AbstractRunnableC1624Vt {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Or != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC1443Or(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Or != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A08() {
        return this.A00.get();
    }
}
