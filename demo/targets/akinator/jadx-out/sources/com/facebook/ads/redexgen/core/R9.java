package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* loaded from: assets/audience_network.dex */
public final class R9 implements BidderTokenProviderApi {
    public final S6 A00 = new S6();

    public final S6 A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(RB.A09(context));
    }
}
