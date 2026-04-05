package com.amazon.aps.shared;

import android.content.Context;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.ApsMetricsCustomEventModelBuilder;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsConfigOverride;
import com.amazon.aps.shared.metrics.model.ApsMetricsDeviceInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAaxBidEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsSdkInfo;
import com.amazon.aps.shared.util.APSNetworkManager;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.util.Random;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import mv.d;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsMetrics {
    private static final String CUSTOM_FAILURE_ERROR_DETAIL = "Error in sending the custom event";
    public static final int METRICS_API_SCHEMA_VERSION = 1;
    public static final double METRICS_DEFAULT_SAMPLING_RATE = 0.1d;
    private static final int SAMPLING_ALLOWED_FROM = 0;
    private static String adapterVersion;
    private static Context context;
    private static boolean isSamplingAllowed;
    private static ApsMetricsConfigOverride metricsConfigOverride;
    public static final Companion Companion = new Companion(null);
    private static ApsMetricsDeviceInfo apsMetricsDeviceInfo = new ApsMetricsDeviceInfo(null, null, null, null, null, 31, null);
    private static ApsMetricsSdkInfo apsMetricsSdkInfo = new ApsMetricsSdkInfo(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    private static double samplingPercentage = 0.1d;
    public static final String METRICS_DEFAULT_ENDPOINT_URL = "https://prod.tahoe-analytics.publishers.advertising.a2z.com/logevent/putRecord";
    private static String endpointUrl = METRICS_DEFAULT_ENDPOINT_URL;
    public static final String METRICS_DEFAULT_METRICS_API_KEY = "a5c71f6aff54eb34c826d952c285eaf0650b4259c83ae598962681a6429b63f6";
    private static String apiKey = METRICS_DEFAULT_METRICS_API_KEY;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final void calculateSamplingAllowed() {
            try {
                boolean z10 = true;
                if (new Random().nextInt(10000000) + 1 > d.roundToInt(effectiveSamplingPercentage() * DefaultOggSeeker.MATCH_BYTE_RANGE)) {
                    z10 = false;
                }
                ApsMetrics.isSamplingAllowed = z10;
            } catch (RuntimeException e10) {
                ApsLog.e("Unable to set the sampling rate " + e10);
                ApsMetrics.isSamplingAllowed = false;
            }
        }

        public static /* synthetic */ void customEvent$default(Companion companion, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                jSONObject = null;
            }
            companion.customEvent(str, str2, jSONObject);
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, ApsMetricsDeviceInfo apsMetricsDeviceInfo, ApsMetricsSdkInfo apsMetricsSdkInfo, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                apsMetricsDeviceInfo = null;
            }
            if ((i10 & 4) != 0) {
                apsMetricsSdkInfo = null;
            }
            companion.init(context, apsMetricsDeviceInfo, apsMetricsSdkInfo);
        }

        public final void adEvent(String str, ApsMetricsPerfEventModelBuilder builder) {
            e0.checkNotNullParameter(builder, "builder");
            ApsLog.d("Logging perf metrics event");
            try {
                if (isOkToSendData()) {
                    APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(builder.withBidId(str).build());
                }
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error sending the ad event", e10);
            }
        }

        public final void adapterEvent(String str, ApsMetricsPerfEventModelBuilder builder) {
            e0.checkNotNullParameter(builder, "builder");
            ApsLog.d("Logging adapter event");
            adEvent(str, builder);
        }

        public final void bidEvent(String str, String str2, ApsMetricsPerfAaxBidEvent aaxBid) {
            e0.checkNotNullParameter(aaxBid, "aaxBid");
            try {
                ApsLog.d("Logging bid event");
                if (isOkToSendData()) {
                    APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(new ApsMetricsPerfEventModelBuilder().withMediationName(str2).withBidId(str).withEvent(aaxBid).build());
                }
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error sending the bid event", e10);
            }
        }

        public final void customEvent(String eventName, String str, JSONObject jSONObject) {
            e0.checkNotNullParameter(eventName, "eventName");
            customEvent(eventName, str, jSONObject, null);
        }

        public final double effectiveSamplingPercentage() {
            return ApsMetrics.metricsConfigOverride != null ? r0.getSamplingPercentage() : getSamplingPercentage();
        }

        public final String getAdapterVersion() {
            return ApsMetrics.adapterVersion;
        }

        public final String getApiKey() {
            return ApsMetrics.apiKey;
        }

        public final ApsMetricsDeviceInfo getApsMetricsDeviceInfo() {
            return ApsMetrics.apsMetricsDeviceInfo;
        }

        public final ApsMetricsSdkInfo getApsMetricsSdkInfo() {
            return ApsMetrics.apsMetricsSdkInfo;
        }

        public final String getEndpointUrl() {
            return ApsMetrics.endpointUrl;
        }

        public final ApsMetricsConfigOverride getMetricsConfigOverride() {
            return ApsMetrics.metricsConfigOverride;
        }

        public final double getSamplingPercentage() {
            return ApsMetrics.samplingPercentage;
        }

        public final boolean hasMetricsConfigOverride() {
            return ApsMetrics.metricsConfigOverride != null;
        }

        public final void init(Context context, ApsMetricsDeviceInfo apsMetricsDeviceInfo, ApsMetricsSdkInfo apsMetricsSdkInfo) {
            e0.checkNotNullParameter(context, "context");
            try {
                ApsLog.setLogLevel(ApsLogLevel.All);
                if (apsMetricsDeviceInfo != null) {
                    Companion companion = ApsMetrics.Companion;
                    ApsMetrics.apsMetricsDeviceInfo = ApsMetricsDeviceInfo.copy$default(apsMetricsDeviceInfo, null, null, null, null, null, 31, null);
                }
                if (apsMetricsSdkInfo != null) {
                    Companion companion2 = ApsMetrics.Companion;
                    ApsMetrics.apsMetricsSdkInfo = ApsMetricsSdkInfo.copy$default(apsMetricsSdkInfo, null, null, 3, null);
                }
                ApsMetrics.context = context;
                calculateSamplingAllowed();
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in initializing the ApsMetrics", e10);
            }
        }

        public final boolean isInitialized() {
            return ApsMetrics.context != null;
        }

        public final boolean isOkToSendData() {
            if (!isInitialized() || !ApsMetrics.isSamplingAllowed || APSSharedUtil.isNullOrEmpty(getApiKey()) || APSSharedUtil.isNullOrEmpty(getEndpointUrl())) {
                return false;
            }
            ApsMetricsConfigOverride apsMetricsConfigOverride = ApsMetrics.metricsConfigOverride;
            return (apsMetricsConfigOverride != null && apsMetricsConfigOverride.getHasCustomOnlyFlag() && apsMetricsConfigOverride.getCustomOnly()) ? false : true;
        }

        public final void setAdapterVersion(String str) {
            if (str != null) {
                ApsMetrics.adapterVersion = str;
            }
        }

        public final void setApiKey(String str) {
            if (APSSharedUtil.isNullOrEmpty(str)) {
                return;
            }
            ApsMetrics.apiKey = str;
        }

        public final void setEndpointUrl(String str) {
            if (APSSharedUtil.isNullOrEmpty(str)) {
                return;
            }
            ApsMetrics.endpointUrl = str;
        }

        public final void setMetricsConfigOverride(ApsMetricsConfigOverride apsMetricsConfigOverride) {
            String str;
            ApsMetrics.metricsConfigOverride = apsMetricsConfigOverride;
            if (apsMetricsConfigOverride != null) {
                str = "Metrics config override applied: " + apsMetricsConfigOverride;
            } else {
                str = "Metrics config override cleared";
            }
            ApsLog.i(str);
            calculateSamplingAllowed();
        }

        public final void setSamplingPercentage(double d10) {
            if (0.0d > d10 || d10 > 100.0d) {
                return;
            }
            ApsMetrics.samplingPercentage = d10;
            calculateSamplingAllowed();
        }

        private Companion() {
        }

        public static /* synthetic */ void customEvent$default(Companion companion, String str, String str2, JSONObject jSONObject, String str3, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                jSONObject = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            companion.customEvent(str, str2, jSONObject, str3);
        }

        public final void customEvent(String eventName, String str, JSONObject jSONObject, String str2) {
            e0.checkNotNullParameter(eventName, "eventName");
            try {
                ApsLog.d("Logging custom event:" + eventName);
                if (isOkToSendData()) {
                    ApsMetricsCustomEventModelBuilder apsMetricsCustomEventModelBuilder = new ApsMetricsCustomEventModelBuilder();
                    apsMetricsCustomEventModelBuilder.withEventName(eventName);
                    if (str != null) {
                        apsMetricsCustomEventModelBuilder.withEventValue(str);
                    }
                    if (jSONObject != null) {
                        apsMetricsCustomEventModelBuilder.withEventDetail(jSONObject);
                    }
                    if (str2 != null) {
                        apsMetricsCustomEventModelBuilder.withEventCategory(str2);
                    }
                    JSONObject jSONObjectBuild = apsMetricsCustomEventModelBuilder.build();
                    if (jSONObjectBuild != null) {
                        APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(jSONObjectBuild);
                    }
                }
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, ApsMetrics.CUSTOM_FAILURE_ERROR_DETAIL, e10);
            }
        }
    }

    private ApsMetrics() {
    }

    public static final void adEvent(String str, ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder) {
        Companion.adEvent(str, apsMetricsPerfEventModelBuilder);
    }

    public static final void adapterEvent(String str, ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder) {
        Companion.adapterEvent(str, apsMetricsPerfEventModelBuilder);
    }

    public static final void bidEvent(String str, String str2, ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent) {
        Companion.bidEvent(str, str2, apsMetricsPerfAaxBidEvent);
    }

    public static final void customEvent(String str, String str2, JSONObject jSONObject) {
        Companion.customEvent(str, str2, jSONObject);
    }

    public static final double effectiveSamplingPercentage() {
        return Companion.effectiveSamplingPercentage();
    }

    public static final ApsMetricsConfigOverride getMetricsConfigOverride() {
        return Companion.getMetricsConfigOverride();
    }

    public static final boolean hasMetricsConfigOverride() {
        return Companion.hasMetricsConfigOverride();
    }

    public static final void init(Context context2, ApsMetricsDeviceInfo apsMetricsDeviceInfo2, ApsMetricsSdkInfo apsMetricsSdkInfo2) {
        Companion.init(context2, apsMetricsDeviceInfo2, apsMetricsSdkInfo2);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isOkToSendData() {
        return Companion.isOkToSendData();
    }

    public static final void setMetricsConfigOverride(ApsMetricsConfigOverride apsMetricsConfigOverride) {
        Companion.setMetricsConfigOverride(apsMetricsConfigOverride);
    }

    public static final void customEvent(String str, String str2, JSONObject jSONObject, String str3) {
        Companion.customEvent(str, str2, jSONObject, str3);
    }
}
