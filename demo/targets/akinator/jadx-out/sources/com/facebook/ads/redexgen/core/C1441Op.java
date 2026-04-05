package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1441Op extends AbstractRunnableC1624Vt {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC1657Xc A01;

    public C1441Op(DialogInterfaceOnClickListenerC1657Xc dialogInterfaceOnClickListenerC1657Xc, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC1657Xc;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AGD(VZ.A03(this.A01.A01.A00), new C2030er().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
