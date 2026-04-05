package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.preference.PreferenceManager;
import b0.e2;
import com.amazon.aps.ads.ApsAdFormatUtils;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAaxBidEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsResult;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbMetrics;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdRequest implements DTBAdLoader {
    public static final String AAX_VIDEO_INVENTORY_TYPE = "inventoryType";
    public static final String AAX_VIDEO_SKIP_AFTER = "skipAfter";
    public static final int DEFAULT_RERESH_DURATION = 60;
    public static final String LOG_TAG = "DTBAdRequest";
    public static final int MIN_REFRESH_DURATION = 20;
    public static final String PJ_KEY = "pj";
    public static final long WEEK = 604800000;
    public static JSONArray mRaidArray;
    public static JSONArray mRaidCustomArray;
    public static boolean mRaidDefined;
    public String aaxHostname;
    public volatile AdError adError;
    public DTBAdNetworkInfo adNetworkInfo;
    public DTBAdResponse adResponse;
    public final List<DTBAdSize> adSizes;
    public DTBAdCallback callback;
    public Context context;
    public String correlationId;
    public final Map<String, String> customTargets;
    public boolean isAutoRefresh;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public final Runnable mRefreshRunnable;
    public int refreshDuration;
    public boolean refreshFlag;
    public boolean requestHasBeenUsed;
    public final Map<String, String> sizeSlotUUIDMap;
    public String slotGroup;
    public long startLoadAdTime;
    public boolean submitMetrics;
    public VersionInfo versionInfo;
    public static final String[] MRAID_VALID_VERSIONS = {APSAnalytics.DEFAULT_SDK_VERSION, "2.0", "3.0"};
    public static Integer reqCount = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.device.ads.DTBAdRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MRAIDPolicy;

        static {
            int[] iArr = new int[MRAIDPolicy.values().length];
            $SwitchMap$com$amazon$device$ads$MRAIDPolicy = iArr;
            try {
                iArr[MRAIDPolicy.AUTO_DETECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy[MRAIDPolicy.DFP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy[MRAIDPolicy.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy[MRAIDPolicy.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class WrapperReport {
        public String expectedPackage;
        public String wrapperPackage;

        public WrapperReport() {
        }
    }

    public DTBAdRequest(Context context, DTBAdNetworkInfo dTBAdNetworkInfo) {
        this.adSizes = new ArrayList();
        this.customTargets = new HashMap();
        this.sizeSlotUUIDMap = new HashMap();
        this.adError = null;
        this.requestHasBeenUsed = false;
        this.submitMetrics = true;
        this.isAutoRefresh = false;
        this.refreshFlag = false;
        this.refreshDuration = 0;
        this.mRefreshRunnable = new j(this, 0);
        this.slotGroup = null;
        this.correlationId = UUID.randomUUID().toString() + UUID.randomUUID().toString();
        if (context == null) {
            throw new IllegalArgumentException("unable to initialize ad request with null app context");
        }
        try {
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdRequest class with context argument", e10);
        }
        if (!AdRegistration.isInitialized()) {
            DtbLog.warn(DtbConstants.MDTB_NOT_INITIALIZED);
            return;
        }
        if (AdRegistration.getContext() == null) {
            AdRegistration.setContext(context);
        }
        this.context = context;
        if (!mRaidDefined) {
            defineMraid();
        }
        setNetworkInfo(dTBAdNetworkInfo);
    }

    private void addMraidParameters(Map<String, Object> map) {
        JSONArray jSONArray = mRaidArray;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        map.put(CampaignEx.JSON_KEY_MRAID, mRaidArray);
    }

    private void addPrivacyParameters(Map<String, Object> map) throws JSONException {
        Context context = this.context;
        if (context != null) {
            addGDPRParametersFromPreferences(map, PreferenceManager.getDefaultSharedPreferences(context));
            HashMap<String, Object> mapAddGPPParametersFromPreferences = DtbCommonUtils.addGPPParametersFromPreferences(PreferenceManager.getDefaultSharedPreferences(this.context));
            if (!DtbCommonUtils.isNullOrEmpty(mapAddGPPParametersFromPreferences)) {
                try {
                    map.put(DtbConstants.REGULATORY_PARAM_KEY, DtbCommonUtils.getParamsAsJson(mapAddGPPParametersFromPreferences));
                } catch (JSONException e10) {
                    APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to get global privacy platform params", e10);
                }
            }
            addDsaTransparencyParams(map);
        }
    }

    private AdError createAdError(AdError.ErrorCode errorCode, String str) {
        AdError adError = new AdError(errorCode, str);
        adError.setAdLoader(DtbCommonUtils.createAutoRefreshAdLoader(this));
        return adError;
    }

    private WrapperReport detectWrapper(Object obj) {
        Context applicationContext = AdRegistration.getContext().getApplicationContext();
        try {
            String name = obj.getClass().getPackage().getName();
            String str = applicationContext.getApplicationInfo().packageName;
            StringTokenizer stringTokenizer = new StringTokenizer(name, ".");
            StringTokenizer stringTokenizer2 = new StringTokenizer(str, ".");
            if (stringTokenizer.countTokens() < 2 || stringTokenizer2.countTokens() < 2) {
                WrapperReport wrapperReport = new WrapperReport();
                wrapperReport.expectedPackage = str;
                wrapperReport.wrapperPackage = name;
                return wrapperReport;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                if (!stringTokenizer.nextToken().equals(stringTokenizer2.nextToken())) {
                    WrapperReport wrapperReport2 = new WrapperReport();
                    wrapperReport2.expectedPackage = name;
                    wrapperReport2.wrapperPackage = str;
                    return wrapperReport2;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: executeCallback, reason: merged with bridge method [inline-methods] */
    public void lambda$triggerCallBack$2(DtbMetrics dtbMetrics) {
        WrapperReport wrapperReportDetectWrapper;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.callback == null) {
            DtbLog.error("No callback -DTBAdCallback- provided to loadAd() to handle success or failure.");
        } else if (this.adError == null || this.adError.getCode() != AdError.ErrorCode.NO_ERROR) {
            DtbLog.debug("Invoking onFailure() callback with errorCode: " + this.adError.getCode() + C3191e4.i.f36529d + this.adError.getMessage() + C3191e4.i.f36531e);
            this.callback.onFailure(this.adError);
        } else {
            DtbLog.debug("Invoking onSuccess() callback for pricepoints: [" + this.adResponse.getDefaultPricePoints() + C3191e4.i.f36531e);
            this.callback.onSuccess(this.adResponse);
            DtbLog.debug("Performing SDK wrapping detection. Will submit a report if needed.");
            if (wrapperDetectionNeeded() && (wrapperReportDetectWrapper = detectWrapper(this.callback)) != null) {
                if (Math.random() <= DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.WRAPPING_PIXEL_SAMPLE_RATE_KEY_NAME, DTBMetricsConfiguration.WRAPPING_PIXEL_DEFAULT_VALUE.intValue(), DTBMetricsConfiguration.SAMPLE_RATES_KEY_NAME).intValue() / 100.0f) {
                    HashMap map = new HashMap();
                    map.put("expected_package", wrapperReportDetectWrapper.expectedPackage);
                    map.put("wrapper_package", wrapperReportDetectWrapper.wrapperPackage);
                    DTBMetricsProcessor.getInstance().submitErrorReport("alert_sdk_wrapping_v2", map, DTBMetricReport.addBid(null, DtbCommonUtils.getHostNameFromUrl(dtbMetrics.getInstPxlUrl())));
                }
            }
        }
        sendBidEvent(jCurrentTimeMillis);
    }

    private String getAdSize(JSONObject jSONObject, List<DTBAdSize> list) {
        try {
            if (jSONObject.has("sz") && !DtbCommonUtils.isNullOrEmpty(jSONObject.getString("sz"))) {
                return jSONObject.getString("sz");
            }
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Invalid sz params from AAX Bid Response.".concat("BidId = " + this.adResponse.getBidId()));
            if (!DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_ENABLE_DEFAULT_AD_SIZE)) {
                return "0x0";
            }
            Iterator<DTBAdSize> it = list.iterator();
            if (!it.hasNext()) {
                return "0x0";
            }
            DTBAdSize next = it.next();
            if (next.isInterstitialAd()) {
                return "9999x9999";
            }
            return next.getWidth() + "x" + next.getHeight();
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to get ad size passed from bid Request", e10);
            return "0x0";
        }
    }

    private void increaseReqCount() {
        synchronized (reqCount) {
            reqCount = Integer.valueOf(reqCount.intValue() + 1);
        }
    }

    private void internalLoadAd() {
        DtbLog.debug("Loading DTB ad.");
        DtbThreadService.getInstance().execute(new j(this, 1));
        DtbLog.debug("Dispatched the loadAd task on a background thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$internalLoadAd$1() {
        DtbLog.info("Fetching DTB ad.");
        try {
            loadAdRequest();
            DtbLog.debug("DTB Ad call is complete");
        } catch (Exception unused) {
            DtbLog.error(LOG_TAG, "Unknown exception in DTB ad call process.");
        }
    }

    private void loadAd(DTBAdCallback dTBAdCallback, String str) throws DTBLoadException, JSONException, IllegalArgumentException {
        AdRegistration.SlotGroup slotGroup = AdRegistration.getSlotGroup(this.slotGroup);
        if (slotGroup == null) {
            throw new DTBLoadException("Slot group is not found");
        }
        DTBAdSize sizeBySlotUUID = slotGroup.getSizeBySlotUUID(str);
        if (sizeBySlotUUID == null) {
            throw new DTBLoadException("Slot group does not contain requested slotUUID");
        }
        setSizes(sizeBySlotUUID);
        loadAd(dTBAdCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024d  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadAdRequest() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdRequest.loadAdRequest():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshAd, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        Activity activity;
        if (!this.isAutoRefresh || this.refreshDuration <= 0) {
            return;
        }
        Context context = this.context;
        if (context instanceof Activity) {
            activity = (Activity) context;
            if (activity.isFinishing() || DtbCommonUtils.isActivityDestroyed(activity)) {
                DtbLog.info("Stopping DTB auto refresh...");
                stop();
                return;
            }
        } else {
            activity = null;
        }
        this.refreshFlag = true;
        if (activity == null || activity.hasWindowFocus()) {
            internalLoadAd();
        } else {
            DtbLog.debug("Skipping DTB auto refresh...activity not in focus");
            scheduleAdRefreshIfEnabled();
        }
    }

    private void removeAaxHostNameFromSharedPreferences() {
        try {
            if (DtbConstants.REMOVE_AAX_END_POINT_FROM_SHARED_PREF.contains(DtbSharedPreferences.getInstance().getAaxHostname())) {
                DtbSharedPreferences.getInstance().removeAAXHostName();
            }
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Exception while removing HostName from sharedPreference", e10);
        }
    }

    public static void resetMraid() {
        mRaidArray = null;
        mRaidDefined = false;
    }

    private void scheduleAdRefreshIfEnabled() {
        if (!this.isAutoRefresh || this.refreshDuration <= 0) {
            return;
        }
        stopAutoRefresh();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(this.mRefreshRunnable, this.refreshDuration * 1000);
        }
    }

    private void sendBidEvent(long j10) {
        ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent;
        String bidId;
        try {
            ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder = new ApsMetricsPerfEventModelBuilder();
            apsMetricsPerfEventModelBuilder.withCorrelationId(getCorrelationId());
            apsMetricsPerfEventModelBuilder.withMediationName(this.adNetworkInfo.getAdNetworkName());
            if (this.adError == null || this.adError.getCode() != AdError.ErrorCode.NO_ERROR) {
                apsMetricsPerfAaxBidEvent = new ApsMetricsPerfAaxBidEvent(ApsMetricsResult.Failure, this.aaxHostname);
                bidId = null;
            } else {
                DTBAdSize dTBAdSize = this.adResponse.getDTBAds().get(0);
                apsMetricsPerfAaxBidEvent = new ApsMetricsPerfAaxBidEvent(ApsMetricsResult.Success, this.aaxHostname);
                ApsAdFormat adFormat = ApsAdFormatUtils.getAdFormat(dTBAdSize.getDTBAdType(), dTBAdSize.getHeight(), dTBAdSize.getWidth());
                if (adFormat != null) {
                    apsMetricsPerfEventModelBuilder.withAdFormat(adFormat.toString());
                }
                bidId = this.adResponse.getBidId();
                apsMetricsPerfEventModelBuilder.withVideoFlag(this.adResponse.isVideo());
            }
            apsMetricsPerfAaxBidEvent.setRefreshFlag(Boolean.valueOf(this.isAutoRefresh));
            apsMetricsPerfAaxBidEvent.setStartTime(this.startLoadAdTime);
            apsMetricsPerfAaxBidEvent.setEndTime(j10);
            apsMetricsPerfEventModelBuilder.withEvent(apsMetricsPerfAaxBidEvent);
            ApsMetrics.adEvent(bidId, apsMetricsPerfEventModelBuilder);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in sending the bid event in ad request", e10);
        }
    }

    public static void setMRAIDSupportedVersions(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            mRaidCustomArray = new JSONArray();
            List listAsList = Arrays.asList(MRAID_VALID_VERSIONS);
            for (String str : strArr) {
                if (str == null) {
                    DtbLog.error(LOG_TAG, "null custom version supplied");
                } else {
                    if (!listAsList.contains(str)) {
                        DtbLog.warn(LOG_TAG, "custom version \"" + str + "\" is not valid");
                    }
                    mRaidCustomArray.put(str);
                }
            }
        }
        resetMraid();
    }

    private void setRefreshDuration(int i10) {
        if (i10 >= 20) {
            this.refreshDuration = i10;
        } else {
            DtbLog.warn(LOG_TAG, "Defaulting auto refresh duration to 60 seconds.");
            this.refreshDuration = 60;
        }
    }

    private void stopAutoRefresh() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.refreshFlag = false;
    }

    private void triggerCallBack(DtbMetrics dtbMetrics) {
        scheduleAdRefreshIfEnabled();
        DtbLog.info(LOG_TAG, "Forwarding the error handling to view on main thread.");
        DtbThreadService.executeOnMainThread(new k(0, this, dtbMetrics));
        if (this.submitMetrics) {
            DtbMetrics.Submitter.INSTANCE.submitMetrics(dtbMetrics);
        }
    }

    private void useDFP() {
        JSONArray jSONArray = new JSONArray();
        mRaidArray = jSONArray;
        jSONArray.put(APSAnalytics.DEFAULT_SDK_VERSION);
        mRaidArray.put("2.0");
        mRaidArray.put("3.0");
    }

    private boolean wrapperDetectionNeeded() {
        DtbSharedPreferences dtbSharedPreferences = DtbSharedPreferences.getInstance();
        Long wrapperDetectionLastPing = dtbSharedPreferences.getWrapperDetectionLastPing();
        long jC = e2.c();
        boolean z10 = true;
        if (wrapperDetectionLastPing != null && jC - wrapperDetectionLastPing.longValue() <= WEEK) {
            z10 = false;
        }
        if (z10) {
            dtbSharedPreferences.saveWrapperDetectionLastPing(jC);
        }
        return z10;
    }

    public void addDsaTransparencyParams(Map<String, Object> map) throws JSONException {
        try {
            JSONObject jSONObject = map.containsKey(DtbConstants.REGULATORY_PARAM_KEY) ? (JSONObject) map.get(DtbConstants.REGULATORY_PARAM_KEY) : new JSONObject();
            if (!DtbCommonUtils.isNullOrEmpty(AdRegistration.getDsaTransparencyData())) {
                jSONObject.put(DtbConstants.DSA_PARAM_KEY, AdRegistration.getDsaTransparencyData());
            }
            if (DtbCommonUtils.isNullOrEmpty(jSONObject)) {
                return;
            }
            map.put(DtbConstants.REGULATORY_PARAM_KEY, jSONObject);
        } catch (JSONException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "API Failure : Failed to add DSA Transparency params", e10);
        }
    }

    public void addGDPRParametersFromPreferences(Map<String, Object> map, SharedPreferences sharedPreferences) throws JSONException {
        JSONObject jSONObject = null;
        String string = sharedPreferences.getString(DtbConstants.IABCONSENT_SUBJECT_TO_GDPR, null);
        Object obj = sharedPreferences.contains("IABTCF_gdprApplies") ? sharedPreferences.getAll().get("IABTCF_gdprApplies") : null;
        String string2 = sharedPreferences.getString(DtbConstants.IABCONSENT_CONSENT_STRING, null);
        String string3 = sharedPreferences.getString("IABTCF_TCString", null);
        String encodedNonIABString = AdRegistration.getEncodedNonIABString();
        try {
            if (string3 != null || string2 != null) {
                jSONObject = new JSONObject();
                if (string3 != null) {
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, string3);
                } else if (string2 != null) {
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, string2);
                }
            } else if (encodedNonIABString != null) {
                jSONObject = new JSONObject();
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, encodedNonIABString);
            }
            if (string != null || obj != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (obj != null) {
                    try {
                        if ((obj instanceof Integer) && (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0)) {
                            jSONObject.put("e", obj);
                        } else if (((obj instanceof String) && ((String) obj).equals("1")) || ((String) obj).equals("0")) {
                            jSONObject.put("e", obj);
                        } else {
                            DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                        }
                    } catch (ClassCastException unused) {
                        DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                    }
                } else if (string != null) {
                    jSONObject.put("e", string);
                }
            }
            if (jSONObject == null || jSONObject.length() == 0) {
                return;
            }
            map.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, jSONObject);
        } catch (JSONException unused2) {
            DtbLog.error("INVALID JSON formed for GDPR clause");
        }
    }

    public void addLegoFlag(Map<String, Object> map, boolean z10) throws JSONException {
        if ((this instanceof ApsAdRequest) && z10) {
            try {
                JSONObject jSONObject = map.containsKey(PJ_KEY) ? (JSONObject) map.get(PJ_KEY) : new JSONObject();
                jSONObject.put("api", ApsMetricsDataMap.APSMETRICS_FIELD_APS);
                map.put(PJ_KEY, jSONObject);
            } catch (RuntimeException e10) {
                e = e10;
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error setting the isLego flag in ad request", e);
            } catch (JSONException e11) {
                e = e11;
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error setting the isLego flag in ad request", e);
            }
        }
    }

    public void defineMraid() {
        try {
            if (this.versionInfo == null) {
                this.versionInfo = MobileAds.getVersion();
            }
        } catch (Exception unused) {
            DtbLog.error("Unable to identify the version of the play services library");
        }
        mRaidDefined = true;
        int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$MRAIDPolicy[AdRegistration.getMRAIDPolicy().ordinal()];
        if (i10 == 1) {
            if (isServerless()) {
                return;
            }
            useDFP();
        } else if (i10 == 2) {
            useDFP();
        } else {
            if (i10 != 3) {
                return;
            }
            mRaidArray = mRaidCustomArray;
        }
    }

    public String[] dfpCandidateList() {
        return new String[]{"com.google.android.gms.common.GoogleApiAvailability", "com.google.android.gms.common.GoogleApiAvailabilityLight", "com.google.android.gms.common.GooglePlayServicesUtil", "com.google.android.gms.common.GooglePlayServicesUtilLight"};
    }

    public DTBAdNetworkInfo getAdNetworkInfo() {
        return this.adNetworkInfo;
    }

    public List<DTBAdSize> getAdSizes() {
        return this.adSizes;
    }

    public String getCorrelationId() {
        return this.correlationId;
    }

    public Map<String, String> getCustomTargets() {
        return this.customTargets;
    }

    public int getRefreshDuration() {
        return this.refreshDuration;
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public String getSlotGroupName() {
        return this.slotGroup;
    }

    public boolean isServerless() throws ClassNotFoundException {
        for (String str : AdRegistration.getServerlessMarkers()) {
            try {
                Class.forName(str);
                JSONArray jSONArray = new JSONArray();
                mRaidArray = jSONArray;
                jSONArray.put(APSAnalytics.DEFAULT_SDK_VERSION);
                mRaidArray.put("2.0");
                mRaidArray.put("3.0");
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void loadSmartBanner(DTBAdCallback dTBAdCallback) throws DTBLoadException, JSONException {
        int i10;
        int i11;
        try {
            this.startLoadAdTime = System.currentTimeMillis();
            if (DtbDeviceDataRetriever.isTablet()) {
                i10 = 728;
                i11 = 90;
            } else {
                i10 = 320;
                i11 = 50;
            }
            loadAd(dTBAdCallback, i10, i11);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute loadSmartBanner method", e10);
        }
    }

    public void onRequestFormed(HashMap<String, Object> map) {
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void pauseAutoRefresh() {
        this.isAutoRefresh = false;
        this.refreshFlag = false;
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void putCustomTarget(String str, String str2) {
        try {
            this.customTargets.put(str, str2);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute putCustomTarget method", e10);
        }
    }

    public void recycle() {
        this.requestHasBeenUsed = false;
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void resumeAutoRefresh() {
        try {
            setAutoRefresh(this.refreshDuration);
            lambda$new$0();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute resumeAutoRefresh method", e10);
        }
    }

    public void setAdSizes(List<DTBAdSize> list) {
        this.adSizes.clear();
        for (DTBAdSize dTBAdSize : list) {
            if (dTBAdSize != null) {
                this.adSizes.add(dTBAdSize);
            }
        }
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void setAutoRefresh() {
        try {
            this.isAutoRefresh = true;
            setRefreshDuration(60);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setAutoRefresh method", e10);
        }
    }

    public void setCorrelationId(String str) {
        this.correlationId = str;
    }

    public void setCustomTargets(Map<String, String> map) {
        this.customTargets.clear();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.customTargets.put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public synchronized void setNetworkInfo(DTBAdNetworkInfo dTBAdNetworkInfo) {
        VersionInfo versionInfo;
        this.adNetworkInfo = dTBAdNetworkInfo != null ? dTBAdNetworkInfo : new DTBAdNetworkInfo(DTBAdNetwork.UNKNOWN);
        try {
        } catch (Exception unused) {
            DtbLog.error("Unable to identify the version of the play services library");
        }
        if (this.versionInfo == null) {
            this.versionInfo = MobileAds.getVersion();
            if (!DTBAdNetwork.GOOGLE_AD_MANAGER.name().equals(this.adNetworkInfo.getAdNetworkName()) && ((versionInfo = this.versionInfo) == null || versionInfo.getMajorVersion() < 24)) {
                String adNetworkName = dTBAdNetworkInfo != null ? dTBAdNetworkInfo.getAdNetworkName() : AbstractJsonLexerKt.NULL;
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Using pre-Gam24 library:" + adNetworkName);
                throw new RuntimeException("The play services library to be upgraded to 24.x.x");
            }
        } else if (!DTBAdNetwork.GOOGLE_AD_MANAGER.name().equals(this.adNetworkInfo.getAdNetworkName())) {
        }
    }

    public void setRefreshFlag(boolean z10) {
        this.refreshFlag = z10;
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void setSizes(DTBAdSize... dTBAdSizeArr) throws IllegalArgumentException {
        this.adSizes.clear();
        DtbLog.info(LOG_TAG, "Setting " + dTBAdSizeArr.length + " AdSize(s) to the ad request.");
        for (DTBAdSize dTBAdSize : dTBAdSizeArr) {
            if (dTBAdSize == null) {
                throw new IllegalArgumentException("DTBAdSize cannot be null.");
            }
            this.adSizes.add(dTBAdSize);
        }
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void setSlotGroup(String str) {
        this.slotGroup = str;
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void stop() {
        try {
            stopAutoRefresh();
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quit();
                DtbLog.debug("Stopping DTB auto refresh");
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute stop method", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void setAutoRefresh(int i10) {
        try {
            this.isAutoRefresh = true;
            setRefreshDuration(i10);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setAutoRefresh method with seconds argument", e10);
        }
    }

    private void loadAd(DTBAdCallback dTBAdCallback, int i10, int i11) throws DTBLoadException, JSONException, IllegalArgumentException {
        loadAd(dTBAdCallback, i10, i11, AdType.DISPLAY);
    }

    private void loadAd(DTBAdCallback dTBAdCallback, int i10, int i11, AdType adType) throws DTBLoadException, JSONException, IllegalArgumentException {
        AdRegistration.SlotGroup slotGroup = AdRegistration.getSlotGroup(this.slotGroup);
        if (slotGroup != null) {
            DTBAdSize sizeByWidthHeightType = slotGroup.getSizeByWidthHeightType(i10, i11, adType);
            if (sizeByWidthHeightType != null) {
                setSizes(sizeByWidthHeightType);
                loadAd(dTBAdCallback);
                return;
            }
            throw new DTBLoadException("Slot group does not contain required size of a given type");
        }
        throw new DTBLoadException("Slot group is not found");
    }

    @Override // com.amazon.device.ads.DTBAdLoader
    public void loadAd(DTBAdCallback dTBAdCallback) throws JSONException {
        try {
            this.startLoadAdTime = System.currentTimeMillis();
            this.callback = dTBAdCallback;
            if (this.adSizes.size() > 0) {
                if (this.requestHasBeenUsed) {
                    DtbLog.error(LOG_TAG, "This ad request object is already used for loading an ad. Please create a new instance to load the Ad.");
                    return;
                }
                this.requestHasBeenUsed = true;
                if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_CLEAR_AAX_HOST_NAME_FROM_SHARED_PREF)) {
                    removeAaxHostNameFromSharedPreferences();
                }
                DtbDeviceRegistration.verifyRegistration();
                for (DTBAdSize dTBAdSize : this.adSizes) {
                    this.sizeSlotUUIDMap.put(dTBAdSize.getWidth() + "x" + dTBAdSize.getHeight(), dTBAdSize.getSlotUUID());
                }
                try {
                    if (this.mHandlerThread == null && this.isAutoRefresh && this.refreshDuration > 0) {
                        HandlerThread handlerThread = new HandlerThread("DtbHandlerThread");
                        this.mHandlerThread = handlerThread;
                        handlerThread.start();
                        this.mHandler = new Handler(this.mHandlerThread.getLooper());
                    }
                    internalLoadAd();
                    increaseReqCount();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("seqCount", String.valueOf(reqCount));
                    jSONObject.put("isGdprApplicable", ApsPrivacyManager.INSTANCE.isGdprConsentRequired());
                    ApsMetrics.customEvent("bidCall", String.valueOf(DtbSharedPreferences.getInstance().isValidIdfaAvailable()), jSONObject);
                    return;
                } catch (Exception e10) {
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unknown exception occured in DTB ad call.", e10);
                    return;
                }
            }
            throw new IllegalArgumentException("Please set at least one ad size in the request.");
        } catch (RuntimeException e11) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute loadAd method", e11);
        }
    }

    public DTBAdRequest(DTBAdNetworkInfo dTBAdNetworkInfo) {
        this.adSizes = new ArrayList();
        this.customTargets = new HashMap();
        this.sizeSlotUUIDMap = new HashMap();
        this.adError = null;
        this.requestHasBeenUsed = false;
        this.submitMetrics = true;
        this.isAutoRefresh = false;
        this.refreshFlag = false;
        this.refreshDuration = 0;
        this.mRefreshRunnable = new j(this, 0);
        this.slotGroup = null;
        this.correlationId = UUID.randomUUID().toString() + UUID.randomUUID().toString();
        try {
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdRequest class", e10);
        }
        if (!AdRegistration.isInitialized()) {
            DtbLog.warn(DtbConstants.MDTB_NOT_INITIALIZED);
            return;
        }
        if (this.context == null) {
            this.context = AdRegistration.getContext();
        }
        if (!mRaidDefined) {
            defineMraid();
        }
        setNetworkInfo(dTBAdNetworkInfo);
    }

    public DTBAdRequest(DTBAdRequest dTBAdRequest) {
        ArrayList arrayList = new ArrayList();
        this.adSizes = arrayList;
        HashMap map = new HashMap();
        this.customTargets = map;
        HashMap map2 = new HashMap();
        this.sizeSlotUUIDMap = map2;
        this.adError = null;
        this.requestHasBeenUsed = false;
        this.submitMetrics = true;
        this.isAutoRefresh = false;
        this.refreshFlag = false;
        this.refreshDuration = 0;
        this.mRefreshRunnable = new j(this, 0);
        this.slotGroup = null;
        this.correlationId = UUID.randomUUID().toString() + UUID.randomUUID().toString();
        arrayList.addAll(dTBAdRequest.adSizes);
        map.putAll(dTBAdRequest.customTargets);
        map2.putAll(dTBAdRequest.sizeSlotUUIDMap);
        this.adResponse = dTBAdRequest.adResponse;
        this.callback = dTBAdRequest.callback;
        this.context = dTBAdRequest.context;
        this.adError = dTBAdRequest.adError;
        this.requestHasBeenUsed = dTBAdRequest.requestHasBeenUsed;
        this.submitMetrics = dTBAdRequest.submitMetrics;
        this.isAutoRefresh = dTBAdRequest.isAutoRefresh;
        this.refreshFlag = dTBAdRequest.refreshFlag;
        this.refreshDuration = dTBAdRequest.refreshDuration;
        this.mHandler = dTBAdRequest.mHandler;
        this.mHandlerThread = dTBAdRequest.mHandlerThread;
        this.slotGroup = dTBAdRequest.slotGroup;
        setNetworkInfo(dTBAdRequest.adNetworkInfo);
    }

    public DTBAdRequest(DTBAdRequest dTBAdRequest, String str) {
        this.adSizes = new ArrayList();
        this.customTargets = new HashMap();
        this.sizeSlotUUIDMap = new HashMap();
        this.adError = null;
        this.requestHasBeenUsed = false;
        this.submitMetrics = true;
        this.isAutoRefresh = false;
        this.refreshFlag = false;
        this.refreshDuration = 0;
        this.mRefreshRunnable = new j(this, 0);
        this.slotGroup = null;
        this.correlationId = UUID.randomUUID().toString() + UUID.randomUUID().toString();
        setAdSizes(dTBAdRequest.getAdSizes());
        setSlotGroup(dTBAdRequest.getSlotGroupName());
        setCustomTargets(dTBAdRequest.getCustomTargets());
        setNetworkInfo(dTBAdRequest.adNetworkInfo);
    }
}
