package em;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface n {
    void cache();

    void cache(AdsFormat adsFormat);

    boolean cacheWaterfall(AdsFormat adsFormat, boolean z10);

    String getVersion();

    void init(Context context);

    boolean isInitialized();

    void loadBanner(NetworkAdUnit networkAdUnit, b0 b0Var);

    void loadInterstitial(NetworkAdUnit networkAdUnit, f0 f0Var);

    void loadRewarded(NetworkAdUnit networkAdUnit, i0 i0Var);

    v reserveMostExpensiveAd(NetworkAdUnit networkAdUnit, AdsFormat adsFormat);

    void unReserveAd(NetworkAdUnit networkAdUnit);
}
