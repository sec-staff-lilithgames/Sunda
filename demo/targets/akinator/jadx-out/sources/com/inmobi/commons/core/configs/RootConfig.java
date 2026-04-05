package com.inmobi.commons.core.configs;

import com.inmobi.media.C2682a7;
import com.inmobi.media.C3053w6;
import com.inmobi.media.InterfaceC2753ea;
import com.inmobi.media.InterfaceC2765f5;
import com.inmobi.media.J4;
import com.inmobi.media.Vc;
import com.inmobi.media.Xc;
import com.inmobi.media.Yc;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import sv.k0;
import sv.n0;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RootConfig extends Config {
    public static final long DEFAULT_EXPIRY = 86400;
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    public static final String DEFAULT_URL = "";
    public static final int DEFAULT_WAIT_TIME = 3;
    public static final String IP_ADDRESS_TP_SUPPORT_KEY = "ipAddrTPSupport";

    @InterfaceC2765f5
    private final String TAG;
    private List<ComponentConfig> components;

    @InterfaceC2753ea
    private GDPR gdpr;
    private final List<String> ipAddrTPSupport;
    private int maxRetries;
    private boolean monetizationDisabled;
    private int retryInterval;
    private int waitTime;
    public static final e Companion = new e();
    private static final Object sAcquisitionLock = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ComponentConfig {
        private String type = "";
        private long expiry = Long.MAX_VALUE;
        private String url = "";
        private String fallbackUrl = RootConfig.DEFAULT_FALLBACK_URL;

        public final long getExpiry() {
            return this.expiry;
        }

        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (n0.trim(getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 864000 && !J4.a(this.url)) {
                return (e0.areEqual("root", getType()) && J4.a(this.fallbackUrl)) ? false : true;
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class GDPR {

        @InterfaceC2753ea
        private Boolean transmitRequest = Boolean.TRUE;

        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    public RootConfig(String str) {
        super(str);
        this.TAG = "RootConfig";
        this.maxRetries = 3;
        this.retryInterval = 60;
        this.waitTime = 3;
        this.gdpr = new GDPR();
        this.components = p0.emptyList();
        this.ipAddrTPSupport = p0.emptyList();
    }

    public final long getExpiryForType(String type) {
        e0.checkNotNullParameter(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (e0.areEqual(type, componentConfig.getType())) {
                        return componentConfig.getExpiry();
                    }
                }
            }
            return 86400L;
        }
    }

    public final String getFallbackUrlForRootType() {
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (e0.areEqual("root", componentConfig.getType())) {
                        return componentConfig.getFallbackUrl();
                    }
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }

    public final List<String> getIpAddrTPSupport() {
        return this.ipAddrTPSupport;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "root";
    }

    public final String getUrlForType(String type) {
        e0.checkNotNullParameter(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (e0.areEqual(type, componentConfig.getType())) {
                        return componentConfig.getUrl();
                    }
                }
            }
            return "";
        }
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final boolean isMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    public final boolean isSameAs(RootConfig config) {
        e0.checkNotNullParameter(config, "config");
        return ((getAccountId$media_release() == null && config.getAccountId$media_release() == null) || (getAccountId$media_release() != null && k0.equals$default(getAccountId$media_release(), config.getAccountId$media_release(), false, 2, null))) && config.maxRetries == this.maxRetries && config.retryInterval == this.retryInterval && config.waitTime == this.waitTime && config.monetizationDisabled == this.monetizationDisabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        x0 x0Var;
        String TAG = this.TAG;
        e0.checkNotNullExpressionValue(TAG, "TAG");
        Objects.toString(this.gdpr);
        if (this.maxRetries < 0 || this.retryInterval < 0 || this.waitTime < 0) {
            return false;
        }
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((ComponentConfig) it.next()).isValid()) {
                        return false;
                    }
                }
                x0Var = x0.f87415a;
            } else {
                x0Var = null;
            }
            if (x0Var == null) {
                return false;
            }
            GDPR gdpr = this.gdpr;
            return gdpr != null && gdpr.isValid();
        }
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr == null || (transmitRequest = gdpr.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new C3053w6().a(new Yc("components", RootConfig.class), (Xc) new C2682a7(new d(), ComponentConfig.class)).a(new Yc(IP_ADDRESS_TP_SUPPORT_KEY, RootConfig.class), (Xc) new C2682a7(new Vc(), String.class)).a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        e0.checkNotNullExpressionValue(TAG, "TAG");
        return new JSONObject();
    }
}
