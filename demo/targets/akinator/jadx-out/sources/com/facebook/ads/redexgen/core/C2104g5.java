package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.g5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2104g5 implements InterfaceC1487Qj {
    public final /* synthetic */ QO A00;

    public C2104g5(QO qo2) {
        this.A00 = qo2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final View A79(int i10) {
        return this.A00.A0v(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A7B(View view) {
        return this.A00.A0l(view) + ((QP) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A7C(View view) {
        return this.A00.A0q(view) - ((QP) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A8Y() {
        return this.A00.A0Z() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1487Qj
    public final int A8Z() {
        return this.A00.A0i();
    }
}
