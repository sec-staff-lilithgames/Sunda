package io.bidmachine.ads.networks.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import fn.t;
import hr.d;
import hr.e;
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
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jm.c;
import jm.i;
import rm.b;
import tm.b0;
import um.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class MraidAdapter extends HeaderBiddingAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f59842a = new AtomicBoolean(false);

    public MraidAdapter() {
        super(CampaignEx.JSON_KEY_MRAID, "3.4.0", "3.4.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new c();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new i(b0.f86992b);
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new i(b0.f86993c);
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
        if (f59842a.compareAndSet(false, true)) {
            b.addBridge(new rm.d());
        }
        t.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        tm.t.setLoggingLevel(z10 ? c0.debug : c0.none);
    }
}
