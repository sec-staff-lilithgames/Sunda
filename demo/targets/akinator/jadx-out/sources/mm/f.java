package mm;

import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.TargetingParams;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends AdRequest {
    @Override // io.bidmachine.AdRequest
    public final hr.d createUnifiedAdRequestParams(AdRequestParameters adRequestParameters, TargetingParams targetingParams, up.d dVar) {
        return new d((b) adRequestParameters, targetingParams, dVar);
    }

    public g getSize() {
        return ((b) getAdRequestParameters()).getBannerSize();
    }
}
