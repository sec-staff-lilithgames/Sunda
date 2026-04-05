package io.bidmachine;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class HeaderBiddingAdapter extends NetworkAdapter {
    public HeaderBiddingAdapter(String str, String str2, String str3, int i10, AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }

    public final void collectHeaderBiddingParams(ContextProvider contextProvider, hr.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        int adapterMinDeviceApiVersion = getAdapterMinDeviceApiVersion();
        if (Build.VERSION.SDK_INT < adapterMinDeviceApiVersion) {
            headerBiddingCollectParamsCallback.onCollectFail(pr.a.adapter("minSdkVersion is " + adapterMinDeviceApiVersion));
        } else if (isInitialized(contextProvider)) {
            onCollectHeaderBiddingParams(contextProvider, dVar, networkAdUnit, headerBiddingAdRequestParams, headerBiddingCollectParamsCallback);
        } else {
            headerBiddingCollectParamsCallback.onCollectFail(pr.a.adapterNotInitialized());
        }
    }

    public abstract void onCollectHeaderBiddingParams(ContextProvider contextProvider, hr.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable;
}
