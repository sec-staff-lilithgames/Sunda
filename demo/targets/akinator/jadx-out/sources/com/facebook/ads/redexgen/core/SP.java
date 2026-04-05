package com.facebook.ads.redexgen.core;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class SP {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C1911cu> A01 = new AtomicReference<>();

    public static C1911cu A00() {
        AtomicReference<C1911cu> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP;
        return atomicReference.get();
    }

    public static void A01(C1911cu c1911cu) {
        if (c1911cu == null) {
            return;
        }
        AB.A00(A01, null, c1911cu);
    }
}
