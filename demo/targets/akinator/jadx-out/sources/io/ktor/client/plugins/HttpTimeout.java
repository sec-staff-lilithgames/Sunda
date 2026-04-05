package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpTimeout {
    public static final long INFINITE_TIMEOUT_MS = Long.MAX_VALUE;
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<HttpTimeout> key = new AttributeKey<>("TimeoutPlugin");
    private final Long connectTimeoutMillis;
    private final Long requestTimeoutMillis;
    private final Long socketTimeoutMillis;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class HttpTimeoutCapabilityConfiguration {
        public static final Companion Companion = new Companion(null);
        private static final AttributeKey<HttpTimeoutCapabilityConfiguration> key = new AttributeKey<>("TimeoutConfiguration");
        private Long _connectTimeoutMillis;
        private Long _requestTimeoutMillis;
        private Long _socketTimeoutMillis;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final AttributeKey<HttpTimeoutCapabilityConfiguration> getKey() {
                return HttpTimeoutCapabilityConfiguration.key;
            }

            private Companion() {
            }
        }

        public /* synthetic */ HttpTimeoutCapabilityConfiguration(Long l9, Long l10, Long l11, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : l9, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : l11);
        }

        private final Long checkTimeoutValue(Long l9) {
            if (l9 == null || l9.longValue() > 0) {
                return l9;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }

        public final HttpTimeout build$ktor_client_core() {
            return new HttpTimeout(getRequestTimeoutMillis(), getConnectTimeoutMillis(), getSocketTimeoutMillis(), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HttpTimeoutCapabilityConfiguration.class != obj.getClass()) {
                return false;
            }
            HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeoutCapabilityConfiguration) obj;
            return e0.areEqual(this._requestTimeoutMillis, httpTimeoutCapabilityConfiguration._requestTimeoutMillis) && e0.areEqual(this._connectTimeoutMillis, httpTimeoutCapabilityConfiguration._connectTimeoutMillis) && e0.areEqual(this._socketTimeoutMillis, httpTimeoutCapabilityConfiguration._socketTimeoutMillis);
        }

        public final Long getConnectTimeoutMillis() {
            return this._connectTimeoutMillis;
        }

        public final Long getRequestTimeoutMillis() {
            return this._requestTimeoutMillis;
        }

        public final Long getSocketTimeoutMillis() {
            return this._socketTimeoutMillis;
        }

        public int hashCode() {
            Long l9 = this._requestTimeoutMillis;
            int iHashCode = (l9 != null ? l9.hashCode() : 0) * 31;
            Long l10 = this._connectTimeoutMillis;
            int iHashCode2 = (iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31;
            Long l11 = this._socketTimeoutMillis;
            return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
        }

        public final void setConnectTimeoutMillis(Long l9) {
            this._connectTimeoutMillis = checkTimeoutValue(l9);
        }

        public final void setRequestTimeoutMillis(Long l9) {
            this._requestTimeoutMillis = checkTimeoutValue(l9);
        }

        public final void setSocketTimeoutMillis(Long l9) {
            this._socketTimeoutMillis = checkTimeoutValue(l9);
        }

        public HttpTimeoutCapabilityConfiguration(Long l9, Long l10, Long l11) {
            this._requestTimeoutMillis = 0L;
            this._connectTimeoutMillis = 0L;
            this._socketTimeoutMillis = 0L;
            setRequestTimeoutMillis(l9);
            setConnectTimeoutMillis(l10);
            setSocketTimeoutMillis(l11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<HttpTimeoutCapabilityConfiguration, HttpTimeout>, HttpClientEngineCapability<HttpTimeoutCapabilityConfiguration> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpTimeout> getKey() {
            return HttpTimeout.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpTimeout plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            ((HttpSend) HttpClientPluginKt.plugin(scope, HttpSend.Plugin)).intercept(new HttpTimeout$Plugin$install$1(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpTimeout prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = new HttpTimeoutCapabilityConfiguration(null, null, null, 7, null);
            block.invoke(httpTimeoutCapabilityConfiguration);
            return httpTimeoutCapabilityConfiguration.build$ktor_client_core();
        }
    }

    public /* synthetic */ HttpTimeout(Long l9, Long l10, Long l11, u uVar) {
        this(l9, l10, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasNotNullTimeouts() {
        return (this.requestTimeoutMillis == null && this.connectTimeoutMillis == null && this.socketTimeoutMillis == null) ? false : true;
    }

    private HttpTimeout(Long l9, Long l10, Long l11) {
        this.requestTimeoutMillis = l9;
        this.connectTimeoutMillis = l10;
        this.socketTimeoutMillis = l11;
    }
}
