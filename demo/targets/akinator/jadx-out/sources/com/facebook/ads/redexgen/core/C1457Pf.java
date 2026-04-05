package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1457Pf extends AbstractRunnableC1624Vt {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VR A01;
    public final /* synthetic */ VU A02;
    public final /* synthetic */ String A03;

    public C1457Pf(VU vu2, String str, long j10, VR vr2) {
        this.A02 = vu2;
        this.A03 = str;
        this.A00 = j10;
        this.A01 = vr2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
