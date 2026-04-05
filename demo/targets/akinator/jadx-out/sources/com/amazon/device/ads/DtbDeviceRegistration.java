package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.core.app.NotificationCompat;
import b0.e2;
import bp.oM.DwaEpyvxz;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.ApsMigrationUtil;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.G5;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import j1.o2;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbDeviceRegistration {
    public static final String AAX_VIDEO_HOST_NAME_KEY = "aaxVideoHostname";
    public static final String CONFIG_OS_KEY = "os";
    public static final String CONFIG_OS_VERSION_KEY = "osVersion";
    public static final String CONFIG_PRIVACY_APPLICABLE = "privacyApplicable";
    public static final String CONFIG_PRIVACY_KEY = "privacy";
    public static final String CONFIG_SEGMENT_ID_KEY = "segmentId";
    public static final String LOG_TAG = "com.amazon.device.ads.DtbDeviceRegistration";
    public static String appId;
    public static int configSeq;
    public static DtbDeviceRegistration dtbDeviceRegistrationInstance;
    public final DtbMetrics metrics = new DtbMetrics();

    private HashMap<String, Object> buildSISParams(String str) {
        HashMap<String, Object> map = new HashMap<>(DtbDeviceData.getDeviceDataInstance().getDeviceParams());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            map.put(f.b.f38557c, adId);
        }
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            map.put("idfa", idfa);
        }
        map.put("oo", convertBooleanToFlag(optOut));
        if (str != null) {
            map.put("appId", str);
        }
        JSONObject paramsJson = DtbPackageNativeData.getPackageNativeDataInstance(AdRegistration.getContext()).getParamsJson();
        if (paramsJson != null) {
            map.put("pkg", paramsJson);
        }
        Context context = AdRegistration.getContext();
        if (context != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Object obj = defaultSharedPreferences.contains("IABTCF_gdprApplies") ? defaultSharedPreferences.getAll().get("IABTCF_gdprApplies") : null;
            String string = defaultSharedPreferences.getString("IABTCF_TCString", null);
            if (obj != null) {
                try {
                    if ((obj instanceof Integer) && (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0)) {
                        map.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, obj);
                    } else if (((obj instanceof String) && ((String) obj).equals("1")) || ((String) obj).equals("0")) {
                        map.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, obj);
                    } else {
                        DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                    }
                } catch (ClassCastException unused) {
                    DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                }
            }
            if (string != null) {
                map.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
            }
            if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_FLAG_GPP_PARAMS_TO_AIP_CALL)) {
                HashMap<String, Object> mapAddGPPParametersFromPreferences = DtbCommonUtils.addGPPParametersFromPreferences(defaultSharedPreferences);
                if (!DtbCommonUtils.isNullOrEmpty(mapAddGPPParametersFromPreferences)) {
                    map.putAll(mapAddGPPParametersFromPreferences);
                }
            }
        }
        String encodedNonIABString = AdRegistration.getEncodedNonIABString();
        if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABString)) {
            map.put("gdpr_custom", encodedNonIABString);
        }
        return map;
    }

    public static String convertBooleanToFlag(Boolean bool) {
        return (bool != null && bool.booleanValue()) ? "1" : "0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7 */
    private synchronized void initializeAds() {
        DtbMetric dtbMetric;
        DtbMetric dtbMetric2;
        JSONObject jSONObject;
        DtbMetric dtbMetric3 = "ad id failed registration: ";
        synchronized (this) {
            if (DtbCommonUtils.isOnMainThread()) {
                DtbLog.error(LOG_TAG, "Unable to fetch advertising identifier information on main thread.");
                return;
            }
            String appKey = AdRegistration.getAppKey();
            appId = appKey;
            if (DtbCommonUtils.isNullOrEmpty(appKey)) {
                DtbLog.error(LOG_TAG, "App id not available");
                return;
            }
            if (!DtbCommonUtils.isNetworkConnected()) {
                DtbLog.debug("Network is not available");
                return;
            }
            DtbDebugProperties.getInstance();
            registerConfig(appId);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = DtbSharedPreferences.getInstance().getSisLastCheckIn().longValue();
            if (DtbSharedPreferences.getInstance().getIsSisRegisterationSuccessful()) {
                long j10 = jCurrentTimeMillis - jLongValue;
                if (j10 <= 86400000) {
                    DtbLog.debug("SIS call not required, last registration duration:" + j10 + ", expiration:86400000");
                    return;
                }
            }
            new DtbAdvertisingInfo();
            boolean z10 = false;
            if (!ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed() && !DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_AIP_CALL_IF_NO_GDPR_CONSENT, false)) {
                ApsLog.d(LOG_TAG, "No AIP calls as the feature flag is off");
                return;
            }
            String sisEndpoint = DtbSharedPreferences.getInstance().getSisEndpoint();
            if (sisEndpoint.startsWith(AbstractJsonLexerKt.NULL)) {
                DtbLog.debug("SIS is not ready");
                return;
            }
            StringBuilder sb2 = new StringBuilder(DtbDebugProperties.getSISUrl(sisEndpoint));
            if (jLongValue == 0) {
                DtbLog.info(LOG_TAG, "Trying to register ad id..");
                sb2.append(DtbConstants.generatePath);
            } else {
                DtbLog.info(LOG_TAG, "Trying to update ad id..");
                sb2.append(DtbConstants.updatePath);
                z10 = true;
            }
            HashMap<String, Object> mapBuildSISParams = buildSISParams(appId);
            JSONObject jSONObject2 = null;
            try {
                try {
                    jSONObject = new JSONObject();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    jSONObject.put("api", z10 ? "update_dev_info" : "generate_did");
                    DtbHttpClient dtbHttpClient = new DtbHttpClient(sb2.toString());
                    dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                    dtbHttpClient.setParams(mapBuildSISParams);
                    dtbHttpClient.enableQueryParams();
                    DtbMetric dtbMetric4 = z10 ? DtbMetric.SIS_LATENCY_UPDATE_DEVICE_INFO : DtbMetric.SIS_LATENCY_REGISTER_EVENT;
                    this.metrics.startTimer(dtbMetric4);
                    dtbHttpClient.executePOST(DtbConstants.NETWORK_READ_TIMEOUT);
                    this.metrics.stopTimer(dtbMetric4);
                    if (DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                        DtbLog.debug("No response from sis call.");
                        throw new Exception("SIS Response is null");
                    }
                    JSONObject jSONObject3 = (JSONObject) new JSONTokener(dtbHttpClient.getResponse()).nextValue();
                    DtbSharedPreferences.getInstance().setIsSisRegisterationSuccessful(isRegistrationRequestSuccessful(jSONObject3));
                    if (DtbSharedPreferences.getInstance().getIsSisRegisterationSuccessful()) {
                        ApsMetrics.customEvent("sisApiSuccess", String.valueOf(DtbSharedPreferences.getInstance().isValidIdfaAvailable()), jSONObject);
                        if (dtbMetric4 != null) {
                            this.metrics.resetMetric(dtbMetric4);
                        }
                        pingSis(sisEndpoint, appId);
                        return;
                    }
                    DtbLog.info(LOG_TAG, "ad id failed registration: " + jSONObject3);
                    throw new Exception("ad id failed registration: ");
                } catch (JSONException e10) {
                    e = e10;
                    dtbMetric2 = null;
                    jSONObject2 = jSONObject;
                    DtbLog.error("JSON error parsing return from SIS: " + e.getMessage());
                    ApsMetrics.customEvent("sisApiFailed", String.valueOf(DtbSharedPreferences.getInstance().isValidIdfaAvailable()), jSONObject2);
                    if (dtbMetric2 != null) {
                        this.metrics.resetMetric(dtbMetric2);
                    }
                } catch (Exception e11) {
                    e = e11;
                    dtbMetric = null;
                    jSONObject2 = jSONObject;
                    DtbLog.error("Error registering device for ads:" + e);
                    ApsMetrics.customEvent("sisApiFailed", String.valueOf(DtbSharedPreferences.getInstance().isValidIdfaAvailable()), jSONObject2);
                    if (dtbMetric != null) {
                        this.metrics.resetMetric(dtbMetric);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dtbMetric3 = 0;
                    jSONObject2 = jSONObject;
                    ApsMetrics.customEvent("sisApiFailed", String.valueOf(DtbSharedPreferences.getInstance().isValidIdfaAvailable()), jSONObject2);
                    if (dtbMetric3 != 0) {
                        this.metrics.resetMetric(dtbMetric3);
                    }
                    throw th;
                }
            } catch (JSONException e12) {
                e = e12;
                dtbMetric2 = null;
            } catch (Exception e13) {
                e = e13;
                dtbMetric = null;
            } catch (Throwable th4) {
                th = th4;
                dtbMetric3 = 0;
            }
        }
    }

    private boolean isPingRequestSuccessful(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("rcode")) {
            return false;
        }
        if (jSONObject.getInt("rcode") == 1) {
            DtbSharedPreferences.getInstance().saveSisLastPing(System.currentTimeMillis());
            DtbLog.info(LOG_TAG, "ad id is registered or updated successfully.");
            return true;
        }
        if (jSONObject.getInt("rcode") != 103 && (jSONObject.getInt("rcode") != 101 || !jSONObject.has(NotificationCompat.CATEGORY_MESSAGE) || jSONObject.getInt(NotificationCompat.CATEGORY_MESSAGE) != 103)) {
            return false;
        }
        DtbSharedPreferences.getInstance().saveSisLastPing(System.currentTimeMillis());
        DtbLog.info("gdpr consent not granted");
        return true;
    }

    private boolean isRegistrationRequestSuccessful(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("rcode")) {
            return false;
        }
        DtbSharedPreferences.getInstance().saveSisLastCheckIn(System.currentTimeMillis());
        if (jSONObject.getInt("rcode") == 1 && jSONObject.has(f.b.f38557c)) {
            String string = jSONObject.getString(f.b.f38557c);
            if (jSONObject.has("idChanged") && jSONObject.getBoolean("idChanged")) {
                DtbLog.info(LOG_TAG, "ad id has changed, updating..");
                this.metrics.incrementMetric(DtbMetric.SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED);
            }
            DtbSharedPreferences.getInstance().saveAdId(string);
            DtbLog.info(LOG_TAG, "ad id is registered or updated successfully.");
            return true;
        }
        if (jSONObject.getInt("rcode") != 103) {
            if (jSONObject.getInt("rcode") != 101 || !jSONObject.has(NotificationCompat.CATEGORY_MESSAGE)) {
                return false;
            }
            if (jSONObject.optInt(NotificationCompat.CATEGORY_MESSAGE) != 103 && !"need at least one native id in parameter".equals(jSONObject.get(NotificationCompat.CATEGORY_MESSAGE))) {
                return false;
            }
        }
        DtbSharedPreferences.getInstance().removeAdid();
        DtbLog.debug(LOG_TAG, "No ad-id returned");
        return true;
    }

    public static /* synthetic */ void lambda$verifyRegistration$0() {
        dtbDeviceRegistrationInstance.initializeAds();
        ApsMigrationUtil.setApsRemoteConfigInProgress(false);
    }

    private void loadApsMetricsConfig() {
        ApsMetrics.Companion companion = ApsMetrics.Companion;
        companion.setEndpointUrl(DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.APSMETRICS_LEVEL1_KEY, DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY, "url", ApsMetrics.METRICS_DEFAULT_ENDPOINT_URL));
        companion.setSamplingPercentage(DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.APSMETRICS_LEVEL1_KEY, DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY, DTBMetricsConfiguration.APSMETRICS_SAMPLING_RATE, 0.1d).doubleValue());
        companion.setApiKey(DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.APSMETRICS_LEVEL1_KEY, DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY, DTBMetricsConfiguration.APSMETRICS_APIKEY, ApsMetrics.METRICS_DEFAULT_METRICS_API_KEY));
    }

    private boolean parseRegisterConfigResponse(String str, long j10, boolean z10) throws Exception {
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (jSONObject.has(CONFIG_PRIVACY_APPLICABLE)) {
            Object obj = jSONObject.get(CONFIG_PRIVACY_APPLICABLE);
            if (obj instanceof JSONArray) {
                ApsPrivacyManager.INSTANCE.setGdprConfiguration((JSONArray) obj);
            }
        }
        if (jSONObject.has(DTBAdRequest.PJ_KEY)) {
            DtbSharedPreferences.getInstance().savePJTemplate(jSONObject.getJSONObject(DTBAdRequest.PJ_KEY));
        } else {
            DtbSharedPreferences.getInstance().removePJTemplate();
        }
        if (jSONObject.has(CONFIG_PRIVACY_KEY)) {
            setPrivacyConfigToSharedPreferences(jSONObject.getJSONArray(CONFIG_PRIVACY_KEY));
        } else {
            DtbSharedPreferences.getInstance().removePrivacyLocationConfig();
        }
        DTBMetricsConfiguration.processMetricsConfigFromResponse(jSONObject);
        if (!jSONObject.has(DtbDebugProperties.AAX_HOSTNAME) && !jSONObject.has("sisURL") && !jSONObject.has(AAX_VIDEO_HOST_NAME_KEY)) {
            DtbLog.info(LOG_TAG, "ad configuration failed load: " + jSONObject);
            throw new Exception("ad configuration failed load");
        }
        if (jSONObject.has(DtbDebugProperties.AAX_HOSTNAME)) {
            DtbSharedPreferences.getInstance().saveAaxHostname(jSONObject.getString(DtbDebugProperties.AAX_HOSTNAME));
        }
        if (jSONObject.has("sisURL")) {
            z10 = DtbSharedPreferences.getInstance().saveSisEndpoint(jSONObject.getString("sisURL"));
        }
        if (jSONObject.has("ttl")) {
            DtbSharedPreferences.getInstance().saveConfigTtlInMilliSeconds(Long.parseLong(jSONObject.getString("ttl")));
        }
        if (jSONObject.has(AAX_VIDEO_HOST_NAME_KEY)) {
            DtbSharedPreferences.getInstance().saveAaxVideoHostname(jSONObject.getString(AAX_VIDEO_HOST_NAME_KEY));
        }
        if (jSONObject.has("bidTimeout")) {
            DtbSharedPreferences.getInstance().saveBidTimeout(Integer.valueOf(jSONObject.getInt("bidTimeout")));
        } else {
            DtbSharedPreferences.getInstance().removeBidTimeout();
        }
        if (jSONObject.has(DtbConstants.AMZN_BIDDER_REQUEST_KEY)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(DtbConstants.AMZN_BIDDER_REQUEST_KEY);
            if (DtbCommonUtils.isNullOrEmpty(DtbSharedPreferences.getInstance().getSDKBTemplate()) || !jSONObject2.toString().equals(DtbSharedPreferences.getInstance().getSDKBTemplate().toString())) {
                ApsBidder.reset();
                DtbSharedPreferences.getInstance().saveSDKBTemplate(jSONObject2);
            }
        } else {
            DtbSharedPreferences.getInstance().removeSdKBTemplate();
            ApsBidder.reset();
        }
        DtbSharedPreferences.getInstance().saveConfigLastCheckIn(j10);
        DtbLog.info(LOG_TAG, "ad configuration loaded successfully.");
        return z10;
    }

    private boolean registerConfig(String str) {
        DtbMetric dtbMetric;
        configSeq++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = jCurrentTimeMillis - DtbSharedPreferences.getInstance().getConfigLastCheckIn().longValue();
        long configTtlInMilliSeconds = DtbSharedPreferences.getInstance().getConfigTtlInMilliSeconds();
        StringBuilder sbR = e2.r(jLongValue, "Config last check in duration: ", ", Expiration: ");
        sbR.append(configTtlInMilliSeconds);
        DtbLog.debug(sbR.toString());
        if (!DTBMetricsConfiguration.getInstance().isFeatureEnabled(DtbConstants.CONFIG_CHECK_IN_TTL_FEATURE)) {
            configTtlInMilliSeconds = DtbConstants.DEFAULT_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS;
        }
        boolean registerConfigResponse = false;
        if (jLongValue <= configTtlInMilliSeconds) {
            DtbLog.debug("No config refresh required");
            return false;
        }
        if (!DtbCommonUtils.isNetworkConnected()) {
            DtbLog.debug("Network is not available");
            return false;
        }
        DtbHttpClient dtbHttpClient = new DtbHttpClient(o2.o(new StringBuilder(), DtbDebugProperties.getConfigHostName(DtbConstants.DTB_CONFIG_ENDPOINT), DtbConstants.DTB_CONFIG_PATH));
        dtbHttpClient.addHeader("Accept", G5.L);
        for (Map.Entry<String, String> entry : DtbDebugProperties.getConfigRequestHeaders("{}").entrySet()) {
            dtbHttpClient.addHeader(entry.getKey(), entry.getValue());
        }
        dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
        dtbHttpClient.setParams(buildConfigInfoParams(str));
        try {
            try {
                DtbMetrics dtbMetrics = this.metrics;
                dtbMetric = DtbMetric.CONFIG_DOWNLOAD_LATENCY;
                dtbMetrics.startTimer(dtbMetric);
                dtbHttpClient.executeGET(DtbConstants.NETWORK_READ_TIMEOUT);
                this.metrics.stopTimer(dtbMetric);
            } catch (Exception e10) {
                DtbLog.error("Error fetching DTB config: " + e10);
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error fetching DTB config:", e10);
                ApsMetrics.customEvent("remoteConfigFetchFailed", String.valueOf(configSeq), null);
                DtbMetrics dtbMetrics2 = this.metrics;
                if (dtbMetrics2 != null) {
                    dtbMetrics2.resetMetric(DtbMetric.CONFIG_DOWNLOAD_LATENCY);
                }
            }
            if (DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                throw new Exception("Config Response is null");
            }
            registerConfigResponse = parseRegisterConfigResponse(dtbHttpClient.getResponse(), jCurrentTimeMillis, false);
            ApsMetrics.customEvent("remoteConfigFetchSuccess", String.valueOf(configSeq), null);
            AdRegistration.initBidderSDK();
            DtbMetrics dtbMetrics3 = this.metrics;
            if (dtbMetrics3 != null) {
                dtbMetrics3.resetMetric(dtbMetric);
            }
            try {
                DTBMetricsConfiguration.getInstance().loadMobileClientConfig();
                double dIntValue = DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.SAMPLING_RATE_ANALYTICS_KEY_NAME, DTBMetricsConfiguration.ANALYTIC_PIXEL_DEFAULT_VALUE.intValue(), DTBMetricsConfiguration.ANALYTICS_KEY_NAME).intValue() / 100.0f;
                String clientConfigVal = DTBMetricsConfiguration.getClientConfigVal("url", "", DTBMetricsConfiguration.ANALYTICS_KEY_NAME);
                String clientConfigVal2 = DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.API_KEY_ANALYTICS_KEY_NAME, "", DTBMetricsConfiguration.ANALYTICS_KEY_NAME);
                if (!APSAnalytics.isInitialized()) {
                    APSAnalytics.init(AdRegistration.getContext());
                    APSAnalytics.setVersion(AdRegistration.getVersion());
                }
                APSAnalytics.setSamplingRate((int) dIntValue);
                APSAnalytics.setHttpUrl(clientConfigVal);
                APSAnalytics.setApiKey(clientConfigVal2);
                loadApsMetricsConfig();
            } catch (RuntimeException e11) {
                DtbLog.warn("Error when reading client config file for APSAndroidShared library" + e11);
            }
            return registerConfigResponse;
        } catch (Throwable th2) {
            DtbMetrics dtbMetrics4 = this.metrics;
            if (dtbMetrics4 != null) {
                dtbMetrics4.resetMetric(DtbMetric.CONFIG_DOWNLOAD_LATENCY);
            }
            throw th2;
        }
    }

    private void setPrivacyConfigToSharedPreferences(JSONArray jSONArray) throws JSONException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject.has(DtbConstants.PRIVACY_LOCATION_KEY)) {
                    DtbSharedPreferences.getInstance().savePrivacyLocationConfig(jSONObject.getJSONObject(DtbConstants.PRIVACY_LOCATION_KEY));
                    return;
                }
            } catch (RuntimeException e10) {
                e = e10;
                DtbLog.error(LOG_TAG, "Failed to parse privacy configuration");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to parse privacy configuration", e);
                return;
            } catch (JSONException e11) {
                e = e11;
                DtbLog.error(LOG_TAG, "Failed to parse privacy configuration");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to parse privacy configuration", e);
                return;
            }
        }
        DtbSharedPreferences.getInstance().removePrivacyLocationConfig();
    }

    public static synchronized void verifyRegistration() {
        try {
            if (dtbDeviceRegistrationInstance == null) {
                dtbDeviceRegistrationInstance = new DtbDeviceRegistration();
                ApsMigrationUtil.setApsRemoteConfigInProgress(false);
            }
            if (!ApsMigrationUtil.isApsRemoteConfigInProgress()) {
                ApsMigrationUtil.setApsRemoteConfigInProgress(true);
                DtbThreadService.getInstance().execute(new al.b(2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private HashMap<String, Object> buildConfigInfoParams(String str) {
        HashMap<String, Object> mapS = e2.s("appId", str);
        mapS.put(PcrIk.gXnJMneNRJXMxRI, DtbCommonUtils.getSDKVersion());
        mapS.put("fp", "false");
        mapS.put("testMode", Boolean.toString(AdRegistration.isTestMode()));
        JSONObject paramsJsonGetSafe = DtbDeviceData.getDeviceDataInstance().getParamsJsonGetSafe();
        if (paramsJsonGetSafe != null) {
            mapS.put("dinfo", paramsJsonGetSafe);
        }
        JSONObject paramsJson = DtbPackageNativeData.getPackageNativeDataInstance(AdRegistration.getContext()).getParamsJson();
        if (paramsJson != null) {
            mapS.put("pkg", paramsJson);
        }
        if (AdRegistration.getCustomDictionary() != null && AdRegistration.getCustomDictionary().containsKey(DtbConstants.MEDIATION_NAME)) {
            String str2 = AdRegistration.getCustomDictionary().get(DtbConstants.MEDIATION_NAME);
            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                mapS.put(DtbConstants.MEDIATION_NAME, str2);
            }
        }
        if (Math.random() <= DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.DISTRIBUTION_PIXEL_SAMPLE_RATE_KEY_NAME, DTBMetricsConfiguration.DISTRIBUTION_PIXEL_DEFAULT_VALUE.intValue(), DTBMetricsConfiguration.SAMPLE_RATES_KEY_NAME).intValue() / 100.0f) {
            String sDKDistributionPlace = AdRegistration.getSDKDistributionPlace();
            if (!DtbCommonUtils.isNullOrEmpty(sDKDistributionPlace)) {
                mapS.put(DtbConstants.SDK_DISTRIBUTION_KEY_NAME, sDKDistributionPlace);
            }
        }
        mapS.put(CONFIG_SEGMENT_ID_KEY, Integer.valueOf(new SecureRandom().nextInt(1000) + 1));
        mapS.put("os", "android");
        mapS.put("osVersion", Build.VERSION.RELEASE);
        return mapS;
    }

    private void pingSis(String str, String str2) throws Exception {
        if (System.currentTimeMillis() - DtbSharedPreferences.getInstance().getSisLastPing() < DtbConstants.SIS_PING_INTERVAL) {
            return;
        }
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId == null || adId.isEmpty()) {
            DtbLog.info("error retrieving ad id, cancelling sis ping");
            return;
        }
        try {
            if (!DtbCommonUtils.isNetworkConnected()) {
                DtbLog.debug(VPCjETNfjxu.RkatwtthsAITQZ);
                return;
            }
            DtbHttpClient dtbHttpClient = new DtbHttpClient(str + DtbConstants.pingPath);
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            HashMap<String, Object> map = new HashMap<>();
            map.put("appId", str2);
            map.put(f.b.f38557c, adId);
            Context context = AdRegistration.getContext();
            if (context != null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                Object obj = defaultSharedPreferences.contains("IABTCF_gdprApplies") ? defaultSharedPreferences.getAll().get("IABTCF_gdprApplies") : null;
                String string = defaultSharedPreferences.getString("IABTCF_TCString", null);
                if (obj != null) {
                    try {
                        if ((obj instanceof Integer) && (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0)) {
                            map.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, obj);
                        } else if (((obj instanceof String) && ((String) obj).equals("1")) || ((String) obj).equals("0")) {
                            map.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, obj);
                        } else {
                            DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                        }
                    } catch (ClassCastException unused) {
                        DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                    }
                }
                if (string != null) {
                    map.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
                }
                if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_FLAG_GPP_PARAMS_TO_AIP_CALL)) {
                    HashMap<String, Object> mapAddGPPParametersFromPreferences = DtbCommonUtils.addGPPParametersFromPreferences(defaultSharedPreferences);
                    if (!DtbCommonUtils.isNullOrEmpty(mapAddGPPParametersFromPreferences)) {
                        map.putAll(mapAddGPPParametersFromPreferences);
                    }
                }
            }
            String encodedNonIABString = AdRegistration.getEncodedNonIABString();
            if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABString)) {
                map.put("gdpr_custom", encodedNonIABString);
            }
            dtbHttpClient.setParams(map);
            dtbHttpClient.executeGET(DtbConstants.NETWORK_READ_TIMEOUT);
            if (DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                DtbLog.debug("No response from sis ping.");
                throw new Exception(DwaEpyvxz.trkazgSN);
            }
            JSONObject jSONObject = (JSONObject) new JSONTokener(dtbHttpClient.getResponse()).nextValue();
            if (isPingRequestSuccessful(jSONObject)) {
                return;
            }
            DtbLog.info(LOG_TAG, "sis ping failed failed registration: " + jSONObject);
            throw new Exception("sis ping failed registration: ");
        } catch (Exception e10) {
            DtbLog.error("Error pinging sis: " + e10);
        }
    }
}
