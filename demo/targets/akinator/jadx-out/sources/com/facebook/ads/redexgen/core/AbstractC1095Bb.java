package com.facebook.ads.redexgen.core;

import android.util.Log;

/* renamed from: com.facebook.ads.redexgen.X.Bb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1095Bb implements InterfaceC2113gE {
    public int A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final void A9l(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final void A9m(String str, String str2, Throwable th2) {
        Log.i(str, str2, th2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final boolean AAP(int i10) {
        return this.A00 <= i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2113gE
    public final void AIo(int i10) {
        this.A00 = i10;
    }
}
