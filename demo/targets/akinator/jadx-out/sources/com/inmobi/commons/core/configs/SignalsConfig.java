package com.inmobi.commons.core.configs;

import android.webkit.URLUtil;
import com.inmobi.media.InterfaceC2765f5;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SignalsConfig extends Config {
    public static final i Companion = new i();

    @InterfaceC2765f5
    private final String TAG;
    private BootTimeConfig bts;
    private JSONObject ext;
    private IceConfig ice;
    private String kA;
    private int lowMemoryFreq;
    private NovatiqConfig novatiqConfig;
    private PublisherConfig publisher;
    private Purchases purchases;
    private SessionConfig session;
    private UnifiedIdServiceConfig unifiedIdServiceConfig;
    private int vAK;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z10) {
            this.cce = z10;
        }

        public final void setCof(int i10) {
            this.cof = i10;
        }

        public final void setVce(boolean z10) {
            this.vce = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class IceConfig {

        /* renamed from: c, reason: collision with root package name */
        private CellIceConfig f31607c = new CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.f31607c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.f31607c.getCce();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            return getCellOperatorFlag() >= 0;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.f31607c.getVce();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;
        private List<String> carrierNames = p0.emptyList();
        private String beaconUrl = "https://spadsync.com/sync";

        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;
        private final Map<String, String> generalKeys = new LinkedHashMap();
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 6000;
        private final AutoInputData auto = new AutoInputData();
        private final ObjInputData obj = new ObjInputData();
        private final DirectInputData direct = new DirectInputData();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AutoInputData extends BaseInputData {
            private final Map<String, KeyData> allowedKeys = new LinkedHashMap();
            private final List<String> incompatibleSdkVer = p0.emptyList();
            private final String topic = "";

            public final Map<String, KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            public final List<String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            public final String getTopic() {
                return this.topic;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;
            private final DepthData depth = new DepthData();

            public final int getCount() {
                return this.count;
            }

            public final DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DepthData {
            private final boolean enabled;

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DirectInputData extends BaseInputData {
            private final Map<String, String> allowedKeys = new LinkedHashMap();

            public final Map<String, String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class KeyData {
            private final String name = "";
            private final String type = "";

            public final String getName() {
                return this.name;
            }

            public final String getType() {
                return this.type;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ObjInputData extends BaseInputData {
            private final Map<String, KeyData> allowedKeysAnd = new LinkedHashMap();

            public final Map<String, KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final AutoInputData getAuto() {
            return this.auto;
        }

        public final DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Purchases {
        private boolean inapp;
        private List<String> versionList = p0.listOf((Object[]) new String[]{"7.0.0", "7.1.0", "7.1.1"});

        public final boolean getInapp() {
            return this.inapp;
        }

        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z10) {
            this.inapp = z10;
        }

        public final void setVersionList(List<String> list) {
            e0.checkNotNullParameter(list, QCmNMSGd.DIZZYkxzEgHQk);
            this.versionList = list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SessionConfig {
        private List<Integer> control = p0.listOf((Object[]) new Integer[]{0, 1, 2, 3, 4, 5, 6});

        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setRetryInterval(int i10) {
            this.retryInterval = i10;
        }

        public final void setTimeout(int i10) {
            this.timeout = i10;
        }

        public final void setUrl(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    public SignalsConfig(String str) {
        super(str);
        this.TAG = "SignalsConfig";
        this.ice = new IceConfig();
        this.unifiedIdServiceConfig = new UnifiedIdServiceConfig();
        this.novatiqConfig = new NovatiqConfig();
        this.session = new SessionConfig();
        this.publisher = new PublisherConfig();
        this.lowMemoryFreq = 300;
        this.kA = "wWFMAWbSEtvl5VxZbQGMK7";
        this.vAK = 1;
        this.bts = new BootTimeConfig();
        this.purchases = new Purchases();
    }

    public final String getAK() {
        return this.kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    public final BootTimeConfig getBts() {
        return this.bts;
    }

    public final JSONObject getExt() {
        return this.ext;
    }

    public final IceConfig getIceConfig() {
        return this.ice;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    public final Purchases getPurchases() {
        return this.purchases;
    }

    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "signals";
    }

    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setBts(BootTimeConfig bootTimeConfig) {
        e0.checkNotNullParameter(bootTimeConfig, "<set-?>");
        this.bts = bootTimeConfig;
    }

    public final void setLowMemoryFreq(int i10) {
        this.lowMemoryFreq = i10;
    }

    public final void setPurchases(Purchases purchases) {
        e0.checkNotNullParameter(purchases, "<set-?>");
        this.purchases = purchases;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = i.a().a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        e0.checkNotNullExpressionValue(TAG, "TAG");
        return new JSONObject();
    }
}
