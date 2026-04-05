package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.ApsMigrationUtil;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.bidder.adapter.ApsBidderAdapter;
import com.amazon.aps.bidder.listeners.ApsBidderSDKInitializationListener;
import com.amazon.aps.bidder.status.ApsBidderSDKInitializationStatus;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsConfigOverride;
import cv.BLca.YsiBvdpw;
import j1.o2;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class AdRegistration {
    public static final String LOGTAG = "AdRegistration";
    public static AdRegistration adRegistrationInstance;
    public static CMPFlavor cmpFlavor;
    public static boolean consentStringDirty;
    public static ConsentStatus currentConsentStatus;
    public static String currentVendorListString;
    public static Map<String, String> customDictionary;
    public static JSONObject dsaTransparencyData;
    public static HashMap<String, SlotGroup> groups;
    public static boolean isOmSdkActivated;
    public static String lastSeenNonIABEncodedConsentString;
    public static boolean locationEnabled;
    public static String mAppKey;
    public static Context mContext;
    public static List<String> providersProprietaryKeys;
    public static String sdkDistributionPlace;
    public static boolean testMode;
    public ActivityMonitor activityMonitor;
    public static Integer initCount = 0;
    public static MRAIDPolicy mraidPolicy = MRAIDPolicy.AUTO_DETECT;
    public static String[] serverlessMarkers = {"com.amazon.admob_adapter.APSAdMobCustomBannerEvent", "com.amazon.mopub_adapter.APSMopubCustomBannerEvent", "com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter"};
    public static Map<String, DTBCacheData> adMobRequestIdMap = new HashMap();
    public Set<AdProvider> providers = new HashSet();
    public EventDistributor eventDistributor = new EventDistributor();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.device.ads.AdRegistration$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBBannerType;
        public static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBSlotType;

        static {
            int[] iArr = new int[DTBSlotType.values().length];
            $SwitchMap$com$amazon$device$ads$DTBSlotType = iArr;
            try {
                iArr[DTBSlotType.SLOT_320_50.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_300_250.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_728_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_SMART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DTBBannerType.values().length];
            $SwitchMap$com$amazon$device$ads$DTBBannerType = iArr2;
            try {
                iArr2[DTBBannerType.PHONE_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBBannerType[DTBBannerType.TABLET_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public enum CMPFlavor {
        CMP_NOT_DEFINED,
        GOOGLE_CMP,
        MOPUB_CMP,
        ADMOB_CMP
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Deprecated
    public enum ConsentStatus {
        CONSENT_NOT_DEFINED,
        EXPLICIT_YES,
        EXPLICIT_NO,
        UNKNOWN
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SlotGroup {
        public String name;
        public Set<DTBAdSize> slots;

        public SlotGroup(String str) {
            if (DtbCommonUtils.isNullOrEmpty(str)) {
                throw new IllegalArgumentException("Slot Group name cannot be null or empty");
            }
            this.name = str;
            this.slots = new HashSet();
        }

        public void addSlot(DTBAdSize dTBAdSize) {
            try {
                for (DTBAdSize dTBAdSize2 : this.slots) {
                    if (dTBAdSize2.getWidth() == dTBAdSize.getWidth() && dTBAdSize2.getHeight() == dTBAdSize.getHeight() && dTBAdSize2.getDTBAdType() == dTBAdSize.getDTBAdType()) {
                        return;
                    }
                }
                this.slots.add(dTBAdSize);
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute addSlot method in SlotGroup class", e10);
            }
        }

        public DTBAdSize getSizeByBannerType(DTBBannerType dTBBannerType) {
            try {
                int i10 = AnonymousClass2.$SwitchMap$com$amazon$device$ads$DTBBannerType[dTBBannerType.ordinal()];
                if (i10 == 1) {
                    return getSizeByWidthAndHeight(320, 50);
                }
                if (i10 != 2) {
                    return null;
                }
                return getSizeByWidthAndHeight(728, 90);
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeByBannerType method in SlotGroup class", e10);
                return null;
            }
        }

        public DTBAdSize getSizeBySlotType(DTBSlotType dTBSlotType) {
            try {
                int i10 = AnonymousClass2.$SwitchMap$com$amazon$device$ads$DTBSlotType[dTBSlotType.ordinal()];
                int i11 = 50;
                int i12 = 320;
                if (i10 == 1) {
                    return getSizeByWidthAndHeight(320, 50);
                }
                if (i10 == 2) {
                    return getSizeByWidthAndHeight(300, 250);
                }
                if (i10 == 3) {
                    return getSizeByWidthAndHeight(728, 90);
                }
                if (i10 != 4) {
                    return null;
                }
                if (DtbDeviceDataRetriever.isTablet()) {
                    i11 = 90;
                    i12 = 728;
                }
                return getSizeByWidthAndHeight(i12, i11);
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeBySlotType method in SlotGroup class", e10);
                return null;
            }
        }

        public DTBAdSize getSizeBySlotUUID(String str) {
            for (DTBAdSize dTBAdSize : this.slots) {
                if (dTBAdSize.getSlotUUID().equals(str)) {
                    return dTBAdSize;
                }
            }
            return null;
        }

        public DTBAdSize getSizeByWidthAndHeight(int i10, int i11) {
            return getSizeByWidthHeightType(i10, i11, AdType.DISPLAY);
        }

        public DTBAdSize getSizeByWidthHeightType(int i10, int i11, AdType adType) {
            try {
                for (DTBAdSize dTBAdSize : this.slots) {
                    if (dTBAdSize.getHeight() == i11 && dTBAdSize.getWidth() == i10 && dTBAdSize.getDTBAdType() == adType) {
                        return dTBAdSize;
                    }
                }
                return null;
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeByWidthHeightType method in SlotGroup class", e10);
                return null;
            }
        }
    }

    public AdRegistration(String str, Context context) throws IllegalArgumentException {
        if (context == null || str == null || "".equals(str.trim())) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters for initialization. SDK initialize failed due to invalid registration parameters");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Invalid parameters for initialization. SDK initialize failed due to invalid registration parameters");
            throw illegalArgumentException;
        }
        if (Build.VERSION.SDK_INT >= 26 && WebView.getCurrentWebViewPackage() == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "No WebView installed on device. APS SDK failed to initialize");
            return;
        }
        mAppKey = str;
        Context applicationContext = context.getApplicationContext();
        mContext = applicationContext;
        APSAnalytics.init(applicationContext);
        APSAnalytics.setVersion(getVersion());
        ApsUtils.Companion.setupMetrics(mContext);
        ApsMetricsConfigOverride metricsConfigOverride = DTBMetricsConfiguration.getMetricsConfigOverride();
        if (metricsConfigOverride != null) {
            ApsMetrics.setMetricsConfigOverride(metricsConfigOverride);
        }
        DtbSharedPreferences dtbSharedPreferencesCreateInstance = DtbSharedPreferences.createInstance();
        context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            DtbLog.error(LOGTAG, "Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
        }
        String versionInUse = dtbSharedPreferencesCreateInstance.getVersionInUse();
        if (versionInUse == null || DtbCommonUtils.isNullOrEmpty(versionInUse)) {
            dtbSharedPreferencesCreateInstance.setVersionInUse(DtbConstants.SDK_VERSION);
        }
        DtbOmSdkSessionManager.activateOMSDK(mContext);
        currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
        cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
        consentStringDirty = false;
        customDictionary = new HashMap();
        JSONObject jSONObjectLoadJsonFromAsset = DTBAdUtil.loadJsonFromAsset(DtbConstants.SDK_DISTRIBUTION_MARKER_WITH_JSON);
        if (jSONObjectLoadJsonFromAsset != null) {
            try {
                sdkDistributionPlace = jSONObjectLoadJsonFromAsset.getString(DtbConstants.SDK_DISTRIBUTION_KEY_NAME);
            } catch (Exception unused) {
                DtbLog.warn("Unable to get distribution place value");
            }
        }
    }

    public static void addAdMobCache(String str, DTBCacheData dTBCacheData) {
        if (adMobRequestIdMap == null) {
            adMobRequestIdMap = new HashMap();
        }
        removeExpiredAdMobCache();
        synchronized (adMobRequestIdMap) {
            adMobRequestIdMap.put(str, dTBCacheData);
        }
    }

    public static void addCustomAttribute(String str, String str2) {
        if (!isInitialized() && !ApsMigrationUtil.isApsInitInProgress()) {
            throw new IllegalStateException(DtbConstants.MDTB_NOT_INITIALIZED);
        }
        try {
            if (customDictionary == null) {
                customDictionary = new HashMap();
            }
            customDictionary.put(str, str2);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addCustomAttribute method", e10);
        }
    }

    public static void addProvider(AdProvider adProvider) {
        if (adRegistrationInstance == null) {
            throw new IllegalStateException("Instance must be initialized prior to adding providers");
        }
        Class<?> cls = adProvider.getClass();
        Iterator<AdProvider> it = adRegistrationInstance.providers.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                return;
            }
        }
        adRegistrationInstance.providers.add(adProvider);
        appendProprietaryProviderKeys(adProvider.getProprietaryKeys());
    }

    public static void addSlotGroup(SlotGroup slotGroup) {
        try {
            if (groups == null) {
                groups = new HashMap<>();
            }
            groups.put(slotGroup.name, slotGroup);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute addSlotGroup method", e10);
        }
    }

    public static void appendProprietaryProviderKeys(String[] strArr) {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        for (String str : strArr) {
            providersProprietaryKeys.add(str);
        }
    }

    public static void enableLogging(boolean z10) {
        try {
            if (z10) {
                DTBLogLevel dTBLogLevel = DTBLogLevel.All;
                DtbLog.setLogLevel(dTBLogLevel);
                ApsLog.setLogLevel(ApsLogLevel.values()[dTBLogLevel.intValue()]);
            } else {
                DTBLogLevel dTBLogLevel2 = DTBLogLevel.Error;
                DtbLog.setLogLevel(dTBLogLevel2);
                ApsLog.setLogLevel(ApsLogLevel.values()[dTBLogLevel2.intValue()]);
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableLogging method", e10);
        }
    }

    public static void enableTesting(boolean z10) {
        try {
            if (!z10) {
                testMode = false;
            } else {
                if (DTBAdUtil.isInstalledFromAppStore(mContext)) {
                    return;
                }
                testMode = z10;
                DtbLog.enableCallerInfo(z10);
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableTesting method", e10);
        }
    }

    private ActivityMonitor getActivityMonitor() {
        return this.activityMonitor;
    }

    public static DTBCacheData getAdMobCache(String str) {
        if (DtbCommonUtils.isNullOrEmpty(str) || adMobRequestIdMap == null) {
            return null;
        }
        removeExpiredAdMobCache();
        return adMobRequestIdMap.get(str);
    }

    public static Map<String, DTBCacheData> getAdMobCacheData() {
        return adMobRequestIdMap;
    }

    public static Set<AdProvider> getAdProviders() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.providers;
        }
        return null;
    }

    public static String getAppKey() {
        return mAppKey;
    }

    public static CMPFlavor getCMPFlavor() {
        if (!isInitialized()) {
            throw new IllegalStateException(DtbConstants.MDTB_NOT_INITIALIZED);
        }
        String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
        return cMPFlavor == null ? cmpFlavor : CMPFlavor.valueOf(cMPFlavor);
    }

    public static ConsentStatus getConsentStatus() {
        if (!isInitialized()) {
            throw new IllegalStateException(DtbConstants.MDTB_NOT_INITIALIZED);
        }
        String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
        return consentStatus == null ? currentConsentStatus : ConsentStatus.valueOf(consentStatus);
    }

    public static Context getContext() {
        return mContext;
    }

    public static Activity getCurrentActivity() {
        return adRegistrationInstance.getActivityMonitor().getCurrentActivity();
    }

    public static Map<String, String> getCustomDictionary() {
        return customDictionary;
    }

    public static JSONObject getDsaTransparencyData() {
        return dsaTransparencyData;
    }

    public static String getEncodedNonIABString() {
        String encodedNonIABConsentString;
        if (!consentStringDirty) {
            return lastSeenNonIABEncodedConsentString;
        }
        String vendorList = DtbSharedPreferences.getInstance().getVendorList();
        String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
        String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
        if (vendorList == null && consentStatus == null && cMPFlavor == null) {
            encodedNonIABConsentString = "";
        } else {
            encodedNonIABConsentString = DTBGDPREncoder.getEncodedNonIABConsentString(getVendorListFromString(vendorList));
            if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABConsentString)) {
                DtbSharedPreferences.getInstance().saveNonIABCustomConsent(encodedNonIABConsentString);
            }
        }
        consentStringDirty = false;
        lastSeenNonIABEncodedConsentString = encodedNonIABConsentString;
        return encodedNonIABConsentString;
    }

    @Deprecated
    public static EventDistributor getEventDistributer() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.eventDistributor;
        }
        throw new IllegalStateException("Instance must be initialized prior using getEventDistributer API");
    }

    public static AdRegistration getInstance(String str, Context context) throws IllegalArgumentException {
        if (DtbCommonUtils.isNullOrEmpty(str) || context == null) {
            ApsMetrics.customEvent(ApsMigrationUtil.getIsApsInitCalled() ? "apsInitCallFailed" : "initCallFailed", str, null);
        }
        if (!isInitialized()) {
            ApsPrivacyManager apsPrivacyManager = ApsPrivacyManager.INSTANCE;
            apsPrivacyManager.init(context);
            adRegistrationInstance = new AdRegistration(str, context);
            apsPrivacyManager.removeStoragesByApsIfNoConsent();
            DTBMetricsConfiguration.getInstance();
            if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_CONFIG_IN_INIT)) {
                DtbDeviceRegistration.verifyRegistration();
            }
        } else if (str != null && !str.equals(mAppKey)) {
            mAppKey = str;
            DtbSharedPreferences.createInstance();
        }
        adRegistrationInstance.setActivityMonitor(new ActivityMonitor(context));
        if (DtbSharedPreferences.getInstance() != null && !DtbCommonUtils.isNullOrEmpty(DtbSharedPreferences.getInstance().getSDKBTemplate())) {
            initBidderSDK();
        }
        String str2 = ApsMigrationUtil.getIsApsInitCalled() ? "apsInitCall" : "initCall";
        Integer numValueOf = Integer.valueOf(initCount.intValue() + 1);
        initCount = numValueOf;
        ApsMetrics.customEvent(str2, String.valueOf(numValueOf), null);
        return adRegistrationInstance;
    }

    public static MRAIDPolicy getMRAIDPolicy() {
        return mraidPolicy;
    }

    public static List<String> getProprietaryProviderKeys() {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        return providersProprietaryKeys;
    }

    public static String getSDKDistributionPlace() {
        return sdkDistributionPlace;
    }

    public static String[] getServerlessMarkers() {
        return serverlessMarkers;
    }

    public static SlotGroup getSlotGroup(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap<String, SlotGroup> map = groups;
            if (map != null) {
                return map.get(str);
            }
            return null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSlotGroup method", e10);
            return null;
        }
    }

    public static String getStringFromVendorList(List<Integer> list) {
        return list.toString();
    }

    public static List<Integer> getVendorListFromString(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 2) {
            for (String str2 : str.substring(1, str.length() - 1).split(",")) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2.trim())));
            }
        }
        return arrayList;
    }

    public static String getVersion() {
        return DtbCommonUtils.getSDKVersion();
    }

    public static boolean hasAdapters() throws ClassNotFoundException {
        for (String str : serverlessMarkers) {
            try {
                Class.forName(str);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void initBidderSDK() {
        try {
            for (Map.Entry<String, ApsBidderAdapter> entry : ApsBidder.getApsBidderInstance().getAllAdapterInstances().entrySet()) {
                final String key = entry.getKey();
                final ApsBidderAdapter value = entry.getValue();
                value.initialize(getContext(), new ApsBidderSDKInitializationListener() { // from class: com.amazon.device.ads.AdRegistration.1
                    @Override // com.amazon.aps.bidder.listeners.ApsBidderSDKInitializationListener
                    public void OnInitializationComplete(ApsBidderSDKInitializationStatus apsBidderSDKInitializationStatus, String str) {
                        ApsMetrics.customEvent(o2.o(new StringBuilder(), key, "_SDK_INIT"), apsBidderSDKInitializationStatus.toString(), null);
                        if (apsBidderSDKInitializationStatus == ApsBidderSDKInitializationStatus.SUCCESS) {
                            value.getSignal();
                            return;
                        }
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error on Initializing : " + key + " SDK");
                    }
                });
            }
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to Initialize Bidder SDK", e10);
        }
    }

    @Deprecated
    public static boolean isConsentStatusUnknown() {
        try {
            if (currentConsentStatus != ConsentStatus.CONSENT_NOT_DEFINED && currentConsentStatus != ConsentStatus.UNKNOWN) {
                if (DtbSharedPreferences.getInstance().getVendorList() != null) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isConsentStatusUnknown method", e10);
            return true;
        }
    }

    public static boolean isInitialized() {
        return adRegistrationInstance != null;
    }

    public static boolean isLocationEnabled() {
        return locationEnabled;
    }

    public static boolean isTestMode() {
        return testMode;
    }

    public static void removeAdMobCache(String str) {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                adMobRequestIdMap.remove(str);
            }
        }
    }

    public static void removeExpiredAdMobCache() {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                try {
                    long time = new Date().getTime();
                    Iterator<Map.Entry<String, DTBCacheData>> it = adMobRequestIdMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (time - it.next().getValue().getResponseTimeStamp() > DtbConstants.ADMOB_REQUESTID_MAP_CLEAR_INTERVAL) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Deprecated
    public static void resetNonIAB() {
        try {
            DtbSharedPreferences.getInstance().removeCMPFlavor();
            DtbSharedPreferences.getInstance().removeConsentStatus();
            DtbSharedPreferences.getInstance().removeVendorList();
            DtbSharedPreferences.getInstance().removeNonIABCustomConsent();
            currentVendorListString = null;
            currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
            cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
            consentStringDirty = false;
            lastSeenNonIABEncodedConsentString = null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute resetNonIAB method", e10);
        }
    }

    private void setActivityMonitor(ActivityMonitor activityMonitor) {
        this.activityMonitor = activityMonitor;
    }

    @Deprecated
    public static void setAppKey(String str) throws IllegalArgumentException {
        if (!isInitialized()) {
            throw new IllegalStateException(DtbConstants.MDTB_NOT_INITIALIZED);
        }
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:appKey for initialization.");
            DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:appKey.", illegalArgumentException);
            throw illegalArgumentException;
        }
        mAppKey = str;
        DtbSharedPreferences.createInstance();
    }

    @Deprecated
    public static void setCMPFlavor(CMPFlavor cMPFlavor) {
        if (!isInitialized()) {
            throw new IllegalStateException(DtbConstants.MDTB_NOT_INITIALIZED);
        }
        try {
            if (cMPFlavor == CMPFlavor.CMP_NOT_DEFINED) {
                DtbLog.error(LOGTAG, "Set cmp type failed due to invalid cmp type parameters. Not allowed to set cmp type to not defined.");
                return;
            }
            CMPFlavor cMPFlavor2 = cmpFlavor;
            if (cMPFlavor2 == null || cMPFlavor2 != cMPFlavor) {
                consentStringDirty = true;
                cmpFlavor = cMPFlavor;
                DtbSharedPreferences.getInstance().saveCMPFlavor(cMPFlavor.name());
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setCMPFlavor method", e10);
        }
    }

    @Deprecated
    public static void setConsentStatus(ConsentStatus consentStatus) {
        if (!isInitialized()) {
            throw new IllegalStateException(DtbConstants.MDTB_NOT_INITIALIZED);
        }
        try {
            if (consentStatus == ConsentStatus.CONSENT_NOT_DEFINED) {
                DtbLog.error(LOGTAG, "Set consent status failed due to invalid consent status parameters. Not allowed to set consent not defined.");
                return;
            }
            ConsentStatus consentStatus2 = currentConsentStatus;
            if (consentStatus2 == null || consentStatus2 != consentStatus) {
                consentStringDirty = true;
                currentConsentStatus = consentStatus;
                DtbSharedPreferences.getInstance().saveConsentStatus(consentStatus.name());
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setConsentStatus method", e10);
        }
    }

    @Deprecated
    public static void setContext(Context context) {
        if (context != null) {
            mContext = context.getApplicationContext();
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:context for initialization.");
            DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:context.", illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public static void setDsaTransparency(JSONObject jSONObject) {
        dsaTransparencyData = jSONObject;
    }

    public static void setMRAIDPolicy(MRAIDPolicy mRAIDPolicy) {
        mraidPolicy = mRAIDPolicy;
        DTBAdRequest.resetMraid();
    }

    public static void setMRAIDSupportedVersions(String[] strArr) {
        DTBAdRequest.setMRAIDSupportedVersions(strArr);
    }

    @Deprecated
    public static void setServerlessMarkers(String[] strArr) {
        serverlessMarkers = strArr;
    }

    public static void useGeoLocation(boolean z10) {
        locationEnabled = z10;
    }

    public static void removeCustomAttribute(String str) {
        if (!isInitialized() && !ApsMigrationUtil.isApsInitInProgress()) {
            throw new IllegalStateException(YsiBvdpw.hZJbZYzqbK);
        }
        try {
            if (!DtbCommonUtils.isNullOrEmpty(customDictionary)) {
                customDictionary.remove(str);
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute removeCustomAttribute method", e10);
        }
    }

    @Deprecated
    public static void setVendorList(List<Integer> list) {
        if (isInitialized()) {
            try {
                if (list == null) {
                    DtbLog.error(LOGTAG, "Set vendor list failed due to invalid vendor list parameters with value null.");
                    return;
                }
                String stringFromVendorList = getStringFromVendorList(list);
                String str = currentVendorListString;
                if (str != null && str.equals(stringFromVendorList)) {
                    return;
                }
                consentStringDirty = true;
                currentVendorListString = stringFromVendorList;
                DtbSharedPreferences.getInstance().saveVendorList(stringFromVendorList);
                return;
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setVendorList method", e10);
                return;
            }
        }
        throw new IllegalStateException(GalEuEfxjome.sXsamIuqoVNRRCx);
    }

    public static void enableLogging(boolean z10, DTBLogLevel dTBLogLevel) {
        try {
            if (z10) {
                DtbLog.setLogLevel(dTBLogLevel);
                ApsLog.setLogLevel(ApsLogLevel.values()[dTBLogLevel.intValue()]);
            } else {
                DtbLog.setLogLevel(DTBLogLevel.Error);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute enableLogging method with logLevel argument");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableLogging method with logLevel argument", e10);
        }
    }
}
