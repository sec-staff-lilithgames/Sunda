package com.amazon.device.ads;

import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsConfigOverride;
import com.ironsource.C3227g4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBMetricsConfiguration {
    public static final String ANALYTICS_KEY_NAME = "analytics";
    public static final String API_KEY_ANALYTICS_KEY_NAME = "api_key";
    public static final String APSMETRICS_APIKEY = "apiKey";
    public static final String APSMETRICS_LEVEL1_KEY = "apsmetricsv2";
    public static final String APSMETRICS_LEVEL2_KEY = "mobile";
    public static final String APSMETRICS_SAMPLING_RATE = "samplingPercentage";
    public static final String APSMETRICS_URL = "url";
    public static final String CONFIG_DIR = "config";
    public static final String CONFIG_WITH_JSON = "aps_mobile_client_config.json";
    public static final String CREATIVE_TEMPLATES_KEY_NAME = "creative";
    public static final String CUSTOM_TAB_FEATURE_ENABLED_FLAG = "custom_tab_feature_enabled_flag";
    public static final boolean DEFAULT_AIP_CALL_IF_NO_GDPR_CONSENT = false;
    public static final String DISTRIBUTION_PIXEL_SAMPLE_RATE_KEY_NAME = "distribution_pixel";
    public static final String FEATURE_AD_FORMAT_FROM_AAX = "ad_format_from_bid_response";
    public static final String FEATURE_AIP_CALL_IF_NO_GDPR_CONSENT = "aip_if_no_gdpr_consent";
    public static final String FEATURE_APSMETRICS_EXTENDED_METRICS = "apsmetrics_extended_metrics";
    public static final String FEATURE_CLEAR_AAX_HOST_NAME_FROM_SHARED_PREF = "clear_aaxHostName";
    public static final String FEATURE_CONFIG_IN_INIT = "config_in_init";
    public static final String FEATURE_ENABLE_APS_BID_FLAG = "enable_aps_bid_flag";
    public static final String FEATURE_ENABLE_DEFAULT_AD_SIZE = "enable_default_ad_size_to_bid_request";
    public static final String FEATURE_FLAG = "feature_toggle";
    public static final String FEATURE_FLAG_GPP_PARAMS_TO_AIP_CALL = "enable_gpp_params_to_aip_call";
    public static final String LOG_TAG = "DTBMetricsConfiguration";
    public static final String METRICS_CONFIG_KEY = "metricsConfig";
    public static final String METRICS_CONFIG_OVERRIDE_PREF_KEY = "aps_metrics_config_override";
    public static final String OM_SDK_CONFIGURABLE_PARTNER_KEY_NAME = "partner_name";
    public static final String OM_SDK_DENIED_VERSION_KEY_NAME = "denied_version_list";
    public static final String OM_SDK_FEATURE_ENABLE_KEY_NAME = "feature_enabled";
    public static final String OM_SDK_FEATURE_KEY_NAME = "om_sdk_feature";
    public static final String SAMPLE_RATES_KEY_NAME = "sample_rates";
    public static final String SAMPLING_RATE_ANALYTICS_KEY_NAME = "sampling_rate";
    public static final String SPP_FLAG_DEFAULT_VALUE = "leq";
    public static final String SPP_FLAG_KEY_NAME = "spp_flag";
    public static final String TEMPLATES_KEY_NAME = "templates";
    public static final String URL_ANALYTICS_KEY_NAME = "url";
    public static final String WRAPPING_PIXEL_SAMPLE_RATE_KEY_NAME = "wrapping_pixel";
    public static DTBMetricsConfiguration theInstance;
    public JSONObject configuration = new JSONObject();
    public static final Integer WRAPPING_PIXEL_DEFAULT_VALUE = -1;
    public static final Integer DISTRIBUTION_PIXEL_DEFAULT_VALUE = 1;
    public static final Integer ANALYTIC_PIXEL_DEFAULT_VALUE = 1;
    public static int configSeq = 0;

    public DTBMetricsConfiguration() {
        loadMobileClientConfig();
    }

    public static void clearMetricsConfigOverride() {
        DtbSharedPreferences.getInstance().removeMetricsConfigOverride();
        ApsMetrics.setMetricsConfigOverride(null);
    }

    public static Integer getAnalyticsParams(String str, int i10) {
        try {
            JSONObject configParams = getInstance().getConfigParams(ANALYTICS_KEY_NAME);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        return Integer.valueOf(configParams.getInt(str));
                    }
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get sample rates for " + str + " from configuration. Using default value");
                }
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSampleRateForPixel method", e10);
        }
        return Integer.valueOf(i10);
    }

    public static Double getClientConfigVal(String str, String str2, String str3, double d10) throws JSONException {
        try {
            JSONObject jSONObject = getInstance().getConfigParams(str).getJSONObject(str2);
            if (jSONObject != null && jSONObject.has(str3)) {
                return Double.valueOf(jSONObject.getDouble(str3));
            }
        } catch (RuntimeException | JSONException e10) {
            String str4 = LOG_TAG;
            StringBuilder sbB = b3.h.b("Error reading the int config value ", str, " : ", str2, " : ");
            sbB.append(str3);
            sbB.append(" - ");
            sbB.append(e10);
            ApsLog.d(str4, sbB.toString());
        }
        return Double.valueOf(d10);
    }

    private JSONObject getConfigParams(String str) {
        if (!this.configuration.has(str)) {
            return null;
        }
        try {
            return this.configuration.getJSONObject(str);
        } catch (JSONException unused) {
            DtbLog.error("Unable to get" + str + "from configuration");
            return null;
        }
    }

    public static List<String> getDeniedOmSdkVersionList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject configParams = getInstance().getConfigParams(OM_SDK_FEATURE_KEY_NAME);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        JSONArray jSONArray = configParams.getJSONArray(str);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            Object obj = jSONArray.get(i10);
                            if (obj instanceof String) {
                                arrayList.add(obj.toString());
                            }
                        }
                    }
                } catch (JSONException e10) {
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getOMSDKVersionList method", e10);
                }
            }
        } catch (RuntimeException e11) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getOMSDKVersionList method", e11);
        }
        return arrayList;
    }

    public static synchronized DTBMetricsConfiguration getInstance() {
        try {
            if (theInstance == null) {
                theInstance = new DTBMetricsConfiguration();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return theInstance;
    }

    public static ApsMetricsConfigOverride getMetricsConfigOverride() {
        try {
            String metricsConfigOverride = DtbSharedPreferences.getInstance().getMetricsConfigOverride();
            if (metricsConfigOverride != null) {
                return ApsMetricsConfigOverride.fromJsonObject(new JSONObject(metricsConfigOverride));
            }
            return null;
        } catch (Exception e10) {
            ApsLog.e(LOG_TAG, "Failed to retrieve metrics config override: " + e10.getMessage());
            return null;
        }
    }

    private String getWorkingDirContent() throws IOException {
        return DTBAdUtil.loadFile(CONFIG_WITH_JSON, CONFIG_DIR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadConfigurationFromWeb, reason: merged with bridge method [inline-methods] */
    public void lambda$loadMobileClientConfig$0() {
        try {
            DtbHttpClient dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost(CONFIG_WITH_JSON) + CONFIG_WITH_JSON);
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            dtbHttpClient.executeGET(DtbConstants.NETWORK_READ_TIMEOUT);
            if (dtbHttpClient.getResponseCode() != 200) {
                throw new RuntimeException("resource aps_mobile_client_config.json not available");
            }
            String response = dtbHttpClient.getResponse();
            if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
                File filesDir = AdRegistration.getContext().getFilesDir();
                File fileCreateTempFile = createTempFile(filesDir);
                storeTempFile(fileCreateTempFile, response);
                File file = new File(filesDir.getAbsolutePath() + "/config/aps_mobile_client_config.json");
                if (file.exists()) {
                    file.delete();
                }
                if (!fileCreateTempFile.renameTo(file)) {
                    DtbLog.error("Rename failed");
                }
            }
            loadConfiguration(response);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error loading the configuration from web", e10);
        }
    }

    public static void processMetricsConfigFromResponse(JSONObject jSONObject) {
        try {
            if (jSONObject.has(METRICS_CONFIG_KEY)) {
                saveMetricsConfigOverride(jSONObject.getJSONObject(METRICS_CONFIG_KEY));
                DtbLog.info(LOG_TAG, "Stored metrics config override from /getConfig response");
            } else {
                clearMetricsConfigOverride();
                DtbLog.info(LOG_TAG, "No metricsConfig in /getConfig response, cleared override");
            }
        } catch (Exception e10) {
            DtbLog.error(LOG_TAG, "Failed to process metrics config from response: " + e10.getMessage());
        }
    }

    public static void saveMetricsConfigOverride(JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                clearMetricsConfigOverride();
                return;
            }
            ApsMetricsConfigOverride apsMetricsConfigOverride = new ApsMetricsConfigOverride(jSONObject);
            DtbSharedPreferences.getInstance().saveMetricsConfigOverride(apsMetricsConfigOverride);
            ApsMetrics.setMetricsConfigOverride(apsMetricsConfigOverride);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to save metrics config override", e10);
        }
    }

    public File createTempFile(File file) {
        try {
            return File.createTempFile(C3227g4.D, "json", file);
        } catch (Exception unused) {
            ApsLog.e(LOG_TAG, "Error creating the temporary file");
            return null;
        }
    }

    public String getConfigVal(String str) {
        if (!this.configuration.has(str)) {
            return null;
        }
        try {
            return this.configuration.getString(str);
        } catch (JSONException unused) {
            DtbLog.error("Unable to get" + str + "from configuration");
            return null;
        }
    }

    public boolean isFeatureEnabled(String str, boolean z10) throws JSONException {
        JSONObject jSONObject = this.configuration;
        if (jSONObject != null && jSONObject.has(FEATURE_FLAG)) {
            try {
                JSONObject jSONObject2 = this.configuration.getJSONObject(FEATURE_FLAG);
                if (jSONObject2.has(str)) {
                    return jSONObject2.getBoolean(str);
                }
            } catch (JSONException unused) {
                DtbLog.error("Unable to get feature flag from configuration");
            }
        }
        return z10;
    }

    public synchronized boolean isTypeEnabled(String str) {
        JSONObject jSONObject = this.configuration;
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metrics");
                if (jSONObject2.has(str)) {
                    return jSONObject2.getBoolean(str);
                }
            } catch (JSONException unused) {
                DtbLog.error("Unable to get metrics from configuration");
            }
        }
        return false;
    }

    public void loadConfiguration() {
        loadConfiguration(null);
    }

    public void loadMobileClientConfig() {
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            DTBAdUtil.createDirIfDoesNotExist(CONFIG_DIR);
        }
        loadConfiguration();
        DtbThreadService.getInstance().execute(new l(this, 2));
    }

    public boolean storeTempFile(File file, String str) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
            return true;
        } catch (Exception unused) {
            ApsLog.e(LOG_TAG, "Error creating the temporary file");
            return false;
        }
    }

    public synchronized void loadConfiguration(String str) {
        try {
            configSeq++;
            if (str == null) {
                try {
                    if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
                        str = getWorkingDirContent();
                    }
                } catch (IOException e10) {
                    e = e10;
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error loading the configuration from assets", e);
                    ApsMetrics.customEvent("remoteJsonFetchFailed", String.valueOf(configSeq), null);
                } catch (RuntimeException e11) {
                    e = e11;
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error loading the configuration from assets", e);
                    ApsMetrics.customEvent("remoteJsonFetchFailed", String.valueOf(configSeq), null);
                } catch (JSONException e12) {
                    e = e12;
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error loading the configuration from assets", e);
                    ApsMetrics.customEvent("remoteJsonFetchFailed", String.valueOf(configSeq), null);
                }
            }
            if (str == null) {
                str = DTBAdUtil.loadFromAssets(CONFIG_WITH_JSON);
            }
            if (str != null) {
                this.configuration = new JSONObject(str);
            }
            ApsMetrics.customEvent("remoteJsonFetchSuccess", String.valueOf(configSeq), null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean isFeatureEnabled(String str) {
        return isFeatureEnabled(str, true);
    }

    public static String getClientConfigVal(String str, String str2, String str3, String str4) throws JSONException {
        try {
            JSONObject jSONObject = getInstance().getConfigParams(str).getJSONObject(str2);
            return (jSONObject == null || !jSONObject.has(str3)) ? str4 : jSONObject.getString(str3);
        } catch (RuntimeException | JSONException e10) {
            String str5 = LOG_TAG;
            StringBuilder sbB = b3.h.b("Error reading the String config value ", str, " : ", str2, " : ");
            sbB.append(str3);
            sbB.append(" - ");
            sbB.append(e10);
            ApsLog.d(str5, sbB.toString());
            return str4;
        }
    }

    public static Integer getClientConfigVal(String str, int i10, String str2) {
        try {
            JSONObject configParams = getInstance().getConfigParams(str2);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        return Integer.valueOf(configParams.getInt(str));
                    }
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get" + str2 + "for " + str + " from configuration. Using default value");
                }
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getClientConfigVal method", e10);
        }
        return Integer.valueOf(i10);
    }

    public static String getClientConfigVal(String str, String str2, String str3) {
        try {
            JSONObject configParams = getInstance().getConfigParams(str3);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        return configParams.getString(str);
                    }
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get" + str3 + "for " + str + " from configuration. Using default value");
                }
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getClientConfigVal method", e10);
        }
        return str2;
    }

    public static String getClientConfigVal(String str, String str2) {
        try {
            String configVal = getInstance().getConfigVal(str2);
            return !DtbCommonUtils.isNullOrEmpty(configVal) ? configVal : str;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getClientConfigVal method", e10);
            return str;
        }
    }
}
