package com.amazon.aps.ads;

import af.g;
import android.content.Context;
import ao.n;
import com.amazon.aps.ads.listeners.ApsInitializationListener;
import com.amazon.aps.ads.model.ApsInitConfig;
import com.amazon.aps.ads.model.ApsInitializationStatus;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.ads.model.ApsMraidPolicy;
import com.amazon.aps.ads.model.ApsMraidVersion;
import com.amazon.aps.ads.model.ApsPrivacyType;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.AdRegistration;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class Aps implements ApsConstants {
    private static String appKey;
    private static ApsInitializationListener apsInitializationListener;
    private static Context context;
    private static final HashMap<String, String> privacyHashmap = new HashMap<>();

    public static void enableLogging(boolean z10) {
        AdRegistration.enableLogging(z10);
    }

    public static ApsMraidPolicy getMraidPolicy() {
        try {
            return ApsMigrationUtil.getApsMraidPolicy(AdRegistration.getMRAIDPolicy());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:getMraidPolicy", e10);
            return ApsMraidPolicy.NONE;
        }
    }

    public static HashMap<String, String> getPrivacyHashmap() {
        return privacyHashmap;
    }

    public static String getSdkVersion() {
        return AdRegistration.getVersion();
    }

    public static void initialize(Context context2, String str, ApsInitializationListener apsInitializationListener2) {
        ApsAdUtils.checkNullAndLogInvalidArg(context2, str);
        ApsMigrationUtil.setIsApsInitCalled(true);
        ApsMigrationUtil.setApsInitInProgress(true);
        try {
            context = context2;
            appKey = str;
            apsInitializationListener = apsInitializationListener2;
            ApsAsyncUtil.getInstance().runAsyncAndCallback(new n(3, str, context2), new g(apsInitializationListener2, 6));
        } catch (RuntimeException e10) {
            ApsMigrationUtil.setApsInitInProgress(false);
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:initialize", e10);
        }
    }

    public static boolean isInitialized() {
        return AdRegistration.isInitialized();
    }

    public static boolean isLocationEnabled() {
        return AdRegistration.isLocationEnabled();
    }

    public static boolean isTestingMode() {
        return AdRegistration.isTestMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AdRegistration lambda$initialize$0(String str, Context context2) throws IllegalArgumentException {
        AdRegistration adRegistration = AdRegistration.getInstance(str, context2);
        ApsMigrationUtil.setApsInitInProgress(false);
        return adRegistration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$1(ApsInitializationListener apsInitializationListener2, ApsResult apsResult, AdRegistration adRegistration) {
        if (apsInitializationListener2 != null) {
            apsInitializationListener2.onInitializationCompleted(new ApsInitializationStatus(apsResult));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$2(ApsInitConfig apsInitConfig, ApsInitializationListener apsInitializationListener2, ApsInitializationStatus apsInitializationStatus) {
        setTestingMode(apsInitConfig.isTestingMode);
        apsInitializationListener2.onInitializationCompleted(apsInitializationStatus);
    }

    public static void removeCustomAttribute(String str) {
        ApsAdUtils.checkNullAndLogInvalidArg(str);
        try {
            AdRegistration.removeCustomAttribute(str);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:removeCustomAttribute", e10);
        }
    }

    public static void removePrivacyString(ApsPrivacyType apsPrivacyType) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsPrivacyType);
        try {
            privacyHashmap.remove(apsPrivacyType.toString());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setPrivacyString", e10);
        }
    }

    public static void setCustomAttribute(String str, String str2) {
        ApsAdUtils.checkNullAndLogInvalidArg(str, str2);
        try {
            AdRegistration.addCustomAttribute(str, str2);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setCustomAttribute", e10);
        }
    }

    public static void setLocationEnabled(boolean z10) {
        AdRegistration.useGeoLocation(z10);
    }

    public static void setMraidPolicy(ApsMraidPolicy apsMraidPolicy) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsMraidPolicy);
        try {
            AdRegistration.setMRAIDPolicy(ApsMigrationUtil.getMRAIDPolicy(apsMraidPolicy));
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setMraidPolicy", e10);
        }
    }

    public static void setMraidSupportedVersions(ApsMraidVersion... apsMraidVersionArr) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsMraidVersionArr);
        try {
            String[] strArr = new String[apsMraidVersionArr.length];
            for (int i10 = 0; i10 < apsMraidVersionArr.length; i10++) {
                strArr[i10] = apsMraidVersionArr[i10].getString();
            }
            AdRegistration.setMRAIDSupportedVersions(strArr);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setMraidSupportedVersions", e10);
        }
    }

    public static void setOmIdPartnerName(String str) {
        ApsAdUtils.checkNullAndLogInvalidArg(str);
        try {
            AdRegistration.addCustomAttribute("omidPartnerName", str);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setOmIdPartnerName", e10);
        }
    }

    public static void setOmIdPartnerVersion(String str) {
        ApsAdUtils.checkNullAndLogInvalidArg(str);
        try {
            AdRegistration.addCustomAttribute("omidPartnerVersion", str);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setOmIdPartnerVersion", e10);
        }
    }

    public static void setPrivacyString(ApsPrivacyType apsPrivacyType, String str) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsPrivacyType, str);
        try {
            privacyHashmap.put(apsPrivacyType.toString(), str);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:setPrivacyString", e10);
        }
    }

    public static void setPrivacyValue(ApsPrivacyType apsPrivacyType, Object obj) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsPrivacyType, obj);
        if (apsPrivacyType == ApsPrivacyType.DSA_PRIVACY && (obj instanceof JSONObject)) {
            AdRegistration.setDsaTransparency((JSONObject) obj);
            return;
        }
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unsupported value type for " + apsPrivacyType.toString());
    }

    public static void setTestingMode(boolean z10) {
        AdRegistration.enableTesting(z10);
    }

    public static void enableLogging(boolean z10, ApsLogLevel apsLogLevel) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsLogLevel);
        try {
            AdRegistration.enableLogging(z10, ApsMigrationUtil.getDTBLogLevel(apsLogLevel));
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:enableLogging", e10);
        }
    }

    public static void initialize(Context context2, String str, ApsInitConfig apsInitConfig, ApsInitializationListener apsInitializationListener2) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsInitConfig);
        boolean z10 = true;
        ApsMigrationUtil.setIsApsInitCalled(true);
        try {
            ApsLogLevel apsLogLevel = apsInitConfig.apsLogLevel;
            if (apsLogLevel == null || apsLogLevel == ApsLogLevel.Off) {
                z10 = false;
            }
            if (apsLogLevel == null) {
                apsLogLevel = ApsLogLevel.Error;
            }
            enableLogging(z10, apsLogLevel);
            setLocationEnabled(apsInitConfig.isLocationEnabled);
            initialize(context2, str, new n(4, apsInitConfig, apsInitializationListener2));
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:initialize", e10);
        }
    }
}
