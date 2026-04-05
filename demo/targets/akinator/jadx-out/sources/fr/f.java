package fr;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.FullScreenAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends FullScreenAdRequest {
    @Override // io.bidmachine.AdRequest
    public final void onBuildPlacement(Placement.Builder builder) {
        super.onBuildPlacement(builder);
        builder.setReward(true);
    }
}
