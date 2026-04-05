package com.amazon.device.ads;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class SDKUtilities {
    public static final String BID_HTML_TEMPLATE = "<div style=\"display:inline-block\"><div id=\"__dtbAd__\" style=\"overflow:hidden;\"><!--Placeholder for the Ad --></div><script type=\"text/javascript\">amzn.dtb.loadAd(\"%s\", \"%s\", \"%s\", %s, {isv: %s, dc: \"%s\", skipafter: %s, vtype: \"%s\"});</script></div>";
    public static final String LOG_TAG = "SDKUtilities";
    public static String amznDebugStateFlag = "false";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SimpleSize {
        public int height;
        public int width;

        public SimpleSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public void setHeight(int i10) {
            this.height = i10;
        }

        public void setWidth(int i10) {
            this.width = i10;
        }
    }

    public static List<Object> convertJSONArrayToList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objConvertJSONObjectToMap = jSONArray.get(i10);
            if (objConvertJSONObjectToMap instanceof JSONArray) {
                objConvertJSONObjectToMap = convertJSONArrayToList((JSONArray) objConvertJSONObjectToMap);
            } else if (objConvertJSONObjectToMap instanceof JSONObject) {
                objConvertJSONObjectToMap = convertJSONObjectToMap((JSONObject) objConvertJSONObjectToMap);
            }
            arrayList.add(objConvertJSONObjectToMap);
        }
        return arrayList;
    }

    public static Map<String, Object> convertJSONObjectToMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                map.put(next, convertJSONObjectToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                map.put(next, convertJSONArrayToList((JSONArray) obj));
            } else {
                map.put(next, obj);
            }
        }
        return map;
    }

    public static String getBidInfo(DTBAdResponse dTBAdResponse) throws JSONException {
        Map<String, List<String>> defaultDisplayAdsRequestCustomParams;
        List<String> list;
        if (dTBAdResponse.bidderRenderingFlowEnabled()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(DtbConstants.AMZN_SDK_BIDDER_ID_KEY, dTBAdResponse.getBidder());
                jSONObject.put(DtbConstants.AMZN_BIDDER_REQUEST_KEY, dTBAdResponse.getBridgingBidderExtra());
                jSONObject.put(DtbConstants.AMZN_IMP_URL_KEY, dTBAdResponse.getImpressionUrl());
                jSONObject.put("width", getWidth(dTBAdResponse));
                jSONObject.put("height", getHeight(dTBAdResponse));
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Failed to parse rendering params", e10);
            }
            return jSONObject.toString();
        }
        try {
            if (dTBAdResponse.getDTBAds().size() == 0) {
                return "";
            }
            if (dTBAdResponse.isVideo()) {
                defaultDisplayAdsRequestCustomParams = dTBAdResponse.getVideoAdsRequestCustomParamsAsList();
                list = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_VID_KEY);
            } else {
                defaultDisplayAdsRequestCustomParams = dTBAdResponse.getDefaultDisplayAdsRequestCustomParams();
                list = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_BID_ID_KEY);
            }
            String str = !DtbCommonUtils.isNullOrEmpty(list) ? list.get(0) : "";
            List<String> list2 = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_HOST_KEY);
            String str2 = !DtbCommonUtils.isNullOrEmpty(list2) ? list2.get(0) : "";
            List<String> list3 = defaultDisplayAdsRequestCustomParams.get(DTBAdLoader.A9_PRICE_POINTS_KEY);
            String str3 = !DtbCommonUtils.isNullOrEmpty(list3) ? list3.get(0) : "";
            Map<String, List<String>> kvpDictionary = dTBAdResponse.getKvpDictionary();
            return String.format(DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, BID_HTML_TEMPLATE, DTBMetricsConfiguration.TEMPLATES_KEY_NAME), str3, str, str2, amznDebugStateFlag, Boolean.valueOf(dTBAdResponse.isVideo()), (!kvpDictionary.containsKey("dc") || kvpDictionary.get("dc").size() == 0) ? "" : kvpDictionary.get("dc").get(0), dTBAdResponse.getVideoSkipAfterDurationInSeconds(), !DtbCommonUtils.isNullOrEmpty(dTBAdResponse.getVideoInventoryType()) ? dTBAdResponse.getVideoInventoryType() : "");
        } catch (RuntimeException e11) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getBidInfo method", e11);
            return "";
        }
    }

    public static int getHeight(DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getDTBAds().size() == 0) {
            return -1;
        }
        return dTBAdResponse.getDTBAds().get(0).getHeight();
    }

    public static String getPricePoint(DTBAdResponse dTBAdResponse) {
        try {
            List<String> list = (dTBAdResponse.isVideo() ? dTBAdResponse.getVideoAdsRequestCustomParamsAsList() : dTBAdResponse.getDefaultDisplayAdsRequestCustomParams()).get(DTBAdLoader.A9_PRICE_POINTS_KEY);
            return (list == null || list.size() <= 0) ? "" : list.get(0);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getPricePoint method", e10);
            return "";
        }
    }

    public static int getWidth(DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getDTBAds().size() == 0) {
            return -1;
        }
        return dTBAdResponse.getDTBAds().get(0).getWidth();
    }

    @Deprecated
    public static boolean isEmulator() {
        try {
            String str = Build.FINGERPRINT;
            String str2 = Build.MODEL;
            String str3 = Build.MANUFACTURER;
            if (str.startsWith("generic") || str.startsWith("unknown") || str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || str3.contains("Genymotion")) {
                return true;
            }
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                return true;
            }
            return "google_sdk".equals(Build.PRODUCT);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isEmulator method", e10);
            return false;
        }
    }

    public static boolean isTelSupported() {
        try {
            if (AdRegistration.getContext().checkSelfPermission("android.permission.CALL_PHONE") != 0) {
                return false;
            }
            return ((TelephonyManager) AdRegistration.getContext().getSystemService("phone")).getPhoneType() != 0;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isTelSupported method", e10);
            return false;
        }
    }

    public static void setAmznDebugStateFlagValue(String str) {
        amznDebugStateFlag = str;
    }
}
