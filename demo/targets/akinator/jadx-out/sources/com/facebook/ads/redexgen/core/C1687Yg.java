package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1687Yg extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C1911cu A00;

    public C1687Yg(C1911cu c1911cu) {
        this.A00 = c1911cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
