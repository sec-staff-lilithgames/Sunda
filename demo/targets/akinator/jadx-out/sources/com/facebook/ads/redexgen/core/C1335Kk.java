package com.facebook.ads.redexgen.core;

import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1335Kk extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C1716Zj A00;

    public C1335Kk(C1716Zj c1716Zj) {
        this.A00 = c1716Zj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() throws JSONException {
        if (this.A00.A01) {
            return;
        }
        this.A00.A04(-1, null);
    }
}
