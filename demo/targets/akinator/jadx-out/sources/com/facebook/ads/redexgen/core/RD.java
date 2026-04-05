package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;

/* loaded from: assets/audience_network.dex */
public final class RD implements InitApi {
    @Override // com.facebook.ads.internal.api.InitApi
    public final void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
        TK.A0H(RB.A09(context), multithreadedBundleWrapper, initListener, i10);
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final boolean isInitialized() {
        return TK.A0I();
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onAdLoadInvoked(Context context) {
        TK.A08(RB.A09(context));
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onContentProviderCreated(Context context) {
        TK.A09(RB.A09(context));
    }
}
