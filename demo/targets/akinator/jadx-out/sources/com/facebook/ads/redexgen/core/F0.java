package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class F0 implements R6 {
    public final /* synthetic */ R0 A00;
    public final /* synthetic */ C09163q A01;

    public F0(C09163q c09163q, R0 r02) {
        this.A01 = c09163q;
        this.A00 = r02;
    }

    @Override // com.facebook.ads.redexgen.core.R6
    public final boolean AAA() {
        if (!this.A01.A0b()) {
            if (this.A01.A0c()) {
                return true;
            }
            return this.A01.A0d();
        }
        this.A01.A0a(this.A00);
        return true;
    }
}
