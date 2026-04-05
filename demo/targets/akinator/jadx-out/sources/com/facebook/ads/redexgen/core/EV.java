package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class EV implements InterfaceC2035ew {
    public final /* synthetic */ C1934dI A00;

    public EV(C1934dI c1934dI) {
        this.A00 = c1934dI;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2035ew
    public final void AGQ() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2035ew
    public final void AGS(C2037ey c2037ey) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c2037ey != null && c2037ey.A00()) {
            this.A00.A02.A4b(this.A00.A03.A8x());
        } else {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }
}
