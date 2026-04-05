package com.facebook.ads.redexgen.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class EG implements InterfaceC1943dR {
    public final C1937dL A01;
    public final US A02;
    public final C1940dO A03;
    public final E1 A04;
    public final String A07;
    public final DR A06 = new DR() { // from class: com.facebook.ads.redexgen.X.3m
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Y c3y) {
            if (this.A00.A00.booleanValue()) {
                return;
            }
            this.A00.A01.A0F().AII();
            this.A00.A08();
        }
    };
    public final DX A05 = new DX() { // from class: com.facebook.ads.redexgen.X.3l
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C09033d c09033d) {
            if (!this.A00.A00.booleanValue()) {
                this.A00.A01.A0F().AIG();
                this.A00.A08();
            }
            this.A00.A00 = true;
        }
    };
    public Boolean A00 = false;

    public EG(C1937dL c1937dL, US us, E1 e12, String str, boolean z10, C1146Dc c1146Dc, Map<String, String> extraParams) {
        this.A01 = c1937dL;
        this.A02 = us;
        this.A07 = str;
        this.A04 = e12;
        this.A03 = new C1940dO(e12, str, z10, extraParams);
        if (U7.A25(this.A01)) {
            this.A01.A0F().AID();
            c1146Dc.A0m(this);
        } else {
            this.A01.A0F().AIE();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        EI ei2 = new EI(this);
        if (this.A04.A0t()) {
            XJ.A00(ei2);
        } else {
            this.A04.getStateHandler().post(ei2);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABQ(this.A07, this.A03.A06());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1943dR
    public final void AE5() {
        this.A01.A0F().AIH();
        A08();
    }
}
