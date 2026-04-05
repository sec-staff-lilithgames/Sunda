package com.amazon.device.ads;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdResponse {
    public static final String AMAZON_AD_INFO = "{bidID:'%s',aaxHost:'%s',type:'%s',width:%d,height:%d,pricePoint:'%s'}";
    public static final String AMZNH_PARAMETER_KEY = "amznh";
    public static final String LOG_TAG = "DTBAdResponse";
    public String bidId;
    public String bidder;
    public JSONObject bridgingBidderExtra;
    public String crid;
    public String extrasAsString;
    public String hostName;
    public String impressionUrl;
    public boolean isVideo;
    public Map<String, List<String>> kvpDictionary;
    public Map<DTBAdSize, List<DtbPricePoint>> pricepoints;
    public DTBAdRequest refreshLoader;
    public Bundle renderingBundle;
    public String videoInventoryType;
    public int videoSkipAfterDurationInSeconds;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.device.ads.DTBAdResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdType[AdType.DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdType[AdType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DTBAdResponse() {
        this.kvpDictionary = new HashMap();
        this.pricepoints = new HashMap();
    }

    private String defaultImpressionUrl() {
        return a.b.o(b3.h.b(DtbConstants.HTTPS, resolvedHostName(), "/", isVideo() ? DtbConstants.videoImpressionPath : DtbConstants.displayImpressionPath, "?b="), getBidId(), "&ps=", getDefaultPricePoints());
    }

    private String getAmazonInfo() {
        String str = "";
        if (getDTBAds().size() == 0) {
            return "";
        }
        DTBAdSize dTBAdSize = getDTBAds().get(0);
        int width = dTBAdSize.getWidth();
        int height = dTBAdSize.getHeight();
        int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdType[dTBAdSize.getDTBAdType().ordinal()];
        if (i10 == 1) {
            str = "video";
        } else if (i10 == 2) {
            str = "banner";
        } else if (i10 == 3) {
            Activity currentActivity = AdRegistration.getCurrentActivity();
            str = "interstitial";
            if (currentActivity != null) {
                Display defaultDisplay = ((WindowManager) currentActivity.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int iPixelsToDeviceIndependenPixels = DTBAdUtil.pixelsToDeviceIndependenPixels(displayMetrics.widthPixels);
                height = DTBAdUtil.pixelsToDeviceIndependenPixels(displayMetrics.heightPixels);
                width = iPixelsToDeviceIndependenPixels;
            }
        }
        String str2 = str;
        String strResolvedHostName = resolvedHostName();
        if (strResolvedHostName == null) {
            strResolvedHostName = DtbDebugProperties.getAaxHostName(DtbSharedPreferences.getInstance().getAaxHostname());
        }
        String pricePoint = SDKUtilities.getPricePoint(this);
        return String.format(AMAZON_AD_INFO, this.bidId, strResolvedHostName, str2, Integer.valueOf(width), Integer.valueOf(height), pricePoint);
    }

    private String getBidKey() {
        return !this.isVideo ? DTBAdLoader.A9_BID_ID_KEY : DTBAdLoader.A9_VID_KEY;
    }

    public boolean bidderRenderingFlowEnabled() {
        return (DtbCommonUtils.isNullOrEmpty(this.bidder) || DtbCommonUtils.isNullOrEmpty(this.bridgingBidderExtra) || DtbCommonUtils.isNullOrEmpty(getImpressionUrl()) || DtbCommonUtils.isNullOrEmpty(String.valueOf(SDKUtilities.getWidth(this))) || DtbCommonUtils.isNullOrEmpty(String.valueOf(SDKUtilities.getHeight(this)))) ? false : true;
    }

    public int getAdCount() {
        return this.pricepoints.size();
    }

    public DTBAdRequest getAdLoader() {
        return this.refreshLoader;
    }

    public String getBidId() {
        return this.bidId;
    }

    public String getBidder() {
        return this.bidder;
    }

    public JSONObject getBridgingBidderExtra() {
        return this.bridgingBidderExtra;
    }

    public String getCrid() {
        return this.crid;
    }

    public List<DTBAdSize> getDTBAds() {
        return new ArrayList(this.pricepoints.keySet());
    }

    public Map<String, List<String>> getDefaultDisplayAdsRequestCustomParams() {
        HashMap map = new HashMap();
        try {
            if (!this.isVideo) {
                if (this.pricepoints.size() > 0) {
                    map.put(DTBAdLoader.A9_BID_ID_KEY, Collections.singletonList(this.bidId));
                    map.put(getBidKey(), Collections.singletonList(this.bidId));
                    map.put(DTBAdLoader.A9_HOST_KEY, Collections.singletonList(resolvedHostName()));
                    Iterator<DtbPricePoint> it = this.pricepoints.get(getDTBAds().get(0)).iterator();
                    while (it.hasNext()) {
                        map.put(DTBAdLoader.A9_PRICE_POINTS_KEY, Collections.singletonList(it.next().getPricePoint()));
                    }
                }
                map.put(DTBAdLoader.APS_VIDEO_FLAG, Collections.singletonList(String.valueOf(this.isVideo)));
                map.putAll(getKvpDictionary());
                if (!DtbCommonUtils.isNullOrEmpty(AdRegistration.getAppKey())) {
                    map.put(DTBAdLoader.APS_VIDEO_APP_KEY, Collections.singletonList(AdRegistration.getAppKey()));
                }
            }
            return map;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getDefaultDisplayAdsRequestCustomParams method", e10);
            return map;
        }
    }

    public String getDefaultPricePoints() {
        try {
            if (getAdCount() == 0) {
                return null;
            }
            return getPricePoints(getDTBAds().get(0));
        } catch (IllegalArgumentException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getDefaultPricePoints method", e10);
            return null;
        }
    }

    public Map<String, String> getDefaultVideoAdsRequestCustomParams() {
        HashMap map = new HashMap();
        try {
            if (this.isVideo) {
                map.put(DTBAdLoader.A9_VID_KEY, this.bidId);
                map.put(DTBAdLoader.A9_HOST_KEY, resolvedHostName());
                Iterator<DtbPricePoint> it = this.pricepoints.get(getDTBAds().get(0)).iterator();
                while (it.hasNext()) {
                    map.put(DTBAdLoader.A9_PRICE_POINTS_KEY, it.next().getPricePoint());
                }
                for (Map.Entry<String, List<String>> entry : this.kvpDictionary.entrySet()) {
                    map.put(entry.getKey(), TextUtils.join(", ", entry.getValue()));
                }
                map.put(DTBAdLoader.APS_VIDEO_FLAG, String.valueOf(this.isVideo));
                map.put(DTBAdLoader.APS_VIDEO_SKIP_AFTER, String.valueOf(getVideoSkipAfterDurationInSeconds()));
                map.put(DTBAdLoader.APS_VIDEO_TYPE, getVideoInventoryType());
                if (!DtbCommonUtils.isNullOrEmpty(AdRegistration.getAppKey())) {
                    map.put(DTBAdLoader.APS_VIDEO_APP_KEY, AdRegistration.getAppKey());
                }
            }
            return map;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getDefaultVideoAdsRequestCustomParams method", e10);
            return map;
        }
    }

    @Deprecated
    public String getHost() {
        try {
            return DtbSharedPreferences.getInstance().getAaxHostname();
        } catch (IllegalArgumentException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getPricePoints method", e10);
            return null;
        }
    }

    public String getImpressionUrl() {
        return !ApsUtils.Companion.isNullOrEmpty(this.impressionUrl) ? this.impressionUrl : defaultImpressionUrl();
    }

    public Map<String, List<String>> getKvpDictionary() {
        return this.kvpDictionary;
    }

    @Deprecated
    public String getMoPubKeywords() {
        try {
            DtbLog.debug(LOG_TAG, "API 'getMoPubKeywords' supports banner & video Ads.");
            StringBuilder sb2 = new StringBuilder();
            Map<String, List<String>> defaultDisplayAdsRequestCustomParams = !this.isVideo ? getDefaultDisplayAdsRequestCustomParams() : getVideoAdsRequestCustomParamsAsList();
            if (this.pricepoints.size() > 0) {
                boolean z10 = true;
                for (Map.Entry<String, List<String>> entry : defaultDisplayAdsRequestCustomParams.entrySet()) {
                    for (String str : entry.getValue()) {
                        if (z10) {
                            z10 = false;
                        } else {
                            sb2.append(",");
                        }
                        sb2.append(entry.getKey());
                        sb2.append(":");
                        sb2.append(str);
                    }
                }
            }
            return sb2.toString();
        } catch (IllegalArgumentException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getMoPubKeywords method", e10);
            return "";
        }
    }

    @Deprecated
    public String getMoPubServerlessKeywords() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Map<String, List<String>> defaultDisplayAdsRequestCustomParams = getDefaultDisplayAdsRequestCustomParams();
            if (this.pricepoints.size() > 0 && defaultDisplayAdsRequestCustomParams.containsKey(DTBAdLoader.A9_PRICE_POINTS_KEY)) {
                List<String> list = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_PRICE_POINTS_KEY);
                if (list.size() > 0) {
                    sb2.append("amznslots:");
                    sb2.append(list.get(0));
                }
            }
            return sb2.toString();
        } catch (IllegalArgumentException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getMoPubServerlessKeywords method", e10);
            return "";
        }
    }

    public String getPricePoints(DTBAdSize dTBAdSize) {
        try {
            List<DtbPricePoint> list = this.pricepoints.get(dTBAdSize);
            if (list == null || list.isEmpty()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                sb2.append(list.get(i10).getPricePoint());
                if (i10 != list.size() - 1) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getPricePoints method", e10);
            return null;
        }
    }

    public Bundle getRenderingBundle() {
        Bundle bundle = this.renderingBundle;
        return bundle != null ? bundle : getRenderingBundle(false);
    }

    public HashMap<String, Object> getRenderingMap() {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("bid_html_template", SDKUtilities.getBidInfo(this));
            map.put("event_server_parameter", SDKUtilities.getPricePoint(this));
            map.put("amazon_ad_info", getAmazonInfo());
            map.put("bid_identifier", this.bidId);
            map.put("hostname_identifier", this.hostName);
            map.put("start_load_time", Long.valueOf(new Date().getTime()));
            if (!bidderRenderingFlowEnabled()) {
                return map;
            }
            map.put(DtbConstants.AMZN_SDK_BIDDER_ID_KEY, getBidder());
            map.put(DtbConstants.AMZN_BIDDER_REQUEST_KEY, getBridgingBidderExtra().toString());
            map.put(DtbConstants.AMZN_IMP_URL_KEY, getImpressionUrl());
            map.put("height", Integer.valueOf(SDKUtilities.getHeight(this)));
            map.put("width", Integer.valueOf(SDKUtilities.getWidth(this)));
            return map;
        } catch (IllegalArgumentException e10) {
            DtbLog.debug(LOG_TAG, "Fail to execute getRenderingMap method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getRenderingMap method", e10);
            return map;
        }
    }

    public Map<String, List<String>> getVideoAdsRequestCustomParamsAsList() {
        HashMap map = new HashMap();
        if (this.isVideo) {
            map.put(DTBAdLoader.A9_VID_KEY, Collections.singletonList(this.bidId));
            map.put(DTBAdLoader.A9_HOST_KEY, Collections.singletonList(resolvedHostName()));
            Iterator<DtbPricePoint> it = this.pricepoints.get(getDTBAds().get(0)).iterator();
            while (it.hasNext()) {
                map.put(DTBAdLoader.A9_PRICE_POINTS_KEY, Collections.singletonList(it.next().getPricePoint()));
            }
            map.put(DTBAdLoader.APS_VIDEO_FLAG, Collections.singletonList(String.valueOf(this.isVideo)));
            map.put(DTBAdLoader.APS_VIDEO_SKIP_AFTER, Collections.singletonList(String.valueOf(getVideoSkipAfterDurationInSeconds())));
            map.put(DTBAdLoader.APS_VIDEO_TYPE, Collections.singletonList(getVideoInventoryType()));
            if (!DtbCommonUtils.isNullOrEmpty(AdRegistration.getAppKey())) {
                map.put(DTBAdLoader.APS_VIDEO_APP_KEY, Collections.singletonList(AdRegistration.getAppKey()));
            }
            map.putAll(getKvpDictionary());
        }
        return map;
    }

    public String getVideoInventoryType() {
        return this.videoInventoryType;
    }

    public Integer getVideoSkipAfterDurationInSeconds() {
        return Integer.valueOf(this.videoSkipAfterDurationInSeconds);
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    public void putPricePoint(DtbPricePoint dtbPricePoint) {
        if (this.pricepoints.get(dtbPricePoint.getAdSize()) == null) {
            this.pricepoints.put(dtbPricePoint.getAdSize(), new ArrayList());
        }
        this.pricepoints.get(dtbPricePoint.getAdSize()).add(dtbPricePoint);
    }

    public String resolvedHostName() {
        List<String> list;
        String str;
        if (this.isVideo) {
            String str2 = this.hostName;
            if (str2 != null) {
                return str2;
            }
            try {
                return DtbSharedPreferences.getInstance().getAaxVideoHostName();
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to retrieve AaxVideoHostName from sharedPreferences", e10);
                return null;
            }
        }
        Map<String, List<String>> map = this.kvpDictionary;
        if (map != null && map.containsKey(AMZNH_PARAMETER_KEY) && (list = this.kvpDictionary.get(AMZNH_PARAMETER_KEY)) != null && !list.isEmpty() && (str = list.get(0)) != null && !str.trim().isEmpty()) {
            return str;
        }
        String str3 = this.hostName;
        if (str3 != null) {
            return str3;
        }
        try {
            return DtbSharedPreferences.getInstance().getAaxHostname();
        } catch (Exception e11) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to retrieve getAaxHostname from sharedPreferences", e11);
            return null;
        }
    }

    public void setAdLoader(DTBAdRequest dTBAdRequest) {
        this.refreshLoader = dTBAdRequest;
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setBidder(String str) {
        this.bidder = str;
    }

    public void setBridgingBidderExtra(JSONObject jSONObject) {
        this.bridgingBidderExtra = jSONObject;
    }

    public void setCrid(String str) {
        this.crid = str;
    }

    public void setHostName(String str) {
        this.hostName = str;
    }

    public void setImpressionUrl(String str) {
        this.impressionUrl = str;
    }

    public void setKvpDictionary(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (this.kvpDictionary.get(next) == null) {
                        this.kvpDictionary.put(next, new ArrayList());
                    }
                    this.kvpDictionary.get(next).add(jSONArray.getString(i10));
                }
            }
        }
    }

    public void setVideo(boolean z10) {
        this.isVideo = z10;
    }

    public void setVideoInventoryType(String str) {
        this.videoInventoryType = str;
    }

    public void setVideoSkipAfterDurationInSeconds(int i10) {
        this.videoSkipAfterDurationInSeconds = i10;
    }

    public Bundle getRenderingBundle(String str) {
        return getRenderingBundle(false, str);
    }

    public Bundle getRenderingBundle(boolean z10) {
        return getRenderingBundle(z10, null);
    }

    public DTBAdResponse(DTBAdResponse dTBAdResponse) {
        this.kvpDictionary = new HashMap();
        this.pricepoints = new HashMap();
        this.bidId = dTBAdResponse.bidId;
        this.isVideo = dTBAdResponse.isVideo;
        this.hostName = dTBAdResponse.hostName;
        this.kvpDictionary = dTBAdResponse.kvpDictionary;
        this.pricepoints = dTBAdResponse.pricepoints;
        this.impressionUrl = dTBAdResponse.impressionUrl;
        this.crid = dTBAdResponse.crid;
        this.refreshLoader = dTBAdResponse.refreshLoader;
        this.videoSkipAfterDurationInSeconds = dTBAdResponse.videoSkipAfterDurationInSeconds;
        this.videoInventoryType = dTBAdResponse.videoInventoryType;
        this.renderingBundle = dTBAdResponse.renderingBundle;
        this.extrasAsString = dTBAdResponse.extrasAsString;
        this.bridgingBidderExtra = dTBAdResponse.bridgingBidderExtra;
        this.bidder = dTBAdResponse.bidder;
    }

    public Bundle getRenderingBundle(boolean z10, String str) {
        Bundle bundleInitializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            bundleInitializeEmptyBundle.putString("bid_html_template", SDKUtilities.getBidInfo(this));
            bundleInitializeEmptyBundle.putString("bid_identifier", this.bidId);
            bundleInitializeEmptyBundle.putString("hostname_identifier", this.hostName);
            bundleInitializeEmptyBundle.putBoolean("video_flag", this.isVideo);
            bundleInitializeEmptyBundle.putString("event_server_parameter", SDKUtilities.getPricePoint(this));
            bundleInitializeEmptyBundle.putString("amazon_ad_info", getAmazonInfo());
            bundleInitializeEmptyBundle.putLong("start_load_time", new Date().getTime());
            if (bidderRenderingFlowEnabled()) {
                bundleInitializeEmptyBundle.putString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY, getBidder());
                bundleInitializeEmptyBundle.putString(DtbConstants.AMZN_BIDDER_REQUEST_KEY, getBridgingBidderExtra().toString());
                bundleInitializeEmptyBundle.putString(DtbConstants.AMZN_IMP_URL_KEY, getImpressionUrl());
                bundleInitializeEmptyBundle.putString("height", String.valueOf(SDKUtilities.getHeight(this)));
                bundleInitializeEmptyBundle.putString("width", String.valueOf(SDKUtilities.getWidth(this)));
            }
            if (z10) {
                bundleInitializeEmptyBundle.putInt("expected_width", SDKUtilities.getWidth(this));
                bundleInitializeEmptyBundle.putInt("expected_height", SDKUtilities.getHeight(this));
            }
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                bundleInitializeEmptyBundle.putString("amazon_request_queue", str);
            }
            return bundleInitializeEmptyBundle;
        } catch (IllegalArgumentException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getRenderingBundle method", e10);
            return bundleInitializeEmptyBundle;
        }
    }

    public DTBAdResponse(Bundle bundle) {
        this.kvpDictionary = new HashMap();
        this.pricepoints = new HashMap();
        this.renderingBundle = bundle;
    }

    public DTBAdResponse(String str) {
        this.kvpDictionary = new HashMap();
        this.pricepoints = new HashMap();
        this.extrasAsString = str;
    }
}
