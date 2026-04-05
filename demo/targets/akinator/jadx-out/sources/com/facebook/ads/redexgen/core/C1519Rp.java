package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1519Rp {
    public final long A00;
    public final EnumC1518Ro A01;
    public final String A02;
    public final boolean A03;

    public C1519Rp(String str, boolean z10, EnumC1518Ro enumC1518Ro) {
        this(str, z10, enumC1518Ro, System.currentTimeMillis());
    }

    public C1519Rp(String str, boolean z10, EnumC1518Ro enumC1518Ro, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC1518Ro;
        this.A00 = j10;
    }

    public static C1519Rp A00() {
        return new C1519Rp("", true, EnumC1518Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC1518Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
