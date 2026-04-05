package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class W0 {
    public static final AtomicReference<InterfaceC1630Vz> A00 = new AtomicReference<>(null);

    public static InterfaceC1630Vz A00() {
        InterfaceC1630Vz errorLogger = A00.get();
        if (errorLogger == null) {
            return new PR();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC1630Vz interfaceC1630Vz) {
        A00.set(interfaceC1630Vz);
    }
}
