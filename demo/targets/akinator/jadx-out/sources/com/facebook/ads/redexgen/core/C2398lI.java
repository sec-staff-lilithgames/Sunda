package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2398lI implements InterfaceC1244Gw {
    public final long A00;
    public final C1243Gv A01;

    public C2398lI(long j10) {
        this(j10, 0L);
    }

    public C2398lI(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C1243Gv(j11 == 0 ? C1245Gx.A04 : new C1245Gx(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return false;
    }
}
