package io.bidmachine;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i3 implements NetworkConfigParams {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkConfig f60379a;

    public i3(NetworkConfig networkConfig) {
        this.f60379a = networkConfig;
    }

    @Override // io.bidmachine.NetworkConfigParams
    public String getFromNetworkParams(String str) {
        return (String) this.f60379a.networkParams.get(str);
    }

    @Override // io.bidmachine.NetworkConfigParams
    public EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr) {
        ArrayList arrayList;
        List list;
        if (adsFormatArr == null || adsFormatArr.length <= 0) {
            return null;
        }
        EnumMap<AdsFormat, List<Map<String, String>>> enumMap = null;
        for (AdsFormat adsFormat : adsFormatArr) {
            NetworkConfig networkConfig = this.f60379a;
            if (networkConfig.typedMediationConfigs == null || (list = (List) networkConfig.typedMediationConfigs.get(adsFormat)) == null) {
                arrayList = null;
            } else {
                arrayList = null;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Map map = (Map) list.get(i10);
                    Map<String, String> mapPrepareTypedMediationConfig = map != null ? networkConfig.prepareTypedMediationConfig(map) : null;
                    if (mapPrepareTypedMediationConfig != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(mapPrepareTypedMediationConfig);
                    }
                }
            }
            if (arrayList != null) {
                if (enumMap == null) {
                    enumMap = new EnumMap<>(AdsFormat.class);
                }
                enumMap.put((EnumMap<AdsFormat, List<Map<String, String>>>) adsFormat, (AdsFormat) arrayList);
            }
        }
        return enumMap;
    }

    @Override // io.bidmachine.NetworkConfigParams
    public Map<String, String> obtainNetworkParams() {
        return new HashMap(this.f60379a.networkParams);
    }

    @Override // io.bidmachine.NetworkConfigParams
    public String removeFromNetworkParams(String str) {
        return (String) this.f60379a.networkParams.remove(str);
    }
}
