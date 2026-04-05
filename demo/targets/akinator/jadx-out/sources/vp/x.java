package vp;

import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.MediaAssetType;
import io.bidmachine.TargetingParams;
import io.bidmachine.protobuf.ResponsePayload;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x extends AdRequest {
    public boolean containsAssetType(MediaAssetType mediaAssetType) {
        return ((m) getAdRequestParameters()).containsAssetType(mediaAssetType);
    }

    @Override // io.bidmachine.AdRequest
    public final hr.d createUnifiedAdRequestParams(AdRequestParameters adRequestParameters, TargetingParams targetingParams, up.d dVar) {
        return new w((m) adRequestParameters, targetingParams, dVar);
    }

    @Override // io.bidmachine.AdRequest
    public final void processBidPayload(ResponsePayload responsePayload) {
        ((m) getAdRequestParameters()).f89545b = false;
        super.processBidPayload(responsePayload);
    }
}
