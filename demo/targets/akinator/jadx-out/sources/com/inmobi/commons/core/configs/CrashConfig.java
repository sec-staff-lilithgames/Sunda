package com.inmobi.commons.core.configs;

import com.inmobi.media.C2702ba;
import com.inmobi.media.C2719ca;
import com.inmobi.media.C2881m3;
import com.inmobi.media.C3051w4;
import com.inmobi.media.C3053w6;
import com.inmobi.media.InterfaceC2765f5;
import com.inmobi.media.J4;
import com.ironsource.C3119a4;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CrashConfig extends Config {
    public static final C2881m3 Companion = new C2881m3();
    public static final long DEFAULT_ANR_WATCHDOG_INTERVAL = 4500;
    public static final long DEFAULT_APP_EXIT_REASON_WAIT_INTERVAL = 1000;
    public static final double DEFAULT_APP_EXIT_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CATCH_ENABLED = false;
    public static final double DEFAULT_CATCH_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CRASH_ENABLED = true;
    public static final double DEFAULT_CRASH_SAMPLING_PERCENT = 1.0d;
    public static final long DEFAULT_EVENT_TTL_SEC = 259200;
    public static final long DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL = 30000;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final int DEFAULT_MAX_BATCH_SIZE = 2;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    public static final int DEFAULT_MAX_NO_OF_LINES = 200;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_BATCH_SIZE = 1;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    public static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public static final double DEFAULT_WATCHDOG_SAMPLING_PERCENT = 0.0d;

    @InterfaceC2765f5
    private final String TAG;
    private ANRConfig anr;
    private CatchConfig catchConfig;
    private boolean catchEnabled;
    private CrashIncidentConfig crashConfig;
    private boolean crashEnabled;
    private long eventTTL;
    private int maxEventsToPersist;
    private int maxRetryCount;
    private C2719ca networkType;
    private long processingInterval;
    private long txLatency;
    private String url;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ANRConfig {
        private AppExitReasonConfig appExitReason = new AppExitReasonConfig();
        private WatchDogConfig watchdog = new WatchDogConfig();

        public final AppExitReasonConfig getAppExitReason() {
            return this.appExitReason;
        }

        public final WatchDogConfig getWatchdog() {
            return this.watchdog;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AppExitReasonConfig {
        private boolean enabled;
        private long incidentWaitInterval = 1000;
        private long incompleteLogThresholdTime = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private int maxNumberOfLines = 200;
        private boolean reportToLogs;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getIncidentWaitInterval() {
            return this.incidentWaitInterval;
        }

        public final long getIncompleteLogThresholdTime() {
            return this.incompleteLogThresholdTime;
        }

        public final int getMaxNumberOfLines() {
            return this.maxNumberOfLines;
        }

        public final boolean getReportToLogs() {
            return this.reportToLogs;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CatchConfig {
        private boolean enabled;
        private double samplingPercent;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CrashIncidentConfig {
        private boolean reportOOMInfo;
        private boolean reportSessionInfo;
        private boolean enabled = true;
        private double samplingPercent = 1.0d;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getReportOOMInfo() {
            return this.reportOOMInfo;
        }

        public final boolean getReportSessionInfo() {
            return this.reportSessionInfo;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WatchDogConfig {
        private boolean enabled;
        private long interval = CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    public CrashConfig(String str) {
        super(str);
        this.TAG = "CrashConfig";
        this.url = DEFAULT_URL;
        this.processingInterval = 60L;
        this.maxRetryCount = 3;
        this.maxEventsToPersist = 50;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.txLatency = 86400L;
        this.crashEnabled = true;
        this.networkType = new C2719ca();
        this.anr = new ANRConfig();
        this.crashConfig = new CrashIncidentConfig();
        this.catchConfig = new CatchConfig();
        setDefaultNetworkConfig();
    }

    private final void setDefaultNetworkConfig() {
        C2719ca c2719ca = this.networkType;
        C2702ba c2702ba = new C2702ba();
        c2702ba.a(10L);
        c2702ba.c(1);
        c2702ba.b(2);
        c2719ca.getClass();
        e0.checkNotNullParameter(c2702ba, "<set-?>");
        c2719ca.wifi = c2702ba;
        C2719ca c2719ca2 = this.networkType;
        C2702ba c2702ba2 = new C2702ba();
        c2702ba2.a(10L);
        c2702ba2.c(1);
        c2702ba2.b(2);
        c2719ca2.getClass();
        e0.checkNotNullParameter(c2702ba2, "<set-?>");
        c2719ca2.others = c2702ba2;
    }

    public final ANRConfig getANRConfig() {
        return this.anr;
    }

    public final CatchConfig getCatchConfig() {
        return this.catchConfig;
    }

    public final CrashIncidentConfig getCrashConfig() {
        return this.crashConfig;
    }

    public final C3051w4 getEventConfig() {
        return new C3051w4(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final long getEventTTL() {
        return this.eventTTL;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final C2702ba getMobileConfig() {
        C2702ba c2702ba = this.networkType.others;
        if (c2702ba != null) {
            return c2702ba;
        }
        e0.throwUninitializedPropertyAccessException("others");
        return null;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "crashReporting";
    }

    public final String getUrl() {
        return this.url;
    }

    public final C2702ba getWifiConfig() {
        C2702ba c2702ba = this.networkType.wifi;
        if (c2702ba != null) {
            return c2702ba;
        }
        e0.throwUninitializedPropertyAccessException(C3119a4.f35922b);
        return null;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (J4.a(this.url)) {
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
                if (c2702ba2.a(i10) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new C3053w6().a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        e0.checkNotNullExpressionValue(TAG, "TAG");
        return new JSONObject();
    }
}
