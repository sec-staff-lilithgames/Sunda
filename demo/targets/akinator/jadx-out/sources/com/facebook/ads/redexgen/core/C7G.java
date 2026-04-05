package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7G {
    public static final C7G A01 = new C7G(false);
    public final boolean A00;

    public C7G(boolean z10) {
        this.A00 = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C7G) obj).A00;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }
}
