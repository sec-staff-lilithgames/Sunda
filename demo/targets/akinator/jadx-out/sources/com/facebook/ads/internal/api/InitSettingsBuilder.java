package com.facebook.ads.internal.api;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InitSettingsBuilder implements AudienceNetworkAds.InitSettingsBuilder {
    public static final String PLACEMENTS_KEY = "PLACEMENTS_KEY";
    private final Context mContext;
    private final MultithreadedBundleWrapper mInitSettings = new MultithreadedBundleWrapper();
    private AudienceNetworkAds.InitListener mInitializationListener;

    public InitSettingsBuilder(Context context) {
        this.mContext = context;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public void initialize() {
        DynamicLoaderFactory.initialize(this.mContext, this.mInitSettings, this.mInitializationListener, false);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public /* bridge */ /* synthetic */ AudienceNetworkAds.InitSettingsBuilder withPlacementIds(List list) {
        return withPlacementIds((List<String>) list);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public InitSettingsBuilder withInitListener(AudienceNetworkAds.InitListener initListener) {
        this.mInitializationListener = initListener;
        return this;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public InitSettingsBuilder withMediationService(String str) {
        AdSettings.setMediationService(str);
        return this;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder
    public InitSettingsBuilder withPlacementIds(List<String> list) {
        this.mInitSettings.putStringArrayList(PLACEMENTS_KEY, new ArrayList<>(list));
        return this;
    }
}
