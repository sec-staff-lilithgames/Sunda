package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1318Jt implements InterfaceC1633Wc {
    public final /* synthetic */ C09575f A00;

    public C1318Jt(C09575f c09575f) {
        this.A00 = c09575f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void ACp() {
        this.A00.A02 = false;
        if (this.A00.A07 != null) {
            this.A00.A07.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void AEn(float f10) {
        if (this.A00.A07 != null) {
            this.A00.A07.setProgressImmediate(100.0f * (1.0f - (f10 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
