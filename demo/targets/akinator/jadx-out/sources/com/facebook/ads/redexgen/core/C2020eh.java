package com.facebook.ads.redexgen.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2020eh {
    public C2024el A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C2020eh A00(C2024el c2024el) {
        this.A00 = c2024el;
        return this;
    }

    public final C2020eh A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C2020eh A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C2020eh A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C2020eh A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C2021ei A05() {
        return new C2021ei(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
