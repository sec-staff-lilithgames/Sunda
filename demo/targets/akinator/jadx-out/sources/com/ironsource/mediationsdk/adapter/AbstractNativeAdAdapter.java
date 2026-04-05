package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.Map;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(JSONObject config, JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(config, jSONObject);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(JSONObject config) {
        e0.checkNotNullParameter(config, "config");
    }

    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        e0.checkNotNullParameter(config, "config");
        return null;
    }

    public final NativeAdProperties getNativeAdProperties(JSONObject config) {
        e0.checkNotNullParameter(config, "config");
        return new NativeAdProperties(config);
    }

    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(JSONObject config, JSONObject jSONObject, NativeAdSmashListener listener) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(listener, "listener");
    }

    public void loadNativeAdForBidding(JSONObject config, JSONObject jSONObject, String str, NativeAdSmashListener nativeAdSmashListener) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(nativeAdSmashListener, KGUkpTlXZlJLy.swHA);
    }
}
