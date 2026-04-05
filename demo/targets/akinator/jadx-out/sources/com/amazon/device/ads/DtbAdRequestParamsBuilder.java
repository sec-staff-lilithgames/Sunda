package com.amazon.device.ads;

import android.content.Context;
import android.os.Build;
import androidx.browser.customtabs.v;
import b0.e2;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.model.ApsSlotInfoExtra;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.bidder.adapter.ApsBidderAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.ironsource.Q6;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbAdRequestParamsBuilder {
    public static final String bidderParamFormat = "{\"user\":{\"buyeruid\":\"%s\"}, \"imp\":[{\"displaymanager\":\"%s\",\"displaymanagerver\":\"%s\"}]}";
    public final String LOG_TAG = "DtbAdRequestParamsBuilder";
    public DTBAdNetworkInfo adNetworkInfo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.device.ads.DtbAdRequestParamsBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public DtbAdRequestParamsBuilder(DTBAdNetworkInfo dTBAdNetworkInfo) {
        this.adNetworkInfo = dTBAdNetworkInfo == null ? new DTBAdNetworkInfo(DTBAdNetwork.UNKNOWN) : dTBAdNetworkInfo;
    }

    private HashMap<String, Object> getCustomParams(Map<String, String> map) {
        HashMap<String, Object> map2 = new HashMap<>();
        if (map != null) {
            for (String str : map.keySet()) {
                map2.put(str, map.get(str));
            }
        }
        return map2;
    }

    private HashMap<String, Object> getSlotParams(List<DTBAdSize> list) throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 1;
            for (DTBAdSize dTBAdSize : list) {
                JSONObject jSONObject = new JSONObject();
                if (dTBAdSize.isInterstitialAd()) {
                    jSONObject.put("sz", "interstitial");
                } else {
                    jSONObject.put("sz", dTBAdSize.getWidth() + "x" + dTBAdSize.getHeight());
                }
                jSONObject.put("slot", dTBAdSize.getSlotUUID());
                int i11 = i10 + 1;
                jSONObject.put("slotId", i10);
                JSONArray jSONArray2 = new JSONArray();
                if (AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdType[dTBAdSize.getDTBAdType().ordinal()] != 1) {
                    jSONArray2.put(AdType.DISPLAY.toString());
                } else {
                    jSONArray2.put(AdType.VIDEO.toString());
                }
                jSONObject.put("supportedMediaTypes", jSONArray2);
                if (dTBAdSize.getPubSettings() != null) {
                    jSONObject.put("ps", dTBAdSize.getPubSettings());
                }
                if (dTBAdSize.getSlotInfoExtra() != null) {
                    if (dTBAdSize.getSlotInfoExtra().getPos() != ApsSlotInfoExtra.PosOption.NO_VALUE) {
                        jSONObject.put("pos", dTBAdSize.getSlotInfoExtra().getPos().getValue());
                    }
                    JSONObject videoSlotExtraJSON = dTBAdSize.getSlotInfoExtra().getVideoSlotExtraJSON();
                    if (videoSlotExtraJSON != null) {
                        jSONObject.put("video", videoSlotExtraJSON);
                    }
                }
                jSONArray.put(jSONObject);
                i10 = i11;
            }
            map.put("slots", jSONArray);
            return map;
        } catch (JSONException unused) {
            DtbLog.warn(this.LOG_TAG, "Error constructing slot parameters");
            return map;
        }
    }

    private String getValidSignal(ApsBidderAdapter apsBidderAdapter) {
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            String str = (String) apsBidderAdapter.getSignal().get("token");
            return DtbCommonUtils.isNullOrEmpty(str) ? "" : str;
        }
        ApsLog.d(this.LOG_TAG, "User Consent not granted");
        ApsMetrics.customEvent(((String) apsBidderAdapter.getSignal().get(DtbConstants.AMZN_BIDDER_NAME_KEY)) + "_TOKEN_P1_CONSENT", "NoConsent", null);
        return "";
    }

    public void addCurrentEnvironmentToCustomAtt() {
        Map map = new HashMap();
        if (AdRegistration.getCustomDictionary() != null) {
            map = AdRegistration.getCustomDictionary();
        }
        if (map.containsKey("framework")) {
            return;
        }
        AdRegistration.addCustomAttribute("framework", DtbCommonUtils.getSDKFramework());
    }

    public void addInAppNativeBrowserToCustomAtt(Context context) {
        if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.CUSTOM_TAB_FEATURE_ENABLED_FLAG, true)) {
            try {
                if (Build.VERSION.SDK_INT < 31 || !DtbCommonUtils.isClassAvailable("androidx.browser.customtabs.CustomTabsClient") || v.getPackageName(context, Collections.EMPTY_LIST) == null) {
                    return;
                }
                AdRegistration.addCustomAttribute("inAppNativeBrowser", Boolean.TRUE.toString());
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to set inAppNativeBrowser in Bid Request", e10);
            }
        }
    }

    public void addOmidPartnerNameAndPartnerVersionToBidRequest() {
        if (AdRegistration.getCustomDictionary() == null) {
            DtbLog.info(this.LOG_TAG, "Custom Dictionary Not found");
            return;
        }
        try {
            if (DtbCommonUtils.isNullOrEmpty(this.adNetworkInfo.getAdNetworkName()) || !DTBAdNetwork.valueOf(this.adNetworkInfo.getAdNetworkName()).isMediation()) {
                return;
            }
            AdRegistration.addCustomAttribute("omidPartnerName", DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.OM_SDK_CONFIGURABLE_PARTNER_KEY_NAME, DtbConstants.OM_SDK_DEFAULT_PARTNER_NAME, DTBMetricsConfiguration.OM_SDK_FEATURE_KEY_NAME));
            AdRegistration.addCustomAttribute("omidPartnerVersion", DtbCommonUtils.getSDKVersion());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to set OM SDK Partner Name and Version in Bid Request", e10);
        }
    }

    public HashMap<String, Object> getCommonParams(Context context) {
        HashMap<String, Object> mapS = e2.s("isDTBMobile", "true");
        mapS.put("appId", AdRegistration.getAppKey());
        mapS.put("adsdk", DtbCommonUtils.getSDKVersion());
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            mapS.put("idfa", idfa);
        }
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (optOut != null) {
            mapS.put("oo", Boolean.toString(optOut.booleanValue()));
        }
        JSONObject paramsJson = DtbDeviceData.getDeviceDataInstance().getParamsJson();
        if (paramsJson != null) {
            mapS.put("dinfo", paramsJson);
        }
        String userAgentString = DtbDeviceData.getDeviceDataInstance().getUserAgentString();
        if (userAgentString != null) {
            mapS.put(Q6.f35252d0, userAgentString);
        }
        mapS.put("pkg", DtbPackageNativeData.getPackageNativeDataInstance(context).getParamsJson());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            mapS.put("ad-id", adId);
        }
        if (AdRegistration.isTestMode()) {
            mapS.put("isTest", "true");
        }
        if (AdRegistration.isLocationEnabled()) {
            String locationParam = new DtbGeoLocation().getLocationParam();
            if (!DtbCommonUtils.isNullOrEmpty(locationParam)) {
                mapS.put("geoloc", locationParam);
            }
        }
        return mapS;
    }

    public HashMap<String, Object> getCustomAttributeParams(boolean z10, Context context) throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        JSONObject pJTemplate = DtbSharedPreferences.getInstance().getPJTemplate();
        JSONObject jSONObject = new JSONObject();
        addOmidPartnerNameAndPartnerVersionToBidRequest();
        addCurrentEnvironmentToCustomAtt();
        AdRegistration.addCustomAttribute("autoRefresh", String.valueOf(z10));
        addInAppNativeBrowserToCustomAtt(context);
        Iterator<String> itKeys = pJTemplate.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (pJTemplate.get(next) instanceof String) {
                    String str = AdRegistration.getCustomDictionary().get(pJTemplate.getString(next));
                    if (!DtbCommonUtils.isNullOrEmpty(str)) {
                        jSONObject.put(next, str);
                    }
                } else if (pJTemplate.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = pJTemplate.getJSONObject(next);
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject2.get(next2) instanceof String) {
                            String str2 = AdRegistration.getCustomDictionary().get(jSONObject2.getString(next2));
                            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                                jSONObject3.put(next2, str2);
                            }
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject.put(next, jSONObject3);
                    }
                }
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error when constructing custom attribute parameters", e10);
            }
        }
        if (!DtbCommonUtils.isNullOrEmpty(this.adNetworkInfo.getAdNetworkName())) {
            jSONObject.put(DtbConstants.MEDIATION_NAME, this.adNetworkInfo.getAdNetworkName());
        }
        if (jSONObject.length() > 0) {
            map.put(DTBAdRequest.PJ_KEY, jSONObject);
        }
        return map;
    }

    public HashMap<String, Object> getParams(Context context, List<DTBAdSize> list, Map<String, String> map, boolean z10) {
        HashMap<String, Object> map2 = new HashMap<>();
        map2.putAll(getCommonParams(context));
        map2.putAll(getSlotParams(list));
        map2.putAll(getCustomParams(map));
        map2.putAll(getCustomAttributeParams(z10, context));
        map2.putAll(getBidderParams());
        return map2;
    }

    public HashMap<String, Object> getBidderParams() throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        Map<String, ApsBidderAdapter> allAdapterInstances = ApsBidder.getApsBidderInstance().getAllAdapterInstances();
        if (DtbCommonUtils.isNullOrEmpty(allAdapterInstances)) {
            ApsLog.d(this.LOG_TAG, "No Bidder Adapter found");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ApsBidderAdapter> entry : allAdapterInstances.entrySet()) {
                String key = entry.getKey();
                ApsBidderAdapter value = entry.getValue();
                jSONObject.put(key, new JSONObject("{\"user\":{\"buyeruid\":\"" + getValidSignal(value) + KGUkpTlXZlJLy.YEtzzHsWlN + ((String) value.getSignal().get(DtbConstants.AMZN_BIDDER_NAME_KEY)) + "\",\"displaymanagerver\":\"" + value.getBidderSDKVersion() + "\"}]}"));
            }
            map.put(DtbConstants.AMZN_BIDDER_REQUEST_KEY, jSONObject);
            return map;
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Error during token collection from bidder Adapter", e10);
            return map;
        }
    }
}
