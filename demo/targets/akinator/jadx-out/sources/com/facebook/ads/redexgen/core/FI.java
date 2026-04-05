package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class FI implements InterfaceC1828bZ {
    public final /* synthetic */ FH A00;

    public FI(FH fh2) {
        this.A00 = fh2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1828bZ
    public final void AFm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1828bZ
    public final void AFo(View view) {
        AbstractC1290Ir abstractC1290Ir = (AbstractC1290Ir) view;
        abstractC1290Ir.A1R();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1290Ir.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
