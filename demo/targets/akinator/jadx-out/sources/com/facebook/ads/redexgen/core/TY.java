package com.facebook.ads.redexgen.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class TY {
    public static TY A00 = new TY();

    public static TY A00() {
        return A00;
    }

    public final C1632Wb A01(SQ sq2, boolean z10) {
        return new C1632Wb(sq2, z10, new S5());
    }

    public final Map<String, String> A02(SQ sq2) {
        try {
            return A01(sq2, false).A06();
        } catch (Throwable th2) {
            sq2.A08().A4A(th2);
            return TQ.A01(sq2);
        }
    }
}
