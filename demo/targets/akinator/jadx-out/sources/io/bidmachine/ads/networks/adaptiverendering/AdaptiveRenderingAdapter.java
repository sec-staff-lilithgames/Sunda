package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
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
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import uu.k0;
import xl.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdaptiveRenderingAdapter extends HeaderBiddingAdapter {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public AdaptiveRenderingAdapter() {
        super("adaptive_rendering", "3.4.0", "3.4.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new c();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new xl.e();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new xl.e();
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        e0.checkNotNullParameter(contextProvider, "contextProvider");
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, d adRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams hbAdRequestParams, HeaderBiddingCollectParamsCallback collectCallback) {
        e0.checkNotNullParameter(contextProvider, "contextProvider");
        e0.checkNotNullParameter(adRequestParams, "adRequestParams");
        e0.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        e0.checkNotNullParameter(hbAdRequestParams, "hbAdRequestParams");
        e0.checkNotNullParameter(collectCallback, "collectCallback");
        HashMap map = new HashMap();
        String[] supportedFeatures = tm.u.getSupportedFeatures(contextProvider.getApplicationContext());
        e0.checkNotNullExpressionValue(supportedFeatures, "getSupportedFeatures(con….getApplicationContext())");
        map.put("features", k0.joinToString$default(supportedFeatures, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        collectCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public final void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback callback) {
        e0.checkNotNullParameter(contextProvider, "contextProvider");
        e0.checkNotNullParameter(initializationParams, "initializationParams");
        e0.checkNotNullParameter(networkConfigParams, "networkConfigParams");
        e0.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
        t.initialize(applicationContext);
        zp.a.initialize(applicationContext);
        callback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        zp.a.setLoggingEnabled(z10);
    }
}
