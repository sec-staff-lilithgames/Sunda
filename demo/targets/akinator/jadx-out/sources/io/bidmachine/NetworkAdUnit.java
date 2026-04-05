package io.bidmachine;

import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class NetworkAdUnit {
    private final AdsFormat adsFormat;

    /* renamed from: id, reason: collision with root package name */
    private final String f59828id = UUID.randomUUID().toString();
    private final Map<String, String> mediationConfig;
    private final NetworkAdapter networkAdapter;

    public NetworkAdUnit(NetworkAdapter networkAdapter, AdsFormat adsFormat, Map<String, String> map) {
        this.networkAdapter = networkAdapter;
        this.adsFormat = adsFormat;
        this.mediationConfig = map;
    }

    public void clearAuction() throws Throwable {
        getNetworkAdapter().clearAuction(this);
    }

    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    public String getId() {
        return this.f59828id;
    }

    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    public String getMediationParameter(String str) {
        return this.mediationConfig.get(str);
    }

    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    public void onLossAuction() throws Throwable {
        getNetworkAdapter().onLossAuction(this);
    }

    public void onWinAuction() throws Throwable {
        getNetworkAdapter().onWinAuction(this);
    }
}
