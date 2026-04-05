package com.amazon.aps.bidder.adapter;

import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbSharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsBidder {
    private static final String BIDDER_ADAPTER_CLASS_NAME_KEY = "apsBidderAdapterClass";
    private static final String LOG_TAG = "ApsBidder";
    private static final String PUB_BIDDER_ACCOUNT_ID_KEY = "accountId";
    private static final String SUPPORTED_BIDDER_KEY = "supportedBidders";
    private static HashMap<String, ApsBidderAdapter> adapterInstances;
    private static ApsBidder apsBidderInstance;
    private JSONObject bidderConfig = DtbSharedPreferences.getInstance().getSDKBTemplate();

    private ApsBidder() throws JSONException {
        adapterInstances = new HashMap<>();
        createAdapterInstance();
    }

    private void createAdapterInstance() throws JSONException {
        JSONObject jSONObject = this.bidderConfig;
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(SUPPORTED_BIDDER_KEY);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject2.getJSONObject(next).optString(BIDDER_ADAPTER_CLASS_NAME_KEY);
                if (DtbCommonUtils.isNullOrEmpty(strOptString) || !APSSharedUtil.isClassExistInPackage(strOptString)) {
                    ApsLog.d(LOG_TAG, "Bidder Adapter package not found: " + next);
                } else {
                    ApsBidderAdapter apsBidderAdapter = (ApsBidderAdapter) createInstance(strOptString);
                    if (apsBidderAdapter != null) {
                        apsBidderAdapter.setApsBidderAdapterParam(createAdapterParam(next));
                        adapterInstances.put(next, apsBidderAdapter);
                        ApsLog.d(LOG_TAG, "Adapter instance created for supported bidder : " + next);
                    }
                }
            }
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB:Error while creating Bidder Adapter instance", e10);
        }
    }

    private ApsBidderAdapterParam createAdapterParam(String str) throws JSONException {
        String string;
        try {
            string = this.bidderConfig.getJSONObject(SUPPORTED_BIDDER_KEY).getJSONObject(str).getString("accountId");
        } catch (Exception e10) {
            ApsLog.e(LOG_TAG, "AccountId Not found");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB: Invalid Account Id Format", e10);
            string = null;
        }
        return ApsBidderAdapterParam.builder().accountId(string).build();
    }

    private <T> T createInstance(String str) {
        try {
            return (T) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB:Error during bidder adapter initialization", e10);
            return null;
        }
    }

    public static synchronized ApsBidder getApsBidderInstance() {
        try {
            if (apsBidderInstance == null) {
                apsBidderInstance = new ApsBidder();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return apsBidderInstance;
    }

    public static void reset() {
        apsBidderInstance = null;
        adapterInstances = null;
    }

    public ApsBidderAdapter getAdapterInstance(String str) {
        return adapterInstances.get(str);
    }

    public Map<String, ApsBidderAdapter> getAllAdapterInstances() {
        return new HashMap(adapterInstances);
    }
}
