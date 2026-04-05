package io.bidmachine.ads.networks.vast;

import fn.t;
import hr.d;
import hr.h;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.vast.b0;
import io.bidmachine.iab.vast.e;
import java.util.HashMap;
import lm.b;
import um.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VastAdapter extends HeaderBiddingAdapter {
    public VastAdapter() {
        super("vast", "3.4.0", "3.4.0.1", 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new b(b0.f60481b);
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new b(b0.f60482c);
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    public final void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) {
        t.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        e.setLoggingLevel(z10 ? c0.debug : c0.none);
    }
}
