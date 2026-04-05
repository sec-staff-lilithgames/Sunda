package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1145Db implements InterfaceC1951dZ {
    public final View A00;
    public final C1937dL A01;

    public C1145Db(C1937dL c1937dL, View view) {
        this.A01 = c1937dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1951dZ
    public final double A9N() {
        C2011eY result = C2010eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
