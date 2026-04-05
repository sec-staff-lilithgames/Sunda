package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class AdView extends RelativeLayout implements Ad {
    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdViewLoadConfig extends Ad.LoadAdConfig {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdViewLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        AdViewLoadConfig build();

        AdViewLoadConfigBuilder withAdListener(AdListener adListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        AdViewLoadConfigBuilder withBid(String str);
    }

    public AdView(Context context, String str, AdSize adSize) {
        super(context);
        a aVar = new a(this);
        this.mAdViewParentApi = aVar;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, aVar, this);
    }

    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }

    public void loadAd(AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    public AdView(Context context, String str, String str2) throws Exception {
        super(context);
        a aVar = new a(this);
        this.mAdViewParentApi = aVar;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, aVar, this);
    }
}
