package com.amazon.aps.ads;

import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsSlotInfoExtra;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.bidder.adapter.ApsBidderInterstitialAdAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdUtil;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.SDKUtilities;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdUtils {
    private static final String BID_INFO = "bidInfo";
    private static final String HEIGHT = "height";
    private static final String PRICEPOINT_ENCODED = "pricePointEncoded";
    private static final String UUID = "uuid";
    private static final String WIDTH = "width";
    private static boolean isDebugBuild;

    static {
        new ApsAdUtils();
    }

    private ApsAdUtils() {
        isDebugBuild = false;
    }

    public static void addApsAdInAdManagerAdRequest(AdManagerAdRequest adManagerAdRequest, ApsAd apsAd) {
        checkNullAndLogInvalidArg(adManagerAdRequest, apsAd);
        try {
            DTBAdUtil.INSTANCE.loadDTBParams(adManagerAdRequest, apsAd);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error loading the Aps params in the AdManagerAdRequest.Builder object in loadApsParamsInAdManagerAdRequest", e10);
        }
    }

    public static void addApsAdInAdManagerAdRequestBuilder(AdManagerAdRequest.Builder builder, ApsAd apsAd) {
        checkNullAndLogInvalidArg(builder, apsAd);
        try {
            DTBAdUtil.INSTANCE.loadDTBParams(builder, apsAd);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error loading the Aps params in the AdManagerAdRequest.Builder object in loadApsParamsInAdManagerAdRequest", e10);
        }
    }

    public static boolean checkNullAndLogInvalidArg(Object... objArr) {
        try {
            APSSharedUtil.checkNullAndThrowException(objArr);
            return false;
        } catch (IllegalArgumentException e10) {
            if (isDebugBuild) {
                throw e10;
            }
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Invalid argument for calling the method", e10);
            return true;
        }
    }

    public static AdManagerAdRequest.Builder createAdManagerAdRequestBuilder(ApsAd apsAd) {
        checkNullAndLogInvalidArg(apsAd);
        try {
            return DTBAdUtil.INSTANCE.createAdManagerAdRequestBuilder(apsAd);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error constructing the AdManagerAdRequest.Builder object in createAdManagerAdRequestBuilder", e10);
            return null;
        }
    }

    public static Bundle createAdMobBannerRequestBundle(String str, ApsAdFormat apsAdFormat) {
        checkNullAndLogInvalidArg(str, apsAdFormat);
        return DTBAdUtil.createAdMobBannerRequestBundle(str, ApsAdFormatUtils.getWidth(apsAdFormat), ApsAdFormatUtils.getHeight(apsAdFormat));
    }

    public static Bundle createAdMobInterstitialRequestBundle(String str) {
        checkNullAndLogInvalidArg(str);
        return DTBAdUtil.createAdMobInterstitialRequestBundle(str);
    }

    public static Bundle createAdMobInterstitialVideoRequestBundle(String str) {
        checkNullAndLogInvalidArg(str);
        return DTBAdUtil.createAdMobInterstitialVideoRequestBundle(str);
    }

    public static ApsBidderInterstitialAdAdapter fetchBidderInterstitialAd(Context context, ApsAd apsAd, ApsAdListener apsAdListener) {
        Object adapterInstance;
        if (checkNullAndLogInvalidArg(context, apsAd, apsAdListener) || (adapterInstance = ApsBidder.getApsBidderInstance().getAdapterInstance(apsAd.getBidder())) == null) {
            return null;
        }
        ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter = (ApsBidderInterstitialAdAdapter) adapterInstance;
        apsBidderInterstitialAdAdapter.fetchInterstitialAd(context, apsAd, apsAdListener);
        return apsBidderInterstitialAdAdapter;
    }

    public static ApsAd getApsAdForBidderRendering(ApsAdFormat apsAdFormat, String... strArr) throws Exception {
        if (checkNullAndLogInvalidArg(apsAdFormat, strArr)) {
            return null;
        }
        ApsAd apsAd = new ApsAd("", apsAdFormat);
        apsAd.setBidder(strArr[0]);
        apsAd.setBridgingBidderExtra(new JSONObject(strArr[1]));
        apsAd.setImpressionUrl(strArr[2]);
        return apsAd;
    }

    public static String getBidIdFromCreative(String str) {
        String[] strArrSplit;
        if (str == null) {
            return null;
        }
        try {
            String[] strArrSplit2 = str.split("amzn.dtb.loadAd");
            if (strArrSplit2 == null || strArrSplit2.length < 2 || (strArrSplit = strArrSplit2[1].split(",")) == null || strArrSplit.length < 2) {
                return null;
            }
            return strArrSplit[1].replace("\"", "").trim();
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error getting bid id from creative", e10);
            return null;
        }
    }

    public static JSONObject getUnityLevelPlayDataForBanner(String str, ApsAd apsAd) throws JSONException {
        checkNullAndLogInvalidArg(str, apsAd);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(BID_INFO, apsAd.getBidInfo());
            jSONObject2.put(PRICEPOINT_ENCODED, apsAd.getPricePoint());
            jSONObject2.put(UUID, apsAd.getSlotUuid());
            jSONObject2.put("width", apsAd.getWidthFromAax());
            jSONObject2.put("height", apsAd.getHeightFromAax());
            jSONObject.put(str, jSONObject2);
            return jSONObject;
        } catch (RuntimeException | JSONException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error constructing the iron source banner object", e10);
            return jSONObject;
        }
    }

    public static JSONObject getUnityLevelPlayDataForInterstitial(String str, ApsAd apsAd) throws JSONException {
        checkNullAndLogInvalidArg(str, apsAd);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(BID_INFO, apsAd.getBidInfo());
            jSONObject2.put(PRICEPOINT_ENCODED, apsAd.getPricePoint());
            jSONObject2.put(UUID, apsAd.getSlotUuid());
            jSONObject.put(str, jSONObject2);
            return jSONObject;
        } catch (RuntimeException | JSONException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error constructing the iron source interstitial object", e10);
            return jSONObject;
        }
    }

    public static boolean isDebugBuild() {
        return isDebugBuild;
    }

    public static boolean isTelSupported() {
        return SDKUtilities.isTelSupported();
    }

    public static boolean sdkRenderingBridgeEnabled(String str) {
        return !ApsUtils.Companion.isNullOrEmpty(str) && str.contains(DtbConstants.AMZN_SDK_BIDDER_ID_KEY) && str.contains(DtbConstants.AMZN_BIDDER_REQUEST_KEY) && str.contains(DtbConstants.AMZN_IMP_URL_KEY);
    }

    public static void throwExceptionOrRemoteLog(String str) {
        if (isDebugBuild()) {
            throw new IllegalStateException(str);
        }
        APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, str);
    }

    public static Bundle createAdMobInterstitialRequestBundle(String str, ApsSlotInfoExtra apsSlotInfoExtra) {
        checkNullAndLogInvalidArg(str);
        return DTBAdUtil.createAdMobInterstitialRequestBundle(str, apsSlotInfoExtra);
    }

    public static Bundle createAdMobInterstitialVideoRequestBundle(String str, ApsSlotInfoExtra apsSlotInfoExtra) {
        checkNullAndLogInvalidArg(str);
        return DTBAdUtil.createAdMobInterstitialVideoRequestBundle(str, apsSlotInfoExtra);
    }

    public static Bundle createAdMobBannerRequestBundle(String str, ApsAdFormat apsAdFormat, ApsSlotInfoExtra apsSlotInfoExtra) {
        checkNullAndLogInvalidArg(str, apsAdFormat);
        return DTBAdUtil.createAdMobBannerRequestBundle(str, ApsAdFormatUtils.getWidth(apsAdFormat), ApsAdFormatUtils.getHeight(apsAdFormat), apsSlotInfoExtra);
    }

    public static boolean sdkRenderingBridgeEnabled(Bundle bundle) {
        return bundle != null && !bundle.isEmpty() && bundle.containsKey(DtbConstants.AMZN_SDK_BIDDER_ID_KEY) && bundle.containsKey(DtbConstants.AMZN_BIDDER_REQUEST_KEY) && bundle.containsKey(DtbConstants.AMZN_IMP_URL_KEY);
    }

    public static ApsAd getApsAdForBidderRendering(ApsAdFormat apsAdFormat, JSONObject jSONObject) throws Exception {
        if (checkNullAndLogInvalidArg(apsAdFormat, jSONObject)) {
            return null;
        }
        ApsAd apsAd = new ApsAd("", apsAdFormat);
        apsAd.setBidder(jSONObject.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY));
        apsAd.setBridgingBidderExtra(jSONObject.getJSONObject(DtbConstants.AMZN_BIDDER_REQUEST_KEY));
        apsAd.setImpressionUrl(jSONObject.getString(DtbConstants.AMZN_IMP_URL_KEY));
        return apsAd;
    }

    public static ApsAd getApsAdForBidderRendering(JSONObject jSONObject, ApsAdViewImpl apsAdViewImpl) throws Exception {
        if (checkNullAndLogInvalidArg(jSONObject, apsAdViewImpl)) {
            return null;
        }
        ApsAd apsAd = new ApsAd("", ApsAdFormatUtils.getAdFormat(AdType.DISPLAY, Integer.parseInt(jSONObject.getString("height")), Integer.parseInt(jSONObject.getString("width"))));
        apsAd.setBidder(jSONObject.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY));
        apsAd.setBridgingBidderExtra(jSONObject.getJSONObject(DtbConstants.AMZN_BIDDER_REQUEST_KEY));
        apsAd.setImpressionUrl(jSONObject.getString(DtbConstants.AMZN_IMP_URL_KEY));
        apsAd.setAdView(apsAdViewImpl);
        return apsAd;
    }
}
