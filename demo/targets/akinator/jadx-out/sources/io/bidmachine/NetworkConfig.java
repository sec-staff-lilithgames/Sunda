package io.bidmachine;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class NetworkConfig {
    static final String CONFIG_SKIP_INITIALIZATION = "skip_initialization";
    private Map<String, String> baseMediationConfig;
    private AdsType[] mergedAdsTypes;
    private final String networkKey;
    private AdsType[] supportedAdsTypes;
    private EnumMap<AdsFormat, List<Map<String, String>>> typedMediationConfigs;
    private final NetworkConfigParams networkConfigParams = new i3(this);
    private final Map<String, String> networkParams = new HashMap();

    public NetworkConfig(String str, Map<String, String> map) {
        this.networkKey = str;
        withNetworkParams(map);
    }

    private boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> prepareTypedMediationConfig(Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (useNetworkParamsAsMediationBase()) {
            map2.putAll(this.networkParams);
        }
        Map<String, String> map3 = this.baseMediationConfig;
        if (map3 != null) {
            map2.putAll(map3);
        }
        map2.putAll(map);
        return map2;
    }

    public <T extends hr.d> List<NetworkAdUnit> createNetworkAdUnitList(AdsType adsType, T t10, AdContentType adContentType, NetworkAdapter networkAdapter) {
        List list;
        ArrayList arrayList = new ArrayList();
        EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
        if (enumMap != null) {
            Iterator it = enumMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AdsFormat adsFormat = (AdsFormat) entry.getKey();
                if (adsFormat.isMatch(adsType, t10, adContentType) && (list = (List) entry.getValue()) != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new NetworkAdUnit(networkAdapter, adsFormat, prepareTypedMediationConfig((Map) it2.next())));
                    }
                }
            }
        }
        return arrayList;
    }

    public abstract NetworkAdapter createNetworkAdapter();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getNetworkKey().equals(((NetworkConfig) obj).getNetworkKey());
    }

    public NetworkConfig forAdTypes(AdsType... adsTypeArr) {
        this.supportedAdsTypes = adsTypeArr;
        return this;
    }

    public NetworkConfigParams getNetworkConfigParams() {
        return this.networkConfigParams;
    }

    public String getNetworkKey() {
        return this.networkKey;
    }

    public AdsType[] getSupportedAdsTypes(NetworkAdapter networkAdapter) {
        if (this.mergedAdsTypes == null) {
            ArrayList arrayList = new ArrayList();
            for (AdsType adsType : networkAdapter.getSupportedTypes()) {
                AdsType[] adsTypeArr = this.supportedAdsTypes;
                if (adsTypeArr == null || contains(adsTypeArr, adsType)) {
                    arrayList.add(adsType);
                }
            }
            this.mergedAdsTypes = (AdsType[]) arrayList.toArray(new AdsType[0]);
        }
        return this.mergedAdsTypes;
    }

    public int hashCode() {
        return getNetworkKey().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T internalSetSkipInitialization(boolean z10) {
        setNetworkParam(CONFIG_SKIP_INITIALIZATION, String.valueOf(z10));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setBaseMediationParam(String str, String str2) {
        if (this.baseMediationConfig == null) {
            this.baseMediationConfig = new HashMap();
        }
        this.baseMediationConfig.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setNetworkParam(String str, String str2) {
        this.networkParams.put(str, str2);
        return this;
    }

    public boolean useNetworkParamsAsMediationBase() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withBaseMediationConfig(Map<String, String> map) {
        this.baseMediationConfig = map;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withMediationConfig(AdsFormat adsFormat, Map<String, String> map) {
        if (map == null) {
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
            if (enumMap != null) {
                enumMap.remove(adsFormat);
            }
            return this;
        }
        if (this.typedMediationConfigs == null) {
            this.typedMediationConfigs = new EnumMap<>(AdsFormat.class);
        }
        List<Map<String, String>> arrayList = this.typedMediationConfigs.get(adsFormat);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.typedMediationConfigs.put((EnumMap<AdsFormat, List<Map<String, String>>>) adsFormat, (AdsFormat) arrayList);
        }
        arrayList.add(map);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withNetworkParams(Map<String, String> map) {
        this.networkParams.clear();
        if (map != null) {
            this.networkParams.putAll(map);
        }
        return this;
    }

    @Deprecated
    public <T extends NetworkConfig> T withMediationConfig(AdsFormat adsFormat, Map<String, String> map, Orientation orientation) {
        nm.a.w("The parameter 'orientation' is no longer supported and has no effect.");
        return (T) withMediationConfig(adsFormat, map);
    }
}
