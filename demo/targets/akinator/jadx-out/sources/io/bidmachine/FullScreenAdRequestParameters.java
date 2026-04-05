package io.bidmachine;

import io.bidmachine.AdPlacementConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class FullScreenAdRequestParameters extends AdRequestParameters {
    private final AdContentType adContentType;

    @Deprecated
    public FullScreenAdRequestParameters(AdsFormat adsFormat, AdContentType adContentType) {
        this(new AdPlacementConfig.Builder(adsFormat).build(), adContentType);
    }

    private boolean isParametersMatchedInternal(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        return isContentTypeMatch(fullScreenAdRequestParameters.getAdContentType());
    }

    public AdContentType getAdContentType() {
        return this.adContentType;
    }

    public boolean isContentTypeMatch(AdContentType adContentType) {
        AdContentType adContentType2 = this.adContentType;
        return adContentType2 == AdContentType.All || adContentType2 == adContentType;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof FullScreenAdRequestParameters) && isParametersMatchedInternal((FullScreenAdRequestParameters) adRequestParameters);
    }

    public FullScreenAdRequestParameters(AdPlacementConfig adPlacementConfig, AdContentType adContentType) {
        super(adPlacementConfig);
        this.adContentType = adContentType;
    }
}
