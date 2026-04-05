package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2109gA implements InterfaceC1491Qn {
    public final /* synthetic */ C09846g A00;

    public C2109gA(C09846g c09846g) {
        this.A00 = c09846g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1491Qn
    public final void AGP(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        this.A00.A1l(abstractC1484Qg, qj2, qj3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1491Qn
    public final void AGR(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        this.A00.A0r.A0Y(abstractC1484Qg);
        this.A00.A1m(abstractC1484Qg, qj2, qj3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1491Qn
    public final void AGT(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        abstractC1484Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC1484Qg, abstractC1484Qg, qj2, qj3)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC1484Qg, qj2, qj3)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1491Qn
    public final void AJo(AbstractC1484Qg abstractC1484Qg) {
        this.A00.A06.A1F(abstractC1484Qg.A0H, this.A00.A0r);
    }
}
