package io.bidmachine;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface NetworkConfigParams {
    String getFromNetworkParams(String str);

    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr);

    Map<String, String> obtainNetworkParams();

    String removeFromNetworkParams(String str);
}
