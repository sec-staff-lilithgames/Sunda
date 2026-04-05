package com.amazon.device.ads;

import android.content.SharedPreferences;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.ads.util.ApsInMemoryManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsConfigOverride;
import j1.o2;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbSharedPreferences {
    public static final String AAX_HOSTNAME_PREF_NAME = "amzn-dtb-ad-aax-hostname";
    public static final String AAX_VIDEO_HOSTNAME_PREF_NAME = "amzn-dtb-ad-aax-video-hostname";
    public static final String ADID_PREF_NAME = "amzn-dtb-ad-id";
    public static final String BID_TIMEOUT_PREF_NAME = "amzn-dtb-bid-timeout";
    public static final String CONFIG_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-config-last-checkin";
    public static final String CONFIG_TTL_PREF_NAME = "amzn-dtb-ad-config-ttl";
    public static final String DTB_VERSION_IN_USE = "amzn-dtb-version_in_use";
    public static final String ENCODED_PRICE_CHECK_PREF_NAME = "amzn-dtb-enable-encoded-price-check";
    public static final String IDFA_PREF_NAME = "amzn-dtb-idfa";
    public static final String IS_ADID_CHANGED_PREF_NAME = "amzn-dtb-adid-changed";
    public static final String IS_ADID_NEW_PREF_NAME = "amzn-dtb-adid-new";
    public static final String IS_GPS_UNAVAILABLE_PREF_NAME = "amzn-dtb-is-gps-unavailable";
    public static final String LOG_TAG = "DtbSharedPreferences";
    public static final String METRICS_CONFIG_OVERRIDE_PREF_NAME = "amzn-dtb-metrics-config-override";
    public static final String NON_IAB_CMP_FLAVOR = "NON_IAB_CMP_FLAVOR";
    public static final String NON_IAB_CONSENT_STATUS = "NON_IAB_CONSENT_STATUS";
    public static final String NON_IAB_CUSTOM_CONSENT = "NON_IAB_Custom_Consent";
    public static final String NON_IAB_VENDORLIST = "NON_IAB_VENDORLIST";
    public static final String OO_PREF_NAME = "amzn-dtb-oo";
    public static final String PJ_TEMPLATE_PREF_NAME = "amzn-dtb-pj-template";
    public static final String PREF_FILE_NAME = "com.amazon.device.ads.dtb.preferences";
    public static final String PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME = "amzn-dtb-privacy-location-accuracy-in-meters";
    public static final String PRIVACY_LOCATION_MODE_PREF_NAME = "amzn-dtb-privacy-location-mode";
    public static final String SDK_B_TEMPLATE_PREF_NAME = "amzn-dtb-sdkb-template";
    public static final String SDK_WRAPPER_PING = "sdk-wrapper-ping";
    public static final String SIS_ENDPOINT_PREF_NAME = "amzn-dtb-ad-sis-endpoint";
    public static final String SIS_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-sis-last-checkin";
    public static final String SIS_LAST_PING_PREF_NAME = "amzn-dtb-ad-sis-last-ping";
    public static final String SIS_LAST_PING_WEB_RESOURCES = "amzn-dtb-web-resource-ping";
    public static DtbSharedPreferences dtbSharedPreferencesInstance;
    public static SharedPreferences sharedPreferences;
    public static ApsInMemoryManager apsInMemoryManager = ApsInMemoryManager.INSTANCE;
    public static boolean isIgnore = false;
    public static boolean IS_SIS_REGISTERATION_SUCCESSFUL = false;

    public DtbSharedPreferences() {
        if (AdRegistration.getContext() != null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
    }

    public static void clearStorage() {
        ApsLog.d(LOG_TAG, "Removing the stored shared preferences");
        try {
            if (getSharedPreferences() != null) {
                getSharedPreferences().edit().clear().commit();
            }
            flushPreference(IDFA_PREF_NAME);
        } catch (Exception e10) {
            ApsLog.e("Error in clearing the storage:" + e10.getMessage());
        }
    }

    public static boolean containsPreference(String str) {
        if (apsInMemoryManager.contains(str)) {
            return true;
        }
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            return getSharedPreferences().contains(str);
        }
        return false;
    }

    public static DtbSharedPreferences createInstance() {
        DtbSharedPreferences dtbSharedPreferences = new DtbSharedPreferences();
        dtbSharedPreferencesInstance = dtbSharedPreferences;
        return dtbSharedPreferences;
    }

    public static void flushPreference(String str) {
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            SharedPreferences sharedPreferences2 = getSharedPreferences();
            if (sharedPreferences2.contains(str)) {
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                editorEdit.remove(str);
                editorEdit.apply();
            }
        }
        apsInMemoryManager.removePref(str);
    }

    public static DtbSharedPreferences getInstance() {
        if (dtbSharedPreferencesInstance == null) {
            createInstance();
        }
        return dtbSharedPreferencesInstance;
    }

    public static <T> T getPref(String str, Class<T> cls) {
        if (isIgnore) {
            return null;
        }
        if (!apsInMemoryManager.contains(str)) {
            apsInMemoryManager.putPref(str, getPrefFromSys(str, cls));
        }
        return (T) apsInMemoryManager.getPrefWithDefault(str, cls);
    }

    public static <T> T getPrefFromSys(String str, Class<T> cls) {
        if (isIgnore || !ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            return null;
        }
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (cls.isAssignableFrom(String.class)) {
            return (T) sharedPreferences2.getString(str, null);
        }
        if (cls.isAssignableFrom(Set.class)) {
            return (T) sharedPreferences2.getStringSet(str, null);
        }
        if (cls.isAssignableFrom(Boolean.class)) {
            return (T) Boolean.valueOf(sharedPreferences2.getBoolean(str, false));
        }
        if (cls.isAssignableFrom(Long.class)) {
            return (T) Long.valueOf(sharedPreferences2.getLong(str, 0L));
        }
        if (cls.isAssignableFrom(Integer.class)) {
            return (T) Integer.valueOf(sharedPreferences2.getInt(str, 0));
        }
        if (cls.isAssignableFrom(Float.class)) {
            return (T) Float.valueOf(sharedPreferences2.getFloat(str, 0.0f));
        }
        throw new IllegalArgumentException(cls.getName().concat(" is not supported"));
    }

    public static SharedPreferences getSharedPreferences() {
        if (sharedPreferences == null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
        return sharedPreferences;
    }

    private void saveHostName(String str, String str2) {
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            savePref(str2, DtbConstants.AAX_HOSTNAME);
        } else {
            savePref(str2, str);
        }
    }

    public static <T> void savePref(String str, T t10) {
        if (isIgnore) {
            return;
        }
        apsInMemoryManager.putPref(str, t10);
        savePrefInSys(str, t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void savePrefInSys(String str, T t10) {
        SharedPreferences sharedPreferences2;
        if (isIgnore || !ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed() || (sharedPreferences2 = getSharedPreferences()) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        if (t10 instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) t10).booleanValue());
        } else if (t10 instanceof String) {
            editorEdit.putString(str, (String) t10);
        } else if (t10 instanceof Integer) {
            editorEdit.putInt(str, ((Integer) t10).intValue());
        } else if (t10 instanceof Float) {
            editorEdit.putFloat(str, ((Float) t10).floatValue());
        } else if (t10 instanceof Long) {
            editorEdit.putLong(str, ((Long) t10).longValue());
        } else {
            if (!(t10 instanceof Set)) {
                throw new IllegalArgumentException("Saving of " + t10.getClass() + " is not supported.");
            }
            editorEdit.putStringSet(str, (Set) t10);
        }
        editorEdit.apply();
    }

    public static void setIgnoreMode() {
        isIgnore = true;
    }

    public String getAaxHostname() {
        String str = (String) getPref(AAX_HOSTNAME_PREF_NAME, String.class);
        if (!AdRegistration.isTestMode() || !DtbDebugProperties.isInternalDebugMode) {
            return DtbCommonUtils.isNullOrEmpty(str) ? DtbConstants.AAX_HOSTNAME : str;
        }
        if (str == null) {
            str = DtbConstants.AAX_HOSTNAME;
        }
        return DtbDebugProperties.getAaxHostName(str);
    }

    public String getAaxVideoHostName() {
        return (String) getPref(AAX_VIDEO_HOSTNAME_PREF_NAME, String.class);
    }

    public String getAdId() {
        return (String) getPref(ADID_PREF_NAME, String.class);
    }

    public int getBidTimeout() {
        Integer num = (Integer) getPref(BID_TIMEOUT_PREF_NAME, Integer.class);
        if (num == null || num.intValue() == 0) {
            return 5000;
        }
        return num.intValue();
    }

    public String getCMPFlavor() {
        return (String) getPref(NON_IAB_CMP_FLAVOR, String.class);
    }

    public Long getConfigLastCheckIn() {
        long jLongValue = ((Long) getPref(CONFIG_LAST_CHECKIN_PREF_NAME, Long.class)).longValue();
        if (jLongValue <= 0) {
            jLongValue = getSisLastCheckIn().longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public synchronized long getConfigTtlInMilliSeconds() {
        long jLongValue = ((Long) getPref(CONFIG_TTL_PREF_NAME, Long.class)).longValue();
        return jLongValue < DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS ? DtbConstants.DEFAULT_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS : jLongValue;
    }

    public String getConsentStatus() {
        return (String) getPref(NON_IAB_CONSENT_STATUS, String.class);
    }

    public String getIdfa() {
        return (String) getPref(IDFA_PREF_NAME, String.class);
    }

    public boolean getIsAdIdChanged() {
        return ((Boolean) getPref(IS_ADID_CHANGED_PREF_NAME, Boolean.class)).booleanValue();
    }

    public boolean getIsAdIdNew() {
        return ((Boolean) getPref(IS_ADID_NEW_PREF_NAME, Boolean.class)).booleanValue();
    }

    public boolean getIsSisRegisterationSuccessful() {
        return IS_SIS_REGISTERATION_SUCCESSFUL;
    }

    public String getMetricsConfigOverride() {
        return (String) getPref(METRICS_CONFIG_OVERRIDE_PREF_NAME, String.class);
    }

    public String getNonIABCustomConsent() {
        return (String) getPref(NON_IAB_CUSTOM_CONSENT, String.class);
    }

    public synchronized Boolean getOptOut() {
        if (!containsPreference(OO_PREF_NAME)) {
            return null;
        }
        return (Boolean) getPref(OO_PREF_NAME, Boolean.class);
    }

    public JSONObject getPJTemplate() {
        try {
            return new JSONObject((String) getPref(PJ_TEMPLATE_PREF_NAME, String.class));
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            DtbLog.warn(LOG_TAG, "Get Pj template failed when fetching from Cache");
            return jSONObject;
        }
    }

    public synchronized float getPrivacyLocationConfigAccuracyInMeters() {
        Float f10 = (Float) getPref(PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME, Float.class);
        if (f10 == null) {
            return Float.MAX_VALUE;
        }
        return f10.floatValue();
    }

    public synchronized PrivacyLocationMode getPrivacyLocationConfigMode() {
        String str = (String) getPref(PRIVACY_LOCATION_MODE_PREF_NAME, String.class);
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1679810537) {
                if (iHashCode == 67893076 && str.equals(DtbConstants.PRIVACY_LOCATION_FIXED_MODE)) {
                    return PrivacyLocationMode.FIXED;
                }
            } else if (str.equals(DtbConstants.PRIVACY_LOCATION_COMPUTE_MODE)) {
                return PrivacyLocationMode.COMPUTE;
            }
        }
        return PrivacyLocationMode.RESTRICTED;
    }

    public JSONObject getSDKBTemplate() {
        String str = (String) getPref(SDK_B_TEMPLATE_PREF_NAME, String.class);
        try {
            if (DtbCommonUtils.isNullOrEmpty(str)) {
                return null;
            }
            return new JSONObject(str);
        } catch (JSONException unused) {
            ApsLog.e(LOG_TAG, "Get SDK Bridge params failed");
            return null;
        }
    }

    public String getSisEndpoint() {
        String str = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
        return DtbCommonUtils.isNullOrEmpty(str) ? o2.o(new StringBuilder(), DtbConstants.SIS_END_POINT, DtbConstants.SIS_SERVER_PATH) : str;
    }

    public Long getSisLastCheckIn() {
        return (Long) getPref(SIS_LAST_CHECKIN_PREF_NAME, Long.class);
    }

    public long getSisLastPing() {
        return ((Long) getPref(SIS_LAST_PING_PREF_NAME, Long.class)).longValue();
    }

    public String getVendorList() {
        return (String) getPref(NON_IAB_VENDORLIST, String.class);
    }

    public String getVersionInUse() {
        return (String) getPref(DTB_VERSION_IN_USE, String.class);
    }

    public Long getWebResoucesLastPing() {
        return (Long) getPref(SIS_LAST_PING_WEB_RESOURCES, Long.class);
    }

    public Long getWrapperDetectionLastPing() {
        return (Long) getPref(SDK_WRAPPER_PING, Long.class);
    }

    public boolean isValidIdfaAvailable() {
        String idfa = getIdfa();
        return (idfa == null || DtbCommonUtils.isNullOrEmpty(idfa.trim()) || idfa.startsWith("0000")) ? false : true;
    }

    public void removeAAXHostName() {
        flushPreference(AAX_HOSTNAME_PREF_NAME);
    }

    public void removeAdid() {
        flushPreference(ADID_PREF_NAME);
    }

    public void removeBidTimeout() {
        flushPreference(BID_TIMEOUT_PREF_NAME);
    }

    public void removeCMPFlavor() {
        flushPreference(NON_IAB_CMP_FLAVOR);
    }

    public void removeConsentStatus() {
        flushPreference(NON_IAB_CONSENT_STATUS);
    }

    public void removeMetricsConfigOverride() {
        flushPreference(METRICS_CONFIG_OVERRIDE_PREF_NAME);
        DtbLog.info(LOG_TAG, "Removed metrics config override");
    }

    public void removeNonIABCustomConsent() {
        flushPreference(NON_IAB_CUSTOM_CONSENT);
    }

    public void removePJTemplate() {
        flushPreference(PJ_TEMPLATE_PREF_NAME);
    }

    public synchronized void removePrivacyLocationConfig() {
        flushPreference(PRIVACY_LOCATION_MODE_PREF_NAME);
        flushPreference(PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME);
    }

    public void removeSdKBTemplate() {
        flushPreference(SDK_B_TEMPLATE_PREF_NAME);
    }

    public void removeVendorList() {
        flushPreference(NON_IAB_VENDORLIST);
    }

    public void resetWebResoucesLastPing() {
        flushPreference(SIS_LAST_PING_WEB_RESOURCES);
    }

    public void resetWrapperDetectionLastPing() {
        flushPreference(SDK_WRAPPER_PING);
    }

    public void saveAaxHostname(String str) {
        saveHostName(str, AAX_HOSTNAME_PREF_NAME);
    }

    public void saveAaxVideoHostname(String str) {
        saveHostName(str, AAX_VIDEO_HOSTNAME_PREF_NAME);
    }

    public void saveAdId(String str) {
        if (str != null) {
            savePref(ADID_PREF_NAME, str);
        }
    }

    public void saveBidTimeout(Integer num) {
        savePref(BID_TIMEOUT_PREF_NAME, num);
    }

    public void saveCMPFlavor(String str) {
        savePref(NON_IAB_CMP_FLAVOR, str);
    }

    public void saveConfigLastCheckIn(long j10) {
        savePref(CONFIG_LAST_CHECKIN_PREF_NAME, Long.valueOf(j10));
    }

    public synchronized void saveConfigTtlInMilliSeconds(long j10) {
        long j11 = j10 * 1000;
        try {
            if (j11 < DtbConstants.MINIMUM_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS) {
                savePref(CONFIG_TTL_PREF_NAME, Long.valueOf(DtbConstants.DEFAULT_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS));
            } else {
                savePref(CONFIG_TTL_PREF_NAME, Long.valueOf(j11));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void saveConsentStatus(String str) {
        savePref(NON_IAB_CONSENT_STATUS, str);
    }

    public void saveIdfa(String str) {
        if (str != null) {
            savePref(IDFA_PREF_NAME, str);
        } else {
            savePref(IDFA_PREF_NAME, "");
        }
    }

    public void saveIsAdIdChanged(boolean z10) {
        savePref(IS_ADID_CHANGED_PREF_NAME, Boolean.valueOf(z10));
    }

    public void saveIsAdIdNew(boolean z10) {
        savePref(IS_ADID_NEW_PREF_NAME, Boolean.valueOf(z10));
    }

    public void saveMetricsConfigOverride(ApsMetricsConfigOverride apsMetricsConfigOverride) {
        if (apsMetricsConfigOverride == null) {
            removeMetricsConfigOverride();
            return;
        }
        try {
            savePref(METRICS_CONFIG_OVERRIDE_PREF_NAME, apsMetricsConfigOverride.toJsonObject().toString());
            DtbLog.info(LOG_TAG, "Saved metrics config override: " + apsMetricsConfigOverride);
        } catch (Exception e10) {
            DtbLog.error(LOG_TAG, "Failed to save metrics config override: " + e10.getMessage());
        }
    }

    public void saveNonIABCustomConsent(String str) {
        savePref(NON_IAB_CUSTOM_CONSENT, str);
    }

    public synchronized void saveOptOut(Boolean bool) {
        flushPreference(OO_PREF_NAME);
        if (bool != null) {
            savePref(OO_PREF_NAME, bool);
        }
    }

    public void savePJTemplate(JSONObject jSONObject) {
        if (jSONObject != null) {
            savePref(PJ_TEMPLATE_PREF_NAME, jSONObject.toString());
        }
    }

    public synchronized void savePrivacyLocationConfig(JSONObject jSONObject) {
        try {
            savePref(PRIVACY_LOCATION_MODE_PREF_NAME, jSONObject.getString("mode"));
            savePref(PRIVACY_LOCATION_ACCURACY_IN_METERS_PREF_NAME, Float.valueOf((float) jSONObject.getDouble(DtbConstants.PRIVACY_LOCATION_ACCURACY_IN_METERS_KEY)));
        } catch (JSONException unused) {
            DtbLog.error(LOG_TAG, "Failed to save privacy configurations in shared preferences");
        }
    }

    public void saveSDKBTemplate(JSONObject jSONObject) {
        if (DtbCommonUtils.isNullOrEmpty(jSONObject)) {
            return;
        }
        savePref(SDK_B_TEMPLATE_PREF_NAME, jSONObject.toString());
    }

    public boolean saveSisEndpoint(String str) {
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            savePref(SIS_ENDPOINT_PREF_NAME, o2.o(new StringBuilder(), DtbConstants.SIS_END_POINT, DtbConstants.SIS_SERVER_PATH));
            return false;
        }
        String str2 = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
        String strL = o2.l(str, DtbConstants.SIS_SERVER_PATH);
        if (str2 != null && str2.equals(strL)) {
            return false;
        }
        savePref(SIS_ENDPOINT_PREF_NAME, strL);
        return true;
    }

    public void saveSisLastCheckIn(long j10) {
        savePref(SIS_LAST_CHECKIN_PREF_NAME, Long.valueOf(j10));
    }

    public void saveSisLastPing(long j10) {
        savePref(SIS_LAST_PING_PREF_NAME, Long.valueOf(j10));
    }

    public void saveVendorList(String str) {
        savePref(NON_IAB_VENDORLIST, str);
    }

    public void saveWebResoucesLastPing(long j10) {
        savePref(SIS_LAST_PING_WEB_RESOURCES, Long.valueOf(j10));
    }

    public void saveWrapperDetectionLastPing(long j10) {
        savePref(SDK_WRAPPER_PING, Long.valueOf(j10));
    }

    public void setIsSisRegisterationSuccessful(boolean z10) {
        IS_SIS_REGISTERATION_SUCCESSFUL = z10;
    }

    public void setVersionInUse(String str) {
        savePref(DTB_VERSION_IN_USE, str);
    }
}
