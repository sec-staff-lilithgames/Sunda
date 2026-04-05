package io.bidmachine;

import io.bidmachine.AdRequest;
import io.bidmachine.FullScreenAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, hr.j> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        protected AdContentType adContentType = AdContentType.All;

        public SelfType setAdContentType(AdContentType adContentType) {
            this.adContentType = adContentType;
            return this;
        }
    }

    public FullScreenAdRequest(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    public AdContentType getAdContentType() {
        return getAdRequestParameters().getAdContentType();
    }

    @Override // io.bidmachine.AdRequest
    public boolean isPlacementBuilderMatch(om.l lVar) {
        return super.isPlacementBuilderMatch(lVar) && getAdRequestParameters().isContentTypeMatch(lVar.getAdContentType());
    }

    @Override // io.bidmachine.AdRequest
    public hr.j createUnifiedAdRequestParams(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingParams targetingParams, up.d dVar) {
        return new j2(fullScreenAdRequestParameters, targetingParams, dVar);
    }
}
