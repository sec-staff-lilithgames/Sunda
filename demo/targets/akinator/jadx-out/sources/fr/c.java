package fr;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsFormat;
import io.bidmachine.FullScreenAdRequestParameters;
import pr.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c extends FullScreenAdRequestParameters {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(AdContentType adContentType) {
        int i10 = b.f55992a[adContentType.ordinal()];
        super(new AdPlacementConfig.Builder(i10 != 1 ? i10 != 2 ? AdsFormat.Rewarded : AdsFormat.RewardedVideo : AdsFormat.RewardedStatic).build(), adContentType);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return i.isRewardedPlacement(placement);
    }
}
