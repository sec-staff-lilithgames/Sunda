package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1358Lh {
    public static final C1358Lh A02 = new C1358Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1358Lh)) {
            return false;
        }
        C1358Lh c1358Lh = (C1358Lh) obj;
        return this.A00 == c1358Lh.A00 && this.A01 == c1358Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
