package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class G7 extends AbstractC2009eW {
    public final /* synthetic */ G2 A00;

    public G7(G2 g22) {
        this.A00 = g22;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2009eW
    public final void A03() {
        if (!this.A00.A07.A07()) {
            this.A00.A07.A05();
            if (!TextUtils.isEmpty(this.A00.A02.A25())) {
                this.A00.A05.AB5(this.A00.A02.A25(), new C1722Zp().A03(this.A00.A0B).A02(this.A00.A07).A04(this.A00.A02.A0u()).A05());
                if (this.A00.A02.A1l()) {
                    this.A00.A04.A0F().ADs();
                }
                W2.A00(this.A00.A04).A0E(this.A00.A0A.A8d(), this.A00.A02.A25());
                N3.A07(this.A00.A02.A21(), this.A00.A04);
                this.A00.A04.A0F().A3D();
                AbstractC1424Nw.A02(this.A00.A02.A0t(), X0.A00(this.A00.A02.A0v()));
                this.A00.A09.A4b(this.A00.A0A.A88());
            }
        }
    }
}
