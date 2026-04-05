package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class G0 implements InterfaceC1884cT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1220Fy A01;

    public G0(C1220Fy c1220Fy, int i10) {
        this.A01 = c1220Fy;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void ABr() {
        this.A01.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void ACZ() {
        this.A01.A0V(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void ACy(int i10) {
        C1220Fy.A02(this.A01, i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void ADI(float f10) {
        if (!this.A01.A08) {
            this.A01.A0J(f10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void AFE(boolean z10) {
        this.A01.A0U(z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void AFg(String str) {
        this.A01.A0D.A0F().A3S(str);
        this.A01.A0I.A4b(this.A01.A0J.A7t());
        this.A01.A0K(3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void AJr() {
        this.A01.setUnskippableSecondsComplete(false);
        this.A01.A0H.setProgressImmediate(0.0f);
        this.A01.A0H.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1884cT
    public final void AJs(float f10) {
        this.A01.A0H.setProgress(100.0f * f10);
    }
}
