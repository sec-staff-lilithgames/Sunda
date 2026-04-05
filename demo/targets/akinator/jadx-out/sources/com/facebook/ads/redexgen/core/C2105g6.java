package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.g6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2105g6 implements InterfaceC1487Qj {
    public final /* synthetic */ QO A00;

    public C2105g6(QO qo2) {
        this.A00 = qo2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final View A79(int i10) {
        return this.A00.A0v(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A7B(View view) {
        return this.A00.A0p(view) + ((QP) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A7C(View view) {
        return this.A00.A0m(view) - ((QP) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A8Y() {
        return this.A00.A0j() - this.A00.A0h();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A8Z() {
        return this.A00.A0g();
    }
}
