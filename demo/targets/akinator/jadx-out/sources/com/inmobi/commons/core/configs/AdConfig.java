package com.inmobi.commons.core.configs;

import android.graphics.Color;
import android.text.TextUtils;
import com.inmobi.media.C2979s0;
import com.inmobi.media.D2;
import com.inmobi.media.J4;
import com.inmobi.media.Me;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import sv.n0;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdConfig extends Config {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final int DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final long DEFAULT_AUDIO_PROCESSING_INTERVAL = 500;
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    public static final boolean DEFAULT_ENABLE_OKHTTP = false;
    public static final long DEFAULT_EXPOSURE_PROCESSING_INTERVAL = 500;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_PING_V2_CALL_TIMEOUT = 60;
    public static final int DEFAULT_PING_V2_CONNECT_TIMEOUT = 30;
    public static final boolean DEFAULT_PING_V2_ENABLE = false;
    public static final int DEFAULT_PING_V2_EXPIRY_HIGH = 172800;
    public static final int DEFAULT_PING_V2_EXPIRY_NORMAL = 86400;
    public static final int DEFAULT_PING_V2_HIGH_MAX_BATCH_SIZE = 64;
    public static final int DEFAULT_PING_V2_INTERVAL_HIGH = 30;
    public static final int DEFAULT_PING_V2_INTERVAL_NORMAL = 120;
    public static final int DEFAULT_PING_V2_MAX_ENTRIES = 1000;
    public static final int DEFAULT_PING_V2_NORMAL_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_PING_V2_READ_TIMEOUT = 30;
    public static final double DEFAULT_PING_V2_RETRY_HIGH_FACTOR = 1.0d;
    public static final int DEFAULT_PING_V2_RETRY_HIGH_MAX_RETRIES = 5;
    public static final long DEFAULT_PING_V2_RETRY_HIGH_RETRY_INTERVAL = 10;
    public static final double DEFAULT_PING_V2_RETRY_NORMAL_FACTOR = 2.0d;
    public static final int DEFAULT_PING_V2_RETRY_NORMAL_MAX_RETRIES = 3;
    public static final long DEFAULT_PING_V2_RETRY_NORMAL_RETRY_INTERVAL = 120;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final long DEFAULT_SCROLL_THROTTLE_INTERVAL = 500;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final int DEFAULT_UPPER_BOUND_FOR_ACTIVITY_CONTEXT = 10;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;
    private static final String GESTURE_LIST = "gestures";
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
    private static final String SKIP_FIELDS = "skipFields";
    private AdQualityConfig adQuality;
    private AdReportConfig adReport;
    private C2979s0 adReqDeprecateChecker;
    private boolean applyGzipReq;
    private AssetCacheConfig assetCache;
    private AudioConfig audio;
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;
    private ContextualDataConfig contextualData;
    private CustomNetworkValidation customNwValidation;
    private int defaultRefreshInterval;
    private String deprecate;
    private boolean enableCookiesOnInAppBrowser;
    private ImaiConfig imai;
    private int maxPoolSize;
    private int minimumRefreshInterval;
    private MraidConfig mraid;
    private Mraid3Config mraid3;
    private boolean partialTabsEnabled;
    private PingsV2Config pingV2;
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    private boolean skipNetworkValidationFeatureEnabled;
    private Me timeouts;
    private String url;
    private VastVideoConfig vastVideo;
    private ViewabilityConfig viewability;
    private boolean watermarkEnabled;
    private WebAssetCacheConfig webAssetCache;
    public static final b Companion = new b();
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = p0.emptyList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private int retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            return this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100;
        }

        public final void setEnableAdQuality(boolean z10) {
            this.enabled = z10;
        }

        public final void setMaxImageSize(int i10) {
            this.maxImageSize = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i10) {
            this.cridls = i10;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AssetCacheConfig {
        private int maxRetries = 3;
        private int retryInterval = 1;
        private long maxCacheSize = 104857600;
        private long timeToLive = CrashConfig.DEFAULT_EVENT_TTL_SEC;

        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return getRetryInterval() >= 0 && getTimeToLive() >= 0 && getMaxCacheSize() >= 0 && getMaxRetries() >= 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        public final boolean isAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            return this.minDeviceVolume > 0 && this.minRefreshInterval > 0;
        }

        public final void setAudioEnabled(boolean z10) {
            this.isAudioEnabled = z10;
        }

        public final void setMinDeviceVolume(int i10) {
            this.minDeviceVolume = i10;
        }

        public final void setMinRefreshInterval(int i10) {
            this.minRefreshInterval = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = 2000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BitRateConfig {
        private boolean bitrate_mandatory;
        private int headerTimeout = 2000;

        public final int getHeaderTimeout() {
            return this.headerTimeout;
        }

        public final boolean isBitRateMandatory() {
            return this.bitrate_mandatory;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return this.timeToLive >= 0;
        }

        public final void setTimeToLive(long j10) {
            this.timeToLive = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CompanionViewabilityConfig {
        private int impressionMinPercentageViewed = 10;
        private int visibilityPollIntervalMillis = 500;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getVisibilityPollIntervalMillis() {
            return this.visibilityPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setVisibilityPollIntervalMillis(int i10) {
            this.visibilityPollIntervalMillis = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = 86400;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            return this.maxAdRecords >= 0 && this.expiryTime >= 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CustomNetworkValidation {
        private boolean enabled;
        private String urlDomain = "supply.inmobicdn.net";
        private long refreshDebounceTime = 1000;
        private long validatedExpiry = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        private long nonValidatedExpiry = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getNonValidatedExpiry() {
            return this.nonValidatedExpiry;
        }

        public final long getRefreshDebounceTime() {
            return this.refreshDebounceTime;
        }

        public final String getUrlDomain() {
            return this.urlDomain;
        }

        public final long getValidatedExpiry() {
            return this.validatedExpiry;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }

        public final void setNonValidatedExpiry(long j10) {
            this.nonValidatedExpiry = j10;
        }

        public final void setRefreshDebounceTime(long j10) {
            this.refreshDebounceTime = j10;
        }

        public final void setUrlDomain(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.urlDomain = str;
        }

        public final void setValidatedExpiry(long j10) {
            this.validatedExpiry = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        private int maxDbEvents = 500;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            return getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Mraid3Config {
        private boolean bannerEnabled = true;
        private boolean interstitialEnabled = true;
        private long exposureChangeInterval = 500;
        private long muteChangeInterval = 500;

        public final boolean getBannerEnabled() {
            return this.bannerEnabled;
        }

        public final long getExposureChangeInterval() {
            return this.exposureChangeInterval;
        }

        public final boolean getInterstitialEnabled() {
            return this.interstitialEnabled;
        }

        public final long getMuteChangeInterval() {
            return this.muteChangeInterval;
        }

        public final void setBannerEnabled(boolean z10) {
            this.bannerEnabled = z10;
        }

        public final void setExposureChangeInterval(long j10) {
            this.exposureChangeInterval = j10;
        }

        public final void setInterstitialEnabled(boolean z10) {
            this.interstitialEnabled = z10;
        }

        public final void setMuteChangeInterval(long j10) {
            this.muteChangeInterval = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1086/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !J4.a(this.url);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String partnerKey = "Inmobi";
        private String url = "https://supply.inmobicdn.net/javascript/1.5.5/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            String url;
            String string;
            return getMaxRetries() >= 0 && getRetryInterval() >= 0 && (url = getUrl()) != null && (string = n0.trim(url).toString()) != null && D2.a(string) && !TextUtils.isEmpty(getPartnerKey());
        }

        public final void setOmidEnabled(boolean z10) {
            this.omidEnabled = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PingsV2Config {
        private final boolean enableOkhttp;
        private final boolean enabled;
        private final int maxEntries = 1000;
        private final PingBatchSizeConfig maxBatchSize = new PingBatchSizeConfig();
        private final int readTimeout = 30;
        private final int connectTimeout = 30;
        private final int callTimeout = 60;
        private final PingExpiryConfig expiry = new PingExpiryConfig();
        private final PingRetryConfig retryConfig = new PingRetryConfig();
        private final PingIntervalConfig interval = new PingIntervalConfig();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PingBatchSizeConfig {
            private final int normal = 20;
            private final int high = 64;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PingExpiryConfig {
            private final int normal = 86400;
            private final int high = AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PingIntervalConfig {
            private int normal = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
            private int high = 30;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }

            public final void setHigh(int i10) {
                this.high = i10;
            }

            public final void setNormal(int i10) {
                this.normal = i10;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PingRetryConfig {
            private PriorityRetryConfig normal = new PriorityRetryConfig(3, 120, 2.0d);
            private PriorityRetryConfig high = new PriorityRetryConfig(5, 10, 1.0d);

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class PriorityRetryConfig {
                private double factor;
                private int maxRetries;
                private long retryInterval;

                public PriorityRetryConfig(int i10, long j10, double d10) {
                    this.maxRetries = i10;
                    this.retryInterval = j10;
                    this.factor = d10;
                }

                public final double getFactor() {
                    return this.factor;
                }

                public final int getMaxRetries() {
                    return this.maxRetries;
                }

                public final long getRetryInterval() {
                    return this.retryInterval;
                }

                public final void setFactor(double d10) {
                    this.factor = d10;
                }

                public final void setMaxRetries(int i10) {
                    this.maxRetries = i10;
                }

                public final void setRetryInterval(long j10) {
                    this.retryInterval = j10;
                }
            }

            public final PriorityRetryConfig getHigh() {
                return this.high;
            }

            public final PriorityRetryConfig getNormal() {
                return this.normal;
            }

            public final void setHigh(PriorityRetryConfig priorityRetryConfig) {
                e0.checkNotNullParameter(priorityRetryConfig, "<set-?>");
                this.high = priorityRetryConfig;
            }

            public final void setNormal(PriorityRetryConfig priorityRetryConfig) {
                e0.checkNotNullParameter(priorityRetryConfig, "<set-?>");
                this.normal = priorityRetryConfig;
            }
        }

        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final boolean getEnableOkhttp() {
            return this.enableOkhttp;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final PingExpiryConfig getExpiry() {
            return this.expiry;
        }

        public final PingIntervalConfig getInterval() {
            return this.interval;
        }

        public final PingBatchSizeConfig getMaxBatchSize() {
            return this.maxBatchSize;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getReadTimeout() {
            return this.readTimeout;
        }

        public final PingRetryConfig getRetryConfig() {
            return this.retryConfig;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class RenderingConfig {
        private boolean enableActivityContextOnBannerAttach;
        private boolean enableDomStorage;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        private boolean shouldRenderPopup;
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;
        private List<Integer> gestures = p0.mutableListOf(0, 1, 2, 3, 4, 5);
        private long scrollThrottleInterval = 500;
        private int upperBoundForActivityContext = 10;

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getEnableActivityContextOnBannerAttach() {
            return this.enableActivityContextOnBannerAttach;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        public final long getScrollThrottleInterval() {
            return this.scrollThrottleInterval;
        }

        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final int getUpperBoundForActivityContext() {
            return this.upperBoundForActivityContext;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * 1000;
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            String string;
            String str = this.webviewBackground;
            if (str != null && (((string = n0.trim(str).toString()) == null || string.length() != 0) && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty())) {
                try {
                    parseColor();
                    return true;
                } catch (IllegalArgumentException unused) {
                }
            }
            return false;
        }

        public final int parseColor() throws IllegalArgumentException {
            return Color.parseColor(this.webviewBackground);
        }

        public final void setScrollThrottleInterval(long j10) {
            this.scrollThrottleInterval = j10;
        }

        public final boolean shouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VastVideoConfig {
        private int maxWrapperLimit = 3;
        private long optimalVastVideoSize = 3145728;
        private long vastMaxAssetSize = 31457280;
        private BitRateConfig bitRate = new BitRateConfig();
        private List<String> allowedContentType = p0.mutableListOf(MimeTypes.VIDEO_MP4, "video/3gp", MimeTypes.VIDEO_H263, "video/webm", "image/jpeg", "image/jpg", "image/gif", "image/png");

        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            return getOptimalVastVideoSize() <= 31457280 && getOptimalVastVideoSize() > 0 && getMaxWrapperLimit() >= 0 && getVastMaxAssetSize() > 0 && getVastMaxAssetSize() <= 31457280;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 2000;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setVideoMinPercentagePlay(int i10) {
            this.videoMinPercentagePlay = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = 250;
        private int displayMinPercentageAnimate = 67;
        private VideoViewabilityConfig video = new VideoViewabilityConfig();
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();
        private WebViewabilityConfig web = new WebViewabilityConfig();
        private OmidConfig omidConfig = new OmidConfig();
        private BannerImpressionTypeConfig banner = new BannerImpressionTypeConfig();

        /* renamed from: int, reason: not valid java name */
        private InterstitialImpressionTypeConfig f171int = new InterstitialImpressionTypeConfig();
        private CompanionViewabilityConfig companion = new CompanionViewabilityConfig();

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getCompanionVisibilityMinPercentageViewed() {
            return this.companion.getImpressionMinPercentageViewed();
        }

        public final int getCompanionVisibilityThrottleMillis() {
            return this.companion.getVisibilityPollIntervalMillis();
        }

        public final int getDisplayMinPercentageAnimate() {
            return this.displayMinPercentageAnimate;
        }

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.f171int.getImpressionType();
        }

        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final boolean isValid() {
            return getImpressionMinPercentageViewed() > 0 && getImpressionMinPercentageViewed() <= 100 && getImpressionMinTimeViewed() >= 0 && getDisplayMinPercentageAnimate() > 0 && getDisplayMinPercentageAnimate() <= 100 && getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getCompanionVisibilityMinPercentageViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getVisibilityThrottleMillis() * 5 <= getImpressionMinTimeViewed() && getImpressionPollIntervalMillis() >= 50 && getImpressionPollIntervalMillis() * 4 <= getImpressionMinTimeViewed() && getCompanionVisibilityThrottleMillis() >= 50 && this.omidConfig.isValid();
        }

        public final void setOmidConfig(OmidConfig omidConfig) {
            e0.checkNotNullParameter(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }

        public final void setVideoImpressionMinTimeViewed(int i10) {
            this.video.setImpressionMinTimeViewed(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WebAssetCacheConfig {
        public static final c Companion = new c();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i10 = webAssetCacheConfig.cacheSize;
            }
            if ((i15 & 2) != 0) {
                i11 = webAssetCacheConfig.timeout;
            }
            if ((i15 & 4) != 0) {
                i12 = webAssetCacheConfig.maxRetries;
            }
            if ((i15 & 8) != 0) {
                i13 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            if ((i15 & 16) != 0) {
                i14 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            int i16 = i14;
            int i17 = i12;
            return webAssetCacheConfig.copy(i10, i11, i17, i13, i16);
        }

        public final int component1() {
            return this.cacheSize;
        }

        public final int component2() {
            return this.timeout;
        }

        public final int component3() {
            return this.maxRetries;
        }

        public final int component4() {
            return this.minAvailableDiskSpace;
        }

        public final int component5() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final WebAssetCacheConfig copy(int i10, int i11, int i12, int i13, int i14) {
            return new WebAssetCacheConfig(i10, i11, i12, i13, i14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) obj;
            return this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            return Integer.hashCode(this.cacheSizeToDiskSpaceMaxPercent) + e3.g.d(this.minAvailableDiskSpace, e3.g.d(this.maxRetries, e3.g.d(this.timeout, Integer.hashCode(this.cacheSize) * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("WebAssetCacheConfig(cacheSize=");
            sb2.append(this.cacheSize);
            sb2.append(", timeout=");
            sb2.append(this.timeout);
            sb2.append(", maxRetries=");
            sb2.append(this.maxRetries);
            sb2.append(", minAvailableDiskSpace=");
            sb2.append(this.minAvailableDiskSpace);
            sb2.append(", cacheSizeToDiskSpaceMaxPercent=");
            return e3.g.m(sb2, this.cacheSizeToDiskSpaceMaxPercent, ')');
        }

        public WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14) {
            this.cacheSize = i10;
            this.timeout = i11;
            this.maxRetries = i12;
            this.minAvailableDiskSpace = i13;
            this.cacheSizeToDiskSpaceMaxPercent = i14;
        }

        public /* synthetic */ WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14, int i15, u uVar) {
            this((i15 & 1) != 0 ? 15 : i10, (i15 & 2) != 0 ? 5000 : i11, (i15 & 4) != 0 ? 1 : i12, (i15 & 8) != 0 ? 50 : i13, (i15 & 16) != 0 ? 10 : i14);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionPollIntervalMillis(int i10) {
            this.impressionPollIntervalMillis = i10;
        }
    }

    public AdConfig(String str) {
        super(str);
        this.maxPoolSize = 10;
        this.url = DEFAULT_AD_SERVER_URL;
        this.customNwValidation = new CustomNetworkValidation();
        this.minimumRefreshInterval = 20;
        this.defaultRefreshInterval = 60;
        this.watermarkEnabled = true;
        this.mraid3 = new Mraid3Config();
        this.pingV2 = new PingsV2Config();
        Me.Companion.getClass();
        Me me2 = new Me();
        me2.a0();
        this.timeouts = me2;
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.assetCache = new AssetCacheConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        this.cache = p1.mutableMapOf(tu.e0.to("base", new CacheConfig()), tu.e0.to("banner", new CacheConfig()), tu.e0.to("audio", new CacheConfig()), tu.e0.to("int", new CacheConfig()), tu.e0.to("native", new CacheConfig()));
    }

    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    public final C2979s0 getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            C2979s0 c2979s0 = null;
            if (str != null) {
                if (!D2.a(str)) {
                    str = null;
                }
                if (str != null) {
                    c2979s0 = new C2979s0(str);
                }
            }
            this.adReqDeprecateChecker = c2979s0;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    public final AssetCacheConfig getAssetCacheConfig() {
        return this.assetCache;
    }

    public final AudioConfig getAudio() {
        return this.audio;
    }

    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    public final CustomNetworkValidation getCustomNwValidation() {
        return this.customNwValidation;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    public final boolean getEnableCookiesOnInAppBrowser() {
        return this.enableCookiesOnInAppBrowser;
    }

    public final ImaiConfig getImaiConfig() {
        return this.imai;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    public final Mraid3Config getMraid3Config() {
        return this.mraid3;
    }

    public final MraidConfig getMraidConfig() {
        return this.mraid;
    }

    public final boolean getPartialTabsEnabled() {
        return this.partialTabsEnabled;
    }

    public final PingsV2Config getPingsV2Config() {
        return this.pingV2;
    }

    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    public final boolean getSkipNetworkValidationFeatureEnabled() {
        return this.skipNetworkValidationFeatureEnabled;
    }

    public final Me getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public final String getUrl() {
        return this.url;
    }

    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    public final boolean isCCTEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        int i10;
        int i11;
        if (this.maxPoolSize > 0 && !J4.a(this.url) && (i10 = this.minimumRefreshInterval) >= 0 && (i11 = this.defaultRefreshInterval) >= 0 && i10 <= i11) {
            Iterator<Map.Entry<String, CacheConfig>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    return false;
                }
            }
            this.timeouts.a0();
            if (this.contextualData.isValid() && this.adQuality.isValid() && this.imai.isValid() && this.mraid.isValid() && this.timeouts.Z() && this.rendering.isValid() && this.vastVideo.isValid() && this.assetCache.isValid() && this.viewability.isValid() && this.audio.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final void setAdQuality(AdQualityConfig adQualityConfig) {
        e0.checkNotNullParameter(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(AdReportConfig adReportConfig) {
        e0.checkNotNullParameter(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(C2979s0 c2979s0) {
        this.adReqDeprecateChecker = c2979s0;
    }

    public final void setApplyGzipReq(boolean z10) {
        this.applyGzipReq = z10;
    }

    public final void setAudio(AudioConfig audioConfig) {
        e0.checkNotNullParameter(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(ContextualDataConfig contextualDataConfig) {
        e0.checkNotNullParameter(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setCustomNwValidation(CustomNetworkValidation customNetworkValidation) {
        this.customNwValidation = customNetworkValidation;
    }

    public final void setDefaultRefreshInterval(int i10) {
        this.defaultRefreshInterval = i10;
    }

    public final void setEnableCookiesOnInAppBrowser(boolean z10) {
        this.enableCookiesOnInAppBrowser = z10;
    }

    public final void setMinimumRefreshInterval(int i10) {
        this.minimumRefreshInterval = i10;
    }

    public final void setPartialTabsEnabled(boolean z10) {
        this.partialTabsEnabled = z10;
    }

    public final void setRendering(RenderingConfig renderingConfig) {
        e0.checkNotNullParameter(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z10) {
        this.skipNetCheckHB = z10;
    }

    public final void setSkipNetworkValidationFeatureEnabled(boolean z10) {
        this.skipNetworkValidationFeatureEnabled = z10;
    }

    public final void setTimeouts(Me me2) {
        e0.checkNotNullParameter(me2, "<set-?>");
        this.timeouts = me2;
    }

    public final void setUrl(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(VastVideoConfig vastVideoConfig) {
        e0.checkNotNullParameter(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(ViewabilityConfig viewabilityConfig) {
        e0.checkNotNullParameter(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(WebAssetCacheConfig webAssetCacheConfig) {
        e0.checkNotNullParameter(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = b.a().a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        e0.checkNotNullExpressionValue("AdConfig", "access$getTAG$p(...)");
        return new JSONObject();
    }

    public final CacheConfig getCacheConfig(String adType) {
        e0.checkNotNullParameter(adType, "adType");
        CacheConfig cacheConfig = this.cache.get(adType);
        if (cacheConfig != null) {
            return cacheConfig;
        }
        CacheConfig cacheConfig2 = this.cache.get(PcrIk.UNxisGCHOfrmhBw);
        return cacheConfig2 == null ? new CacheConfig() : cacheConfig2;
    }
}
