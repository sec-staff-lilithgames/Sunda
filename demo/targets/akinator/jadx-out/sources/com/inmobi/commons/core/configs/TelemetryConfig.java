package com.inmobi.commons.core.configs;

import be.nVUQ.UupKET;
import com.inmobi.media.C2682a7;
import com.inmobi.media.C2702ba;
import com.inmobi.media.C2719ca;
import com.inmobi.media.C2943pe;
import com.inmobi.media.C2960qe;
import com.inmobi.media.C3051w4;
import com.inmobi.media.C3053w6;
import com.inmobi.media.InterfaceC2765f5;
import com.inmobi.media.J4;
import com.inmobi.media.Xc;
import com.inmobi.media.Yc;
import com.ironsource.C3119a4;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import sv.k0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class TelemetryConfig extends Config {
    public static final C2960qe Companion = new C2960qe();
    public static final long DEFAULT_DEEPLINK_FALLBACK_INTERVAL = 1000;
    public static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    public static final long DEFAULT_EVENT_TTL_SEC = 604800;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final boolean DEFAULT_IS_ENABLED = true;
    public static final boolean DEFAULT_LOG_ENABLED = false;
    public static final long DEFAULT_LOG_EXPIRY = 86400;
    private static final String DEFAULT_LOG_LEVEL = "ERROR";
    public static final int DEFAULT_LOG_MAX_RETRIES = 3;
    public static final long DEFAULT_LOG_RETRY_INTERVAL = 5000;
    public static final double DEFAULT_LOG_SAMPLING_FACTOR = 0.0d;
    public static final String DEFAULT_LOG_URL = "https://log-activity.templates.inmobi.com/api/v1/ingest";
    public static final int DEFAULT_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_MAX_ENTRIES = 20;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_MAX_TEMPLATE_EVENTS = 50;
    public static final int DEFAULT_MIN_BATCH_SIZE = 5;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    public static final long DEFAULT_REDIRECTION_INTERVAL = 1000;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    public static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    public static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";

    @InterfaceC2765f5
    private final String TAG;
    private AssetReportingConfig assetReporting;
    private Base base;
    private boolean disableAllGeneralEvents;
    private long eventTTL;
    private LoggingConfig loggingConfig;
    private LandingPageConfig lpConfig;
    private int maxEventsToPersist;
    private int maxRetryCount;
    private int maxTemplateEvents;
    private C2719ca networkType;
    private double pingSamplingFactor;
    private List<String> priorityEvents;
    private long processingInterval;
    private double samplingFactor;
    private boolean sendCrashEvents;
    private String telemetryUrl;
    private long txLatency;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdTypeLoggingConfig {

        /* renamed from: ab, reason: collision with root package name */
        private PlacementTypeLoggingConfig f31608ab = new PlacementTypeLoggingConfig();
        private PlacementTypeLoggingConfig nonAb = new PlacementTypeLoggingConfig();

        public final PlacementTypeLoggingConfig getAb() {
            return this.f31608ab;
        }

        public final PlacementTypeLoggingConfig getNonAb() {
            return this.nonAb;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AssetReportingConfig {
        private boolean gif;
        private boolean image;
        private boolean video;

        public final boolean getGif() {
            return this.gif;
        }

        public final boolean getImage() {
            return this.image;
        }

        public final boolean getVideo() {
            return this.video;
        }

        public final boolean isGifEnabled() {
            return this.gif;
        }

        public final boolean isImageEnabled() {
            return this.image;
        }

        public final boolean isVideoEnabled() {
            return this.video;
        }

        public final void setGif(boolean z10) {
            this.gif = z10;
        }

        public final void setImage(boolean z10) {
            this.image = z10;
        }

        public final void setVideo(boolean z10) {
            this.video = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Base {
        private boolean enabled = true;

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LandingPageConfig {
        private boolean enableOnLpLifeCycleEvent;
        private boolean nativeEnabled;
        private int maxFunnelsToTrackPerAd = 10;
        private boolean universalLinkEnabled = true;

        public final boolean getEnableOnLpLifeCycleEvent() {
            return this.enableOnLpLifeCycleEvent;
        }

        public final int getMaxFunnelsToTrackPerAd() {
            return this.maxFunnelsToTrackPerAd;
        }

        public final boolean getNativeEnabled() {
            return this.nativeEnabled;
        }

        public final boolean getUniversalLinkEnabled() {
            return this.universalLinkEnabled;
        }

        public final void setEnableOnLpLifeCycleEvent(boolean z10) {
            this.enableOnLpLifeCycleEvent = z10;
        }

        public final void setMaxFunnelsToTrackPerAd(int i10) {
            this.maxFunnelsToTrackPerAd = i10;
        }

        public final void setNativeEnabled(boolean z10) {
            this.nativeEnabled = z10;
        }

        public final void setUniversalLinkEnabled(boolean z10) {
            this.universalLinkEnabled = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LoggingConfig {
        private boolean enabled;
        private String loggingUrl = TelemetryConfig.DEFAULT_LOG_URL;
        private int maxNoOfEntries = 20;
        private long expiry = 86400;
        private int maxRetries = 3;
        private long retryInterval = 5000;
        private AdTypeLoggingConfig banner = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig audio = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig int_html = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig int_native = new AdTypeLoggingConfig();

        /* renamed from: native, reason: not valid java name */
        private AdTypeLoggingConfig f172native = new AdTypeLoggingConfig();
        private PlacementTypeLoggingConfig getToken = new PlacementTypeLoggingConfig();

        public final AdTypeLoggingConfig getAudio() {
            return this.audio;
        }

        public final AdTypeLoggingConfig getBanner() {
            return this.banner;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getExpiry() {
            return this.expiry;
        }

        public final PlacementTypeLoggingConfig getGetToken() {
            return this.getToken;
        }

        public final AdTypeLoggingConfig getInt_html() {
            return this.int_html;
        }

        public final AdTypeLoggingConfig getInt_native() {
            return this.int_native;
        }

        public final String getLoggingUrl() {
            return this.loggingUrl;
        }

        public final int getMaxNoOfEntries() {
            return this.maxNoOfEntries;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final AdTypeLoggingConfig getNative() {
            return this.f172native;
        }

        public final long getRetryInterval() {
            return this.retryInterval;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PlacementTypeLoggingConfig {
        private String logLevel;
        private double samplePercent;

        public PlacementTypeLoggingConfig() {
            TelemetryConfig.Companion.getClass();
            this.logLevel = TelemetryConfig.DEFAULT_LOG_LEVEL;
        }

        public final String getLogLevel() {
            return this.logLevel;
        }

        public final double getSamplePercent() {
            return this.samplePercent;
        }
    }

    private final AssetReportingConfig getDefaultAssetReportingConfig() {
        AssetReportingConfig assetReportingConfig = new AssetReportingConfig();
        assetReportingConfig.setVideo(true);
        assetReportingConfig.setImage(false);
        assetReportingConfig.setGif(false);
        return assetReportingConfig;
    }

    private final void setDefaultNetworkConfig() {
        C2719ca c2719ca = this.networkType;
        C2702ba c2702ba = new C2702ba();
        c2702ba.a(60L);
        c2702ba.c(5);
        c2702ba.b(20);
        c2719ca.getClass();
        e0.checkNotNullParameter(c2702ba, "<set-?>");
        c2719ca.wifi = c2702ba;
        C2719ca c2719ca2 = this.networkType;
        C2702ba c2702ba2 = new C2702ba();
        c2702ba2.a(60L);
        c2702ba2.c(5);
        c2702ba2.b(20);
        c2719ca2.getClass();
        e0.checkNotNullParameter(c2702ba2, "<set-?>");
        c2719ca2.others = c2702ba2;
    }

    public final AssetReportingConfig getAssetConfig() {
        return this.assetReporting;
    }

    public final boolean getEnabled() {
        return this.base.getEnabled();
    }

    public final C3051w4 getEventConfig() {
        return new C3051w4(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    public final LandingPageConfig getLpConfig() {
        return this.lpConfig;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public final int getMaxTemplateEvents() {
        return this.maxTemplateEvents;
    }

    public final C2702ba getMobileConfig() {
        C2702ba c2702ba = this.networkType.others;
        if (c2702ba != null) {
            return c2702ba;
        }
        e0.throwUninitializedPropertyAccessException("others");
        return null;
    }

    public final double getPingSamplingFactor() {
        return this.pingSamplingFactor;
    }

    public final List<String> getPriorityEventsList() {
        return this.priorityEvents;
    }

    public final double getSamplingFactor() {
        return this.samplingFactor;
    }

    public final String getTelemetryUrl() {
        return this.telemetryUrl;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "telemetry";
    }

    public final String getUrl() {
        return this.telemetryUrl;
    }

    public final C2702ba getWifiConfig() {
        C2702ba c2702ba = this.networkType.wifi;
        if (c2702ba != null) {
            return c2702ba;
        }
        e0.throwUninitializedPropertyAccessException(C3119a4.f35922b);
        return null;
    }

    public final boolean isGeneralEventsDisabled() {
        return this.disableAllGeneralEvents;
    }

    public final boolean isSameAs(TelemetryConfig config) {
        e0.checkNotNullParameter(config, "config");
        boolean z10 = (getAccountId$media_release() == null && config.getAccountId$media_release() == null) || (getAccountId$media_release() != null && k0.equals$default(getAccountId$media_release(), config.getAccountId$media_release(), false, 2, null));
        List<String> priorityEventsList = getPriorityEventsList();
        Iterator<T> it = config.getPriorityEventsList().iterator();
        while (it.hasNext()) {
            if (!priorityEventsList.contains((String) it.next())) {
                return false;
            }
        }
        return z10 && e0.areEqual(config.telemetryUrl, this.telemetryUrl) && config.samplingFactor == this.samplingFactor && config.eventTTL == this.eventTTL && config.maxEventsToPersist == this.maxEventsToPersist && config.maxRetryCount == this.maxRetryCount && config.getAssetConfig().isImageEnabled() == getAssetConfig().isImageEnabled() && config.getAssetConfig().isGifEnabled() == getAssetConfig().isGifEnabled() && config.getAssetConfig().isVideoEnabled() == getAssetConfig().isVideoEnabled();
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (J4.a(this.telemetryUrl)) {
            return false;
        }
        long j10 = this.txLatency;
        if (j10 >= this.processingInterval && j10 <= this.eventTTL) {
            C2719ca c2719ca = this.networkType;
            int i10 = this.maxEventsToPersist;
            C2702ba c2702ba = c2719ca.wifi;
            C2702ba c2702ba2 = null;
            if (c2702ba == null) {
                e0.throwUninitializedPropertyAccessException(C3119a4.f35922b);
                c2702ba = null;
            }
            if (c2702ba.a(i10)) {
                C2702ba c2702ba3 = c2719ca.others;
                if (c2702ba3 != null) {
                    c2702ba2 = c2702ba3;
                } else {
                    e0.throwUninitializedPropertyAccessException("others");
                }
                if (c2702ba2.a(i10) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0 && this.samplingFactor >= 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void setTelemetryUrl(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.telemetryUrl = str;
    }

    public final boolean shouldSendCrashEvents() {
        return this.sendCrashEvents;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new C3053w6().a(new Yc("priorityEvents", TelemetryConfig.class), (Xc) new C2682a7(new C2943pe(), String.class)).a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        e0.checkNotNullExpressionValue(TAG, "TAG");
        return new JSONObject();
    }

    public TelemetryConfig(String str) {
        super(str);
        this.telemetryUrl = DEFAULT_URL;
        this.TAG = "TelemetryConfig";
        this.processingInterval = 30L;
        this.maxRetryCount = 1;
        this.maxEventsToPersist = 1000;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.maxTemplateEvents = 50;
        this.txLatency = 86400L;
        Companion.getClass();
        this.priorityEvents = p0.mutableListOf("ServerFill", "ServerNoFill", "ServerError", "AdLoadFailed", "AdLoadSuccessful", "BlockAutoRedirection", "AssetDownloaded", "CrashEventOccurred", UupKET.GDLnBm, "ConfigFetched", "SdkInitialized", "AdGetSignalsFailed", "AdGetSignalsSucceeded", "AdShowFailed", "AdLoadCalled", "AdLoadDroppedAtSDK", "AdShowCalled", "AdShowSuccessful", "AdGetSignalsCalled", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "MUTTSuccess", "ParseSuccess", "WebViewLoadCalled", "PageStarted", "WebViewLoadFinished", "FireAdReady", "FireAdFailed", "TemplateEventDropped", "NetworkLoadLimitExceeded", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed");
        this.base = new Base();
        this.networkType = new C2719ca();
        this.loggingConfig = new LoggingConfig();
        this.lpConfig = new LandingPageConfig();
        setDefaultNetworkConfig();
        this.assetReporting = getDefaultAssetReportingConfig();
    }
}
