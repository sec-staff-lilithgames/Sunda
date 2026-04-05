package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1446Ou implements X5 {
    public final X4 A00;
    public final X5 A01;

    public C1446Ou(X5 x52, int i10, int i11) {
        this.A01 = x52;
        this.A00 = new X4(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.X5
    public final void AGO(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && X7.A08(this.A00)) {
            this.A01.AGO(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.X5
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (X7.A08(this.A00)) {
                this.A01.AGO(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
