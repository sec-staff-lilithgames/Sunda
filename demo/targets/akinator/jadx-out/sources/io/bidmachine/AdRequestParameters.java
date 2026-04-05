package io.bidmachine;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class AdRequestParameters {
    private AdPlacementConfig adPlacementConfig;
    private ResponsePayload bidPayload;
    private List<NetworkConfig> networkConfigList;
    private PriceFloorParams priceFloorParams;
    private TargetingParams targetingParams;
    private Integer timeOutMs;

    public AdRequestParameters(AdPlacementConfig adPlacementConfig) {
        this.adPlacementConfig = adPlacementConfig;
    }

    public AdPlacementConfig getAdPlacementConfig() {
        return this.adPlacementConfig;
    }

    public AdsFormat getAdsFormat() {
        return this.adPlacementConfig.getAdsFormat();
    }

    public AdsType getAdsType() {
        return getAdsFormat().getAdsType();
    }

    public ResponsePayload getBidPayload() {
        return this.bidPayload;
    }

    public CustomParams getCustomParams() {
        return this.adPlacementConfig.getCustomParams();
    }

    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    public String getPlacementId() {
        return this.adPlacementConfig.getPlacementId();
    }

    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Deprecated
    public SessionAdParams getSessionAdParams() {
        return null;
    }

    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return getAdsType() == adRequestParameters.getAdsType();
    }

    public abstract boolean isPlacementObjectValid(Placement placement) throws Throwable;

    public boolean isPricePassedByPriceFloor(double d10) {
        PriceFloorParams priceFloorParams = this.priceFloorParams;
        if (priceFloorParams == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        Iterator<Double> it = priceFloors.values().iterator();
        while (it.hasNext()) {
            if (d10 > it.next().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    public void setAdPlacementConfig(AdPlacementConfig adPlacementConfig) {
        AdsFormat adsFormat = this.adPlacementConfig.getAdsFormat();
        AdsFormat adsFormat2 = adPlacementConfig.getAdsFormat();
        if (adsFormat != adsFormat2) {
            nm.a.w("setAdPlacementConfig received different AdsFormat. Expected: " + adsFormat + ", actual: " + adsFormat2);
            adPlacementConfig = adPlacementConfig.copy(adsFormat, adPlacementConfig.getPlacementId(), adPlacementConfig.getCustomParams());
        }
        this.adPlacementConfig = adPlacementConfig;
    }

    public void setBidPayload(ResponsePayload responsePayload) {
        this.bidPayload = responsePayload;
    }

    public void setNetworkConfigList(List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    public void setPriceFloorParams(PriceFloorParams priceFloorParams) {
        this.priceFloorParams = priceFloorParams;
    }

    public void setTargetingParams(TargetingParams targetingParams) {
        this.targetingParams = targetingParams;
    }

    public void setTimeOutMs(Integer num) {
        this.timeOutMs = num;
    }
}
