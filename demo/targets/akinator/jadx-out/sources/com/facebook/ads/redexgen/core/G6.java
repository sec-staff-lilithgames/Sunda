package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC1633Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1624Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C1140Cw A03;

    public G6(G2 g22, int i10, C1140Cw c1140Cw, AbstractRunnableC1624Vt abstractRunnableC1624Vt) {
        this.A02 = g22;
        this.A00 = i10;
        this.A03 = c1140Cw;
        this.A01 = abstractRunnableC1624Vt;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void ACp() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void AEn(float f10) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            C1140Cw c1140Cw = this.A03;
            float percentage = this.A00;
            c1140Cw.A07((int) ((percentage - f10) * 1000.0f));
        }
    }
}
