package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1368Lr implements InterfaceC1748aH {
    public final /* synthetic */ C1353Lc A00;

    public C1368Lr(C1353Lc c1353Lc) {
        this.A00 = c1353Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1748aH
    public final void ACI() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1748aH
    public final void AE7() {
        this.A00.A0F = false;
        this.A00.A0O.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1748aH
    public final void AE8() {
        this.A00.A0F = true;
        this.A00.A0O.A06();
    }
}
