package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.CrashConfig;

/* renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2362kW implements InterfaceC1244Gw {
    public final /* synthetic */ C2361kV A00;

    public C2362kW(C2361kV c2361kV) {
        this.A00 = c2361kV;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        long jA06 = this.A00.A0B.A06(j10);
        long j11 = this.A00.A09;
        long j12 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j13 = (j12 - targetGranule) * jA06;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = AbstractC09264a.A0T((j11 + (j13 / targetGranule2)) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, this.A00.A09, this.A00.A08 - 1);
        return new C1243Gv(new C1245Gx(j10, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }
}
