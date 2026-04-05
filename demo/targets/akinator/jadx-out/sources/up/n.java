package up;

import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface n {
    AdRequest build();

    n setBidPayload(String str);

    n setCustomParams(CustomParams customParams);

    n setListener(AdRequest.AdRequestListener<AdRequest> adRequestListener);

    n setLoadingTimeOut(Integer num);

    n setNetworks(String str);

    n setNetworks(List<NetworkConfig> list);

    n setPlacementId(String str);

    n setPriceFloorParams(PriceFloorParams priceFloorParams);

    @Deprecated
    n setSessionAdParams(SessionAdParams sessionAdParams);

    n setTargetingParams(TargetingParams targetingParams);
}
