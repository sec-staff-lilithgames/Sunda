package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;

/* loaded from: assets/audience_network.dex */
public final class R3 implements AudienceNetworkAdsApi {
    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final int getAdFormatForPlacement(String str) {
        AbstractC1616Vl.A02(this);
        return 0;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final void initialize(Context context, MultithreadedBundleWrapper initSettings, AudienceNetworkAds.InitListener initListener) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        if (initListener == null) {
            try {
                initListener = new R2(this);
            } catch (Throwable th2) {
                AbstractC1616Vl.A00(th2, this);
                return;
            }
        }
        DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final boolean isInitialized() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return false;
        }
        try {
            DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
            if (dynamicLoader == null) {
                return false;
            }
            return dynamicLoader.getInitApi().isInitialized();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return false;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final void onContentProviderCreated(Context context) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
